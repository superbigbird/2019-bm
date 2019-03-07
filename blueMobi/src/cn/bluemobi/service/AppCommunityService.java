/**
 * Project Name:blueMobi
 * File Name:AppCommunityService.java
 * Package Name:cn.bluemobi.service
 * Date:上午9:56:09
 * Copyright (c) 2019, bluemobi All Rights Reserved.
 *
*/

package cn.bluemobi.service;

import java.util.List;
import java.util.Map;

import cn.bluemobi.entity.app.TieziInfo;

/**
 * Description: Date: 上午9:56:09 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public interface AppCommunityService {

    /**
     * 
     * Description: 创建圈子<br/>
     *
     * @author 丁鹏
     * @return
     */
    Map<String, Object> createCommunuty(Map<String, Object> paramMap);

    /**
     * 
     * Description: 分页获取帖子列表<br/>
     *
     * @author 丁鹏
     * @return
     */
    List<TieziInfo> getTeiziListByFenYe();

}
