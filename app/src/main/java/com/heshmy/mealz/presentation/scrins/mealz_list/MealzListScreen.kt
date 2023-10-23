package com.heshmy.mealz.presentation.scrins.mealz_list

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.heshmy.domain.entity.MealzCategoryResponse
import kotlinx.coroutines.flow.SharedFlow

@Composable
@Preview
fun mealzList(
   // navController: NavController
){
    val viewModel: MealsListViewModel = viewModel()
    val context= LocalContext.current
    val mealsdata: SharedFlow<MealzCategoryResponse?> = viewModel.category

Column (
    modifier = Modifier
        .fillMaxSize()
        .background(Color.Black)
        .wrapContentSize(Alignment.Center)
){

    Column (
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp)
            .background(Color.Gray),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ){
        Text(
            text = "heshmy with mealz",
            color = Color.White,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
    }
    LazyColumn(modifier = Modifier.padding(10.dp)){
       // items(mealsdata){d-> mealzItem(d,) }
    }
}
}

