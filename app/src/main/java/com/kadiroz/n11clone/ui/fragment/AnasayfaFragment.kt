package com.kadiroz.n11clone.ui.fragment

import UrunlerAdapter
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import com.kadiroz.n11clone.data.entity.Kategoriler
import com.kadiroz.n11clone.data.entity.Urunler
import com.kadiroz.n11clone.databinding.FragmentAnasayfaBinding
import com.kadiroz.n11clone.ui.adapter.KategorilerAdapter


class AnasayfaFragment : Fragment() {
    private lateinit var binding: FragmentAnasayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnasayfaBinding.inflate(inflater,container,false)

        val urunlerListesi = ArrayList<Urunler>()
        val  f1 = Urunler(1,"Xiaomi Redmi Note 128 GB (Xiaomi Türkiye Garantili)","telefon",8500, null,4,148)
        val f2 = Urunler(2,"Taşınabilir Elektrikli Araba Ev Şarj Aleti", "elektrikli_sarz_cihazi",790,null,5,5)
        val f3 = Urunler(3,"Mavi Renk ve Dekorlu Yemek Takımı","mavi_tabak", 600,890,3,63)
        val f4 = Urunler(4, "Doğal ve Taze  Kuruyemiş, Özenle Kavrulmuş", "kuruyemis", 320,null,4,132)
        val f5 = Urunler(5,"Multi Çift Kişilik Yatak Örtüsü Seti", "yatak_ortusu",1400,2200,5,13)
        urunlerListesi.add(f1)
        urunlerListesi.add(f2)
        urunlerListesi.add(f3)
        urunlerListesi.add(f4)
        urunlerListesi.add(f5)


        val kategorilerListesi = ArrayList<Kategoriler>()
        val k1 = Kategoriler(1,"yurtdisi","Yurt Dışından")
        val k2 = Kategoriler(2,"kuponlar","Kuponlar")
        val k3 = Kategoriler(3,"one_cikanlar","Öne Çıkanlar")
        val k4 = Kategoriler(4,"kacmz_teklifler","Sana Özel")
        val k5 = Kategoriler(4,"siparisler","Siparişlerim")
        kategorilerListesi.add(k1)
        kategorilerListesi.add(k2)
        kategorilerListesi.add(k3)
        kategorilerListesi.add(k4)
        kategorilerListesi.add(k5)

        val kategorilerAdapter = KategorilerAdapter(requireContext(),kategorilerListesi)
        binding.kategorilerRv.adapter = kategorilerAdapter

        binding.kategorilerRv.layoutManager =
            StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)


        val urunlerAdapter = UrunlerAdapter(requireContext(),urunlerListesi)
        binding.urunlerRv.adapter = urunlerAdapter

        binding.urunlerRv.layoutManager =
            StaggeredGridLayoutManager(1,StaggeredGridLayoutManager.HORIZONTAL)

        return binding.root
    }
}