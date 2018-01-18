package com.atguigu.atcrowdfunding.manager.service;
import java.util.Map;
import com.atguigu.atcrowdfunding.bean.User;
import com.atguigu.atcrowdfunding.util.Page;
import org.springframework.stereotype.Service;

@Service("userService")
public interface UserService {

	User queryUserlogin(Map<String, Object> paramMap);

	@Deprecated
	Page<User> queryPage(int pageNo, int pageSize);

	public Page<User> queryPage(int pageNo, int pageSize,Map<String, Object> map);

	int save(User user);
}
