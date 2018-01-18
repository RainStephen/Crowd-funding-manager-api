package com.atguigu.atcrowdfunding.manager.dao;
import com.atguigu.atcrowdfunding.bean.User;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

@Component
public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    User selectByPrimaryKey(Integer id);

    List<User> selectAll();

    int updateByPrimaryKey(User record);
    
    //根据请求登录的参数从数据库中获取用户数据
	User queryUserlogin(Map<String, Object> paramMap);

	List<User> queryList(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize);
	List<User> queryList(@Param("startIndex") int startIndex, @Param("pageSize") int pageSize,@Param("where") String where);

	@Deprecated
	int queryCount();

    List<User> queryList(Map<String, Object> paramMap);

    int queryCount(Map<String, Object> paramMap);
}