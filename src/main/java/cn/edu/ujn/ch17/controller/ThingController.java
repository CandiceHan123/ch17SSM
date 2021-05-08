package cn.edu.ujn.ch17.controller;

import cn.edu.ujn.ch17.dao.Thing;
import cn.edu.ujn.ch17.service.IThingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@CrossOrigin
public class ThingController {
    @Autowired
    private IThingService iThingService;
    @ResponseBody
    @RequestMapping("/showallthings")
    public List<Thing> showAllThings(){
        return this.iThingService.showAllThings();
    }
    @ResponseBody
    @RequestMapping("/findthingbyname")
    public Thing findThingByName(String name){
        return this.iThingService.selectThingByName(name);
    }
    @ResponseBody
    @RequestMapping("/modifythings")
    public String modifyThings(String name,String type,boolean isreturn,float price) {
        Thing record=new Thing();
        record.setName(name);
        record.setType(type);
        record.setIsreturn(isreturn);
        record.setPrice(price);
        int i=this.iThingService.modifyThings(record);
        if(i==1){
            return "yes";
        }else{
            return "no";
        }
    }
    @ResponseBody
    @RequestMapping("/deletethings")
    public String deleteThings(String name){
        int i=this.iThingService.deleteThings(name);
        if(i==1){
            return "yes";
        }else{
            return "no";
        }
    }
    @ResponseBody
    @RequestMapping("/salethings")
    public String saleThings(String name){
        Thing thing=new Thing();
        thing.setName(name);
        int laststock=this.iThingService.selectThingByName(name).getStock();
        thing.setStock(laststock-1);
        int lastsalesvolume=this.iThingService.selectThingByName(name).getSalesvolume();
        thing.setSalesvolume(lastsalesvolume+1);
        int i=this.iThingService.modifyThings(thing);
        if(i==1){
            return "yes";
        }else{
            return "no";
        }
    }
}
