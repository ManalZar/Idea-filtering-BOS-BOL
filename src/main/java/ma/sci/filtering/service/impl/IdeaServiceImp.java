/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.sci.filtering.service.impl;

import java.util.List;
import ma.sci.filtering.bean.Idea;
import ma.sci.filtering.repository.IdeaDao;
import ma.sci.filtering.service.facade.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author HPi7
 */
@Service
public class IdeaServiceImp implements IdeaService {

    @Autowired
    private IdeaDao ideaDao;

    @Override
    public Idea findByReference(String reference) {
        return ideaDao.findByReference(reference);
    }

    @Override
    public int deleteByReference(String reference) {
        return ideaDao.deleteByReference(reference);
    }

    @Override
    public int save(Idea idea) {
        Idea foundedIdea = findByReference(idea.getReference());
        if (foundedIdea != null) {
            return -1;
        } else {
            ideaDao.save(idea);
            return 1;
        }

    }

    @Override
    public List<Idea> findAll() {
        return ideaDao.findAll();
    }

}
