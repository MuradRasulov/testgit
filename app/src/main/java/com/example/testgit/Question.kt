package com.example.testgit

import androidx.annotation.StringRes

data class Question(@StringRes val textResId: Int, val answer: Boolean)