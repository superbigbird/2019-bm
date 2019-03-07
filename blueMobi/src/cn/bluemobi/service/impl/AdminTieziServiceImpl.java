/**
 * Project Name:blueMobi
 * File Name:AdminTieziServiceImpl.java
 * Package Name:cn.bluemobi.service.impl
 * Date:下午4:16:36
 * Copyright (c) 2019, bluemobi All Rights Reserved.
 *
*/

package cn.bluemobi.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.bluemobi.mapper.admin.AdminTieziMapper;
import cn.bluemobi.service.AdminTieziService;

/**
 * Description: Date: 下午4:16:36 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
@Service
public class AdminTieziServiceImpl implements AdminTieziService {

    @Autowired
    private AdminTieziMapper adminTieziMapper;

    @Override
    public Map<String, Object> findTiezis(Integer pageNum, Integer pageSize) {
        // 获取分页数据
        int startIndex = (pageNum - 1) * pageSize;
        List<Map<String, Object>> tieziList = adminTieziMapper.getTieziList(startIndex, pageSize);
        // 获取帖子总数量
        int count = adminTieziMapper.countTiezi();
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("rows", tieziList);
        resultMap.put("total", count);
        return resultMap;
    }

}
