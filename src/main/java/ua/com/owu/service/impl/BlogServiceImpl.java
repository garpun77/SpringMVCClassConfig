package ua.com.owu.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.com.owu.DAO.BlogDAO;
import ua.com.owu.entity.Blog;
import ua.com.owu.service.BlogService;

import java.util.List;

/**
 * Created by blackhaski on 24.05.17.
 */
@Service
@Transactional
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogDAO blogDAO;

    public void save(String blogName, String  blogDescr) {
        blogDAO.save(Blog.builder().blogName(blogName).blogDescr(blogDescr).build());
    }

    public List<Blog> findAll() {
        return blogDAO.findAll();
    }

    public Blog findOne(int id) {
        return blogDAO.findOne(id);
    }
}
