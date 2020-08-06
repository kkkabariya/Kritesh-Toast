package com.example.toastlibrary

import android.content.Context
import android.view.Gravity
import android.widget.Toast

class ToastMessage {

    fun s(c: Context, message: String){

        var toast = Toast.makeText(c, message, Toast.LENGTH_LONG)
        toast.setGravity(Gravity.CENTER, Gravity.AXIS_X_SHIFT, Gravity.AXIS_Y_SHIFT)
        toast.show()
    }
}