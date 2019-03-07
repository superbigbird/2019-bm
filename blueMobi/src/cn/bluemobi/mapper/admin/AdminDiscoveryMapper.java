/**
 * Project Name:blueMobi
 * File Name:AdminDiscoveryMapper.java
 * Package Name:cn.bluemobi.mapper.admin
 * Date:上午11:22:45
 * Copyright (c) 2019, bluemobi All Rights Reserved.
 *
*/

package cn.bluemobi.mapper.admin;
/**
 * Description: 
 * Date:     上午11:22:45 <br/>
 * @author   丁鹏
 * @version  
 * @see 	 
 */

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface AdminDiscoveryMapper {

    /**
     * Description: 分页查询发现列表<br/>
     *
     * @author 丁鹏
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Map<String, Object>> getDiscoveryList(Integer startIndex, Integer pageSize);

    /**
     * 
     * Description: 统计发现表中的数据记录数<br/>
     *
     * @author 丁鹏
     * @return
     */
    int countDiscovery();

    /**
     * 
     * Description: 添加发现<br/>
     *
     * @author 丁鹏
     * @param paramMap
     * @return
     */
    int insertDisCovery(Map<String, Object> paramMap);

    /**
     * 
     * Description: 批量修改<br/>
     *
     * @author 丁鹏
     * @param idStr
     * @return
     */
    int batchUpdate(@Param("idStr") String idStr);

    /**
     * 
     * Description: 获取后台系统管理员信息<br/>
     *
     * @author 丁鹏
     * @return
     */
    List<Map<String, Object>> getSystemUserList();

    /**
     * 
     * Description: 带条件的发现搜索<br/>
     *
     * @author 丁鹏
     * @param paramMap
     * @return
     */
    List<Map<String, Object>> getDiscoveryListByCondition(Map<String, Object> paramMap);
}
