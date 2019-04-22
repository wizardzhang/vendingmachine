package com.wizard.service;

import com.wizard.model.UserInfo;

/**
 * Created by 10992 on 2017/8/9.
 */
public interface UserInfoService {
    UserInfo findByUsername(String username);
}
