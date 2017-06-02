package ua.com.owu.service;

import ua.com.owu.entity.Blog;

import java.util.List;

/**
 * Created by blackhaski on 24.05.17.
 */

public interface BlogService {
    void save(String blogName, String blogDescr);
    List<Blog> findAll();
    Blog findOne(int id);
}
