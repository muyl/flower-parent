package com.flower.core.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (SysUser)实体类
 *
 * @author makejava
 * @since 2018-12-08 15:49:56
 */
@Data
public class SysUser implements Serializable {
    private static final long serialVersionUID = 572763899738650746L;
    
    private String userId;
    
    private String loginName;
    
    private String password;
    
    private String userName;
    
    private String orgId;
    
    private String telephone;
    
    private String mobile;
    
    private String userAddress;
    
    private String email;
    
    private Object avatar;
    
    private Date loginTime;
    
    private Date logoutTime;
    
    private String status;
    
    private Date createTime;
    
    private Date updateTime;
    
    private String type;
    
    private String employeeId;

}