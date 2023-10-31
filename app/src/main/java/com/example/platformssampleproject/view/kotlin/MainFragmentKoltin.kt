package com.example.platformssampleproject.view.kotlin

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import com.example.platformssampleproject.databinding.FragmentMainBinding
import com.example.platformssampleproject.viewmodel.kotlin.MainViewModelKotlin


class MainFragmentKoltin : Fragment() {
          // View Binding
          private var _binding: FragmentMainBinding? = null
          private val binding get() = _binding!!

          // Create a viewModel
          private val viewModel: MainViewModelKotlin by activityViewModels()

          override fun onCreateView(
                    inflater: LayoutInflater,
                    container: ViewGroup?,
                    savedInstanceState: Bundle?
          ): View? {
                    // This is needed for view binding
                    _binding = FragmentMainBinding.inflate(inflater, container, false)
                    val view = binding.root
                    return view
          }

          override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
                    super.onViewCreated(view, savedInstanceState)

                    setupClickListeners()
                    fragmentTextUpdateObserver()
          }

          override fun onDestroyView() {
                    super.onDestroyView()
                    _binding = null
          }

          // Setup the button in our fragment to call getUpdatedText method in viewModel
          private fun setupClickListeners() {
                    binding.fragmentButton.setOnClickListener { viewModel.getRandomUserData() }
          }

          // Observer is waiting for viewModel to update our UI
          private fun fragmentTextUpdateObserver() {
                    viewModel.uiTextLiveData.observe(viewLifecycleOwner, Observer { updatedText ->
                              binding.fragmentTextView.text = updatedText
                    })
          }
}