package com.rankmi.demo_kotlin.entities

import javax.persistence.*

@Entity
@Table(name = "post")
data class Post(
        @Id
        val id: Long = 0L,
        var title: String,
        var body: String,
        @OneToMany
        @JoinColumn(name = "post_id")
        var comments: List<Comment>
)

