package com.flower.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flower.core.entity.SysUser;
import com.flower.mapper.SysUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


public interface SysUserService {

     List<SysUser> queryUserList(SysUser sysUser) ;

}
