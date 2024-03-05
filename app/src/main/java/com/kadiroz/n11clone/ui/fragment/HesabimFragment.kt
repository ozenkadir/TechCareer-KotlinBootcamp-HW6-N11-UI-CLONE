package com.kadiroz.n11clone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kadiroz.n11clone.databinding.FragmentAnasayfaBinding
import com.kadiroz.n11clone.databinding.FragmentHesabimBinding


class HesabimFragment : Fragment() {

    private lateinit var binding: FragmentHesabimBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHesabimBinding.inflate(inflater,container,false)
        return binding.root
    }
}