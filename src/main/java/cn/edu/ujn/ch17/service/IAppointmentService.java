package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Appointment;
import cn.edu.ujn.ch17.dao.Privatetrainer;

import java.util.List;

public interface IAppointmentService {
    public List<Appointment> findByCoachId(String coachid);
    public int addAppointRecord(Appointment record);
    public int modifyComplete(Appointment record);
    public int deleteById(int id);
}
