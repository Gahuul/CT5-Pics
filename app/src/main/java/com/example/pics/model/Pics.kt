package com.example.pics.model
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Pics (
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int

)