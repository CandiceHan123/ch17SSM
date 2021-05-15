package cn.edu.ujn.ch17.dao;

import java.util.List;

public interface AppointmentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Appointment record);

    int insertSelective(Appointment record);

    int updateByPrimaryKeySelective(Appointment record);

    int updateByPrimaryKey(Appointment record);

    List<Appointment> selectAll();

    Appointment selectByPrimaryKey(Integer id);

    List<Appointment> selectByTelephone(String telephone);

    List<Appointment> selectByCoachId(String coachid);

    List<Appointment> selectByComplete(Boolean complete);
}
