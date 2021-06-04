package cn.edu.ujn.ch17.controller;

import cn.edu.ujn.ch17.dao.Purchasething;
import cn.edu.ujn.ch17.service.IPurchaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Controller
@CrossOrigin
public class PurchaseController {
    @Autowired
    private IPurchaseService iPurchaseService;
    @RequestMapping("/findpurchasebyid")
    @ResponseBody
    public List<Purchasething> findPurchaseById(int id){
        return this.iPurchaseService.findById(id);
    }
    @RequestMapping("/modifyreturn")
    @ResponseBody
    public String modifyReturn(int id,boolean isreturn){
        Purchasething record=new Purchasething();
        record.setId(id);
        record.setIsreturn(isreturn);
        int i= this.iPurchaseService.modifyReturn(record);
        if(i==1)
            return "yes";
        else
            return "no";
    }
    @RequestMapping("/addPurchaseRecord")
    @ResponseBody
    public String addPurchaseRecord(String name,String purchaseDate,boolean isreturn){
        Purchasething record=new Purchasething();
        record.setName(name);
        SimpleDateFormat format2= new SimpleDateFormat("yyyy-MM-dd");
        Date time2 = new Date();
        try {
            time2 = format2.parse(purchaseDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        record.setPurchaseDate(time2);
        record.setIsreturn(isreturn);
        int i= this.iPurchaseService.addPurchaseRecord(record);
        if(i==1)
            return "yes";
        else
            return "no";
    }
    @RequestMapping("/showallpurchase")
    @ResponseBody
    public List<Purchasething> showAllPurchase(){
        return this.iPurchaseService.selectAll();
    }
}
