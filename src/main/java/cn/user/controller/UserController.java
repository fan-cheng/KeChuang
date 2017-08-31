package cn.user.controller;

import cn.base.utils.CommonUtils;
import cn.base.utils.DateUtil;
import cn.base.utils.ResultFactory;
import cn.user.model.UserModel;
import cn.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RequestMapping(value = "/api")
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    /**
     * 增加用户
     * @param userModel
     * @return
     */
    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    @ResponseBody
    public Object addUser(@ModelAttribute UserModel userModel){
        userModel.setCreateDate(DateUtil.getStringCurrentDate());
        int line = userService.add(userModel);
        if(line >0){
            return ResultFactory.requestResult(ResultFactory.CODE_200);
        }

        return ResultFactory.requestResult(ResultFactory.CODE_1002);

    }

    /**
     * 修改用户信息
     * @param userModel
     * @return
     */
    @RequestMapping(value = "/updateUser",method = RequestMethod.POST)
    @ResponseBody
    public Object updateUser(@ModelAttribute UserModel userModel){

        userModel.setCreateDate(DateUtil.getStringCurrentDate());
        int line = userService.modifyById(userModel);
        if(line >0){
            return ResultFactory.requestResult(ResultFactory.CODE_200);
        }

        return ResultFactory.requestResult(ResultFactory.CODE_1002);
    }

    /**
     * 查询用户集合
     * @return
     */
    @RequestMapping(value = "/getUserList",method = RequestMethod.GET)
    @ResponseBody
    public Object getUserList(){
        List<UserModel> data = userService.findByParam(null);
        if(CommonUtils.isEmpty(data)){
            return ResultFactory.requestResult(ResultFactory.CODE_1001);
        }
        return ResultFactory.requestResult(data);
    }

    /**
     * 删除用户
     * @param userModel
     * @return
     */
    @RequestMapping(value = "/deleteUser",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteUser(@ModelAttribute UserModel userModel){

        userModel.setCreateDate(DateUtil.getStringCurrentDate());
        int line = userService.deleteById(userModel);
        if(line >0){
            return ResultFactory.requestResult(ResultFactory.CODE_200);
        }

        return ResultFactory.requestResult(ResultFactory.CODE_1005);
    }

    /**
     *
     * @param userModel  只需要传id,新密码即可
     * @param oldPassword 旧密码
     * @return
     */
    @RequestMapping(value = "/resetPassword",method = RequestMethod.POST)
    @ResponseBody
    public Object resetPassword(@ModelAttribute UserModel userModel,String oldPassword){
        UserModel tempUser = userService.findById(userModel);
        //根据id查询用户是否存在
        if(CommonUtils.isEmpty(tempUser)){
            return ResultFactory.requestResult(ResultFactory.CODE_1003);
        }
        //对比密码
        if(!tempUser.getPassword().equals(oldPassword)){
            return ResultFactory.requestResult(ResultFactory.CODE_1004);
        }
        int line = userService.resetPassword(userModel);
        if(line >0){
            return ResultFactory.requestResult(ResultFactory.CODE_200);
        }

        return ResultFactory.requestResult(ResultFactory.CODE_1002);
    }
}
