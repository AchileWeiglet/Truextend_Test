package com.truextend.interviewtx.ui.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import org.koin.androidx.viewmodel.ext.android.getViewModel
import kotlin.reflect.KClass

abstract class BaseFragment<DataType : BaseViewModel, Binding : ViewDataBinding>(private val clazz: KClass<DataType>) :
Fragment() {

    protected lateinit var viewModel: DataType
    protected lateinit var binding: Binding
    protected abstract val layoutId: Int

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewModel =  getViewModel(clazz = clazz)
        viewModel.showMessage.observe(this) { event ->
            event?.getContentIfNotHandled()
                ?.let { Toast.makeText(activity, it, Toast.LENGTH_SHORT).show() }
        }
        initObservers()
    }

    abstract fun initObservers()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = DataBindingUtil.inflate(inflater, layoutId, container, false)
        binding.lifecycleOwner = this
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initBindingOrUIValues()
    }

    abstract fun initBindingOrUIValues()
}