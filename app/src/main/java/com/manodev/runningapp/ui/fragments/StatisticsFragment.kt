package com.manodev.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.manodev.runningapp.R
import com.manodev.runningapp.ui.viewmodels.StatisticsViewModel

class StatisticsFragment : Fragment(R.layout.fragment_statistics) {

    private val viewModel: StatisticsViewModel by viewModels()
}