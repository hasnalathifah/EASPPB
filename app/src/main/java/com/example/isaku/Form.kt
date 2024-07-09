package com.example.isaku

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Form(navController: NavController) {
    var namaBisnis by remember { mutableStateOf("") }
    var namaPemilik by remember { mutableStateOf("") }
    var jenisBisnis by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var provinsi by remember { mutableStateOf("") }
    var kota by remember { mutableStateOf("") }
    var kecamatan by remember { mutableStateOf("") }
    var kodePos by remember { mutableStateOf("") }
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(painter = painterResource(id = R.drawable.bgtop), contentDescription = "bgtop",
            modifier = Modifier.width(400.dp).height(250.dp), alignment = Alignment.TopEnd
        )
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(30.dp, 20.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,

        ) {
//        Image(
//            painter = painterResource(id = R.drawable.bsi), contentDescription = "login image",
//            modifier = Modifier.size(250.dp,100.dp)
//        )
        Spacer(modifier = Modifier.height(30.dp))
        Text(text = "Isi data usaha anda", fontSize = 28.sp, fontWeight = FontWeight.Bold)

//        Spacer(modifier = Modifier.height(4.dp))
//        Text(text = "Masuk ke akun mobile banking BSI")

        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = namaBisnis, modifier = Modifier.fillMaxWidth(), onValueChange = { namaBisnis = it }, label = {
            Text(text = "Nama Usaha")
        })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = jenisBisnis, modifier = Modifier.fillMaxWidth(), onValueChange = { jenisBisnis = it }, label = {
            Text(text = "Jenis Usaha")
        })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = namaPemilik, modifier = Modifier.fillMaxWidth(), onValueChange = { namaPemilik = it }, label = {
            Text(text = "Nama pemilik")
        })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = alamat, modifier = Modifier.fillMaxWidth(), onValueChange = { alamat = it }, label = {
            Text(text = "Alamat toko")
        })
//        Spacer(modifier = Modifier.height(10.dp))
//        OutlinedTextField(value = provinsi, modifier = Modifier.fillMaxWidth(), onValueChange = { provinsi = it }, label = {
//            Text(text = "Provinsi")
//        })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = kota, modifier = Modifier.fillMaxWidth(), onValueChange = { kota = it }, label = {
            Text(text = "Kota")
        })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = kecamatan, modifier = Modifier.fillMaxWidth(), onValueChange = { kecamatan = it }, label = {
            Text(text = "Kecamatan")
        })
        Spacer(modifier = Modifier.height(10.dp))
        OutlinedTextField(value = kodePos, modifier = Modifier.fillMaxWidth(), onValueChange = { kodePos = it }, label = {
            Text(text = "Kode Pos")
        })

        Spacer(modifier = Modifier.height(16.dp))
        Button(onClick = { formHandler(navController, namaBisnis, jenisBisnis) },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(10.dp),
            colors = ButtonDefaults.buttonColors(Color(0xFF21A1EE ))
        ) {
            Text(text = "Daftar Akun")

        }
    }
//    Column(
//        modifier = Modifier.fillMaxSize(),
//        verticalArrangement = Arrangement.Bottom,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Image(painter = painterResource(id = R.drawable.bgbottom), contentDescription = "bgbottom",
//            modifier = Modifier.width(400.dp).height(50.dp), alignment = Alignment.BottomEnd
//        )
//    }
}

fun formHandler(navController: NavController, noTelp: String, password: String){
    navController.navigate("FormSuccess")
    Log.i("mylog", "notelp = $noTelp password = $password")
}