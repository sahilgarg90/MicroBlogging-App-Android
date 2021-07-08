package com.sahilgarg90.libconduit.responses


import com.sahilgarg90.libconduit.models.Comment
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class MultipleCommentResponse(
    @Json(name = "comments") val comments: List<Comment>?
)