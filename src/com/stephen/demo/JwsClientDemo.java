package com.stephen.demo;

/**
 * Created by stephen on 2021-02-24 15:46 .
 * Description:
 * 使用jdk提供的wsimport命令生成客户端代码
 * 新建一个项目 webserviceclientdemo
 * 打开cmd命令行，输入 wsimport -s “src目录” -p “生成类所在包名” -keep “wsdl发布地址”
 * wsimport -s E:\Self_projects\webservcieclientdemo\src -p com.stephen.demo -keep http://localhost:8089/Service/ServiceHello?wsdl
 */
public class JwsClientDemo {
    public static void main(String[] args) {
        WebServiceHello hello = new WebServiceHelloService().getWebServiceHelloPort();
        String result = hello.getValue("测试参数0001");
        System.out.println("result: " + result); // 欢迎你！测试参数0001
    }
}
