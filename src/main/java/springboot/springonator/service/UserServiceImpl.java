package springboot.springonator.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import springboot.springonator.dao.UserDAO;
import springboot.springonator.entity.User;

@Service
@Transactional

public class UserServiceImpl {

    @Autowired
    private UserDAO dao;


    public void save(User user) {
        dao.save(user);
    }

}
