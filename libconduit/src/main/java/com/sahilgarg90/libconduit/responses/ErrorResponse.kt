package com.sahilgarg90.libconduit.responses


import com.sahilgarg90.libconduit.models.Errors
import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class ErrorResponse(
    @Json(name = "errors") val errors: Errors?
)