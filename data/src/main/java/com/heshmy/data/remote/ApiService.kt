package com.heshmy.data.remote

import com.heshmy.domain.entity.MealzCategoryResponse
import retrofit2.http.GET

interface ApiService {
    @GET("categories.php")
fun getMeals():MealzCategoryResponse

}