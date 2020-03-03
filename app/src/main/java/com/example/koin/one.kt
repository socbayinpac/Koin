package com.example.koin


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.fragment_one.view.*

class one : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_one, container, false)


        // demo gui data bang safe args
        view.toThree.setOnClickListener {
            val actionOneToThree = oneDirections.actionOneToThree("Hello", 999)
            findNavController().navigate(actionOneToThree)
        }

        view.toTwo.setOnClickListener {
            val actionOneToTwo = oneDirections.actionOneToTwo(Car("card id", 120))
            findNavController().navigate(actionOneToTwo)
        }
        return view
    }


}
