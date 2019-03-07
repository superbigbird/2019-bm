/**
 * Project Name:blueMobi
 * File Name:LoginController.java
 * Package Name:cn.bluemobi.controller.app
 * Date:上午10:37:05
 * Copyright (c) 2019, bluemobi All Rights Reserved.
 *
*/

package cn.bluemobi.controller.app;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.bluemobi.controller.AppController;
import cn.bluemobi.util.sms.HttpClientUtil;

/**
 * Description: Date: 上午10:37:05 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
@Scope(value = "prototype")
@Controller(value = "appLoginController")
@RequestMapping("/app/login")
public class LoginController extends AppController {

    /**
     * 
     * Description: 发送短信验证码<br/>
     *
     * @author 丁鹏
     * @param cellphone
     */
    @RequestMapping("/getSmsCode.htm")
    public void getSmsCode(@RequestParam(value = "cellphone", required = true) String cellphone) {
        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("status", "1");
        // 1、生成一个随机的验证码
        int smsCode = (int) (Math.random() * 10000);
        // 2、判断验证码是否存在
        // 1)不存在
        int result = HttpClientUtil.sendSMS(cellphone, "短信验证码为：" + smsCode + ",1分钟之内有效");
        if (result > 0) {
            // 将短信验证码添加到数据库表中去
        } else {// 短信发送失败
            resultMap.put("status", "0");
        }
        outJSON(resultMap);
    }

}
