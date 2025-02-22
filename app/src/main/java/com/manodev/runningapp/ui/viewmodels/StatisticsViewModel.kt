package com.manodev.runningapp.ui.viewmodels

import androidx.lifecycle.ViewModel
import com.manodev.runningapp.repositories.MainRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class StatisticsViewModel @Inject constructor(
    val mainRepository: MainRepository
) : ViewModel() {


}