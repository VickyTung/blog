package com.haojing.blog.dao;

import com.haojing.blog.po.Blog;
import com.haojing.blog.service.BlogService;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface BlogRepository extends JpaRepository<Blog, Long>, JpaSpecificationExecutor<Blog> {

    @Query("select b from Blog b where b.recommended = true ")
    List<Blog> findTop(Pageable pageable);
}

