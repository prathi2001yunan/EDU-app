package com.example.edu

import android.os.Parcel
import android.os.Parcelable

class Kotlin1(val text1:String,val text2:String):Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun describeContents(): Int {
        return 0
    }

    override fun writeToParcel(p0: Parcel, p1: Int) {

        p0.writeString(text1)
        p0.writeString(text2)
    }

    companion object CREATOR : Parcelable.Creator<Kotlin1> {
        override fun createFromParcel(parcel: Parcel): Kotlin1 {
            return Kotlin1(parcel)
        }

        override fun newArray(size: Int): Array<Kotlin1?> {
            return arrayOfNulls(size)
        }
    }
}
