package com.heshmy.data.repo

import com.heshmy.data.remote.ApiService
import com.heshmy.domain.entity.MealzCategoryResponse
import com.heshmy.domain.repo.MealsRepo

class MealsRepoImpl(private val apiService:ApiService) :MealsRepo{
    override fun getMealsFromRemote(): MealzCategoryResponse =apiService.getMeals()
}