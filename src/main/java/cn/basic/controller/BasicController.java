package cn.basic.controller;

import cn.base.utils.CommonUtils;
import cn.base.utils.DateUtil;
import cn.base.utils.ResultFactory;
import cn.basic.model.BasicData;
import cn.basic.service.BasicService;
import javafx.beans.binding.ObjectExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@RequestMapping(value = "/api")
@Controller
public class BasicController {

    @Autowired
    private BasicService basicService;

    /**
     * 添加基础数据
     * @param data
     * @return
     */
    @RequestMapping(value = "/addBasicData",method = RequestMethod.POST)
    @ResponseBody
    public Object addBasicData(@ModelAttribute BasicData data){

        data.setUpdateDate(DateUtil.getStringCurrentDate());
        int line = basicService.add(data);
        if (line > 0){
            return ResultFactory.requestResult(ResultFactory.CODE_200);
        }
        return ResultFactory.requestResult(ResultFactory.CODE_1002);
    }

    /**
     * 更新基础数据
     * @param data
     * @param request
     * @return
     */
    @RequestMapping(value = "/updateBasicData",method = RequestMethod.POST)
    @ResponseBody
    public Object updateBasicData(@ModelAttribute BasicData data){
        data.setUpdateDate(DateUtil.getStringCurrentDate());
        int line = basicService.modifyById(data);
        if (line > 0){
            return ResultFactory.requestResult(ResultFactory.CODE_200);
        }
        return ResultFactory.requestResult(ResultFactory.CODE_1002);
    }

    /**
     * 查询基础数据
     * @return
     */
    @RequestMapping(value = "/getBasicData",method = RequestMethod.GET)
    @ResponseBody
    public Object getBasicData(){
        List<BasicData> data = basicService.findByParam(null);
        if(CommonUtils.isEmpty(data)){
            return ResultFactory.requestResult(ResultFactory.CODE_1001);
        }
        return ResultFactory.requestResult(data);
    }
    @RequestMapping(value = "/deleteBasicData",method = RequestMethod.POST)
    @ResponseBody
    public Object deleteBasicData(@ModelAttribute BasicData data){
        int line = basicService.deleteById(data);
        if (line > 0){
            return ResultFactory.requestResult(ResultFactory.CODE_200);
        }
        return ResultFactory.requestResult(ResultFactory.CODE_404);
    }

}
