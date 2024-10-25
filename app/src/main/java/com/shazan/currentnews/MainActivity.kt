package com.shazan.currentnews

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.shazan.currentnews.presentation.onboarding.OnboardingScreen
import com.shazan.currentnews.ui.theme.CurrentNewsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        enableEdgeToEdge()
        setContent {
            CurrentNewsTheme {

                OnboardingScreen {  }
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                    }
            }
        }
    }
}

//@Composable
//fun ShowOnboardingScreen() {
//    val context = LocalContext.current
//    Box(modifier = Modifier.background(color = MaterialTheme.colorScheme.background)) {
//        OnboardingScreen {
//            Toast.makeText(context, "Onboarding Completed", Toast.LENGTH_SHORT).show()
//        }
//    }
//
//}

@Preview()
@Composable
private fun Preview1() {
    OnboardingScreen {  }
}