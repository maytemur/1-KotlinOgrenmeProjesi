package com.maytemur.kotlinogrenmeprojesi


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.ArrayList

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        println("merhaba kotlin milyon")
        println(5*10)
        //Değişkenlere girildi
        /*değişkenlerden çıkıldı girildi
        saçma sapan işler oluyor :)
         */
        //Degiskenler
        //Integer

        println("--------Int----------")

        var a=5
        var b=10
        println (a*b)
        var yas=50
        println(yas /5*8)
        yas=60
        println(yas/5*8)

        val x=5
        val y=20
        println(yas*x)

        // camelCase yasSonucu
        // snake_case yas_sonucu gibi
        val yasSonucu =yas * x
        println(yasSonucu)

        //Tanımlama - defining
        val benimIntegerim : Int

        //Başlatma değerini atama - İnitialization
        benimIntegerim=5

        var yeniInteger: Int=20
        println(benimIntegerim/2)

        //Long
        println("--------Long----------")

        var benimLong : Long=100
        benimLong=3000000000
        println(benimLong)

        //Double & Float
        println("--------Double&Float----------")
        val pi=3.14
        println(pi*2)
        val floatPi: Float= 3.14F
        println(floatPi*2)

        val yeniDouble=5.0
        println(yeniDouble/2)

        //String - Metin
        println("--------String----------")
        val benimVarString="Sürekli değişebilir"
        println(benimVarString)
        val benimVarString2="yeni haki"
        println(benimVarString2)

        val benimString="Benim Kotlin Milyon Metni"
        println(benimString.length)

        val isim= "Mustafa"
        val soyisim= "Aytemur"

        val tamisim= isim+" "+soyisim
        println(tamisim)

        val yeniBirString = "10"

        val baskaBirString="20"

        println(yeniBirString+baskaBirString)

        //Boolean
        println("--------Boolean----------")

        var benimBoolean= true
        benimBoolean =false

        // < küçüktür
        // > büyüktür
        // == eşittir
        // != eşit değildir
        // <= küçük eşittir
        // >= büyük eşittir
        // && ve
        // || veya

        println(3<5)
        println(4!=4)

        //Veri Tipi Dönüştürme
        println("--------Dönüştürme----------")

        val benimInt= 10
        val benimLongaCevrilenInt= benimInt.toLong()
        println(benimLongaCevrilenInt)

        val kullaniciGirdisi= "50"
        val kullaniciInt= kullaniciGirdisi.toInt()
        println(kullaniciInt/2)

        //Koleksiyonlar
        //Array-Dizi

        println("--------Dizi----------")
        val stringOrnegi= "Mesela string"
        val benimDizi= arrayOf(stringOrnegi,"atıl","ömer","ebubekir","uzman")

        //index
        println(benimDizi[2])
        println(benimDizi[0])
        println(benimDizi.get(1))
        benimDizi[2]="Zeynep"
        println(benimDizi[2])
        benimDizi.set(3,"osman")
        println(benimDizi[3])

        val numaraDizisi= doubleArrayOf(1.0,2.0,3.5)
        println(numaraDizisi.get(2))

        val karisikDizi= arrayOf(16.5,"ne haber",false,24,true)
        println(karisikDizi.get(2))

        //ArrayList - Listeler - arrayof'dan farkı bunda add metodu çıkıyor- veri tipi olarak any denenebiliyor
        // 2 tip liste var biri değiştirilemeyen list diğeri mutable list yani değiştirilebilir sonrada eklenip
        //çıkarılabilir vs.. MutableList<E> buradaki <E> type of elements veya <T> type paramsın kısaltması
        
        println("------------------ArrayList---------")

        val isimlistesi= arrayListOf("erek","masal","yalan125",56,5.45)
        println(isimlistesi[1])
        println(isimlistesi.get(2))

        isimlistesi.add("masal uzadı")
        println(isimlistesi[5])

        val karisikArrayList= arrayListOf<Any>()
        karisikArrayList.add("23")
        karisikArrayList.add(true)
        karisikArrayList.add(254.56)
        karisikArrayList.add(12)
        println(karisikArrayList[0])
        println(karisikArrayList[1])
        println(karisikArrayList[2])
        println(karisikArrayList[3])

        val intArrayList= ArrayList<Any>()  // Javada olan arrayListOf yerine kullanılan code
        intArrayList.add(34)
        intArrayList.add("hesap")
        intArrayList.add(false)
        intArrayList.add(458789999656998889)
        println(intArrayList[0])
        println(intArrayList[1])
        println(intArrayList[2])
        println(intArrayList[3])

        //Set

        println("--------Set----------")

        val ornekDizi= arrayOf(5,4,6,3,34,5,3,2)
        println("index 2: ${ornekDizi[2]}")
        println("index 3: ${ornekDizi[3]}")

        println(ornekDizi.size)

        val benimSet= setOf<Any>(3,4,5,"ahmet",6,4,"tekli",3,4,34,3)
        println(benimSet.size)

        //For Each
        benimSet.forEach {
            println(it)
        }

        val digerSet= HashSet<String>()
        digerSet.add("mustafa")
        digerSet.add("mustafa")
        digerSet.add("nefer")
        digerSet.add("opus")

        digerSet.forEach {
            println(it)
        }

        //Map

        println("------------Map------------")
        // Anahtar Kelime - Değer (Key-Value Pairing)

        val yemekDizisi= arrayOf("Elma","Et","Tavuk") // çok fazla bu şekilde kullanılmaz
        val kaloriDizisi= arrayOf(100,300,200)
        println("${yemekDizisi[0]}'nın kalorisi: ${kaloriDizisi[0]}")

        val yemekKaloriMap= hashMapOf<String,Int>() // bu yöntem daha fazla kullanılıyor
        yemekKaloriMap.put("Elma",100)
        yemekKaloriMap.put("Et",300)
        yemekKaloriMap.put("Tavuk",200)

        println("Et'in Kalorisi: "+yemekKaloriMap.get("Et"))

        val benimMapim= HashMap<String,String>() // bu şekilde de kullanılabilir
        benimMapim.put("Örnek","Bu aslında değer 125")

        val yeniMap= hashMapOf<String,Int>("Mustafa" to 50,"Sürmek" to 87) // Kotlin dökümanlarında var
                                                                            // ama fazla kullanılmıyor
        println(benimMapim.get("Örnek"))
        println(yeniMap.get("Sürmek"))
        println("Mustafa'nın notu " +yeniMap.get("Mustafa"))
        println("Elma'nın kalorisi : ${yemekKaloriMap.get("Elma")}")

        //Matematiksel işlemler

        println("------------Matemetiksel işlemler------------")

        var sayi=8
        println(sayi)
        sayi=sayi+1
        println(sayi)
        sayi++
        println(sayi)
        sayi--
        println(sayi)

        var digerSayi= 10
        println(digerSayi > sayi)

        // && --> ve
        // || --> veya

        println(digerSayi>sayi && 2>3)
        println(digerSayi>sayi || 2>3)
        println(digerSayi<sayi)

        println(3+4)
        println(6-5)
        println(6*4)
        println(21/8)
        //Remainder - Kalanı bulmak
        println(32%5)

        //if kontrolleri
        println("-----If statements------------")

        val skor= 5
        if (skor<10) {
            println("oyunu kaybettin!")
        }else if (skor>=10 && skor <20){
            println("skorun 10 ve 20 arasında, çok iyi skor aldın")
        }else if (skor>=20 && skor<30){
            println("skorun 20 ve 30 arasında, rekorlar kırıyorsun")
        }else {
            println("skorun 30'un üstünde ,efsane oynadın")
        }

        //When-Switch------------->elseif ler çok fazla ise bunu kullanıyoruz
        println("-----When------------")

        var notRakami =2
        var notStringi =""
        when(notRakami){
            0 -> notStringi="Geçersiz not"
            1 -> notStringi="Zayıf"
            2 -> notStringi="Kötü"
            3 -> notStringi="Orta"
            4 -> notStringi="iyi"
            else -> notStringi="Pek İyi"
        }

        /*if(notRakami==0){
            notStringi= "Geçersiz Not"
        } else if (notRakami==1){
            notStringi= "Zayıf"
        } else if(notRakami==2){
            notStringi= "Kötü"
        } else if(notRakami==3){
            notStringi= "Orta"
        } else if(notRakami==4){
            notStringi= "İyi"
        } else {
            notStringi= "Pek İyi"
        } */
        println(notStringi)

        //Döngüler
        println("-----For Döngüsü------------")

        val baskaBirDizi = arrayOf(5,10,15,20,25,30)
        val q = baskaBirDizi[0] / 5 + 3
        println(q)

        println("döngü başladı")
        for (numara in baskaBirDizi) {
            println(numara / 5 + 3)
        }
        println("döngü bitti")

        for(indeks in baskaBirDizi.indices){
            println(baskaBirDizi[indeks] / 5 + 4)
        }
        for (b in 0..9){
            println(b)
        }

        val benimDigerStringDizim = ArrayList<String>()
        benimDigerStringDizim.add("Mustafa")
        benimDigerStringDizim.add("Aytemur")

        for(str in benimDigerStringDizim){
            println(str)
        }

        benimDigerStringDizim.forEach {
            println(it)
        }

        //Döngüler
        println("-----While Döngüsü------------")

        var j = 0
        while (j <= 10){
            println(j)
            j = j +1
        }



























































    }
}