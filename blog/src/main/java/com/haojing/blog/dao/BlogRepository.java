package com.haojing.blog.dao;

import com.haojing.blog.po.Blog;
import com.haojing.blog.service.BlogService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface BlogRepository extends JpaRepository<Blog, Long>, JpaSpecificationExecutor<Blog> {
}
