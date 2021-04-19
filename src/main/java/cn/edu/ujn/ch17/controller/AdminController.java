package cn.edu.ujn.ch17.controller;

import cn.edu.ujn.ch17.dao.Admin;
import cn.edu.ujn.ch17.service.IAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class AdminController {
    @Autowired
    private IAdminService adminService;
    @ResponseBody
    @RequestMapping("/findadminbytele")
    public String findByTele(String telephone){
        Admin admin=this.adminService.findByTele(telephone);
        if(admin==null)
        {
            return "adminNotExist";
        }else{
            return admin.getPassword();
        }
    }
    @ResponseBody
    @RequestMapping("/findadmin")
    public Admin findAdmin(String telephone){
        return this.adminService.findByTele(telephone);
    }
    @ResponseBody
    @RequestMapping("/addadmin")
    public void addAdmin(String username,String password,String telephone,String identity,String sex)
    {
        Admin admin=new Admin();
        admin.setUsername(username);
        admin.setPassword(password);
        admin.setTelephone(telephone);
        admin.setIdentity(identity);
        admin.setSex(sex);
        this.adminService.addAdmin(admin);
    }
    @ResponseBody
    @RequestMapping("/modifyadmin")
    public String modifyAdmin(String username,String telephone,String identity,String sex){
        Admin admin=new Admin();
        admin.setUsername(username);
        admin.setTelephone(telephone);
        admin.setIdentity(identity);
        admin.setSex(sex);
        int i=this.adminService.ModifyAdmin(admin);
        if(i==1)
            return "yes";
        else return "no";
    }
    @ResponseBody
    @RequestMapping("/modifypassword")
    public String modifyPassword(String telephone,String password){
        Admin admin=new Admin();
        admin.setTelephone(telephone);
        admin.setPassword(password);
        int i=this.adminService.ModifyPassword(admin);
        if(i==1)
            return "yes";
        else return "no";
    }
}
