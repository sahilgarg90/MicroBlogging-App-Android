package com.sahilgarg90.libconduit.responses


import com.sahilgarg90.libconduit.models.Comment
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class SingleCommentResponse(
    @Json(name = "comments") val comment: Comment?
)