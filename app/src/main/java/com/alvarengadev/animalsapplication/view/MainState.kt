package com.alvarengadev.animalsapplication.view

import com.alvarengadev.animalsapplication.model.Animal

sealed class MainState {

    object Idle: MainState()
    object Loading: MainState()
    data class Success(val animals: List<Animal>): MainState()
    data class Error(val error: String?): MainState()

}
