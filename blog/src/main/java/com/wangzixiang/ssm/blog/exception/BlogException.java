package com.wangzixiang.ssm.blog.exception;


import com.wangzixiang.ssm.blog.constants.BlogEnum;

/**
 * Company :  北京动力节点
 * Author :   Andy
 * Date : 2020/7/14
 * Description :
 * blog项目的异常类:负责项目中所有的不合法操作
 * 或者是给用户操作结果错误的提示
 */
public class BlogException extends RuntimeException{

    private BlogEnum blogEnum;

    public BlogException(BlogEnum blogEnum){
        super(blogEnum.getMess());
        this.blogEnum = blogEnum;
    }

}
