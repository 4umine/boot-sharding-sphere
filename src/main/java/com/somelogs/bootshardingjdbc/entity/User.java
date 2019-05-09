package com.somelogs.bootshardingjdbc.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 描述
 *
 * @author LBG - 2019/5/9
 */
@Data
public class User implements Serializable {

    private static final long serialVersionUID = -2359336982098859444L;

    /** 主键id **/
    private Long id;

    /** 姓名 **/
    private String realName;

    /** 手机号码 **/
    private String mobile;

    /** 密码 **/
    private String password;

    /** 创建日期 **/
    private Date createTime;

    /** 修改日期 **/
    private Date updateTime;

    /** 删除标记 1 删除, 0 未删除 **/
    private String delFlag;


}
