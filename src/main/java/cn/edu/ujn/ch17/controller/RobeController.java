package cn.edu.ujn.ch17.controller;

import cn.edu.ujn.ch17.dao.Robe;
import cn.edu.ujn.ch17.service.IRobeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class RobeController {
    @Autowired
    private IRobeService iRobeService;
    @ResponseBody
    @RequestMapping("/showallrobes")
    public List<Robe> showAllRobes(){
        return this.iRobeService.showAllRobes();
    }
    @ResponseBody
    @RequestMapping("/modifyrobes")
    public String modifyRobes(int id,boolean occupied,float rent){
        Robe robe=new Robe();
        robe.setId(id);
        robe.setOccupied(occupied);
        robe.setRent(rent);
        int i=this.iRobeService.modifyById(robe);
        if(i==1){
            return "yes";
        }else{
            return "no";
        }
    }
    @ResponseBody
    @RequestMapping("/deleterobes")
    public String deleteRobes(int id){
        int i=this.iRobeService.deleteById(id);
        if(i==1){
            return "yes";
        }else{
            return "no";
        }
    }
    @ResponseBody
    @RequestMapping("/changestateto2")
    public String changeStateTo2(int id,boolean occupied){
        Robe robe=new Robe();
        robe.setId(id);
        robe.setOccupied(occupied);
        robe.setTelephone("");
        int i=this.iRobeService.modifyById(robe);
        if(i==1){
            return "yes";
        }else{
            return "no";
        }
    }
    @ResponseBody
    @RequestMapping("/changestateto1")
    public String changeStateTo1(int id,boolean occupied,String telephone){
        Robe robe=new Robe();
        robe.setId(id);
        robe.setOccupied(occupied);
        robe.setTelephone(telephone);
        int i=this.iRobeService.modifyById(robe);
        if(i==1){
            return "yes";
        }else{
            return "no";
        }
    }
}
