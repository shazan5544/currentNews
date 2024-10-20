package com.shazan.currentnews.presentation.onboarding

import androidx.annotation.DrawableRes
import com.shazan.currentnews.R

sealed class Page (
    @DrawableRes val image: Int,
    val title: String,
    val description: String,
){
    data object FirstPage : Page(
        image = R.drawable.currentnewslogo2,
        title = "Welcome to currentNews",
        description = "Stay Updated with the Latest News in Real-Time"
    )

    data object SecondPage : Page(
        image = R.drawable.world_map_svgrepo_com_1,
        title = "Personalize Your News by Location",
        description = "Select your preferred location to get tailored news updates"
    )

    data object ThirdPage : Page(
        image = R.drawable.world_map_svgrepo_com_1,
        title = "Personalize Your News by Location",
        description = "Select your preferred location to get tailored news updates"
    )
}