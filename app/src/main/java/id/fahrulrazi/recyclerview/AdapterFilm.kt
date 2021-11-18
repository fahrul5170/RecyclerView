package id.fahrulrazi.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class AdapterFilm(private val context: Context, private val film: List<MyItem>, val listener: (MyItem) -> Unit)
    : RecyclerView.Adapter<AdapterFilm.MyItemViewHolder>() {

    class MyItemViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val imgFilm = view.findViewById<ImageView>(R.id.img_item_photo)
        val titleFilm = view.findViewById<TextView>(R.id.tv_item_name)
        val descFilm = view.findViewById<TextView>(R.id.tv_item_description)

        fun bindview(film: MyItem, listener: (MyItem) -> Unit){
            imgFilm.setImageResource(film.imgFilm)
            titleFilm.text = film.titleFilm
            descFilm.text = film.descFilm
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyItemViewHolder {
        return MyItemViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_poster, parent, false)
        )
    }

    override fun onBindViewHolder(holder: MyItemViewHolder, position: Int) {
       holder.bindview(film[position], listener)
    }

    override fun getItemCount(): Int = film.size
}