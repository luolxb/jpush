package com.ruosen.jpush.utils;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class JPushTest {

    @Autowired
    private JPush jPush;

    private Map<String,String> init (){
        //设置推送参数
        Map<String, String> parm = new HashMap<String, String>();
        //这里的id是,移动端集成极光并登陆后,极光用户的rid
        parm.put("id","140fe1da9e16b4ee700");
        //设置提示信息,内容是文章标题
        parm.put("msg","测试测试,收到请联系发送人");
        return parm;
    }

    @Test
    void jpushAndroid() {
        jPush.jpushAndroid(init());
    }

    @Test
    void jpushIOS() {
        jPush.jpushIOS(init());
    }

    @Test
    void jpushAll() {
        jPush.jpushAll(init());
    }
}