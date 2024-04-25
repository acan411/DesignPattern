package com.example.springtest.redisTest;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author acan
 * @version 2024/01/25 14:17
 */
@Mapper
public interface UserMapperDao extends BaseMapper<UserBean> {

}
