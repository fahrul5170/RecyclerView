package id.fahrulrazi.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listFilm = listOf<MyItem>(
            MyItem(
                R.drawable.poster_1,
                titleFilm = "Mencari Hilal",
                descFilm = "Mencari Hilal adalah film drama Indonesia yang dirilis pada tahun 2015. Film ini dibintangi oleh Deddy Sutomo, Oka Antara, dan Torro Margens. Film ini menganugerahkan gelar Pemeran Utama Pria Terbaik untuk Deddy Sutomo pada Festival Film Indonesia 2015."
            ),
            MyItem(
                R.drawable.poster_2,
                titleFilm = "Dua Garis Biru",
                descFilm = "Dua Garis Biru menceritakan pentingnya pendidikan seks terutama bahaya akan seks bebas. Dalam film yang dirilis pada 2019 lalu ini juga menjelaskan realitas pernikahan dini yang masih dianggap tabu sebagian kalangan masyarakat Indonesia. Dua Garis Biru mengangkat tema kehamilan remaja di luar nikah.28 Jul 2021"
            ),
            MyItem(
                R.drawable.poster_3,
                titleFilm = "Bucin",
                descFilm = "Film ini berkisahkan tentang persahabatan empat orang pemuda kota yang memiliki permasalahan dalam hal percintaan yang nyaris sama. Mereka memiliki sifat yang bucin terhadap kekasih mereka masing-masing. ... Singkat cerita, empat orang sahabat ini memutuskan untuk ikut ke kelas anti bucin.30 Okt 2020"
            ),
            MyItem(
                R.drawable.poster_4,
                titleFilm = "Bidah Cinta",
                descFilm = "Film Bidah Cinta menceritakan tentang hubungan asmara Khalida (Ayushita) dan Kamal (Dimas Aditya) yang tak direstui oleh keluarga mereka. ... Rupanya perbedaan pandangan agama ini menyeret hubungan asmara Khalida dan Kamal ke dalam konflik. Khalida sendiri adalah anak H Rohili yang akrab dengan pemuda di kampung.13 Nov 2019"
            ),
            MyItem(
                R.drawable.poster_5,
                titleFilm = "Cek Toko Sebelah",
                descFilm = "Film Cek Toko Sebelah menceritakan tentang Koh Afuk (Chew Kin Wah), yang punya usaha toko kelontong. Ia merasa bahwa dirinya semakin hari semakin tua untuk mengurus bisnisnya ini, terlebih lagi setelah ditinggal oleh sang istri (Dayu Wijayanto).\n" +
                        "\n" +
                        "Koh Afuk pun memutuskan untuk mewariskan tokonya kepada Erwin (Ernest Prakasa). Mendengar keputusan tersebut, Yohan (Dion Wiyoko) sebagai anak sulung tidak menerima apabila tokonya tersebut diberikan kepada Erwin, si anak bungsu."
            ),
            MyItem(
                R.drawable.poster_6,
                titleFilm = "Ayat-ayat Cinta 2",
                descFilm = "Bercerita tentang karakter pria idaman wanita, Fahri yang diperankan oleh Fedi Nuril. Ayat-Ayat Cinta 2 memulai cerita dari petualangan baru Fahri menjadi seorang dosen muslim di sebuah universitas ternama di Kota Edinburgh, Skotlandia. ... Di balik rasa sedih Fahri kehilangan istri berbagai permasalahan pun tiba.23 Sep 2021"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = AdapterFilm(this, listFilm){

        }
    }
}