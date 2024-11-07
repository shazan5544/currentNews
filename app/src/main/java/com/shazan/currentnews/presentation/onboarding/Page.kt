package com.shazan.currentnews.presentation.onboarding

import androidx.annotation.DrawableRes
import com.shazan.currentnews.R

sealed class Page(
    @DrawableRes val image: Int,
    val title: String,
    val description: String,
) {
    data object FirstPage : Page(
        image = R.drawable.cn_logopng,
        title = "  Welcome to currentNews  ",
        description = "  Stay Updated with the Latest Tech and Innovation News in Real-Time  "
    )

    data object SecondPage : Page(
        image = R.drawable.news_animatepng,
        title = "  Get Real-time Updates  ",
        description = "  Deep Insights on the Latest Trends and Innovations in Technology  "
    )

    data object ThirdPage : Page(
        image = R.drawable.articles_panapng,
        title = "  Read Latest Tech News Articles  ",
        description = "  Covers Tech Industry News, Startups, Product Launches, and Innovations  "
    )
}