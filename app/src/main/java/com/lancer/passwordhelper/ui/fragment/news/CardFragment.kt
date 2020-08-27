package com.lancer.passwordhelper.ui.fragment.news

import com.lancer.passwordhelper.base.BaseFragment
import com.lancer.passwordhelper.R
import com.lancer.passwordhelper.databinding.FragmentCardBinding

//替换为开眼每日新闻界面
class CardFragment : BaseFragment<FragmentCardBinding>() {    init {
    name = CardFragment::class.java.simpleName
}

    companion object {
        fun newInstance() = CardFragment()
    }

    override fun initView() {
        binding.cardStatusView.showEmpty()
    }

    override fun initData() {

    }

    override fun initLayout(): Int = R.layout.fragment_card


}