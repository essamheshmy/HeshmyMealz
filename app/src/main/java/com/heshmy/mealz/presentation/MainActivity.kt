package com.heshmy.mealz.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.heshmy.data.remote.ApiService
import com.heshmy.data.repo.MealsRepoImpl
import com.heshmy.domain.usecase.GetMealz
import com.heshmy.mealz.name
import com.heshmy.mealz.presentation.scrins.bottom_screens.mealz_list.MealsListViewModel
import com.heshmy.mealz.ui.theme.HeshmyMealzTheme
import com.heshmy.mealz.ui.theme.Purple40
import dagger.hilt.android.AndroidEntryPoint
import dagger.hilt.android.HiltAndroidApp
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

@AndroidEntryPoint
@HiltAndroidApp
class MainActivity : ComponentActivity() {
    
    override fun onCreate(savedInstanceState: Bundle?) {
        
        super.onCreate(savedInstanceState)
        setContent {
            HeshmyMealzTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {

                    BottomNavigate()
                }
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
 fun BottomNavigate() {


   val viewModel: MealsListViewModel = viewModel()
    val mealzName=viewModel.category.toString()

Column(
    modifier = Modifier
        .fillMaxSize()
        .background(Color.Gray)
){
Text(text = mealzName)
}
}


