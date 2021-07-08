package com.sahilgarg90.libconduit.responses


import com.sahilgarg90.libconduit.models.Article
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MultipleArticleResponse(
    @Json(name = "articles") val articles: List<Article>?,
    @Json(name = "articlesCount") val articlesCount: Int?
)