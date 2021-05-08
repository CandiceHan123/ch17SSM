package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Motion;

public interface IMotionService {
    public Motion findByTele(String telephone);
    public int modifyDuration(Motion record);
}
