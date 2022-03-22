package com.aredruss.mirea_card.di

import com.aredruss.mirea_card.domain.CardPrefs
import org.koin.android.ext.koin.androidApplication
import org.koin.dsl.module

val domainModule = module {
    single { CardPrefs(appContext = androidApplication()) }
}