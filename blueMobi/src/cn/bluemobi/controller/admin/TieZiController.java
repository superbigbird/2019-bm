package cn.bluemobi.controller.admin;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.bluemobi.controller.BaseController;
import cn.bluemobi.service.AdminTieziService;

/**
 * 
 * Description: 管理员配置<br/>
 * date: 2015-8-12 下午3:43:22 <br/>
 * 
 * @author oscar_000
 * @version
 */
@Controller
@RequestMapping("/admin/tiezi")
public class TieZiController extends BaseController {

    @Autowired
    private AdminTieziService adminTieziService;

    /**
     * 
     * Description: 获取帖子信息<br/>
     *
     * @author 丁鹏
     * @param rows
     * @param page
     */
    @RequestMapping("/getTieziList")
    public void getTieziList(@RequestParam(value = "rows", defaultValue = "10") Integer rows,
            @RequestParam(value = "page", defaultValue = "1") Integer page) {
        Map<String, Object> tieziMap = adminTieziService.findTiezis(page, rows);
        outJSON(tieziMap);
    }

    /**
     * 
     * Description: 跳转到帖子列表页面<br/>
     *
     * @author 丁鹏
     * @return
     */
    @RequestMapping("/findTieziList")
    public String findTieziList() {
        return "admin/tiezi/tieziList.jsp";
    }

}
