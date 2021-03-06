package com.javamaster.cringegram.cringegram.repository;

import com.javamaster.cringegram.cringegram.entity.CommentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CommentEntityRepository extends JpaRepository<CommentEntity, Long> {
    List<CommentEntity> getByPostId(Long postId);
}
