package com.mashirro.demoormmybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户实体类
 * 关于lombok注解含义解释：https://projectlombok.org/features/all
 * @Data:
 *      一个@ToString、@EqualsAndHashCode、@Getter（所有字段）和@Setter（所有非(最终)final字段）的快捷方式，以及@RequiredArgsConstructor！
 * @NoArgsConstructor, @RequiredArgsConstructor and @AllArgsConstructor:
 *      生成不带参数、每个final/non null字段一个参数或每个字段一个参数的构造函数。
 * @Builder:
 *      创建对象时无需麻烦！
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class User implements Serializable {
    private static final long serialVersionUID = -1840831686851699943L;

    /**
     * 主键
     */
    private Long id;

    /**
     * 用户名
     */
    private String name;

    /**
     * 加密后的密码
     */
    private String password;

    /**
     * 加密使用的盐
     */
    private String salt;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 手机号码
     */
    private String phoneNumber;

    /**
     * 状态，-1：逻辑删除，0：禁用，1：启用
     */
    private Integer status;

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 上次登录时间
     */
    private Date lastLoginTime;

    /**
     * 上次更新时间
     */
    private Date lastUpdateTime;
}
