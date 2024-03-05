import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kadiroz.n11clone.data.entity.Urunler
import com.kadiroz.n11clone.databinding.UrunCardTasarimBinding

class UrunlerAdapter(var mContext: Context, var urunlerListesi: List<Urunler>)
    : RecyclerView.Adapter<UrunlerAdapter.CardTasarimTutucu>() {

    inner class CardTasarimTutucu(var tasarim: UrunCardTasarimBinding) : RecyclerView.ViewHolder(tasarim.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardTasarimTutucu {
        val binding = UrunCardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false)
        return CardTasarimTutucu(binding)
    }

    override fun onBindViewHolder(holder: CardTasarimTutucu, position: Int) {
        val urun = urunlerListesi[position]
        val t = holder.tasarim

        t.imageViewUrun.setImageResource(mContext.resources.getIdentifier(urun.urun_resim, "drawable",
            mContext.packageName))

        val maxKarakterSayisi = 30
        val urunAdi = urun.urun_ad
        if (urunAdi.length > maxKarakterSayisi) {
            t.textViewAciklama.text = "${urunAdi.substring(0, maxKarakterSayisi)}..."
        } else {
            t.textViewAciklama.text = urunAdi
        }

        t.textViewFiyat.text = "${urun.urun_fiyat} TL"

        t.ratingBar.rating = urun.urun_oy.toFloat()

        t.oylama.text = "(${urun.urun_oy_yazisi})"

        if (urun.urun_eski_fiyat != null) {
            t.textViewEskiFiyat.text = "${urun.urun_eski_fiyat} TL"
            t.textViewEskiFiyat.visibility = android.view.View.VISIBLE
        } else {
            t.textViewEskiFiyat.visibility = android.view.View.GONE
        }
    }

    override fun getItemCount(): Int {
        return urunlerListesi.size
    }
}
