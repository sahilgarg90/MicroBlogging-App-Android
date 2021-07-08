package com.sahilgarg90.libconduit.responses


import com.sahilgarg90.libconduit.models.Article
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SingleArticleResponse(
    @Json(name = "article") val article: Article?
)