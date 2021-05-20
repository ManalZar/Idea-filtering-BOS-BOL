/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.sci.filtering.service.facade;

import java.util.List;
import ma.sci.filtering.bean.Idea;

/**
 *
 * @author HPi7
 */
public interface IdeaService {

    Idea findByReference(String reference);

    int deleteByReference(String reference);
    
    int save(Idea idea);
    
    List<Idea> findAll();
}
