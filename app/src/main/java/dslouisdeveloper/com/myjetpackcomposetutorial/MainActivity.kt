package dslouisdeveloper.com.myjetpackcomposetutorial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dslouisdeveloper.com.myjetpackcomposetutorial.ui.theme.MYJetpackComposeTutorialTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ComposeTutorialScreen()

        }
    }
}

@Composable
fun ComposeTutorialScreen() {
    //scrollabe column to allow vertical scrolling
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState()) // add scroll if needed
    ){
        // Full-width image
        Image(
            painter = painterResource(id = R.drawable.compose1),
            contentDescription = null,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp) //adjust height as needed
        )
        // First Text element


        Text(
            text = stringResource(R.string.jetpack_compose_tutorial_text1), // "Jetpack Compose tutorial"
            fontSize = 24.sp,
            modifier = Modifier
               .padding(16.dp) // adjust padding as needed
        )
        // Second Text element
        Text(
            text = stringResource(R.string.jetpack_compose_text2),
            textAlign = TextAlign.Justify,
            modifier = Modifier
               .padding(16.dp) // adjust padding as needed
        )
        // Third Text element
        Text(
            text = stringResource(R.string.compose_text_3),
            textAlign = TextAlign.Justify,
            modifier = Modifier
               .padding(16.dp) // adjust padding as needed
        )
        // Fourth Text element
        Text(
            text = (stringResource(R.string.from_text_4)),
            textAlign = TextAlign.Justify,
            modifier = Modifier
                .padding(16.dp) // adjust padding as needed
                .align(alignment = Alignment.CenterHorizontally)
        )
    }


}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    MYJetpackComposeTutorialTheme {
        ComposeTutorialScreen()
    }
}