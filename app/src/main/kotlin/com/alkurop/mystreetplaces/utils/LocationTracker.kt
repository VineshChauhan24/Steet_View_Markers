package com.alkurop.mystreetplaces.utils

import android.content.Intent
import android.location.Location
import android.support.v4.app.FragmentActivity
import com.google.android.gms.maps.LocationSource


interface LocationTracker : LocationSource {
    fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?)
    fun setUp(activity: FragmentActivity, onFailedListener: () -> Unit)
}