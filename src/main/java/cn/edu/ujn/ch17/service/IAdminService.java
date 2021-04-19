package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Admin;

public interface IAdminService {
    public Admin findByTele(String telephone);
    public void addAdmin(Admin admin);
    public int ModifyAdmin(Admin admin);
    public int ModifyPassword(Admin admin);
}
