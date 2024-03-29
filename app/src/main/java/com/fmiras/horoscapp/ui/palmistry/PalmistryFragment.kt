package com.fmiras.horoscapp.ui.palmistry

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.fmiras.horoscapp.R
import com.fmiras.horoscapp.databinding.FragmentHoroscopeBinding
import com.fmiras.horoscapp.databinding.FragmentLuckBinding
import com.fmiras.horoscapp.databinding.FragmentPalmistryBinding

class PalmistryFragment : Fragment() {
    private var _binding: FragmentPalmistryBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPalmistryBinding.inflate(layoutInflater, container, false)
        return binding.root
    }
}