package com.shazan.currentnews

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.shazan.currentnews.model.NewsViewModel
import com.shazan.currentnews.presentation.article.NewsArticlePage
import com.shazan.currentnews.presentation.homescreen.HomeScreen
import com.shazan.currentnews.presentation.onboarding.OnboardingScreen
import com.shazan.currentnews.ui.theme.CurrentNewsTheme

class MainActivity : ComponentActivity() {
    @SuppressLint("NewApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        val newsViewModel = ViewModelProvider(this)[NewsViewModel::class.java]
        enableEdgeToEdge()
        setContent {
            CurrentNewsTheme {
                val navController = rememberNavController()
                NavHost(
                    navController = navController,
                    startDestination = OnboardingPageScreen,
                    builder = {
                        composable<OnboardingPageScreen> {
                            OnboardingScreen(navController)
                        }
                        composable<HomePageScreen> {
                            HomeScreen(newsViewModel, navController)
                        }
                        composable<NewsArticleScreen> {
                            val args = it.toRoute<NewsArticleScreen>()
                            NewsArticlePage(args.url)
                        }
                    })
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
private fun Preview1() {
}