package com.guru.composecookbook.ui.home.pullrefreshdemos


import androidx.compose.animation.core.*
import androidx.compose.foundation.background
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.gestures.draggable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.RotateRight
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.unit.dp
import com.guru.composecookbook.ui.demoapps.spotify.data.SpotifyDataProvider
import com.guru.composecookbook.ui.demoapps.spotify.details.SpotifySongListItem

@Composable
fun PullRefreshList(onPullRefresh: () -> Unit) {
    val albums = SpotifyDataProvider.albums
    //TODO revisit pull refresh
    val initialYTranslate = -100f
    val maximumYTranslate = 200f
    val animatedProgress = remember { Animatable(0f)}
    val lazyListState = rememberLazyListState()

//    val draggableModifier = Modifier.draggable(
//        orientation = Orientation.Vertical,
//        reverseDirection = false,
//        enabled = lazyListState.firstVisibleItemIndex < 2,
//        onDragStarted = {
//            onPullRefresh.invoke()
//            if (animatedProgress.value < maximumYTranslate) {
//                animatedProgress.animateTo(
//                    targetValue = maximumYTranslate,
//                    animationSpec = tween(durationMillis = 1200, easing = LinearEasing),
//                )
//            }
//        },
//        onDragStopped = {
//            animatedProgress.animateTo(
//                targetValue = 3000f,
//                animationSpec = repeatable(
//                    iterations = 1,
//                    animation = tween(durationMillis = 3000, easing = LinearEasing),
//                ),
//            )
//        }
//    )

//    Box(modifier = draggableModifier) {
//        LazyColumn(state = lazyListState) {
//            items(
//                count = albums.size,
//                itemContent = { index ->
//                    SpotifySongListItem(album = albums[index])
//                })
//        }
//        //Animated Icon
//        Icon(
//            imageVector = Icons.Default.RotateRight,
//            tint = Color.Black,
//            contentDescription = null,
//            modifier = Modifier.align(Alignment.TopCenter)
//                .graphicsLayer(
//                    translationY = animateFloatAsState(
//                        animatedProgress.value.coerceIn(
//                            initialYTranslate,
//                            maximumYTranslate
//                        )
//                    ).value,
//                    rotationZ = animateFloatAsState(
//                        animatedProgress.value
//                    ).value
//                ).background(Color.LightGray, shape = CircleShape).padding(2.dp)
//        )
//    }
}
