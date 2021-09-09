package com.frogobox.uikit

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import com.frogobox.uikit.ui.theme.Purple700
import com.frogobox.uikit.ui.theme.dimen_16dp
import com.frogobox.uikit.ui.theme.dimen_2dp

/*
 * Created by faisalamir on 09/09/21
 * FrogoAndroidUIKit
 * -----------------------------------------
 * Name     : Muhammad Faisal Amir
 * E-mail   : faisalamircs@gmail.com
 * Github   : github.com/amirisback
 * -----------------------------------------
 * Copyright (C) 2021 FrogoBox Inc.      
 * All rights reserved
 *
 */

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun FrogoComposeListItemType1() {

    Card(
        Modifier
            .fillMaxWidth()
            .padding(dimen_16dp)
            .clickable { },
        elevation = dimen_2dp
    ) {
        Column(
            modifier = Modifier.padding(dimen_16dp)
        ) {
            Text(color = Purple700, text = "Amir", maxLines = 1)
        }
    }

}