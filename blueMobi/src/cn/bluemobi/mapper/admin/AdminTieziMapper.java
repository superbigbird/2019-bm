/**
 * Project Name:ecommercePlatform
 * File Name:LoginMapper.java
 * Package Name:cn.bluemobi.mapper.admin
 * Date:2015-7-9下午2:44:42
 * Copyright (c) 2015, oscarwang1988@126.com All Rights Reserved.
 *
 */

package cn.bluemobi.mapper.admin;

import java.util.List;
import java.util.Map;

/**
 * Description: <br/>
 * Date: 2015-7-9 下午2:44:42 <br/>
 * 
 * @author oscar_000
 * @version
 * @see
 */
public interface AdminTieziMapper {

    /**
     * 
     * Description: 获取帖子信息<br/>
     *
     * @author 丁鹏
     * @param startIndex
     * @param pageSize
     * @return
     */
    List<Map<String, Object>> getTieziList(Integer startIndex, Integer pageSize);

    /**
     * 
     * Description: 统计帖子的总数量<br/>
     *
     * @author 丁鹏
     * @return
     */
    int countTiezi();
}
