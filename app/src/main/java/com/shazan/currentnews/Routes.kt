package com.shazan.currentnews

import kotlinx.serialization.Serializable

@Serializable
object OnboardingPageScreen

@Serializable
object HomePageScreen

@Serializable
data class NewsArticleScreen(
    val url: String
)

