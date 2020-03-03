package com.example.koin


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.navigation.fragment.navArgs

class three : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val args: threeArgs by navArgs()
        Toast.makeText(context,"Day la data nhan dc \n chuoi String ::${args.stringData} va so Int ::${args.intData}",Toast.LENGTH_LONG).show()
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_three, container, false)
    }


}
