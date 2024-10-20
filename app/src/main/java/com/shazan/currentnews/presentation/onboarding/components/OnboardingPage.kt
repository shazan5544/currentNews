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
            contentScale = ContentScale.Crop,
            contentDescription = null,
            alignment = Alignment.Center
        )
        Spacer(modifier = Modifier.size(50.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            text = page.title,
            style = MaterialTheme.typography.titleMedium,
            color = MaterialTheme.colorScheme.onBackground
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .size(15.dp))
        Text(
            modifier = Modifier.fillMaxWidth(),
            fontSize = 20.sp,
            textAlign = TextAlign.Center,
            text = page.description,
            style = MaterialTheme.typography.bodySmall,
            color = MaterialTheme.colorScheme.onSurface,
            lineHeight = 25.sp
        )
        Spacer(modifier = Modifier
            .fillMaxWidth()
            .size(15.dp))
    }





}

@Preview(showBackground = true)
@Composable
fun OnboardingPreview1() {
    CurrentNewsTheme {
        OnBoardingPage(
            modifier = Modifier.fillMaxWidth(),
            page = Page.FirstPage
        )
    }
}