package cn.bluemobi.service;

import java.util.List;
import java.util.Map;

/**
 * 管理员接口
 * 
 * @author lvxh
 * 
 */
public interface AdminDiscoveryService {

    /**
     * 
     * Description: 给easyui返回发现列表数据<br/>
     *
     * @author 丁鹏
     * @param pageNum
     * @param pageSize
     * @return
     */
    Map<String, Object> findDiscoveryListByFenye(Integer pageNum, Integer pageSize);

    /**
     * 
     * Description: 添加发现<br/>
     *
     * @author 丁鹏
     * @param paramMap
     * @return
     */
    boolean addDisCovery(Map<String, Object> paramMap);

    /**
     * 
     * Description: 批量修改<br/>
     *
     * @author 丁鹏
     * @param idStr
     * @return
     */
    boolean batchUpdate(String idStr);

    /**
     * 
     * Description: 获取后台系统管理员信息<br/>
     *
     * @author 丁鹏
     * @return
     */
    List<Map<String, Object>> findSystemUserList();

    /**
     * 
     * Description: 带条件的发现搜索<br/>
     *
     * @author 丁鹏
     * @param paramMap
     * @return
     */
    List<Map<String, Object>> findDiscoveryListByCondition(Map<String, Object> paramMap);

}
