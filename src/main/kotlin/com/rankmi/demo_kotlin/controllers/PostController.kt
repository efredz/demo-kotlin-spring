package com.rankmi.demo_kotlin.controllers

import com.rankmi.demo_kotlin.entities.Post
import com.rankmi.demo_kotlin.repository.PostRepository
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/post")
class PostController(private val postRepository: PostRepository) {

    @GetMapping("/{id}")
    fun getById(id: Long): Optional<Post> {
        return postRepository.getById(id)
    }

    @GetMapping
    fun getAll(): MutableIterable<Post> {
        return postRepository.getAll()
    }

    @DeleteMapping("/{id}")
    fun deleteById(id: Long) {
        return postRepository.deleteById(id)
    }


    @PutMapping
    fun put(post: Post): Post {
        return postRepository.update(post)
    }

    @PostMapping
    fun post(post: Post): Post {
        return postRepository.save(post)
    }

}