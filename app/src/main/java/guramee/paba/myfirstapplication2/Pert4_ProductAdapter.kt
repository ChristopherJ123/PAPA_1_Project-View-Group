package guramee.paba.myfirstapplication2

import android.graphics.Paint
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Pert4_ProductAdapter(private val productList: List<Pert4_Product>) :
    RecyclerView.Adapter<Pert4_ProductAdapter.ProductViewHolder>() {

    class ProductViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val productImage: ImageView = itemView.findViewById(R.id.product_image)
        val productDescription: TextView = itemView.findViewById(R.id.product_description)
        val discountedPrice: TextView = itemView.findViewById(R.id.product_price_discounted)
        val originalPrice: TextView = itemView.findViewById(R.id.product_price_original)
        val discountBadge: TextView = itemView.findViewById(R.id.discount_badge)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.pert4_product_card_item_layout, parent, false)
        return ProductViewHolder(view)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = productList[position]

        // Set the data for each view
        holder.productImage.setImageResource(product.imageResId)
        holder.productDescription.text = product.description
        holder.discountedPrice.text = product.discountedPrice
        holder.originalPrice.text = product.originalPrice

        // Strikethrough effect
        holder.originalPrice.paintFlags = holder.originalPrice.paintFlags or Paint.STRIKE_THRU_TEXT_FLAG

        holder.discountBadge.text = "-20%"
    }

    override fun getItemCount(): Int {
        return productList.size
    }
}