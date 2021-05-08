package cn.edu.ujn.ch17.controller;

import cn.edu.ujn.ch17.dao.Member;
import cn.edu.ujn.ch17.dao.Memberrecord;
import cn.edu.ujn.ch17.dao.Motion;
import cn.edu.ujn.ch17.service.IMemberService;
import cn.edu.ujn.ch17.service.IMemberrecordService;
import cn.edu.ujn.ch17.service.IMotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
@CrossOrigin
public class MotionController {
    @Autowired
    private IMotionService motionService;
    @Autowired
    private IMemberService memberService;
    @Autowired
    private IMemberrecordService memberrecordService;
    @RequestMapping("/findmotionbytele")
    @ResponseBody
    public Motion findByTele(String telephone){
        return this.motionService.findByTele(telephone);
    }
    @RequestMapping("/addsignrecord")
    @ResponseBody
    public String addSignRecord(String telephone, String approach, String depart){
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time1 = new Date();
        Date time2 = new Date();
        try {
              time1 = format1.parse(approach);
              time2 = format2.parse(depart);
            } catch (ParseException e) {
            e.printStackTrace();
        }
        Memberrecord memberrecord=new Memberrecord();
        memberrecord.setTelephone(telephone);
        memberrecord.setApproach(time1);
        memberrecord.setDepart(time2);
        int i=this.memberrecordService.addRecord(memberrecord);
        if(i==1)
            return "yes";
        else return "no";
    }
    @RequestMapping("/modifyduration")
    @ResponseBody
    public String modifyDuration(String telephone,int duration,int calorie){
        Motion record=new Motion();
        Member record2=new Member();
        record.setTelephone(telephone);
        record2.setTelephone(telephone);
        int lastduration=this.motionService.findByTele(telephone).getDuration();
        int lastcolarie=this.motionService.findByTele(telephone).getCalorie();
        int lastintegral=this.memberService.selectByPrimaryKey(telephone).getIntegral();
        record.setDuration(lastduration+duration);
        record.setCalorie(lastcolarie+calorie);
        record2.setIntegral(lastintegral+duration/10);
        int i=this.motionService.modifyDuration(record);
        int j=this.memberService.modifyByTele(record2);
        if(i==1&&j==1)
            return "yes";
        else return "no";
    }
}
