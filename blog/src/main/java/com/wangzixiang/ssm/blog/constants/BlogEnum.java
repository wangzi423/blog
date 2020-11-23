package com.wangzixiang.ssm.blog.constants;

/**
 * 定义异常类型
 */
public enum BlogEnum {

    LOGIN_ERROR("用户名或密码错误"),
    AUTH_ERROR("验证码输入错误");

    public String getMess() {
        return mess;
    }

    public void setMess(String mess) {
        this.mess = mess;
    }

    private String mess;

    BlogEnum(String mess){
        this.mess = mess;
    }
}
