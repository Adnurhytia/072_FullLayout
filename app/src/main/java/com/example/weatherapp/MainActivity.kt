package com.example.weatherapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weatherapp.ui.theme.WeatherAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            WeatherAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen()
                }
            }
        }
    }
}

@Composable
fun TampilRain(){
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Gray)) {

        Column(modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally) {

            Image(painter = painterResource(id= R.drawable.weather),
                contentDescription =null,
                modifier = Modifier.size(200.dp))

            Text(text = "Rain", fontSize = 30.sp)
        }
    }
}


@Composable
fun Location(){
Text(text = "20C", fontWeight = FontWeight.Bold, fontSize = 64.sp)
    Row (verticalAlignment = Alignment.CenterVertically){

        Image(painter = painterResource(id = R.drawable.location), contentDescription ="location")

        Spacer(modifier = Modifier.padding(3.dp))

        Text(
            text = "Yogyakarta",
            fontSize = 30.sp,
            color =Color.Gray,
            textAlign = TextAlign.Center,
            fontWeight = FontWeight.Bold
        )

    }
    Spacer(modifier = Modifier.padding(8.dp))
    Text(text = "Tamantirto, Kasihan, Bantul, Daerah Istimewa Yogyakarta",
        fontSize = 15.sp,
        textAlign = TextAlign.Center)
}

@Composable
fun HomeScreen() {
    Column (modifier = Modifier
        .padding(20.dp)
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally){
        Text(
            text = "Adinda Nurhayati",
            textAlign = TextAlign.Center,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold
        )
        Spacer(modifier = Modifier.padding(13.dp))

        TampilRain()

        Location()

        Spacer(modifier = Modifier.padding(13.dp))
        
    }
}

@Composable
fun Weather() {
    Box(modifier = Modifier
        .fillMaxWidth()
        .clip(RoundedCornerShape(25.dp))
        .background(color = Color.Cyan))
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    WeatherAppTheme {
        Box(modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
        )
        HomeScreen()
    }
}