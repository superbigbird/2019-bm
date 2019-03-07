/**
 * Project Name:blueMobi
 * File Name:AdminTieziService.java
 * Package Name:cn.bluemobi.service
 * Date:下午4:15:17
 * Copyright (c) 2019, bluemobi All Rights Reserved.
 *
*/

package cn.bluemobi.service;

import java.util.Map;

/**
 * Description: Date: 下午4:15:17 <br/>
 * 
 * @author 丁鹏
 * @version
 * @see
 */
public interface AdminTieziService {

    Map<String, Object> findTiezis(Integer pageNum, Integer pageSize);

}
