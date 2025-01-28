package com.ushan.PostListing.repo;

import com.ushan.PostListing.model.Post;
import org.springframework.data.repository.ListCrudRepository;

public interface PostRepository extends ListCrudRepository<Post,Integer> {
}
