package cn.bluemobi.controller.admin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.bluemobi.controller.BaseController;
import cn.bluemobi.service.AdminDiscoveryService;
import cn.bluemobi.service.AdminService;

/**
 * 
 * Description: 管理员配置<br/>
 * date: 2015-8-12 下午3:43:22 <br/>
 * 
 * @author oscar_000
 * @version
 */
@Controller
@RequestMapping("/admin")
public class DiscoveryController extends BaseController {

    @Autowired
    private AdminDiscoveryService adminDiscoveryService;

    /**
     * 
     * Description: 跳转到发现列表页面<br/>
     *
     * @author 丁鹏
     * @return
     */
    @RequestMapping("/findDiscoveryList")
    public String findDiscoveryList() {
        return "admin/discovery/discoveryList.jsp";
    }

    /**
     * 
     * Description: EasyUI分页查看发现列表信息<br/>
     *
     * @author 丁鹏
     * @param page
     * @param rows
     */
    @RequestMapping("/getDiscoveryListByFenYe")
    public void getDiscoveryListByFenYe(@RequestParam(value = "page", defaultValue = "1") Integer page,
            @RequestParam(value = "rows", defaultValue = "10") Integer rows) {
        Map<String, Object> discoveryMap = adminDiscoveryService.findDiscoveryListByFenye(page, rows);
        outJSON(discoveryMap);
    }

    @Autowired
    private AdminService adminService;

    @RequestMapping("/addDiscovery")
    public void addDiscovery(String title, String content, Long publishUserId, String status, HttpSession session) {
        // 1、校验数据的合理性
        // 2、调用业务方法，将数据保存到数据库
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("title", title);
        resultMap.put("content", content);
        resultMap.put("publishUserId", publishUserId);
        resultMap.put("status", status);
        boolean flag = adminDiscoveryService.addDisCovery(resultMap);
        // 3、回显结果
        Map<String, Object> rMap = new HashMap<String, Object>();
        rMap.put("flag", flag);

        // 记录日志
        adminService.addLog(session, "添加发现", new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        outJSON(rMap);
    }

    /**
     * 
     * Description: 批量显示<br/>
     *
     * @author 丁鹏
     * @param idStr
     */
    @RequestMapping("/batchShow")
    public void batchShow(String idStr) {
        // 取出掉最后一个",","1,2,3"
        idStr = idStr.substring(0, idStr.lastIndexOf(","));
        boolean flag = adminDiscoveryService.batchUpdate(idStr);
        // 回显结果
        Map<String, Object> rMap = new HashMap<String, Object>();
        rMap.put("flag", flag);
        outJSON(rMap);
    }

    /**
     * 
     * Description: 获取管理员信息列表<br/>
     *
     * @author 丁鹏
     */
    @RequestMapping("/findSystemUserList")
    public void findSystemUserList() {
        List<Map<String, Object>> systemUserList = adminDiscoveryService.findSystemUserList();
        outJSON(systemUserList);
    }

    /**
     * 
     * Description: 带条件的发现搜索<br/>
     *
     * @author 丁鹏
     * @param paramMap
     * @return
     */
    @RequestMapping("/findDiscoveryListByCondition")
    // public void findDiscoveryListByCondition(@RequestBody Map<String, Object>
    // paramMap) {
    public void findDiscoveryListByCondition(String title, Long publishUserId, String status, String startTime,
            String endTime) {
        // 校验数据合法性
        // 调用业务层
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("title", title);
        paramMap.put("publishUserId", publishUserId);
        paramMap.put("status", status);
        paramMap.put("startTime", startTime);
        paramMap.put("endTime", endTime);
        System.out.println("paramMap=" + paramMap);
        List<Map<String, Object>> discoverList = adminDiscoveryService.findDiscoveryListByCondition(paramMap);
        outJSON(discoverList);
    }

}
