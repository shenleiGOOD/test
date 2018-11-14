package com.jk.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultType;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.jk.model.User;

@Mapper
public interface TestDao {

	@ResultType(com.jk.model.User.class)
	@Select(value="select  *   from  t_user")
	List<User> queryuser();

	@Delete("delete from t_user where id=#{id}")
	void deleteuser(String id);

	@Select(value="select  *   from  t_user where id=#{id}")
	User queryup(String id);
	
	@Insert("INSERT INTO t_user (id,name,password) VALUES(#{user.id},#{user.name},#{user.password})")
	void save(@Param("user")User user);
	
	@Update("update t_user set name=#{user.name},password=#{user.password} where id=#{user.id}")
	void updateuser(@Param("user")User user);	
}
