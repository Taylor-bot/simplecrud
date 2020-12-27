package cc.ztl.cool.user.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * (User)实体类
 *
 * @author Taylor
 * @since 2020-12-27 00:06:52
 */
@Data
public class User implements Serializable {
    private static final long serialVersionUID = 994774338102091494L;
    /**
    * 主键ID
    */
    private int id;
    /**
    * 姓名
    */
    private String name;
    /**
    * 年龄
    */
    private Integer age;
    /**
    * 邮箱
    */
    private String email;
    
    private Date createTime;
    
    private Date updateTime;
    
    private Integer version;
}