package com.mashirro.demoormmybatis;

import com.mashirro.demoormmybatis.entity.User;
import com.mashirro.demoormmybatis.mapper.UserMapper;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.List;

@Slf4j
@SpringBootTest
class DemoOrmMybatisApplicationTests {

	@Test
	void contextLoads() {
	}

	@Autowired
	private UserMapper userMapper;

	/**
	 * 测试查询所有
	 */
	@Test
	public void selectAllUser() {
		List<User> userList = userMapper.selectAllUser();
		log.debug("【userList】= {}", userList);
	}


	/**
	 * 测试根据主键删除
	 */
	@Test
	public void deleteById() {
		int i = userMapper.deleteById(1L);
	}

}
