package com.rankmi.demo_kotlin.repository.datasource

import com.rankmi.demo_kotlin.entities.Post
import org.springframework.data.repository.CrudRepository

interface PostDataSource: CrudRepository<Post, Long>