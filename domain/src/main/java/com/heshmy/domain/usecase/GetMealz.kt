package com.heshmy.domain.usecase

import com.heshmy.domain.repo.MealsRepo

class GetMealz(private val mealsRepo:MealsRepo) {
    suspend operator fun invoke()= mealsRepo.getMealsFromRemote()
}