package com.wangzixiang.ssm.blog.service.impl;


import com.wangzixiang.ssm.blog.bean.User;
import com.wangzixiang.ssm.blog.constants.BlogEnum;
import com.wangzixiang.ssm.blog.exception.BlogException;
import com.wangzixiang.ssm.blog.mapper.AdminMapper;
import com.wangzixiang.ssm.blog.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

/**
 * Company :  北京动力节点
 * Author :   Andy
 * Date : 2020/7/14
 * Description :
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {

   // @Autowired
    //private AdminMapper adminMapper;

    @Override
    public void login(User user) {
        Example example = new Example(User.class);
        example.createCriteria().
                andEqualTo("username",user.getUsername())
                .andEqualTo("password",user.getPassword());

      //  user = adminMapper.selectOneByExample(example);
        //if(user == null){
      //      throw new BlogException(BlogEnum.LOGIN_ERROR);
     //   }
    }
}
