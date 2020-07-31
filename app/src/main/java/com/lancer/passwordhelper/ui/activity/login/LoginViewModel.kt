package com.lancer.passwordhelper.ui.activity.login

import androidx.lifecycle.*
import com.lancer.passwordhelper.api.BaseResponse
import com.lancer.passwordhelper.api.LoginBean
import com.lancer.passwordhelper.model.MainRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.lang.Exception

/**
 * @author lancer
 * @des
 * @Date 2020/7/28 16:39
 */
class LoginViewModel(private val repository: MainRepository) : ViewModel() {

    //TODO
    var isLoginSuccess = MutableLiveData<Boolean>()

    fun login(username: String, password: String) {
        viewModelScope.launch(Dispatchers.Main) {
            val login = repository.login(username, password)
            isLoginSuccess.value = login.errorCode == 0
        }
    }

    private fun launch(block: suspend () -> Unit, error: suspend (Throwable) -> Unit) =
        viewModelScope.launch {
            try {
                block()
            } catch (e: Throwable) {
                error(e)
            }
        }
}