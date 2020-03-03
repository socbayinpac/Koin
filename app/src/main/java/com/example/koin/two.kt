package com.example.koin


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs

class two : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val args: twoArgs by navArgs()
        Toast.makeText(context,"Day la data nhan dc \n Car voi id ::${args.carData?.id} va power ::${args.carData?.power}",
            Toast.LENGTH_LONG).show()
        return inflater.inflate(R.layout.fragment_two, container, false)
    }


}
