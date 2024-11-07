package com.shazan.currentnews.presentation.article

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.kwabenaberko.newsapilib.models.Article
import com.shazan.currentnews.NewsArticleScreen
import com.shazan.currentnews.R
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Composable
fun ArticleCard(article: Article, navController: NavController) {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.background),
        onClick = {
            navController.navigate(NewsArticleScreen(article.url))
        }
    ) {
        Row(
            modifier = Modifier
                .fillMaxSize()
                .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically
        ) {
            AsyncImage(
                model = article.urlToImage ?: R.drawable.ic_image_off,
                contentDescription = "Article Image",
                modifier = Modifier
                    .size(96.dp)
                    .clip(MaterialTheme.shapes.medium),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.padding(3.dp))
            Column(
                verticalArrangement = Arrangement.SpaceAround,
                modifier = Modifier
                    .padding(horizontal = 3.dp)
                    .height(96.dp)
            ) {
                Text(
                    text = article.title,
                    fontWeight = FontWeight.Bold,
                    style = MaterialTheme.typography.bodyMedium,
                    maxLines = 3,
                    color = MaterialTheme.colorScheme.primary,
                    overflow = TextOverflow.Ellipsis
                )
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = article.source.name,
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.padding(6.dp))
                    Icon(
                        painter = painterResource(R.drawable.ic_date),
                        contentDescription = null,
                        modifier = Modifier.size(11.dp),
                        tint = MaterialTheme.colorScheme.primary
                    )
                    Spacer(modifier = Modifier.padding(3.dp))
                    val parsedDate = LocalDateTime.parse(article.publishedAt, DateTimeFormatter.ISO_DATE_TIME)
                    val formattedDate = parsedDate.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"))
                    Text(
                        text = formattedDate,
                        style = MaterialTheme.typography.labelSmall,
                        color = MaterialTheme.colorScheme.primary,
                        maxLines = 1
                    )
                }
            }


        }
    }
}
