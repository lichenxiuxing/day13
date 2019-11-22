package cn.UserService;

import cn.UserDao.Dao;
import cn.UserDomain.User;

/**
 * @Copyright LiChen
 * 用户：biyang
 * 创建时间：2019/11/22
 * 18:02
 */
//依赖于DAO,通过DAO获取数据。
public class Service {
    private Dao dao = new Dao();
    public User find(){
        return dao.find();
    }
}
