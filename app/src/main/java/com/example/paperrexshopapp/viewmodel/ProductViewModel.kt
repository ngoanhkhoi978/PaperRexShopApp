package com.example.paperrexshopapp.viewmodel

import androidx.compose.runtime.mutableStateListOf
import androidx.lifecycle.ViewModel
import com.example.paperrexshopapp.data.Comment
import com.example.paperrexshopapp.data.Product

class ProductViewModel: ViewModel() {
    private val _products = mutableStateListOf(
        Product(
            name = "PRX Official Match Jersey 2025/26 DinoGlitch",
            price = 69.99,
            productFeatures = listOf("100% Polyester", "Genuine Jersey", "14-day Return Policy On Non-Sale Items"),
            description = """
The Paper Rex™ DinoGlitch Jersey 2025/2026 – Prehistoric Drip Meets Digital Chaos
Looking for a jersey that screams “I’m built different… like, dinosaur-level different”? Meet the DinoGlitch Jersey, where prehistoric vibes and digital chaos collide to create a masterpiece of esports fashion. It’s bold, glitchy, and downright unstoppable – just like you.
We’ve leveled up the fit and quality this season, giving the jersey an upgraded cut for peak comfort and performance. Crafted with OBRE Teamware VAPORTEC 2.0, it’s light, breathable, and so comfy you’ll forget you’re wearing it… until someone points out how amazing it looks.
What makes it roar:
- OBRE Lumibrite™ ink technology: Adds a glitchy, 3D-like design that practically pops off your screen.
- A 3D chest patch: Features the PRX logo and founding year, proving you’re part of the squad.
- The latest sponsor logos: Because leveling up never stops (logos may vary as our partnerships evolve).
Heads-up:
- Custom name/number tags? Not available for this drop – sorry, it’s just that exclusive.
- Made with 100% Vaportec Polyester – breathable, durable, and perfect for battling sweaty matches or just looking amazing.
Slip into the DinoGlitch, unleash your inner apex predator, and show the world that style like this never goes extinct. 🦖✨
""",
            images = listOf("product_1_1", "product_1_2", "product_1_3", "product_1_4", "product_1_5", "product_1_6"),
            colors = listOf("#dc53a9"),
            comments = listOf(
                Comment(
                    username = "Ngo Anh Khoi",
                    content = "Amazing product. Can't go wrong with this one. 100% recommend",
                    date = "25/2/2025",
                    rate = "Love it!"
                ),
                Comment(
                    username = "Huynh Quoc Khanh",
                    content = "Amazing quality for the price",
                    date = "25/2/2025",
                    rate = "Excellent quality"
                )
            )
        ),
        Product(
            name = "PRX Basic Surf Teal Tee",
            price = 27.00,
            productFeatures = listOf("100% Polyester", "Genuine Jersey", "14-day Return Policy On Non-Sale Items"),
            description = """
The Paper Rex™ DinoGlitch Jersey 2025/2026 – Prehistoric Drip Meets Digital Chaos
Looking for a jersey that screams “I’m built different… like, dinosaur-level different”? Meet the DinoGlitch Jersey, where prehistoric vibes and digital chaos collide to create a masterpiece of esports fashion. It’s bold, glitchy, and downright unstoppable – just like you.
We’ve leveled up the fit and quality this season, giving the jersey an upgraded cut for peak comfort and performance. Crafted with OBRE Teamware VAPORTEC 2.0, it’s light, breathable, and so comfy you’ll forget you’re wearing it… until someone points out how amazing it looks.
What makes it roar:
- OBRE Lumibrite™ ink technology: Adds a glitchy, 3D-like design that practically pops off your screen.
- A 3D chest patch: Features the PRX logo and founding year, proving you’re part of the squad.
- The latest sponsor logos: Because leveling up never stops (logos may vary as our partnerships evolve).
Heads-up:
- Custom name/number tags? Not available for this drop – sorry, it’s just that exclusive.
- Made with 100% Vaportec Polyester – breathable, durable, and perfect for battling sweaty matches or just looking amazing.
Slip into the DinoGlitch, unleash your inner apex predator, and show the world that style like this never goes extinct. 🦖✨
""",
            images = listOf("product_2_1", "product_2_2", "product_2_3", "product_2_4"),
            colors = listOf("#44e1d1"),
            comments = listOf(
                Comment(
                    username = "Ngo Anh Khoi",
                    content = "Amazing product. Can't go wrong with this one. 100% recommend",
                    date = "25/2/2025",
                    rate = "Love it!"
                ),
                Comment(
                    username = "Huynh Quoc Khanh",
                    content = "Amazing quality for the price",
                    date = "25/2/2025",
                    rate = "Excellent quality"
                )
            )
        ),Product(
            name = "PRX Basic Black Tee",
            price = 34.00,
            productFeatures = listOf("100% Polyester", "Genuine Jersey", "14-day Return Policy On Non-Sale Items"),
            description = """
The Paper Rex™ DinoGlitch Jersey 2025/2026 – Prehistoric Drip Meets Digital Chaos
Looking for a jersey that screams “I’m built different… like, dinosaur-level different”? Meet the DinoGlitch Jersey, where prehistoric vibes and digital chaos collide to create a masterpiece of esports fashion. It’s bold, glitchy, and downright unstoppable – just like you.
We’ve leveled up the fit and quality this season, giving the jersey an upgraded cut for peak comfort and performance. Crafted with OBRE Teamware VAPORTEC 2.0, it’s light, breathable, and so comfy you’ll forget you’re wearing it… until someone points out how amazing it looks.
What makes it roar:
- OBRE Lumibrite™ ink technology: Adds a glitchy, 3D-like design that practically pops off your screen.
- A 3D chest patch: Features the PRX logo and founding year, proving you’re part of the squad.
- The latest sponsor logos: Because leveling up never stops (logos may vary as our partnerships evolve).
Heads-up:
- Custom name/number tags? Not available for this drop – sorry, it’s just that exclusive.
- Made with 100% Vaportec Polyester – breathable, durable, and perfect for battling sweaty matches or just looking amazing.
Slip into the DinoGlitch, unleash your inner apex predator, and show the world that style like this never goes extinct. 🦖✨
""",
            images = listOf("product_3_1", "product_3_2", "product_3_3", "product_3_4"),
            colors = listOf("#161616"),
            comments = listOf(
                Comment(
                    username = "Ngo Anh Khoi",
                    content = "Amazing product. Can't go wrong with this one. 100% recommend",
                    date = "25/2/2025",
                    rate = "Love it!"
                ),
                Comment(
                    username = "Huynh Quoc Khanh",
                    content = "Amazing quality for the price",
                    date = "25/2/2025",
                    rate = "Excellent quality"
                )
            )
        ),Product(
            name = "PRX Basic Cobalt Spark Hoodie",
            price = 59.99,
            productFeatures = listOf("100% Polyester", "Genuine Jersey", "14-day Return Policy On Non-Sale Items"),
            description = """
The Paper Rex™ DinoGlitch Jersey 2025/2026 – Prehistoric Drip Meets Digital Chaos
Looking for a jersey that screams “I’m built different… like, dinosaur-level different”? Meet the DinoGlitch Jersey, where prehistoric vibes and digital chaos collide to create a masterpiece of esports fashion. It’s bold, glitchy, and downright unstoppable – just like you.
We’ve leveled up the fit and quality this season, giving the jersey an upgraded cut for peak comfort and performance. Crafted with OBRE Teamware VAPORTEC 2.0, it’s light, breathable, and so comfy you’ll forget you’re wearing it… until someone points out how amazing it looks.
What makes it roar:
- OBRE Lumibrite™ ink technology: Adds a glitchy, 3D-like design that practically pops off your screen.
- A 3D chest patch: Features the PRX logo and founding year, proving you’re part of the squad.
- The latest sponsor logos: Because leveling up never stops (logos may vary as our partnerships evolve).
Heads-up:
- Custom name/number tags? Not available for this drop – sorry, it’s just that exclusive.
- Made with 100% Vaportec Polyester – breathable, durable, and perfect for battling sweaty matches or just looking amazing.
Slip into the DinoGlitch, unleash your inner apex predator, and show the world that style like this never goes extinct. 🦖✨
""",
            images = listOf("product_4_1", "product_4_2", "product_4_3", "product_4_4", "product_4_5", "product_4_6"),
            colors = listOf("#000080"),
            comments = listOf(
                Comment(
                    username = "Ngo Anh Khoi",
                    content = "Amazing product. Can't go wrong with this one. 100% recommend",
                    date = "25/2/2025",
                    rate = "Love it!"
                ),
                Comment(
                    username = "Huynh Quoc Khanh",
                    content = "Amazing quality for the price",
                    date = "25/2/2025",
                    rate = "Excellent quality"
                )
            )
        ),Product(
            name = "PRX Crop Jersey 2025/26 DinoGlitch",
            price = 69.99,
            productFeatures = listOf("100% Polyester", "Genuine Jersey", "14-day Return Policy On Non-Sale Items"),
            description = """
The Paper Rex™ DinoGlitch Jersey 2025/2026 – Prehistoric Drip Meets Digital Chaos
Looking for a jersey that screams “I’m built different… like, dinosaur-level different”? Meet the DinoGlitch Jersey, where prehistoric vibes and digital chaos collide to create a masterpiece of esports fashion. It’s bold, glitchy, and downright unstoppable – just like you.
We’ve leveled up the fit and quality this season, giving the jersey an upgraded cut for peak comfort and performance. Crafted with OBRE Teamware VAPORTEC 2.0, it’s light, breathable, and so comfy you’ll forget you’re wearing it… until someone points out how amazing it looks.
What makes it roar:
- OBRE Lumibrite™ ink technology: Adds a glitchy, 3D-like design that practically pops off your screen.
- A 3D chest patch: Features the PRX logo and founding year, proving you’re part of the squad.
- The latest sponsor logos: Because leveling up never stops (logos may vary as our partnerships evolve).
Heads-up:
- Custom name/number tags? Not available for this drop – sorry, it’s just that exclusive.
- Made with 100% Vaportec Polyester – breathable, durable, and perfect for battling sweaty matches or just looking amazing.
Slip into the DinoGlitch, unleash your inner apex predator, and show the world that style like this never goes extinct. 🦖✨
""",
            images = listOf("product_5_1", "product_5_2", "product_5_3", "product_5_4", "product_5_5"),
            colors = listOf("#dc53a9"),
            comments = listOf(
                Comment(
                    username = "Ngo Anh Khoi",
                    content = "Amazing product. Can't go wrong with this one. 100% recommend",
                    date = "25/2/2025",
                    rate = "Love it!"
                ),
                Comment(
                    username = "Huynh Quoc Khanh",
                    content = "Amazing quality for the price",
                    date = "25/2/2025",
                    rate = "Excellent quality"
                )
            )
        ),Product(
            name = "PRX Basic Sage Leaf Tee",
            price = 34.99,
            productFeatures = listOf("100% Polyester", "Genuine Jersey", "14-day Return Policy On Non-Sale Items"),
            description = """
The Paper Rex™ DinoGlitch Jersey 2025/2026 – Prehistoric Drip Meets Digital Chaos
Looking for a jersey that screams “I’m built different… like, dinosaur-level different”? Meet the DinoGlitch Jersey, where prehistoric vibes and digital chaos collide to create a masterpiece of esports fashion. It’s bold, glitchy, and downright unstoppable – just like you.
We’ve leveled up the fit and quality this season, giving the jersey an upgraded cut for peak comfort and performance. Crafted with OBRE Teamware VAPORTEC 2.0, it’s light, breathable, and so comfy you’ll forget you’re wearing it… until someone points out how amazing it looks.
What makes it roar:
- OBRE Lumibrite™ ink technology: Adds a glitchy, 3D-like design that practically pops off your screen.
- A 3D chest patch: Features the PRX logo and founding year, proving you’re part of the squad.
- The latest sponsor logos: Because leveling up never stops (logos may vary as our partnerships evolve).
Heads-up:
- Custom name/number tags? Not available for this drop – sorry, it’s just that exclusive.
- Made with 100% Vaportec Polyester – breathable, durable, and perfect for battling sweaty matches or just looking amazing.
Slip into the DinoGlitch, unleash your inner apex predator, and show the world that style like this never goes extinct. 🦖✨
""",
            images = listOf("product_6_1", "product_6_2", "product_6_3", "product_6_4"),
            colors = listOf("#badaa4", "#ffffff"),
            comments = listOf(
                Comment(
                    username = "Ngo Anh Khoi",
                    content = "Amazing product. Can't go wrong with this one. 100% recommend",
                    date = "25/2/2025",
                    rate = "Love it!"
                ),
                Comment(
                    username = "Huynh Quoc Khanh",
                    content = "Amazing quality for the price",
                    date = "25/2/2025",
                    rate = "Excellent quality"
                )
            )
        )
    )
    val products: List<Product> = _products
}