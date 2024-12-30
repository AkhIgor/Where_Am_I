package com.whereami.interactor

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationManager
import android.location.LocationManager.GPS_PROVIDER
import androidx.annotation.RequiresPermission
import androidx.core.app.ActivityCompat

class LocationInteractor(
    context: Context
) {

    private val locationService =
        context.getSystemService(Context.LOCATION_SERVICE) as LocationManager


    @RequiresPermission(anyOf = [Manifest.permission.ACCESS_FINE_LOCATION, Manifest.permission.ACCESS_COARSE_LOCATION])
    fun getCurrentLocation(): Location? {
        return locationService.getLastKnownLocation(GPS_PROVIDER)
    }

    fun foo() {
//        val s= FusedLocationProviderClient()
        locationService.requestLocationUpdates()
    }
}