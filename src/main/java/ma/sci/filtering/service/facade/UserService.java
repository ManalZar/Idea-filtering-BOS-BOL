/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.sci.filtering.service.facade;

import java.util.List;
import ma.sci.filtering.bean.User;

/**
 *
 * @author HPi7
 */
public interface UserService {

    User findByReference(String reference);

    int deleteByReference(String reference);

    int save(User user);
    
    List<User> findAll();
}
