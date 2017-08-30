package cn.basic.service;

import cn.base.mapper.BaseCurdMapper;
import cn.base.service.BaseServiceImpl;
import cn.basic.mapper.BasicMapper;
import cn.basic.model.BasicData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BasicServiceImpl extends BaseServiceImpl<BasicData > implements BasicService {

    @Autowired
    private BasicMapper basicMapper;

    @Override
    public BaseCurdMapper<BasicData> init() {
        return basicMapper;
    }
}
