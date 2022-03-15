package com.geeksforgeeks.jcmarkwon

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import dev.jeziellago.compose.markdowntext.MarkdownText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainContent()
        }
    }
}

@Composable
fun MainContent() {
    Scaffold(
        topBar = { TopAppBar(title = { Text("GFG | Markdown Text", color = Color.White) }, backgroundColor = Color(0xff0f9d58)) },
        content = { MyContent() }
    )
}

@Composable
fun MyContent(){
    Column(Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally, verticalArrangement = Arrangement.Center) {
        MarkdownText(
            markdown = "Link: https://www.geeksforgeeks.org " +
                    "Phone: 1800 258 4458 " +
                    "Email: feedback@geeksforgeeks.org",
            fontSize = 20.sp
        )
    }
}


@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MainContent()
}

// Refer https://github.com/jeziellago/compose-markdown
// Package Name wrong