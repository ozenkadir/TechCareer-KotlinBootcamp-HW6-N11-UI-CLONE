package com.kadiroz.n11clone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kadiroz.n11clone.databinding.FragmentListelerimBinding
import com.kadiroz.n11clone.databinding.FragmentSepetimBinding


class SepetimFragment : Fragment() {
    private lateinit var binding: FragmentSepetimBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSepetimBinding.inflate(inflater,container,false)
        return binding.root
    }
}