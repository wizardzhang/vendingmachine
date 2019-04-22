package com.wizard.dao;

import com.wizard.model.UserInfo;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by 10992 on 2017/8/10.
 */
public interface UserInfoDao extends CrudRepository<UserInfo, Long>{
    UserInfo findByUsername(String username);
}
