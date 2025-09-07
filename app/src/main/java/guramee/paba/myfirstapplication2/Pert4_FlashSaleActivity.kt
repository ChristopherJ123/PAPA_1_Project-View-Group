package guramee.paba.myfirstapplication2

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class Pert4_FlashSaleActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.pert4_latihan_constraint)

        val productRecyclerView: RecyclerView = findViewById(R.id.product_recycler_view)

        val products = listOf(
            Pert4_Product(R.drawable.model_1, "Lorem ipsum dolor sit amet consectetur", "$16,00", "$20,00"),
            Pert4_Product(R.drawable.model_2, "Lorem ipsum dolor sit amet consectetur", "$16,00", "$20,00"),
            Pert4_Product(R.drawable.model_3, "Lorem ipsum dolor sit amet consectetur", "$16,00", "$20,00"),
            Pert4_Product(R.drawable.model_4, "Lorem ipsum dolor sit amet consectetur", "$16,00", "$20,00"),
            Pert4_Product(R.drawable.model_5, "Lorem ipsum dolor sit amet consectetur", "$16,00", "$20,00"),
            Pert4_Product(R.drawable.model_6, "Lorem ipsum dolor sit amet consectetur", "$16,00", "$20,00")
        )

        val adapter = Pert4_ProductAdapter(products)

        productRecyclerView.layoutManager = GridLayoutManager(this, 2)
        productRecyclerView.adapter = adapter
    }

}