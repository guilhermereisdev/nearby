package com.guilhermereisapps.nearby.ui.component.marketdetails

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.guilhermereisapps.nearby.data.model.Market
import com.guilhermereisapps.nearby.ui.theme.Gray400
import com.guilhermereisapps.nearby.ui.theme.Typography
import com.guilhermereisapps.nearby.R
import com.guilhermereisapps.nearby.data.model.mock.mockMarkets
import com.guilhermereisapps.nearby.ui.theme.Gray500

@Composable
fun MarketDetailsInfo(
    modifier: Modifier = Modifier,
    market: Market,
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        Text(text = "Informações", style = Typography.headlineSmall, color = Gray400)
        Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_ticket),
                    tint = Gray500,
                    contentDescription = "Ícone de cupom",
                )
                Text(
                    text = "${market.coupons} " + if (market.coupons == 1) "cupom disponível" else "cupons disponíveis",
                    style = Typography.labelMedium,
                    color = Gray500,
                )
            }
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_map_pin),
                    tint = Gray500,
                    contentDescription = "Ícone de endereço",
                )
                Text(
                    text = market.address,
                    style = Typography.labelMedium,
                    color = Gray500,
                )
            }
            Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {
                Icon(
                    modifier = Modifier.size(16.dp),
                    painter = painterResource(id = R.drawable.ic_phone),
                    tint = Gray500,
                    contentDescription = "Ícone de telefone",
                )
                Text(
                    text = market.phone,
                    style = Typography.labelMedium,
                    color = Gray500,
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun MarketDetailsInfoPreview() {
    MarketDetailsInfo(
        modifier = Modifier.fillMaxWidth(),
        market = mockMarkets.first()
    )
}
