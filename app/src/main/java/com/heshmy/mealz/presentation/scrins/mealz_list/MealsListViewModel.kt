package com.heshmy.mealz.presentation.scrins.mealz_list

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.heshmy.domain.entity.MealzCategoryResponse
import com.heshmy.domain.usecase.GetMealz
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharedFlow
import kotlinx.coroutines.launch
import java.lang.Exception
import javax.inject.Inject

@HiltViewModel
class MealsListViewModel@Inject constructor(
    private val getMealsUseCase:GetMealz
):ViewModel(){
    private val _categories:MutableStateFlow<MealzCategoryResponse?> = MutableStateFlow(null)
   val category:SharedFlow<MealzCategoryResponse?> =_categories
    fun getMeals(){
        viewModelScope.launch {
            try {
               _categories.value= getMealsUseCase()
            }catch (e:Exception){
                Log.e("MelasViewModel",e.message.toString())
            }

        }

    }
}