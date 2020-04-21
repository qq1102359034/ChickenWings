package com.cnki.chickenwingsweb;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.*;

@SpringBootTest
class ChickenWingsWebApplicationTests {

    @Test
    void contextLoads() throws Exception {
//读取文件(字节流)
        String path=  System.getProperty("user.dir")+"\\src\\main\\resources\\data\\data";
        BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(path),"UTF-8"));
        //写入相应的文件
        //读取数据
        //循环取出数据
        byte[] bytes = new byte[1024];
        String str = null;
        int i=0;
        while ((str = in.readLine()) != null) {
            i++;
            String  s = str.replaceAll("\t", "\",\"");

            System.out.println("\""+s+"\"");
            //写入相关文件

        }
        //清楚缓存
        //关闭流
        in.close();

    }

}
