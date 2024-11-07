package com.shazan.currentnews.presentation.homescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.shazan.currentnews.model.NewsViewModel
import com.shazan.currentnews.presentation.article.ArticleCard
import com.shazan.currentnews.presentation.common.TopBar

@Composable
fun HomeScreen(newsViewModel: NewsViewModel, navController: NavController) {
    val articles by newsViewModel.articles.observeAsState()

    Scaffold(
        topBar = {
            TopBar()
        },
        content = { padding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(padding)
                    .verticalScroll(rememberScrollState())
            ) {
                articles?.forEach { article ->
                    ArticleCard(article, navController)
                }
            }

        })
}


//LazyColumn(
//modifier = Modifier.fillMaxSize(),
//state = rememberLazyListState()
//) {
//    items(articles ?: emptyList()) { article ->
//        ArticleCard(article, navController)
//
//    }
//}