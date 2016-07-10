This Project is build for redisson test, but find leopard project online so it's become a example of leopard which is very poor in doc.  
1. Leopard is wrapped of some of spring function , contains func like:  
    1.1 spring mvc  
    1.2 cache  
    1.3 db  (JDBC)  
    1.4 redis  
    1.5 distributed session  
    1.6 special Controller param :  
            String userAgent 获取浏览器类型，即Request Header中的userAgent.  
            int pageId 获取分页页码，默认为1，可以通过URL中的pageId、p、page三个参数指定该变量值.  
            int size 获取分页数据条数，默认为10.可以通过URL中的size参数指定该变量值.  
            long sessUid 获取session中保存的uid  
            String sessUsername 获取session中保存的username(通行证账号)  
            long cookieUid 获取cookie中的uid(未做登陆合法性验证)  
            long cookieLoginedUid 获取cookie中的uid(经过登陆验证)  
            String cookieUsername 获取cookie中的username(未做登陆合法性验证)  
            String cookieUsername 获取cookie中的username(经过登陆验证)  
            String proxyIp 获取代理服务器IP.  
            String sessionId 获取sessionId.  
            long uid 如果uid参数为空，则根据username参数实时解析.  
    1.7 智能登录检查，控制(@Frenquency 注解)  
    1.8 方法耗时监控  
    1.9 JsonView  
    1.10 简化数据源定义（bean文件）  
    1.11 智能配置<mvn:resources>  
很有需要研究leopard的源码，如果我能找到的话，至少API看看，有实际作用的  
1.2 redission  
