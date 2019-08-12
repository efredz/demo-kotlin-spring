package com.rankmi.demo_kotlin.entities

import java.time.ZonedDateTime
import javax.persistence.Entity
import javax.persistence.Id

@Entity
data class Comment(
        @Id
        val id: Long,
        var authorEmail: String,
        var date: ZonedDateTime,
        var body: String
)
