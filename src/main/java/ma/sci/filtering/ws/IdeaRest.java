/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ma.sci.filtering.ws;

import java.util.List;
import ma.sci.filtering.bean.Idea;
import ma.sci.filtering.service.facade.IdeaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author HPi7
 */

@RestController
@RequestMapping("v1/filtering-api/idea")
public class IdeaRest {
    @Autowired
    private IdeaService ideaService;

    @GetMapping("/reference/{reference}")
    public Idea findByReference(@PathVariable String reference) {
        return ideaService.findByReference(reference);
    }

    @DeleteMapping("/reference/{reference}")
    public int deleteByReference(@PathVariable String reference) {
        return ideaService.deleteByReference(reference);
    }

    @PostMapping("/")
    public int save(@RequestBody Idea idea) {
        return ideaService.save(idea);
    }

    @GetMapping("/")
    public List<Idea> findAll() {
        return ideaService.findAll();
    }
    
    
    
}
