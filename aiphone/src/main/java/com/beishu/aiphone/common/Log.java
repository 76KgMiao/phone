package com.beishu.aiphone.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
******************************************************************************* 
**Copyright (C) 
**  BeiShu Co., Ltd. All Rights Reserved. 
**Version: 
**  1.0 
**Author: 
**  Miaoqx
**Date: 
**  Dec 27, 2018
**Modified History: 
**  <Author>  <Version>  <Date>       <Description> 
**  Miaoqx    V1.0       Dec 27, 2018      setup 
**Descriptions: 
**  日志接口
*******************************************************************************/
public interface Log {

    /**
     * 日志对象
     */
    public static final Logger phone_log = LoggerFactory.getLogger("PHONE");
    
}
