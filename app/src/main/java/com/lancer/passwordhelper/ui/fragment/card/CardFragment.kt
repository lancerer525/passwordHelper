package com.lancer.passwordhelper.ui.fragment.card

import androidx.lifecycle.ViewModelProviders
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.lancer.eyelast.base.BaseFragment
import com.lancer.passwordhelper.R
import com.lancer.passwordhelper.databinding.FragmentCardBinding

class CardFragment : BaseFragment<FragmentCardBinding>() {

    companion object {
        fun newInstance() = CardFragment()
    }

    override fun initView() {
        binding.cardStatusView.showEmpty()
    }

    override fun initData() {

    }

    override fun initLayout(): Int =R.layout.fragment_card


}