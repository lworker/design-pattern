package Structral.Proxy.DynamicProxyCglib;

public class UserDaoImp implements IUserDao {
    @Override
    public void save() {
        System.out.println("保存数据到数据库");
    }
}
