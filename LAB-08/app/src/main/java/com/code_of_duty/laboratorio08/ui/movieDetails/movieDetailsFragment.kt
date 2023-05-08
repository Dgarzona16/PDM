package com.code_of_duty.laboratorio08.ui.movieDetails

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.code_of_duty.laboratorio08.R
import com.code_of_duty.laboratorio08.databinding.FragmentMovieDetailsBinding

class MovieDetailsFragment : Fragment() {
    private lateinit var binding: FragmentMovieDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(layoutInflater,R.layout.fragment_movie_details,container,false)
        return binding.root
    }
}