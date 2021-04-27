package cn.edu.ujn.ch17.controller;

import cn.edu.ujn.ch17.dao.Motion;
import cn.edu.ujn.ch17.service.IMotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@CrossOrigin
public class MotionController {
    @Autowired
    private IMotionService motionService;
    @RequestMapping("/findmotionbytele")
    @ResponseBody
    public Motion findByTele(String telephone){
        return this.motionService.findByTele(telephone);
    }
}
