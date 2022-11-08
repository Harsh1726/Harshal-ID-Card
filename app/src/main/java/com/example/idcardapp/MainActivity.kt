package com.example.idcardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background

import androidx.compose.foundation.layout.*
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.idcardapp.ui.theme.IDCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IDCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),

                    color = MaterialTheme.colors.background
                ) {

                    Greeting("ID CARD")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Box(contentAlignment = Alignment.Center) {

        Image(painter = painterResource(id = R.drawable.swoo), contentDescription ="Profile", modifier = Modifier.size(1045.dp).background(color = Color.White))

        Column {
            Text(text = "$name", color = Color.Green,modifier = Modifier
                .height(23.dp)
                .padding(start = 125.dp))
Image(painter = painterResource(id = R.drawable.myphoto), contentDescription = "Profile Pic",modifier = Modifier
    .height(90.dp)
    .padding(start = 117.dp)
    .padding(horizontal = 3.dp))
     Spacer(modifier = Modifier.size(7.dp))
    Text(
        text = "Harshal Prachand",modifier = Modifier
            .height(33.dp)
            .padding(start = 60.dp),
        style = TextStyle(color = Color.Black, fontSize = 25.sp,
            shadow = Shadow(color =Color.White,
                offset = Offset(2f,3f), 0f),
            fontFamily = FontFamily.SansSerif)
    )
            Spacer(modifier = Modifier.size(27.dp))
            Row() {

                Column() {

                    Text(text = "Email :", style = TextStyle(fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp))
                    Text(text = "Enroll No :", style = TextStyle(fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp))
                    Text(text = "Course :", style = TextStyle(fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp))
                    Text(text = "Batch Year :", style = TextStyle(fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp))
                    Text(text = "Sem And Branch :", style = TextStyle(fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp))
                    Text(text = "College :", style = TextStyle(fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp))
                    Text(text = "Phone No. :", style = TextStyle(fontFamily = FontFamily.SansSerif,
                        fontSize = 14.sp))

                }
                Column() {

                    Text(text = "   prachandharshal@gmail.com", color = Color.Black, fontSize = 14.sp)
                    Text(text = "   0704CS201067", color = Color.Black, fontSize = 14.sp)
                    Text(text = "   B.Tech.", color = Color.Black, fontSize = 14.sp)
                    Text(text = "   2020", color = Color.Black, fontSize = 14.sp)
                    Text(text = "   5th and CS - '1'", color = Color.Black, fontSize = 14.sp)
                    Text(text = "   Mahakal Institute Of Technology", color = Color.Black, fontSize = 14.sp)
                    Text(text = "   8815305227", color = Color.Black, fontSize = 14.sp)

                }



            }

        }
    }

}




@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    IDCardAppTheme {
        Greeting("Android")
    }
}