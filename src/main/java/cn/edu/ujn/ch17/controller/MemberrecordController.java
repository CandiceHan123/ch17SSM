package cn.edu.ujn.ch17.controller;

import cn.edu.ujn.ch17.dao.Memberrecord;
import cn.edu.ujn.ch17.service.IMemberrecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@CrossOrigin
@Controller
public class MemberrecordController {
    @Autowired
    private IMemberrecordService imrs;
    @ResponseBody
    @RequestMapping("/showallmemberrecord")
    public List<Memberrecord> findAll(){
        return this.imrs.findAll();
    }
    @ResponseBody
    @RequestMapping("/findmemberrecordbytelephone")
    public List<Memberrecord> findMemberRecordByTele(String telephone){
        return this.imrs.findByTele(telephone);
    }
    @ResponseBody
    @RequestMapping("/deletememberrecord")
    public String deleteMemberRecord(int id){
        int i=this.imrs.deleteRecord(id);
        if(i==1)
            return "yes";
        else
            return "no";
    }
}
