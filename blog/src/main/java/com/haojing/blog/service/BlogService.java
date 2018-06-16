package com.haojing.blog.service;

import com.haojing.blog.po.Blog;
import com.haojing.blog.po.Type;
import com.haojing.blog.vo.BlogQuery;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface BlogService {

    Blog get(Long id);

    Page<Blog> listBlog(Pageable pageable, BlogQuery blog);


    Blog saveBlog(Blog blog);

    Blog updateBlog(Long id, Blog blog);

    void deleteBlog(Long id);
}
