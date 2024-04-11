package com.jemutai.equityinsuranceapplication

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.gms.wallet.Wallet
import com.jemutai.equityinsuranceapplication.data.Policies
import com.jemutai.equityinsuranceapplication.ui.theme.BlueStart
import com.jemutai.equityinsuranceapplication.ui.theme.GreenStart
import com.jemutai.equityinsuranceapplication.ui.theme.OrangeStart
import com.jemutai.equityinsuranceapplication.ui.theme.Purple40

val policiesList = listOf(
    Policies(

        name = "Motor\nVehicle",
        background = OrangeStart
    ),
    Policies(

        name = "Domestic\nPackage",
        background = BlueStart
    ),
    Policies(

        name = "Travel\nInsurance",
        background = Purple40
    ),
    Policies(

        name = "Personal\nAccident Cover",
        background = GreenStart
    )

)

@Preview
@Composable
fun Policies(){
    Column {
        Text(
            text = "Get Insurance",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
            color = MaterialTheme.colorScheme.onBackground,
            modifier = Modifier.padding(16.dp)
        )
    }
    LazyRow{
        items(policiesList.size){
            FinanceItem(it)
        }
    }
}
@Composable
fun FinanceItem(
    index: Int
){
    val finance = policiesList[index]
    var lastPaddingEnd = 0.dp
    if (index == policiesList.size -1){
        lastPaddingEnd  = 16.dp
    }
    Box(modifier = Modifier.padding(start = 16.dp, end = lastPaddingEnd))
    {
        Column(
            modifier = Modifier
                .clip(RoundedCornerShape(25.dp))
                .background(MaterialTheme.colorScheme.secondaryContainer)
                .size(120.dp)
                .clickable {}
                .padding(13.dp)
        ) {
            Box(
                modifier = Modifier
                    .clip(RoundedCornerShape(16.dp))
                    .background(finance.background)
                    .padding(6.dp)
            ) {

            }
            Text(
                text = finance.name,
                color = MaterialTheme.colorScheme.onSecondaryContainer,
                fontWeight = FontWeight.SemiBold,
                fontSize = 16.sp
            )
        }
    }
}