package com.example.springtest.redisTest;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * @author acan
 * @version 2024/01/25 14:22
 */
@Data
@TableName("t0")
public class UserBean implements Serializable {

    private int id;
    private String department;
    private int salary;
    private String name;
}
