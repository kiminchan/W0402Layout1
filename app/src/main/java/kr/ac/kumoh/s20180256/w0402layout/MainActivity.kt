package kr.ac.kumoh.s20180256.w0402layout

import android.graphics.Color
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color.Companion.Cyan
import androidx.compose.ui.graphics.Color.Companion.Magenta
import androidx.compose.ui.graphics.Color.Companion.Yellow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kr.ac.kumoh.s20180256.w0402layout.ui.theme.W0402LayoutTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
           MyApp()
        }
    }
}

// Pascal case : 첫글자를 대문자로 쓴다.
@Composable
fun MyApp() {
    W0402LayoutTheme {
        // A surface container using the 'background' color from the theme
        Surface(modifier = Modifier.fillMaxSize(),
            color = MaterialTheme.colors.background) {
            //Greeting("Android")
            MyLinearLayout()
        }
    }
}

@Composable
fun MyLinearLayout() {

   Column() {
       Text(text = "안녕하세요",
            modifier = Modifier
                .background(Yellow)
                .padding(8.dp)

       )
       Text(text = "컴퓨터공학과",
           modifier = Modifier
               .background(Magenta)
               .padding(8.dp)

       )
       Text(text = "있을거 같은 얘기",
           modifier = Modifier
               .background(Cyan)
               .padding(8.dp)

       )
   }

    
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MyApp()
}