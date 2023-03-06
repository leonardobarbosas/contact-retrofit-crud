package br.senai.sp.jandira.contactretrofit

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import br.senai.sp.jandira.contactretrofit.api.ContactCall
import br.senai.sp.jandira.contactretrofit.api.RetrofitApi
import br.senai.sp.jandira.contactretrofit.ui.theme.ContactRetrofitTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ContactRetrofitTheme {
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
}

@Composable
fun Greeting(name: String) {

    val retrofit = RetrofitApi.getRetrofit()
    val contactsCall = retrofit.create(ContactCall::class.java)
    val call = contactsCall.getAll()

    Text(text = "Hello $name!")
}


@Composable
fun DefaultPreview() {
    ContactRetrofitTheme {
        Greeting("Android")
    }
}