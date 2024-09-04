package io.xzxj.canal.example.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Table;

/**
 * @author xzxj
 * @date 2023/3/11 13:53
 */
@Data
@TableName("t_test")
@Table(name = "t_test")
public class TestEntity {

    private Long id;

    private String name;

    @Column(name = "f_age")
    @TableField("f_age")
    private Integer age;

    @TableField("f_gender")
    @Column(name = "f_gender")
    private Integer gender;

    private byte[] annex;

}
