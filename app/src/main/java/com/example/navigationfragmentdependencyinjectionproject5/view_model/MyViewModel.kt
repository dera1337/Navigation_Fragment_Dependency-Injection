package com.example.navigationfragmentdependencyinjectionproject5.view_model

import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import com.example.navigationfragmentdependencyinjectionproject5.model.Contoh
import javax.inject.Inject

@HiltViewModel
class MyViewModel @Inject constructor(
//    private val someString: String
    private val classContoh: Contoh
) :ViewModel() {

    var a = 10

    fun incrementA() {
        a++
    }

//    var contoh = Contoh()
//    fun executeLogFromContoh(){
//        contoh.logHello()
//    }

    fun executeLogFromContoh() {
        classContoh.logHello()
    }
}