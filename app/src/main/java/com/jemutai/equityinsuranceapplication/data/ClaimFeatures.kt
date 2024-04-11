package com.jemutai.equityinsuranceapplication.data

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector

data class ClaimFeatures(
    val icon: ImageVector,
    val title: String,
    val description: String,
    val actionText: String,
    val color: Color
)

