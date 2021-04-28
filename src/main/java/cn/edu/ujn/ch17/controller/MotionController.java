package cn.edu.ujn.ch17.controller;

import cn.edu.ujn.ch17.dao.Memberrecord;
import cn.edu.ujn.ch17.dao.Motion;
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
}
