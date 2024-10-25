package com.shazan.currentnews.presentation.onboarding.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.graphics.Color
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun PagerIndicator(
    modifier: Modifier = Modifier,
    pagesSize: Int,
    selectedPage: Int,
    selectedColor: Color = MaterialTheme.colorScheme.primary,
    unselectedColor: Color = MaterialTheme.colorScheme.secondary
) {


    Row (horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically){
        repeat(pagesSize){
            Spacer(modifier = Modifier.size(2.5.dp))
            Box(
                modifier = Modifier
                    .size(size = if (it == selectedPage) 16.dp else 12.dp)
//                    .height(16.dp)
//                    .height(height = if (it == selectedPage) 28.dp else 16.dp)
//                    .width(width = if (it == selectedPage) 28.dp else 16.dp)
                    .clip(RoundedCornerShape(25.dp))
                    .background(color = if (it == selectedPage) selectedColor else unselectedColor)
            )
        }

    }

}

@Preview(showBackground = true)
@Composable
private fun IndicatorPreview() {
    PagerIndicator(pagesSize = 3, selectedPage = 0)
}
@Preview(showBackground = true)
@Composable
private fun IndicatorPreview1() {
    PagerIndicator(pagesSize = 3, selectedPage = 1)
}
@Preview(showBackground = true)
@Composable
private fun IndicatorPreview2() {
    PagerIndicator(pagesSize = 3, selectedPage = 2)
}