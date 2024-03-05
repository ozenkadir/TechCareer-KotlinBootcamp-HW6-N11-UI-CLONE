package com.kadiroz.n11clone.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kadiroz.n11clone.databinding.FragmentBottomSheetBinding
import com.kadiroz.n11clone.databinding.FragmentHesabimBinding


class BottomSheetFragment : Fragment() {


    private lateinit var binding: FragmentBottomSheetBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentBottomSheetBinding.inflate(inflater,container,false)
        return binding.root
    }
}