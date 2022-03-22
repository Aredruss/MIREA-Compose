package com.aredruss.mirea_card.domain

import android.content.Context
import android.content.SharedPreferences

class CardPrefs(
    appContext: Context,
) {
    private val TAG = "CardPrefs"

    private val prefs: SharedPreferences =
        appContext.getSharedPreferences(prefsName, Context.MODE_PRIVATE)

    companion object {
        private const val prefsName = "CardPrefs"
        private const val userNameKey = "userName"
        private const val onBoardingShownKey = "onBoardingShown"
        private const val descriptionKey = "description"
    }

    var userName: String?
        set(value) = prefs.edit().putString(userNameKey, value).apply()
        get() = prefs.getString(userNameKey, null)

    var level: String?
        set(value) = prefs.edit().putString(userNameKey, value).apply()
        get() = prefs.getString(userNameKey, null)

    var description: String?
        set(value) = prefs.edit().putString(descriptionKey, value).apply()
        get() = prefs.getString(descriptionKey, null)

    var onBoardingShown: Boolean
        set(value) = prefs.edit().putBoolean(onBoardingShownKey, value).apply()
        get() = prefs.getBoolean(onBoardingShownKey, false)
}