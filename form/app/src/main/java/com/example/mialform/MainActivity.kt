package com.example.mialform

import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.mialform.ui.theme.MialFormTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            mail()


        }
    }
}

@Composable
fun mail() {
    val inputvalue1 = remember { mutableStateOf(TextFieldValue()) }
    val inputvalue2 = remember { mutableStateOf(TextFieldValue()) }
    val inputvalue3 = remember { mutableStateOf(TextFieldValue()) }
    val contextForToast = LocalContext.current.applicationContext
    Column() {
        TextField(
            value = inputvalue1.value,
            onValueChange = { inputvalue1.value = it },
            placeholder = { Text(text = "To") },
            modifier = Modifier
//                        .padding(all = 16.dp)
                .fillMaxWidth(),)

        TextField(
            value = inputvalue2.value,
            onValueChange = { inputvalue2.value = it },
            placeholder = { Text(text = "From") },
            modifier = Modifier
                .fillMaxWidth(),)

        TextField(
            value = inputvalue3.value,
            onValueChange = { inputvalue3.value = it },
            placeholder = { Text(text = "Message") },
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(.93f)
            ,)

        Button(onClick = {

            Toast.makeText(contextForToast, "Send Successfuly!", Toast.LENGTH_SHORT).show()
        },
            modifier =   Modifier
                .fillMaxWidth()
            ,
        ) {
            Text(text = "Send")
        }

    }
}
//
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {

        mail()

}