package com.code_of_duty.laboratorio08.ui.mainActivity

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.code_of_duty.laboratorio08.models.Movies

class MainViewModel: ViewModel() {
    private val _movieList = mutableListOf<LiveData<Movies>>()
    val movieList: MutableList<LiveData<Movies>>
        get() = _movieList
}