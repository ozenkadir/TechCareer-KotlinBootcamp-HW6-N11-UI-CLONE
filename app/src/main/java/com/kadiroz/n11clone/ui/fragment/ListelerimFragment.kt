package com.kadiroz.n11clone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kadiroz.n11clone.databinding.FragmentKategorilerBinding
import com.kadiroz.n11clone.databinding.FragmentListelerimBinding


class ListelerimFragment : Fragment() {


    private lateinit var binding: FragmentListelerimBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentListelerimBinding.inflate(inflater,container,false)
        return binding.root
    }
}