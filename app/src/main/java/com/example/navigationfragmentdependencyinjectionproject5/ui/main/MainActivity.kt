package com.example.navigationfragmentdependencyinjectionproject5.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import androidx.navigation.NavController
import androidx.navigation.fragment.NavHostFragment
import com.example.navigationfragmentdependencyinjectionproject5.R
import com.example.navigationfragmentdependencyinjectionproject5.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint
import com.example.navigationfragmentdependencyinjectionproject5.view_model.MyViewModel

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {


    private lateinit var navController : NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val navHostFragment = supportFragmentManager
            .findFragmentById(R.id.navHost) as NavHostFragment

        navController = navHostFragment.navController
    }
}