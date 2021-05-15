package cn.edu.ujn.ch17.controller;

import cn.edu.ujn.ch17.dao.Appointment;
import cn.edu.ujn.ch17.service.IAppointmentService;
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
public class AppointmentController {
    @Autowired
    private IAppointmentService appointmentService;
    @ResponseBody
    @RequestMapping("findappointbycoach")
    public List<Appointment> findAppointByCoach(String coachid){
        return this.appointmentService.findByCoachId(coachid);
    }
    @ResponseBody
    @RequestMapping("addappointrecord")
    public String addAppointRecord(String telephone,String coachid,String appointtime){
        Appointment record=new Appointment();
        record.setTelephone(telephone);
        record.setCoachid(coachid);
        SimpleDateFormat format1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time1 = new Date();
        try {
            time1 = format1.parse(appointtime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        record.setAppointtime(time1);
        record.setComplete(false);
        int i=this.appointmentService.addAppointRecord(record);
        if(i==1)
            return "yes";
        else return "no";
    }
    @ResponseBody
    @RequestMapping("modifycomplete")
    public String modifyComplete(int id,String endtime)
    {
        SimpleDateFormat format2= new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date time2 = new Date();
        try {
            time2 = format2.parse(endtime);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Appointment record=new Appointment();
        record.setId(id);
        record.setComplete(true);
        record.setEndtime(time2);
        int i=this.appointmentService.modifyComplete(record);
        if(i==1)
            return "yes";
        else return "no";
    }
    @ResponseBody
    @RequestMapping("deleteappointment")
    public String deleteAppointment(int id){
        int i=this.appointmentService.deleteById(id);
        if(i==1)
            return "yes";
        else return "no";
    }
    @ResponseBody
    @RequestMapping("finduncompletenum")
    public int findUncompleteNum(String coachid){
        int count=0;
        List<Appointment> appointments=this.appointmentService.findByCoachId(coachid);
        for (int i = 0; i < appointments.size(); i++)
        {
            if(appointments.get(i).complete==false)
            {
                count++;
            }
        }
        return count;
    }

}
