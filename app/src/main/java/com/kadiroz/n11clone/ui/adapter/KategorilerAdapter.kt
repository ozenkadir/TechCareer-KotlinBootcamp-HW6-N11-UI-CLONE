package com.kadiroz.n11clone.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kadiroz.n11clone.data.entity.Kategoriler
import com.kadiroz.n11clone.databinding.KategorilerCardTasarimBinding

class KategorilerAdapter(var mContext: Context,var kategorilerListesi:List<Kategoriler>)
    : RecyclerView.Adapter<KategorilerAdapter.CardTasarimTutucu>() {
    inner class CardTasarimTutucu(var tasarim: KategorilerCardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = KategorilerCardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val kategoriler = kategorilerListesi.get(position)
        val t = holder.tasarim

        t.imageViewKategori.setImageResource(mContext.resources.getIdentifier(kategoriler.kategori_resim, "drawable",
            mContext.packageName))

        t.textViewAd.text = "${kategoriler.kategori_isim}"

    }

    override fun getItemCount(): Int {
        return kategorilerListesi.size
    }


}