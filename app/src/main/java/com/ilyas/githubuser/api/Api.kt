package com.ilyas.githubuser.api

import com.ilyas.githubuser.data.model.UserResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface Api {
    @GET("search/users")
    @Headers("Authorization: token d38b98f11f969ee821771365e88409c465f54363")
    fun getSearchUsers(
        @Query("q") query: String
    ): Call<UserResponse>
}