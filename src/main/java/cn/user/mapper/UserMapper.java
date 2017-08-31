package cn.user.mapper;

import cn.base.mapper.BaseCurdMapper;
import cn.user.model.UserModel;

public interface UserMapper extends BaseCurdMapper<UserModel>{

    /**
     * 修改用户密码
     * @param userModel
     * @return
     */
    int resetPassword(UserModel userModel);

}
