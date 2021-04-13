package com.example.firstspringandkotlinapp.repository

import com.example.firstspringandkotlinapp.entities.Article
import com.example.firstspringandkotlinapp.entities.User
import org.springframework.data.repository.CrudRepository

interface ArticleRepository : CrudRepository<Article, Long> {
    fun findBySlug(slug: String): Article?
    fun findAllByOrderByAddedAtDesc(): Iterable<Article>
}
interface UserRepository : CrudRepository<User, Long>{
    fun findByLogin(login: String): User?
}