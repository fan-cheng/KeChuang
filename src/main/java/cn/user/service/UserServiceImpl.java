package cn.user.service;

import cn.base.mapper.BaseCurdMapper;
import cn.base.service.BaseServiceImpl;
import cn.user.mapper.UserMapper;
import cn.user.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserModel> implements UserService{

    @Autowired
    private UserMapper userMapper;

    public BaseCurdMapper<UserModel> init() {
        return userMapper;
    }

    public int resetPassword(UserModel userModel) {
        return userMapper.resetPassword(userModel);
    }
}
