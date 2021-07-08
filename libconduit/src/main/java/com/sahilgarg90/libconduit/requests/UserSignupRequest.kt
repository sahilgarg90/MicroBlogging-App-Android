package com.sahilgarg90.libconduit.requests


import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class UserSignupRequest(
    @Json(name = "user") val user: UserSignupData?
)