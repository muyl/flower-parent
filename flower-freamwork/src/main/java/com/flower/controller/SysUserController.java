package com.flower.controller;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.flower.core.entity.SysUser;
import com.flower.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("userList")
    @ResponseBody
    public List<SysUser> queryUserList(SysUser sysUser) {
        return sysUserService.queryUserList(sysUser);
    }
}
