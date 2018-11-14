package com.jk.service;

import java.util.List;

import com.jk.model.User;


public interface TestService  {

	List<User> queryuser();

	void deleteuser(String id);

	/** <pre>queryup(这里用一句话描述这个方法的作用)   
	 * 创建人：申磊
	 * 创建时间：2018年11月12日 下午9:41:28    
	 * 修改人：申磊
	 * 修改时间：2018年11月12日 下午9:41:28    
	 * 修改备注： 
	 * @param id
	 * @return</pre>    
	 */
	User queryup(String id);

	void save(User user);

	void updateuser(User user);

}
