package com.example.newsapp

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.newsapp.ui.theme.NewsAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            NewsAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }


@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    NewsAppTheme {
        Greeting("Android")
    }
}
override fun onStart() {
    super.onStart()
    Log.i("MainActivity", "onStart called.")
}

override fun onResume() {
    super.onResume()
}

// Activity loses foreground state (eg. another app is interrupting the process) but we can still see it
override fun onPause() {
    super.onPause()
    Log.i("MainActivity", "onPause called.")
}

// Activity is no longer visible to the user
override fun onStop() {
    super.onStop()
    Log.i("MainActivity", "onStop called.")
}

// App is transitioning from onStop back to foreground
override fun onRestart() {
    super.onRestart()
    Log.i("MainActivity", "onRestart called.")
}

// Activity is destroyed -> process is killed or shut down by the user
override fun onDestroy() {
    super.onDestroy()
    Log.i("MainActivity", "onDestroy called.")
}
}