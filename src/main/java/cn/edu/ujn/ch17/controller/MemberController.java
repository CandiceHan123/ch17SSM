package cn.edu.ujn.ch17.controller;

import cn.edu.ujn.ch17.dao.Member;
import cn.edu.ujn.ch17.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class MemberController {
    @Autowired
    private IMemberService memberService;
    @ResponseBody
    @RequestMapping("/showallmembers")
    public List<Member> selectAll()
    {
        return this.memberService.selectAll();
    }
    @ResponseBody
    @RequestMapping("findmember")
    public Member findMember(String telephone)
    {
        return this.memberService.selectByPrimaryKey(telephone);
    }

    @ResponseBody
    @RequestMapping("findmemberbytele")
    public String findByTele(String telephone){
        Member member=this.memberService.selectByPrimaryKey(telephone);
        if(member==null)
        {
            return "memberNotExist";
        }
        else
        return member.getPassword();
    }
    @ResponseBody
    @RequestMapping("findmemberbyusername")
    public List<Member> selectByName(String username)
    {
        return this.memberService.selectByName(username);
    }
    @ResponseBody
    @RequestMapping("findmemberbysex")
    public List<Member> selectBySex(String sex)
    {
        return this.memberService.selectBySex(sex);
    }
    @ResponseBody
    @RequestMapping("findmemberbylevel")
    public List<Member> selectByLevel(int level)
    {
        return this.memberService.selectByLevel(level);
    }
    @ResponseBody
    @RequestMapping("findmemberbypersonalTrainer")
    public List<Member> selectByPersonalTrainer(String personalTrainer)
    {
        return this.memberService.selectByPersonalTrainer(personalTrainer);
    }
    @ResponseBody
    @RequestMapping("findmemberbyage")
    public List<Member> selectByAge(int age)
    {
        return this.memberService.selectByAge(age);
    }
    @ResponseBody
    @RequestMapping("modifymember")
    public String modifyMember(String telephone,int level,String personalTrainer){
        Member record=new Member();
        record.setTelephone(telephone);
        record.setLevel(level);
        record.setPersonalTrainer(personalTrainer);
        int i=this.memberService.modifyByTele(record);
        System.out.println(i);
        if(i==1)
        return "yes";
        else return "no";
    }
    @ResponseBody
    @RequestMapping("deletemember")
    public String deleteMember(String telephone){
        int i=this.memberService.deleteByTele(telephone);
        if(i==1)
            return "yes";
        else return "no";
    }
    @ResponseBody
    @RequestMapping("addbalance")
    public String addBalance(String telephone,int value){
        Member record=new Member();
        record.setTelephone(telephone);
        double lastbalance=this.memberService.selectByPrimaryKey(telephone).getBalance();
        int lastintegral=this.memberService.selectByPrimaryKey(telephone).getIntegral();
        record.setBalance(lastbalance+value);
        record.setIntegral(lastintegral+value/50);
        int i=this.memberService.modifyByTele(record);
        if(i==1)
            return "yes";
        else return "no";
    }
    @ResponseBody
    @RequestMapping("reducebalance")
    public String reduceBalance(String telephone,int value){
        Member record=new Member();
        record.setTelephone(telephone);
        double lastbalance=this.memberService.selectByPrimaryKey(telephone).getBalance();
        record.setBalance(lastbalance-value);
        int i=this.memberService.modifyByTele(record);
        if(i==1)
            return "yes";
        else return "no";
    }
    @ResponseBody
    @RequestMapping("modifyintegral")
    public String modifyIntegral(String telephone,int integral){
        Member record=new Member();
        record.setTelephone(telephone);
        int lastintegral=this.memberService.selectByPrimaryKey(telephone).getIntegral();
        record.setIntegral(lastintegral-integral);
        int i=this.memberService.modifyByTele(record);
        if(i==1)
            return "yes";
        else return "no";
    }
}
