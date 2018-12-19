package com.flower.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.flower.core.entity.SysUser;

import java.util.List;

public interface SysUserMapper  extends BaseMapper<SysUser> {


    List<SysUser> queryUserList(SysUser sysUser);
}
