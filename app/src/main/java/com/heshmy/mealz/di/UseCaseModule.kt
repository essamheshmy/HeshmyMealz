package com.heshmy.mealz.di

import com.heshmy.domain.repo.MealsRepo
import com.heshmy.domain.usecase.GetMealz
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton


@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {
    @Provides
    fun provideUseCase(mealsRepo: MealsRepo):GetMealz{
        return GetMealz(mealsRepo)
    }
}