/**
 * Project Name:blueMobi
 * File Name:SelfLogger.java
 * Package Name:cn.bluemobi.controller
 * Date:下午2:39:08
 * Copyright (c) 2019, bluemobi All Rights Reserved.
 *
*/

package cn.bluemobi.controller;

import java.util.Date;

/**
 * Description: Date: 下午2:39:08 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public class SelfLogger {

    public void log() {
        // ip、uri、datetime
        System.out.println("SelfLogger......" + new Date());
        // 将ip、uri、datetime存入到数据库中去
    }

}
