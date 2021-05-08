package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Thing;

import java.util.List;

public interface IThingService {
    public List<Thing> showAllThings();
    public int modifyThings(Thing record);
    public int deleteThings(String name);
    public Thing selectThingByName(String name);
}
