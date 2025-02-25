package com.example.paperrexshopapp.ui.screens

import android.widget.Space
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.defaultMinSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.GridItemSpan
import androidx.compose.foundation.lazy.grid.LazyGridItemSpanScope
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.foundation.lazy.grid.itemsIndexed
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.KeyboardArrowRight
import androidx.compose.material.icons.sharp.Search
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.paperrexshopapp.data.Product
import com.example.paperrexshopapp.viewmodel.ProductViewModel

@Composable
fun ProductListScreen(viewModel: ProductViewModel = viewModel(), navController:NavController) {

    val openProductDetail = { id:Int -> navController.navigate("productDetail/$id")}

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        contentPadding = PaddingValues(start = 8.dp, end = 8.dp, top = 24.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp),
        horizontalArrangement = Arrangement.spacedBy(16.dp),

    ) {

        item (span = {GridItemSpan(2)}) {
            MerchandiseWithFilter()
        }

        itemsIndexed(viewModel.products) {
                index,product ->
            ProductItem(product = product, openProductDetail = openProductDetail, id = index)
        }
        item {
            Spacer(modifier = Modifier.height(64.dp))
        }
    }
}

@Composable
fun MerchandiseWithFilter() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {

        Row (verticalAlignment = Alignment.CenterVertically) {

            Icon(imageVector = Icons.Filled.Home, contentDescription = "")
            Icon(imageVector = Icons.Filled.KeyboardArrowRight, contentDescription = "")
            Text(text = "Paper Rex Official Merch",fontSize = 10.sp)

        }

        Spacer(modifier = Modifier.height(32.dp))

        Text(
            text = "Paper Rex Official Merch",
            textAlign = TextAlign.Center,
            color = Color(red = 0, green = 0, blue = 102),
            fontSize = 24.sp
            )

        Spacer(modifier = Modifier.height(8.dp))

        Text(
            "Explore the latest official Paper Rex™ merch.",
            textAlign = TextAlign.Center,
            fontSize = 10.sp
            )

        Spacer(modifier = Modifier.height(32.dp))

        Button(
            onClick = {},
            colors = ButtonDefaults.buttonColors(containerColor = Color(red = 229, green = 229, blue = 229)),
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier.fillMaxWidth()


        ) {
            Row (horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                Icon(imageVector = Icons.Sharp.Search, contentDescription = "", tint = Color.Black)
                Text(text ="Filter", color = Color.Black)
            }
        }
    }

}

@Composable
fun ProductItem(id:Int, product: Product,openProductDetail: (Int) -> Unit ) {
    Box(modifier = Modifier.clickable {
        openProductDetail(id)
    }) {
        Column (
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.align(Alignment.Center)
        ) {
            val context = LocalContext.current
            val imageResource = context.resources.getIdentifier(product.images.get(0), "drawable", context.packageName)

            Box() {
                Image(
                    painter = painterResource(imageResource),
                    contentDescription = "",
                    modifier = Modifier.align(Alignment.Center)
                )


                if (product.colors != null && product.colors.isNotEmpty()) {
                    LazyRow(
                        modifier = Modifier.align(Alignment.BottomCenter),
                        horizontalArrangement = Arrangement.spacedBy(10.dp)
                    ) {
                        items(product.colors) { color ->
                            CircleWithInnerColor(color)
                        }
                    }
                }

            }

            Spacer(modifier = Modifier.height(16.dp))

            Text(
                text = "$" + product.price.toString(),
                textAlign = TextAlign.Center,
                color = Color(red = 37, green = 37, blue = 37),
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold)

            Spacer(modifier = Modifier.height(8.dp))

            Text(
                text = product.name,
                color = Color(red = 0, green = 0, blue = 102),
                textAlign = TextAlign.Center,
                lineHeight = 16.sp,
                fontSize = 12.sp)






        }

        Column (
            modifier = Modifier.align(Alignment.TopEnd).padding(top = 8.dp, end = 8.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            IconButton (
                modifier = Modifier.size(24.dp),
                onClick = {},
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = Color(red = 229, green = 229, blue = 229)
                ),

            ) {
                Icon(
                    imageVector = Icons.Filled.Favorite,
                    contentDescription = "",
                    modifier = Modifier.size(14.dp))
            }

            IconButton (
                modifier = Modifier.size(24.dp),
                onClick = {},
                colors = IconButtonDefaults.iconButtonColors(
                    containerColor = Color(red = 229, green = 229, blue = 229)
                ),

                ) {
                Icon(
                    imageVector = Icons.Filled.Info,
                    contentDescription = "",
                    modifier = Modifier.size(14.dp))
            }
        }
    }

}

@Composable
fun CircleWithInnerColor(innerColor: String) {
    Canvas (modifier = Modifier.size(20.dp)) {
        val canvasSize = size
        val radius = canvasSize.minDimension / 2


        drawCircle(
            color = Color.Black,
            radius = radius,
            center = center
        )

        drawCircle(
            color = Color(android.graphics.Color.parseColor(innerColor)),
            radius = radius * 0.8f,
            center = center
        )
    }
}
