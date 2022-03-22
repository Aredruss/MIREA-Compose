package com.aredruss.mirea_card.ui.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Gray
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.aredruss.mirea_card.R
import com.aredruss.mirea_card.ui.theme.MIREATheme

@Composable
fun EmployeeCard(
    modifier: Modifier,
    title: String,
    subtext: String
) {
    Row(
        modifier = modifier
            .shadow(elevation = 1.dp, shape = RoundedCornerShape(5.dp))
            .clip(RoundedCornerShape(5.dp))
            .background(Color.White)
            .padding(10.dp)
    ) {
        Image(
            painter = painterResource(id = R.drawable.mirea),
            contentDescription = "avatar",
            modifier = Modifier.size(100.dp)
        )
        Spacer(
            modifier = Modifier
                .width(20.dp)
                .clip(RoundedCornerShape(5.dp))
        )
        Column {
            Text(
                text = title,
                style = MaterialTheme.typography.h3,
                maxLines = 1
            )
            Text(
                text = subtext,
                style = MaterialTheme.typography.h4,
                color = Gray
            )
        }
    }
}

@Preview
@Composable
fun EmployeeCardPreview() {
    MIREATheme {
        EmployeeCard(
            modifier = Modifier
                .fillMaxWidth()
                .padding(10.dp),
            title = "John Doe",
            subtext = "Surgeon"
        )
    }
}