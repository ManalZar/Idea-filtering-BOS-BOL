/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.sci.filtering.service.impl;

import java.util.List;
import ma.sci.filtering.bean.User;
import ma.sci.filtering.repository.UserDao;
import ma.sci.filtering.service.facade.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HPi7
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    public User findByReference(String reference) {
        return userDao.findByReference(reference);
    }

    @Override
    public int deleteByReference(String reference) {
        return userDao.deleteByReference(reference);
    }

    @Override
    public int save(User user) {
        User foundedUser = findByReference(user.getReference());
        if(foundedUser != null){
            return -1;
        }else{
            userDao.save(user);
            return 1;
        }
    }

    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

}
