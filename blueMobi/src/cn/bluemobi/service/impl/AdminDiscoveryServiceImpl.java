/**
 * Project Name:blueMobi
 * File Name:AdminDiscoveryServiceImpl.java
 * Package Name:cn.bluemobi.service.impl
 * Date:上午11:28:12
 * Copyright (c) 2019, bluemobi All Rights Reserved.
 *
*/

package cn.bluemobi.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bluemobi.mapper.admin.AdminDiscoveryMapper;
import cn.bluemobi.service.AdminDiscoveryService;

/**
 * Description: Date: 上午11:28:12 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
@Service
public class AdminDiscoveryServiceImpl implements AdminDiscoveryService {

    @Autowired
    private AdminDiscoveryMapper adminDiscoveryMapper;

    @Override
    public Map<String, Object> findDiscoveryListByFenye(Integer pageNum, Integer pageSize) {
        // 计算出索引值
        int startIndex = (pageNum - 1) * pageSize;
        List<Map<String, Object>> discoveryList = adminDiscoveryMapper.getDiscoveryList(startIndex, pageSize);
        // 统计总记录条数
        int count = adminDiscoveryMapper.countDiscovery();
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("rows", discoveryList);
        paramMap.put("total", count);
        return paramMap;
    }

    @Override
    public boolean addDisCovery(Map<String, Object> paramMap) {
        return adminDiscoveryMapper.insertDisCovery(paramMap) == 1;
    }

    @Override
    public boolean batchUpdate(String idStr) {
        return adminDiscoveryMapper.batchUpdate(idStr) >= 1;
    }

    @Override
    public List<Map<String, Object>> findSystemUserList() {
        return adminDiscoveryMapper.getSystemUserList();
    }

    @Override
    public List<Map<String, Object>> findDiscoveryListByCondition(Map<String, Object> paramMap) {
        return adminDiscoveryMapper.getDiscoveryListByCondition(paramMap);
    }

}
