package com.manodev.runningapp.ui.fragments

import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.manodev.runningapp.R
import com.manodev.runningapp.ui.viewmodels.MainViewModel

class SetupFragment : Fragment(R.layout.fragment_setup) {

    private val viewModel: MainViewModel by viewModels()
}