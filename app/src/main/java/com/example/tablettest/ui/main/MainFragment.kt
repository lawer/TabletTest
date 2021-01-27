package com.example.tablettest.ui.main

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.Navigation
import com.example.tablettest.Alumn
import com.example.tablettest.R

class MainFragment : Fragment() {
    private var mViewModel: MainViewModel? = null
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.main_fragment, container, false)
        val btnIr = view.findViewById<Button>(R.id.btnIr)
        btnIr.setOnClickListener { v: View? -> Navigation.findNavController(view).navigate(R.id.action_mainFragment_to_contentFragment) }

        val nombre = "arriquitan"
        val nombreMayusculas = nombre.toUpperCase()

        val alumn = Alumn()
        alumn.edad = 10
        alumn.faltas++


        return view
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        var test: Int? = null

        test?.toString()


        mViewModel = ViewModelProvider(this).get(MainViewModel::class.java)

        // TODO: Use the ViewModel
    }

}