package cn.edu.ujn.ch17.service;

import cn.edu.ujn.ch17.dao.Admin;
import cn.edu.ujn.ch17.dao.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminServiceImpl implements IAdminService{

    @Autowired
    private AdminMapper adminMapper;
    @Override
    public Admin findByTele(String telephone) {
        return this.adminMapper.selectByPrimaryKey(telephone);
    }

    @Override
    public void addAdmin(Admin admin) {
        this.adminMapper.insert(admin);
    }

    @Override
    public int ModifyAdmin(Admin admin) {
        return this.adminMapper.updateByPrimaryKeySelective(admin);
    }

    @Override
    public int ModifyPassword(Admin admin) {
        return this.adminMapper.updateByPrimaryKeySelective(admin);
    }
}
