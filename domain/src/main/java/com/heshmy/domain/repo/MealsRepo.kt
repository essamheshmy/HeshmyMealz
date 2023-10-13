package com.heshmy.domain.repo

import com.heshmy.domain.entity.MealzCategoryResponse


interface MealsRepo {
    fun getMealsFromRemote(): MealzCategoryResponse
}