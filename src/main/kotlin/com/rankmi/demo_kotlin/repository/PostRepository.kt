package com.rankmi.demo_kotlin.repository

import com.rankmi.demo_kotlin.entities.Post
import com.rankmi.demo_kotlin.repository.datasource.PostDataSource
import org.springframework.stereotype.Component
import java.util.*

@Component
class PostRepository(private val dataSource: PostDataSource) {
    fun getById(id: Long): Optional<Post> {
        return dataSource.findById(id)
    }

    fun getAll(): MutableIterable<Post> {
        return dataSource.findAll();
    }

    fun deleteById(id: Long) {
        dataSource.deleteById(id)
    }

    fun save(post: Post): Post {
        return dataSource.save(post)
    }

    fun update(post: Post): Post {
        return dataSource.save(post)
    }

}