package com.shazan.currentnews.presentation.onboarding.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.heightIn
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shazan.currentnews.presentation.onboarding.OnboardingScreen
import com.shazan.currentnews.presentation.onboarding.Page
import com.shazan.currentnews.ui.theme.CurrentNewsTheme

@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    page: Page
) {
    Column(modifier = Modifier) {
        Spacer(modifier = Modifier.size(100.dp))

        Image(
            modifier = modifier
                .fillMaxWidth()
                .padding(50.dp, 0.dp),
            painter = painterResource(id = page.image),
            contentScale = ContentScale.Fit,
            contentDescription = null,
            alignment = Alignment.Center
        )
        Spacer(modifier = Modifier.size(50.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally),

            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            text = page.title,
            style = MaterialTheme.typography.labelLarge,
            color = MaterialTheme.colorScheme.primary
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .size(15.dp))
        Text(
            modifier = Modifier
                .fillMaxWidth(0.9f)
                .align(Alignment.CenterHorizontally),
            fontSize = 15.sp,
            textAlign = TextAlign.Center,
            text = page.description,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.secondary,
            lineHeight = 25.sp
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .size(15.dp))
    }





}

@Preview(showBackground = true)
@Composable
private fun OnboardingPrev1() {
    CurrentNewsTheme {
        OnBoardingPage(page = Page.FirstPage)
    }
}
@Preview(showBackground = true)
@Composable
private fun OnboardingPrev2() {
    CurrentNewsTheme {
        OnBoardingPage(page = Page.SecondPage)
    }
}
