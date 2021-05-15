package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Appointment;
import cn.edu.ujn.ch17.dao.AppointmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Service
@Transactional
public class AppointmentServiceImpl implements IAppointmentService{
    @Autowired
    private AppointmentMapper appointmentMapper;
    @Override
    public List<Appointment> findByCoachId(String coachid) {
        return this.appointmentMapper.selectByCoachId(coachid);
    }

    @Override
    public int addAppointRecord(Appointment record) {
        return this.appointmentMapper.insertSelective(record);
    }

    @Override
    public int modifyComplete(Appointment record) {
        return this.appointmentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int deleteById(int id) {
        return this.appointmentMapper.deleteByPrimaryKey(id);
    }

}
