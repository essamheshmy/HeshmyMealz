package com.heshmy.mealz.presentation.scrins.bottom_screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.ui.graphics.vector.ImageVector

sealed class BottomScreen (val route:String,val title:String,val icon:ImageVector){
    object Home:BottomScreen("Home","Home", Icons.Filled.Home)
   // object Saving:BottomScreen("Saving","Saving", Icons.Filled.bo)
    object Favorite:BottomScreen("Favorite","Favorite", Icons.Filled.Favorite)

}
