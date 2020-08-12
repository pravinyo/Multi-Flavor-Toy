package com.allsoftdroid.mobile.multiflavortoy.utility

import android.content.Context
import android.util.TypedValue

object DimensionUtils {
    fun dpToFloat(dpValue:Float,context: Context):Float{
        return TypedValue.applyDimension( TypedValue.COMPLEX_UNIT_DIP, dpValue,
            context.resources.displayMetrics
        )
    }
}