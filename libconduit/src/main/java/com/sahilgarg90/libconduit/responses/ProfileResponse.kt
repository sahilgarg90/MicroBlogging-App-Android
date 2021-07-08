package com.sahilgarg90.libconduit.responses


import com.sahilgarg90.libconduit.models.Profile
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ProfileResponse(
    @Json(name = "profile") val profile: Profile?
)