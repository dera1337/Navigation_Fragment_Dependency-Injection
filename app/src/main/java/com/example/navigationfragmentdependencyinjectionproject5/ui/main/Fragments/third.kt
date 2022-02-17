package com.example.navigationfragmentdependencyinjectionproject5.ui.main.Fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.navigation.fragment.findNavController
import com.example.navigationfragmentdependencyinjectionproject5.R
import com.example.navigationfragmentdependencyinjectionproject5.databinding.FragmentFirstBinding
import com.example.navigationfragmentdependencyinjectionproject5.databinding.FragmentThirdBinding
import com.example.navigationfragmentdependencyinjectionproject5.view_model.MyViewModel

class third : Fragment() {
    private var binding: FragmentThirdBinding? = null
    private val viewModel: MyViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentThirdBinding.inflate(layoutInflater)
        return binding?.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding!!.apply {
            viewModel.apply {
                Log.i("current value", "$a")
                btnThird.setOnClickListener {
                    incrementA()
                    Log.i("current value","$a")
                    findNavController().navigate(R.id.action_third_to_first)
                }
            }
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}