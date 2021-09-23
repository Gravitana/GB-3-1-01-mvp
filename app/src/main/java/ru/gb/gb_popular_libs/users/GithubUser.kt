package ru.gb.gb_popular_libs.users

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class GithubUser(
    val login: String
) : Parcelable