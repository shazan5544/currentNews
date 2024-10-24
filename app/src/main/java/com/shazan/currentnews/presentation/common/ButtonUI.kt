package com.shazan.currentnews.presentation.common

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ButtonUI(
    text: String ,
    backgroundColor: Color = MaterialTheme.colorScheme.primary,
    textColor: Color = MaterialTheme.colorScheme.onPrimary,
    textStyle: androidx.compose.ui.text.TextStyle = MaterialTheme.typography.titleMedium,
    fontSize: Int,
    onClick: () -> Unit
) {
    Button(onClick = onClick,
        colors = ButtonDefaults.buttonColors(
            containerColor = backgroundColor,
            contentColor = textColor
        ), shape = RoundedCornerShape(10.dp)
    ) {
        Text(
            text = text,
            style = textStyle
        )
    }
}

@Preview
@Composable
private fun NextButton() {
    ButtonUI (text = "Next", fontSize = 14){

    }
}

@Preview(showBackground = true )
@Composable
private fun BackButton() {
    ButtonUI (text = "Back",
        backgroundColor = Color.Transparent,
        textColor = Color.Gray,
        textStyle = MaterialTheme.typography.bodySmall,
        fontSize = 13
    ){

    }

}

