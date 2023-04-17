package com.dgarzona.labo05.ui

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.findNavController
import com.dgarzona.labo05.R
import com.dgarzona.labo05.databinding.FragmentMovieContainerBinding

class MovieContainerFragment : Fragment() {
    private var _binding : FragmentMovieContainerBinding? = null
    val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMovieContainerBinding.inflate(inflater, container, false)

        onClick()

        return _binding?.root
    }

    private fun onClick() {
        binding.apply {
            addAction.setOnClickListener {
                it.findNavController().navigate(R.id.action_movieContainerFragment_to_newMovieFragment)
            }

            cardView.setOnClickListener {
                it.findNavController().navigate(R.id.action_movieContainerFragment_to_movieDetailsFragment)
            }

            cardView2.setOnClickListener {
                it.findNavController().navigate(R.id.action_movieContainerFragment_to_movieDetailsFragment)
            }
        }
    }
}