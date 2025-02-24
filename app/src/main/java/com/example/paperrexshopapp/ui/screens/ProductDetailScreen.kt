package com.example.paperrexshopapp.ui.screens

import android.widget.Space
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Divider
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.paperrexshopapp.R
import com.example.paperrexshopapp.viewmodel.ProductViewModel

@Composable
fun ProductDetail(viewModel: ProductViewModel = viewModel(), navController: NavController, id: Int) {
    val product = viewModel.products.get(id)

    Column (modifier = Modifier.verticalScroll(rememberScrollState()).background(Color(red = 248, green = 248, blue = 248))) {
        ImageCarousel(product.images)

        HorizontalDivider(
            color = Color(red = 32, blue = 32, green = 32),
            thickness = 1.dp,
            modifier = Modifier.padding(bottom = 32.dp)
        )

        Column (modifier = Modifier.padding(horizontal = 16.dp)) {
            Text(
                text = product.name,
                color = Color(red = 0, green = 0, blue = 102),
                fontSize = 24.sp,
                fontWeight = FontWeight.Medium,
                )

            Text(
                text = "$" + product.price,
                fontSize = 18.sp,
                modifier = Modifier.padding(vertical = 32.dp),
                fontWeight = FontWeight.Bold,
                color = Color(red = 32, blue = 32, green = 32)
            )

            Button(
                onClick = {},
                shape = RoundedCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(red = 229, blue = 229, green = 229))
            ) {
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    Icon(
                        imageVector = Icons.Filled.Favorite,
                        contentDescription = "",
                        tint = Color(red = 32, green = 32, blue = 32),
                        modifier = Modifier.size(12.dp))
                    Text(
                        text = "ADD TO WISH LIST",
                        color = Color(red = 32, green = 32, blue = 32),
                        fontSize = 12.sp,
                        lineHeight = 12.sp)

                }
            }

            Text(
                text = product.description,
                fontSize = 12.sp
            )

            Image(
                painter = painterResource(R.drawable.size),
                contentDescription = "",
                modifier = Modifier
                    .fillMaxWidth(),
                contentScale = ContentScale.Crop,
                )

            Spacer(modifier = Modifier.height(64.dp))

            SizeDropdownMenu()

            Spacer(modifier = Modifier.height(32.dp))

            QuantitySelector()

            Button(
                onClick = {},
                shape = RoundedCornerShape(0.dp),
                colors = ButtonDefaults.buttonColors(containerColor = Color(red = 228, blue = 0, green = 255)),
                modifier = Modifier.fillMaxWidth().height(160.dp).padding(vertical = 48.dp)
            ) {
                Row(verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.spacedBy(4.dp)) {
                    Icon(
                        imageVector = Icons.Filled.ShoppingCart,
                        contentDescription = "",
                        tint = Color(red = 10, green = 0, blue = 102),
                        modifier = Modifier.size(16.dp))
                    Text(
                        text = "ADD TO WISH CART",
                        color = Color(red = 0, green = 0, blue = 102),
                        fontSize = 16.sp,
                        lineHeight = 16.sp)

                }
            }
        }


    }

}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun QuantitySelector() {
    Text(
        text = "Quantity",
        fontSize = 14.sp,
        modifier = Modifier.padding(bottom = 8.dp)
        )

    var quantity by remember { mutableStateOf(0) }

    TextField(
        value = quantity.toString(),
        onValueChange = { newText ->
            if (newText.all { it.isDigit() }) {
                quantity = newText.toInt()
            }
        },
        trailingIcon = {
            Icon(
                contentDescription = "",
                imageVector = Icons.Filled.KeyboardArrowUp,
                modifier = Modifier.clickable {
                    quantity++
                }
            )
        },
        leadingIcon = {
            Icon(
                contentDescription = "",
                imageVector = Icons.Filled.KeyboardArrowDown,
                modifier = Modifier.clickable {
                    if ( quantity > 0 ) quantity --
                }
            )
        },
        modifier = Modifier.fillMaxWidth(),
        textStyle = TextStyle(textAlign = TextAlign.Center),
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color(red = 229, green = 229, blue = 229),
            unfocusedContainerColor = Color(red = 229, green = 229, blue = 229),

        )

    )
}

@Composable
fun SizeDropdownMenu() {
    var expanded by remember { mutableStateOf(false) }
    var selectedSize by remember { mutableStateOf("M") }
    val sizes = listOf("S", "M", "L", "XL", "2XL", "3XL")

    Box(modifier = Modifier.wrapContentSize()) {
        Button(
            onClick = { expanded = true },
            shape = RoundedCornerShape(0.dp),
            modifier = Modifier.fillMaxWidth(),
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(red = 229, green = 229, blue = 229),
                contentColor = Color.Black
            )
        ) {
            Text("Size: $selectedSize")
        }
        DropdownMenu (expanded = expanded, onDismissRequest = { expanded = false }) {
            sizes.forEach { size ->
                DropdownMenuItem(
                    text = { Text(size) },
                    onClick = {
                        selectedSize = size
                        expanded = false
                    }
                )
            }
        }
    }
}

@Composable
fun ImageCarousel(images: List<String>) {

    var currentIndexImage by remember {
        mutableStateOf(0)
    }

    val context = LocalContext.current
    var imageResource = context.resources.getIdentifier(images.get(currentIndexImage), "drawable", context.packageName)

    Column {
        Image(
            painter = painterResource(imageResource),
            contentDescription = "",
            modifier = Modifier.fillMaxWidth())

        LazyRow (
            contentPadding = PaddingValues(16.dp ),
            horizontalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            itemsIndexed(images) {
                index, image ->
                ThumbnailCarousel(image = image, isCurrent = (currentIndexImage == index), action = {
                    currentIndexImage = index
                })

            }
        }


    }

}

@Composable
fun ThumbnailCarousel(image:String, action: () -> Unit, isCurrent: Boolean) {
    val context = LocalContext.current
    val imageResource = context.resources.getIdentifier(image, "drawable", context.packageName)

    println(isCurrent)
        Image(
            painter = painterResource(imageResource),
            contentDescription = "",
            modifier = Modifier
                .size(94.dp).graphicsLayer(alpha = if (isCurrent) 1f else 0.5f)
                .clickable {
                    action()
                }
        )




}

