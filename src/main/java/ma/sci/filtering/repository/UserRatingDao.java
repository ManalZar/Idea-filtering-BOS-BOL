/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.sci.filtering.repository;

import ma.sci.filtering.bean.UserRating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author HPi7
 */
@Repository
public interface UserRatingDao extends JpaRepository<UserRating, Long> {
    
    
}
