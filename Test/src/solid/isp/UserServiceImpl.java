package solid.isp;

public class UserServiceImpl implements UserService{
    @Override
    public boolean register(String cellphone, String password) {
        return false;
    }

    @Override
    public boolean login(String cellphone, String password) {
        return false;
    }

    @Override
    public UserInfo getUserInfoById(long id) {
        return null;
    }

    @Override
    public UserInfo getUserInfoByCellphone(String cellphone) {
        return null;
    }
}
