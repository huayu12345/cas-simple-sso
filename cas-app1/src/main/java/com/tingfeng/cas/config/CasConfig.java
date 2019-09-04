package com.tingfeng.cas.config;

/**
 * Cas 的一些配置项
 */
public class CasConfig {

    /**
     * 当前应用程序的baseUrl（注意最后面的斜线）
     */
    public static String SERVER_NAME = "http://localhost:8181/";


    /**
     * App1 登出成功url
     */
    public static String APP_LOGOUT_PATH = SERVER_NAME + "user/logout/success";


    /**
     * CAS服务器地址
     */
    //public static String CAS_SERVER_PATH = "https://localhost:8443/cas";
    public static String CAS_SERVER_PATH = "http://localhost:8443/cas";

    /**
     * CAS登陆服务器地址
     */
   //public static String CAS_SERVER_LOGIN_PATH = "https://localhost:8443/cas/login";
    public static String CAS_SERVER_LOGIN_PATH = "http://localhost:8443/cas/login";

    /**
     * CAS登出服务器地址
     */
    //public static String CAS_SERVER_LOGOUT_PATH = "https://localhost:8443/cas/logout";
    public static String CAS_SERVER_LOGOUT_PATH = "http://localhost:8443/cas/logout";


}
