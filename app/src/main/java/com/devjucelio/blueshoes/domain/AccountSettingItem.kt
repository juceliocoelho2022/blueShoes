package com.devjucelio.blueshoes.domain

import androidx.appcompat.app.AppCompatActivity

class AccountSettingItem(
    val label: String,
    val description: String,
    val activityClass: Class<out AppCompatActivity>
)