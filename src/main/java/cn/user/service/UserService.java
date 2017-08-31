package cn.user.service;

import cn.base.service.BaseService;
import cn.user.model.UserModel;

public interface UserService extends BaseService<UserModel>{
    /**
     * 修改密码
     * @param userModel
     * @return
     */
    int resetPassword(UserModel userModel);

}
