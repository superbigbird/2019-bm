/**
 * Project Name:blueMobi
 * File Name:AppCommunityServiceImpl.java
 * Package Name:cn.bluemobi.service.impl
 * Date:上午9:57:41
 * Copyright (c) 2019, bluemobi All Rights Reserved.
 *
*/

package cn.bluemobi.service.impl;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bluemobi.entity.app.TieziInfo;
import cn.bluemobi.mapper.app.AppCommunityMapper;
import cn.bluemobi.service.AppCommunityService;

/**
 * Description: Date: 上午9:57:41 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
@Service
public class AppCommunityServiceImpl implements AppCommunityService {

    @Autowired
    private AppCommunityMapper appCommunityMapper;

    @Override
    public Map<String, Object> createCommunuty(Map<String, Object> paramMap) {
        appCommunityMapper.addCommunity(paramMap);
        return paramMap;
    }

    @Override
    public List<TieziInfo> getTeiziListByFenYe() {
        return appCommunityMapper.getTeiziListByFenYe();
    }

}
