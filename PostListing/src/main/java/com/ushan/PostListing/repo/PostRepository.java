package com.ushan.PostListing.repo;

import com.ushan.PostListing.model.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostRepository extends JpaRepository<Post,Integer> {
}
