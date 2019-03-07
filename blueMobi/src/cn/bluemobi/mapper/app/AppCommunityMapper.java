/**
 * Project Name:blueMobi
 * File Name:AppCommunityMapper.java
 * Package Name:cn.bluemobi.mapper.app
 * Date:下午5:07:31
 * Copyright (c) 2019, bluemobi All Rights Reserved.
 *
*/

package cn.bluemobi.mapper.app;

import java.util.List;
import java.util.Map;

import cn.bluemobi.entity.app.TieziInfo;

/**
 * Description: Date: 下午5:07:31 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public interface AppCommunityMapper {

    /**
     * 
     * Description: 创建圈子<br/>
     *
     * @author 丁鹏
     * @param paramMap
     */
    void addCommunity(Map<String, Object> paramMap);

    /**
     * 
     * Description: 分页获取帖子列表<br/>
     *
     * @author 丁鹏
     * @return
     */
    List<TieziInfo> getTeiziListByFenYe();

}
