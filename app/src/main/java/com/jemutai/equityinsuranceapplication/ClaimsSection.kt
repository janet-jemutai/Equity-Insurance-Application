package com.jemutai.equityinsuranceapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.rounded.MailOutline
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.jemutai.equityinsuranceapplication.data.ClaimFeatures
import com.jemutai.equityinsuranceapplication.ui.theme.maroon

val features = listOf(
    ClaimFeatures(
        icon = Icons.Default.Edit,
        title = "Submit a Claim",
        description = "Start Claim report.",
        actionText = "Submit",
        color = maroon
    ),
    ClaimFeatures(
        icon = Icons.Default.List,
        title = "Claims",
        description = "List of claims",
        actionText = "View",
        color = maroon
    ),
    ClaimFeatures(
        icon = Icons.Rounded.MailOutline,
        title = "Upload Documents",
        description = "Claim Documents",
        actionText = "Documents",
        color = maroon
    ),
    ClaimFeatures(
        icon = Icons.Default.CheckCircle,
        title = "Claim Status",
        description = "Check Claim Progress",
        actionText = "View",
        color = maroon
    ),
    ClaimFeatures(
        icon = Icons.Default.Phone,
        title = "Contact us",
        description = "Get more information",
        actionText = "Contact us",
        color = maroon
    ),

    )

@Preview
@Composable
fun ClaimsSection() {

    Column {
        Text(
            text = "Claim Management",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(16.dp)
        )
    }
    LazyRow {
        items(features.size) { index ->
            ClaimFeatureCard(index)
        }
    }
}

@Composable
fun ClaimFeatureCard(index: Int) {
    val feature = features[index]
    var lastItemPaddingEnd = 0.dp
    if (index == features.size -1){
        lastItemPaddingEnd = 16.dp
    }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 16.dp, end = lastItemPaddingEnd)
    ) {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(feature.color)
                .width(250.dp)
                .height(160.dp)
                .padding(vertical = 12.dp, horizontal = 16.dp),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Icon(
                imageVector = feature.icon,
                contentDescription = feature.title,
                modifier = Modifier.size(48.dp)
            )
            Spacer(modifier = Modifier.height(16.dp))
            Text(text = feature.title, style = MaterialTheme.typography.headlineSmall, color = Color.White)
            Spacer(modifier = Modifier.height(8.dp))
//            Text(text = feature.description, style = MaterialTheme.typography.bodyMedium)
//            Spacer(modifier = Modifier.height(16.dp))
            val customButtonColor = Color.DarkGray
            Button(
                onClick = { /* Handle action */ },
                colors = ButtonDefaults.buttonColors(customButtonColor),
                modifier = Modifier.align(Alignment.End)
            ) {
                Text(text = feature.actionText)
            }
        }
    }
}