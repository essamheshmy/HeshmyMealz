package com.heshmy.mealz.presentation.scrins.bottom_screens.mealz_list

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.heshmy.data.remote.ApiService
import com.heshmy.data.repo.MealsRepoImpl
import com.heshmy.domain.entity.MealzCategoryResponse
import com.heshmy.domain.usecase.GetMealz
import com.heshmy.mealz.name
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.lang.Exception
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@HiltViewModel
class MealsListViewModel
@Inject constructor(private val getMealsUseCase: GetMealz):ViewModel(){
    private val _categories:MutableStateFlow<MealzCategoryResponse?> = MutableStateFlow(null)
            val  category:SharedFlow<MealzCategoryResponse?> =_categories
    fun getMeals()={
    viewModelScope.launch {
    try {
   _categories.value= getMealsUseCase()
    }catch (e:Exception){
   Log.e("MelasViewModel",e.message.toString())
    } } }

/*

    fun apiService()= Retrofit.Builder()
        .baseUrl("www.themealdb.com/api/json/v1/1/")
        .client(
            OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .build())
        .addConverterFactory(GsonConverterFactory.create())
        .build().create(ApiService::class.java)
    fun getMealz()=GetMealz(MealsRepoImpl(apiService()))


    fun getMeals()={
        viewModelScope.launch {
            try {
                _categories.value= getMealz().invoke()
            }catch (e:Exception){
                Log.e("MelasViewModel",e.message.toString())
            } } }*/

}