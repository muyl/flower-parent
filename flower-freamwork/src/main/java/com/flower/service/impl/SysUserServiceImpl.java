package com.flower.service.impl;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flower.core.entity.SysUser;
import com.flower.mapper.SysUserMapper;
import com.flower.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;


    @Override
    public List<SysUser> queryUserList(SysUser sysUser) {
        return sysUserMapper.queryUserList(sysUser);
    }
}
