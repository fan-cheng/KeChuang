package cn.basic.controller;

import cn.base.utils.DateUtil;
import cn.base.utils.ResultFactory;
import cn.basic.model.BasicData;
import cn.basic.service.BasicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@RequestMapping(value = "/api")
@Controller
public class BasicController {

    @Autowired
    private BasicService basicService;

    @RequestMapping(value = "/addBasicData",method = RequestMethod.POST)
    @ResponseBody
    public Object addBasicData(@ModelAttribute BasicData data,HttpServletRequest request){

        data.setUpdateDate(DateUtil.getStringCurrentDate());
        int line = basicService.add(data);
        if (line > 0){
            return ResultFactory.requestResult(ResultFactory.CODE_200);
        }
        return ResultFactory.requestResult(ResultFactory.CODE_1002);

    }
}
