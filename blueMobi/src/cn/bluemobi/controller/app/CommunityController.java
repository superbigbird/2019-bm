/**
 * Project Name:blueMobi
 * File Name:CommunityController.java
 * Package Name:cn.bluemobi.controller.app
 * Date:下午4:59:46
 * Copyright (c) 2019, bluemobi All Rights Reserved.
 *
*/

package cn.bluemobi.controller.app;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.bluemobi.controller.AppController;
import cn.bluemobi.entity.app.TieziInfo;
import cn.bluemobi.service.AppCommunityService;

/**
 * Description: Date: 下午4:59:46 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
@Controller
@RequestMapping("/app/community")
public class CommunityController extends AppController {

    @Autowired
    private AppCommunityService appCommunityService;

    /**
     * 
     * Description: 创建圈子<br/>
     *
     * @author 丁鹏
     * @return
     * @throws IOException
     */
    @RequestMapping("/createCommunity.htm")
    public void createCommunity(HttpServletResponse response, String communityName, int communityType, int roler,
            Long userId) throws IOException {
        // 首先校验数据的合理性
        // 2、调用添加圈子的业务层
        // 3、封装结果信息并且返回
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("cName", communityName);
        paramMap.put("ct", communityType);
        paramMap.put("userId", userId);
        Map<String, Object> communityMap = appCommunityService.createCommunuty(paramMap);
        outJSON(communityMap);
    }

    /**
     * 
     * Description: 分页获取帖子列表信息<br/>
     *
     * @author 丁鹏
     * @return
     */
    @RequestMapping("/getTieZiListByFenYe.htm")
    public void getTieZiListByFenYe() {
        List<TieziInfo> resultList = appCommunityService.getTeiziListByFenYe();
        outJSON(resultList);
    }

}
