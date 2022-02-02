package com.petarran.application.feign_client;

import com.petarran.application.data.Post;
import com.petarran.application.data.User;
import feign.Param;
import feign.RequestLine;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.validation.Valid;
import java.util.Collection;

public interface PostFeignClient extends CommonFeignClient<Post> {

    @RequestLine("GET getAll")
    Collection<Post> findAllPosts();

    @RequestLine("GET getFollowersPosts/{mail}")
    Collection<Post> findFollowersPosts(@Param("mail")String email);

    @RequestLine("GET getLikedPosts")
    Collection<Post> findLikedPosts();

    @RequestLine("POST addPost")
    void addPost(@Valid @RequestBody(required = true) Post post);

    @RequestLine("POST likePost?mail={mail}")
    void likePost(@Valid @RequestBody(required = true) Post post, @Param("mail")String mail);

    @RequestLine("GET getLikedPosts/{mail}")
    Collection<Post> findLikedPosts(@Param("mail")String email);

}
