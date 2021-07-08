package com.sahilgarg90.microblogging.ui.tags

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.sahilgarg90.microblogging.databinding.FragmentTagsBinding

class TagsFragment : Fragment() {

    private lateinit var tagsViewModel: TagsViewModel
    private var _binding: FragmentTagsBinding? = null
    private val binding get() = _binding!!

    companion object {
        fun newInstance() = TagsFragment()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentTagsBinding.inflate(inflater, container, false)

        return binding.root
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}