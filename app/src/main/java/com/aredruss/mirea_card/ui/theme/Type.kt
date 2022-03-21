package com.aredruss.mirea_card.ui.theme

import androidx.compose.material.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.aredruss.mirea_card.R

// Set of Material typography styles to start with
val fonts = FontFamily(
    Font(R.font.readex_normal, weight = FontWeight.Normal),
    Font(R.font.readex_bold, weight = FontWeight.Bold),
    Font(R.font.readex_extra_light, weight = FontWeight.ExtraLight),
    Font(R.font.readex_light, weight = FontWeight.Light),
    Font(R.font.readex_pro_medium, weight = FontWeight.Medium),
    Font(R.font.readex_semi_bold, weight = FontWeight.SemiBold)
)
val Typography = Typography(
    body1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp
    ),
    h1 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 32.sp
    ),
    h2 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 26.sp
    ),
    h3 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Bold,
        fontSize = 20.sp
    ),
    h4 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    body2 = TextStyle(
        fontFamily = fonts,
        fontWeight = FontWeight.Light,
        fontSize = 18.sp
    )
)
