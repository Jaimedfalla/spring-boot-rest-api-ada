package ada.springboot.codelab.restApi.service;

import ada.springboot.codelab.restApi.data.User;

import java.util.List;

public interface IUserService {
    User create(User user);
    User findById(String id);
    List<User> all();
    void deleteById(String id);
    User update(User user,String userId);
}
