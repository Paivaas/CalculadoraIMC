package br.senai.sp.jandira.calculadoraimc

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import br.senai.sp.jandira.calculadoraimc.ui.theme.CalculadoraIMCTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CalculadoraIMCTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Page()
                }
            }
        }
    }
}

@Composable
fun Page() {

    Column (modifier = Modifier
        .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Column (
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color(0xffEB1450))
                .height(210.dp)
                .padding(bottom = 40.dp)
            ,
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally

        ){


            Card (shape = CircleShape,
                modifier = Modifier.size(60.dp)
            ){
                Image(
                    painter = painterResource(
                        id = R.drawable.icon),
                    contentDescription = "icon imc"
                )
            }

            Text(text = "Calculadora IMC",
                fontSize = 26.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White

            )
        }

        Card (modifier = Modifier
            .width(300.dp)
            .height(400.dp)
            .offset(y = -30.dp),
            colors = CardDefaults.cardColors(Color(0xffF7F3F2))
        ){

            Column (
                modifier = Modifier
                    .fillMaxSize()
                    .padding(32.dp),
                verticalArrangement = Arrangement.SpaceAround,
            ){

                Row (
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceAround
                ){
                    Text(text = "Seus Dados",
                        fontSize = 28.sp,
                        color = Color(0xFFEB1450),
                        fontWeight = FontWeight.Bold
                    )
                }

                Text(text = "Seu peso",
                        color = Color(0xFFEB1450),)
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(text = "Seu Peso em Kg",
                            color = Color.Gray
                        )
                    },
                    shape = RoundedCornerShape(12.dp),
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFEB1450),
                        focusedBorderColor = Color(0xFFEB1450),
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White
                    ),
                    modifier = Modifier
                        .padding(bottom =  10.dp)
                )

                Text(text = "Seu peso",
                    color = Color(0xFFEB1450),)
                OutlinedTextField(
                    value = "",
                    onValueChange = {},
                    label = {
                        Text(text = "Seu Peso em Kg",
                            color = Color.Gray
                        )
                    },
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color(0xFFEB1450),
                        focusedBorderColor = Color(0xFFEB1450),
                        focusedContainerColor = Color.White,
                        unfocusedContainerColor = Color.White
                    ),
                    shape = RoundedCornerShape(12.dp),
                    modifier = Modifier
                        .padding(bottom =  10.dp)
                )

                Button(onClick = { /*TODO*/ },
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(50.dp),
                    shape = RoundedCornerShape(12.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = Color((0xFFEB1450)))
                ) {
                    Text(text = "CALCULAR",
                        fontWeight = FontWeight.Bold)
                }
            }

        }

        Row (
            modifier = Modifier
                .width(300.dp)
                .height(100.dp)
                .background(
                    color = Color(0xff2C9660),
                    shape = RoundedCornerShape(16.dp)
                ),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,

        ){
            Column (
                horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(text = "Resultado",
                    color = Color.White)
                Text(text = "Peso ideal",
                    color = Color.White,
                    fontSize = 24.sp,

                )
            }
            Text(text = "21.3",
                fontSize = 36.sp,
                color = Color.White,
                fontWeight = FontWeight.Bold)
        }






    }



}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    CalculadoraIMCTheme {
        Page()
    }
}