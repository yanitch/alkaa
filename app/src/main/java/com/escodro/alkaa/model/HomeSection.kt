package com.escodro.alkaa.model

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Check
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material.icons.outlined.Search
import androidx.compose.material.icons.outlined.Settings
import androidx.compose.ui.graphics.vector.VectorAsset
import com.escodro.alkaa.R

/**
 * Enum to represent the sections available in the bottom app bar.
 *
 * @param title title to be shown in top app bar.
 * @param icon icon to be shown in the bottom app bar
 */
enum class HomeSection(
    @StringRes val title: Int,
    val icon: VectorAsset
) {
    Tasks(R.string.home_title_tasks, Icons.Outlined.Check),
    Search(R.string.home_title_search, Icons.Outlined.Search),
    Categories(R.string.home_title_categories, Icons.Outlined.Notifications),
    Settings(R.string.home_title_settings, Icons.Outlined.Settings)
}
