package cn.edu.ujn.ch17.controller;

import cn.edu.ujn.ch17.dao.Privatetrainer;
import cn.edu.ujn.ch17.service.IPrivateTrainerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class PrivateTrainerController {
    @Autowired
    private IPrivateTrainerService iPrivateTrainerService;
    @ResponseBody
    @RequestMapping("/showallteachers")
    public List<Privatetrainer> showAllTeachers(){
        return this.iPrivateTrainerService.showAllTeachers();
    }
    @ResponseBody
    @RequestMapping("/findteachersbyid")
    public Privatetrainer findById(String id){
        return this.iPrivateTrainerService.findById(id);
    }
    @ResponseBody
    @RequestMapping("/findteachersbyname")
    public List<Privatetrainer> findByName(String name){
        return this.iPrivateTrainerService.findByName(name);
    }
    @ResponseBody
    @RequestMapping("/findteachersbylevel")
    public List<Privatetrainer> findByLevel(int level){
        return this.iPrivateTrainerService.findByLevel(level);
    }
    @ResponseBody
    @RequestMapping("/findteachersbysex")
    public List<Privatetrainer> findBySex(String sex){
        return this.iPrivateTrainerService.findBySex(sex);
    }
    @ResponseBody
    @RequestMapping("/modifyteachers")
    public String modifyById(String id,int level,float hourlywage){
        Privatetrainer privatetrainer=new Privatetrainer();
        privatetrainer.setId(id);
        privatetrainer.setLevel(level);
        privatetrainer.setHourlywage(hourlywage);
        int i=this.iPrivateTrainerService.modifyById(privatetrainer);
        if(i==1){
            return "yes";
        }else{
            return "no";
        }
    }
    @ResponseBody
    @RequestMapping("/deleteteachers")
    public String deleteById(String id){
        int i=this.iPrivateTrainerService.deleteById(id);
        if(i==1){
            return "yes";
        }else{
            return "no";
        }
    }
    @ResponseBody
    @RequestMapping("/returnpassword")
    public String returnPassword(String id)
    {
        Privatetrainer privatetrainer=this.iPrivateTrainerService.findById(id);
        if(privatetrainer==null)
        {
            return "coachNotExist";
        }
        else
            return privatetrainer.getPassword();
    }
}
