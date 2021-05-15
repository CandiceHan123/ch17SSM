package cn.edu.ujn.ch17.controller;

import cn.edu.ujn.ch17.dao.Salesrecord;
import cn.edu.ujn.ch17.service.ISalesRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Time;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Controller
@CrossOrigin
public class SalesRecordController {
    @Autowired
    private ISalesRecordService salesRecordService;
    @ResponseBody
    @RequestMapping("showallsalesrecord")
    public List<Salesrecord> selectAll(){
        return this.salesRecordService.selectAll();
    }
    @ResponseBody
    @RequestMapping("findsalesrecordbytelephone")
    public List<Salesrecord> selectByTele(String telephone){
        return this.salesRecordService.selectByTele(telephone);
    }
    @ResponseBody
    @RequestMapping("/findsalesrecordbythingsname")
    public List<Salesrecord> selectByName(String thingsname){
        return this.salesRecordService.selectByName(thingsname);
    }
    @ResponseBody
    @RequestMapping("/findsalesrecordbymonth")
    public int[] selectByMonth(){
        Calendar calendar=Calendar.getInstance();
        int year=calendar.get(Calendar.YEAR);
        int month=calendar.get(Calendar.MONTH)+1;
        int day=calendar.get(Calendar.DATE);
        int[] count=new int[6];
        String str1,str2;
        for(int c=0,i=year,j=month-5;j<=month;j++,c++){
            if(j<0)
            {
                str1=(i-1)+"-"+String.format("%02d", (12+j))+"-01 00:00:00";
                str2=(i-1)+"-"+String.format("%02d", (j+13))+"-01 00:00:00";
                count[c]=this.salesRecordService.selectByMonth(str1,str2).size();
            }
            else if(j==0)
            {
                str1=i+"-12-01 00:00:00";
                str2=i+"-01-01 00:00:00";
                count[c]=this.salesRecordService.selectByMonth(str1,str2).size();
            }
            else
            {
                str1=i+"-"+String.format("%02d", j)+"-01 00:00:00";
                str2=i+"-"+String.format("%02d", (j+1))+"-01 00:00:00";
                count[c]=this.salesRecordService.selectByMonth(str1,str2).size();
            }
        }
        /*SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String str1 = sdf.format(time1);
        String str2 = sdf.format(time2);*/
        //return this.salesRecordService.selectByMonth(str1,str2);
        return count;
    }
    @ResponseBody
    @RequestMapping("/addsalesrecord1")
    public String addSalesRecord1(String telephone,String thingsname,float price,String time){
        Salesrecord salesrecord=new Salesrecord();
        salesrecord.setTelephone(telephone);
        salesrecord.setThingsname(thingsname);
        salesrecord.setNumber(1);
        salesrecord.setPrice(price);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time1 = new Date();
        try {
            time1 = format1.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        salesrecord.setTime(time1);
        salesrecord.setMethod(true);
        int i=this.salesRecordService.addSalesRecord(salesrecord);
        if(i==1)
            return "yes";
        else return "no";
    }
    @ResponseBody
    @RequestMapping("/addsalesrecord2")
    public String addSalesRecord2(String telephone,String thingsname,float price,String time){
        Salesrecord salesrecord=new Salesrecord();
        salesrecord.setTelephone(telephone);
        salesrecord.setThingsname(thingsname);
        salesrecord.setNumber(1);
        salesrecord.setPrice(price);
        SimpleDateFormat format2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time2 = new Date();
        try {
            time2 = format2.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        salesrecord.setTime(time2);
        salesrecord.setMethod(false);
        int i=this.salesRecordService.addSalesRecord(salesrecord);
        if(i==1)
            return "yes";
        else return "no";
    }
}
