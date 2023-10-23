package com.heshmy.mealz.presentation.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.heshmy.domain.entity.MealzCategory


@Composable

fun mealzItem(
    data: MealzCategory, navController : NavController
){
Card (
    modifier = Modifier.clickable {
    navController.navigate("mealz_details/${data}")
    }.padding(6.dp).fillMaxSize()
){
    Row() {
        //Image(painter = data.strCategory, contentDescription = )
        Column (){

        }
    }
}



}