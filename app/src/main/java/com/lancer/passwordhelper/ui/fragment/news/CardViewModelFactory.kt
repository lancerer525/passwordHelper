package com.lancer.passwordhelper.ui.fragment.news

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.lancer.passwordhelper.model.MainRepository

class CardViewModelFactory(private val repository: MainRepository) :
    ViewModelProvider.NewInstanceFactory() {
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return CardViewModel(repository) as T
    }
}