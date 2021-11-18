package id.fahrulrazi.recyclerview

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class MyItem(
    val imgFilm : Int,
    val titleFilm : String,
    val descFilm : String
) : Parcelable

