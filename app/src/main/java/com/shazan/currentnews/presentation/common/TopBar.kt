package com.shazan.currentnews.presentation.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.shazan.currentnews.R
import com.shazan.currentnews.ui.theme.CurrentNewsTheme

@Composable
fun TopBar() {
    Row(
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .background(MaterialTheme.colorScheme.background)
            .padding(top = 16.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.cn_logo),
            contentDescription = "My Icon",
            modifier = Modifier.size(80.dp),
            contentScale = ContentScale.Fit
        )
        Text("currentNews", color = MaterialTheme.colorScheme.primary, fontSize = 24.sp)
    }
}

@Preview(showBackground = true)
@Composable
private fun TopBarPre() {
    CurrentNewsTheme {
        TopBar()
    }
}