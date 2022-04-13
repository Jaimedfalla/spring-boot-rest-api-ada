package ada.springboot.codelab.restApi.service;

import ada.springboot.codelab.restApi.data.User;
import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.List;

@Service
public class UserService implements IUserService{

    private HashMap<String,User> users;

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public User findById(String id) {
        return null;
    }

    @Override
    public List<User> all() {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }

    @Override
    public User update(User user, String userId) {
        return null;
    }
}
