package cn.UserDao;

import cn.UserDomain.User;

/**
 * @Copyright LiChen
 * 用户：biyang
 * 创建时间：2019/11/22
 * 17:58
 */
public class Dao {
    public User find(){
        //将查询到的数据进行打包，返回给service
        return new User("zhangsna","132");
    }
}
