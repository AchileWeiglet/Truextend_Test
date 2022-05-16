package com.truextend.interviewtx.ui.home

import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import androidx.appcompat.widget.SearchView
import com.truextend.interviewtx.Extensions.onQueryTextChanged
import com.truextend.interviewtx.R
import com.truextend.interviewtx.databinding.FragmentHomeBinding
import com.truextend.interviewtx.ui.base.BaseFragment

class HomeFragment: BaseFragment<HomeViewModel, FragmentHomeBinding>(HomeViewModel::class){

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_home, menu)

        val searchItem = menu.findItem(R.id.action_search)
        val searchView = searchItem.actionView as SearchView

        searchView.onQueryTextChanged {
            viewModel.searchQuery.value = it
        }
    }

    override val layoutId: Int
        get() = R.layout.fragment_home

    override fun initObservers() {}

    override fun initBindingOrUIValues() {
        binding.viewModel = viewModel
    }
}