package com.sahilgarg90.microblogging.ui.feed

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sahilgarg90.microblogging.databinding.FragmentFeedBinding

class FeedFragment : Fragment() {

    private lateinit var feedViewModel: FeedViewModel
    private var _binding: FragmentFeedBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = FeedFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentFeedBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}