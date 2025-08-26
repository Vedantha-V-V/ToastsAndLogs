package com.example.toastsandlogs

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.toastsandlogs.ui.theme.ToastsAndLogsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Toast.makeText(this, "onCreate called", Toast.LENGTH_LONG).show()
        Log.d("ActivityLifeCycle", "onCreate called")

        enableEdgeToEdge()
        setContent {
            ToastsAndLogsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "onStart called", Toast.LENGTH_LONG).show()
        Log.d("ActivityLifeCycle", "onStart called")
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "onResume called", Toast.LENGTH_LONG).show()
        Log.d("ActivityLifeCycle", "onResume called")
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "onPause called", Toast.LENGTH_LONG).show()
        Log.d("ActivityLifeCycle", "onPause called")
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "onStop called", Toast.LENGTH_LONG).show()
        Log.d("ActivityLifeCycle", "onStop called")
    }

    override fun onRestart() {
        super.onRestart()
        Toast.makeText(this, "onRestart called", Toast.LENGTH_LONG).show()
        Log.d("ActivityLifeCycle", "onRestart called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Toast.makeText(this, "onDestroy called", Toast.LENGTH_LONG).show()
        Log.d("ActivityLifeCycle", "onDestroy called")
    }


}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ToastsAndLogsTheme {
        Greeting("Android")
    }
}