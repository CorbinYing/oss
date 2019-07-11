package com.quanwei.ossbigflie.base.oss;
/*
 * Copyright (c) 2018 the original author or authors.
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *     http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * @author yin
 */
import com.aliyun.oss.OSSClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class AliossSupport {
    /**
     * 由于使用FactoryBean产生ossclient，
     * 此处必须使用这种注入方式，不能使用构造方法注入
     */
    @Autowired
    private OSSClient ossClient;
    @Autowired
    private AliossConfigProperties aliossConfigProperties;

    /**
     * 返回默认ossClient，即使用配置文件初始化的ossclient
     *
     * @return
     */
    public  OSSClient defaultOssClient() {
        return ossClient;
    }

    /**
     * 返回默认地域访问名，即使用配置文件初始化
     * @return
     */
    public String defaultEndpoint(){
        return aliossConfigProperties.getEndpoint();
    }
    /**
     * 返回默认AccessKeyId，，即使用配置文件初始化
     * @return
     */
    public String defaultAccessKeyId(){
        return aliossConfigProperties.getAccessKeyId();
    }
    /**
     * 返回默认访问秘钥，即使用配置文件初始化
     * @return
     */
    public String defaultAccessKeySecret(){
        return aliossConfigProperties.getAccessKeySecret();
    }
    /**
     * 返回默认的bucket，即使用配置文件初始化
     * @return
     */
    public String defaultBucketName(){
        return aliossConfigProperties.getBucketName();
    }
    /**
     * 返回默认回调域名，即使用配置文件初始化
     * @return
     */
    public String defaultCallbackDomain(){
        return aliossConfigProperties.getCallbackDomain();
    }
    //--------------------------------------------------------------------------------------------------------------
    /**
     * 日后有需要自定义ossclient
     */

//    /**
//     * 自定义OSSClient，使用后需要
//     * @param endpoint
//     * @param accessKeyId
//     * @param secretAccessKey
//     * @return
//     */
//    public OSSClient instanceOssClient(String endpoint, String accessKeyId, String secretAccessKey) {
//        return new OSSClient(endpoint, accessKeyId, secretAccessKey);
//    }


}
