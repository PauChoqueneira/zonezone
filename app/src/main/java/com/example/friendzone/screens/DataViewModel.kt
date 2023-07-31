package com.example.friendzone.screens

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.friendzone.model.Usuario
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.FirebaseFirestoreException
import kotlinx.coroutines.launch
import kotlinx.coroutines.tasks.await

class DataViewModel: ViewModel() {
    val state = mutableStateOf(Usuario())

    init {
        getData()
    }
    private fun getData(){
        viewModelScope.launch {
            state.value = getDataFromFireStore()
        }
    }
}

suspend fun getDataFromFireStore():Usuario{
    val db = FirebaseFirestore.getInstance()
    var usuario = Usuario()
    try{
        db.collection("usuarios").get().await().map{
            val result = it.toObject(Usuario::class.java)
            usuario = result
        }
    }catch (e: FirebaseFirestoreException){
        Log.d("error", "getDataFromFireStore: $e")
    }
    return usuario
}