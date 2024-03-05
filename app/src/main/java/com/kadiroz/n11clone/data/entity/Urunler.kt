package com.kadiroz.n11clone.data.entity

import java.io.Serializable

data class Urunler(
    var urun_id:Int,
    var urun_ad:String,
    var urun_resim:String,
    var urun_fiyat:Int,
    var urun_eski_fiyat: Int? = null,
    var urun_oy: Int,
    var urun_oy_yazisi:Int, ) : Serializable {}
