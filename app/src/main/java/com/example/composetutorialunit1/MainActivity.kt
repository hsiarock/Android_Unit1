package com.example.composetutorialunit1

import android.os.Bundle
import android.os.Message
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composetutorialunit1.ui.theme.ComposeTutorialUnit1Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialUnit1Theme {
                val shortArticle = stringResource(R.string.compose_short_desc)
                val longArticle = stringResource(R.string.compose_long_desc)
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize()
                    , color = MaterialTheme.colorScheme.background
                    , contentColor = Color.Yellow
                ) {
                    //Unit1Article(shortArticle = shortArticle, longArticle = longArticle)
                    //Unit1TaskComplete()
                    //Unit1Quadrant(),
                    GreetingImage(
                        message = "Happy Tutoral",
                        from = "David Hsia"
                    )
                }
            }
        }
    }
}

@Composable
fun Unit1Article(shortArticle: String, longArticle: String, modifier: Modifier = Modifier) {

        Column{
            Image(
                painter = painterResource(id = R.drawable.bg_compose_background),
                contentDescription = null,
                //contentScale = ContentScale.FillWidth,
                alpha = 0.7F
                //alignment = Alignment.TopStart
            )
            Text(
                text = shortArticle,
                fontSize = 20.sp,
                modifier = Modifier
                    //.fillMaxSize()
                    .padding(top = 24.dp, bottom = 8.dp)
                //.align(alignment = Alignment.BottomCenter)
            )
            Text(
                text = longArticle,
                fontSize = 16.sp,
                //textAlign = TextAlign.Left,
                modifier = Modifier
                    //.fillMaxSize()
                    .padding(16.dp)
                //.align(alignment = Alignment.BottomCenter)
            )
        }

}

@Preview(showBackground = true)
@Composable
fun ArticlePreview() {
    val shortArticle = stringResource(R.string.compose_short_desc)
    val longArticle = stringResource(R.string.compose_long_desc)
    ComposeTutorialUnit1Theme {
        //Unit1Article(shortArticle = shortArticle, longArticle = longArticle)
        //Unit1TaskComplete()
        //Unit1Quadrant()
        GreetingImage(
            message = "Happy Unit1 Tutorial",
            from = "David Hsia"
        )
    }
}

@Composable
fun Unit1TaskComplete() {

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        )  {
            Image(
                painter = painterResource(id = R.drawable.ic_task_completed),
                contentDescription = null,
                //contentScale = ContentScale.,
                alpha = 0.7F,
                alignment = Alignment.Center,
                modifier = Modifier
                    //.fillMaxSize()
                    .padding(top = 24.dp, bottom = 8.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = stringResource(id = R.string.task_completed),
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    //.fillMaxSize()
                    .padding(top = 24.dp, bottom = 8.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
            Text(
                text = stringResource(id = R.string.task_final_status),
                textAlign = TextAlign.Center,
                fontSize = 16.sp,
                modifier = Modifier
                    .align(alignment = Alignment.CenterHorizontally)
            )
        }
}

@Composable
fun Unit1Quadrant() {
    Column(Modifier.fillMaxWidth()){
        Row(Modifier.weight(1f)) {
            BodyCard(
                title = stringResource(id =R.string.quardrant_text1),
                body = stringResource(id =R.string.quardrant_text2),
                backgroundColor = Color(0xFFEADDFF),
                modifier = Modifier.weight(1f))
            BodyCard(
                title = stringResource(id =R.string.quardrant_text3),
                body = stringResource(id =R.string.quardrant_text4),
                backgroundColor = Color(0xFFD0BCFF),
                modifier = Modifier.weight(1f))
        }
        Row(Modifier.weight(1f)) {
            BodyCard(
                title = stringResource(id =R.string.quardrant_text5),
                body = stringResource(id =R.string.quardrant_text6),
                backgroundColor = Color(0xFFB69DF8),
                modifier = Modifier.weight(1f))
            BodyCard(
                title = stringResource(id =R.string.quardrant_text7),
                body = stringResource(id =R.string.quardrant_text8),
                backgroundColor = Color(0xFFF6EDFF),
                modifier = Modifier.weight(1f))
        }
    }
}

@Composable
fun BodyCard(title: String,
             body: String,
             backgroundColor: Color,
             modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .background(backgroundColor)
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

    ) {
        Text(
            text = title,
            modifier = Modifier.padding(bottom = 16.dp),
            fontWeight = FontWeight.Bold
        )
        Text(
            text = body,
            textAlign = TextAlign.Justify,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(id = R.drawable.newport_status1)
    Box(modifier) {
        Image(
            painter = image
            ,contentDescription = null // this is for talkBond voice for disability
            ,contentScale = ContentScale.FillBounds
            //, alpha = 0.8F
            //, alignment = Alignment.Center
            //,modifier = Modifier
        )
        Column (
            verticalArrangement = Arrangement.Center
            //,horizontalAlignment = Arrangement.Center
            ,modifier = Modifier
        ) {
            Text(
                text = message
                , color = Color.Yellow
                , textAlign = TextAlign.Center
                //,fontWeight = FontWeight.Bold
                , fontSize = 90.sp
                , lineHeight = 116.sp
                , modifier = Modifier
                    //.fillMaxSize()
                    .padding(8.dp)
                    //.background(Color.Green)
                    .align(alignment = Alignment.End)
            )
            Text(
                text = from
                , color = Color.Yellow
                , textAlign = TextAlign.End
                , fontSize = 36.sp
                , modifier = Modifier
                    .padding(8.dp)
                    .align(alignment = Alignment.CenterHorizontally)
            )
        }
    }
}