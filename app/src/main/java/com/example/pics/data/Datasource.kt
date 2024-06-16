package com.example.pics.data

import com.example.pics.R
import com.example.pics.model.Pics

class Datasource() {
    fun loadpics(): List<Pics> {
        return listOf<Pics>(
            Pics(R.string.pic1, R.drawable.image1),
            Pics(R.string.pic2, R.drawable.image2),
            Pics(R.string.pic3, R.drawable.image3),
            Pics(R.string.pic4, R.drawable.image4),
            Pics(R.string.pic5, R.drawable.image5),
            Pics(R.string.pic6, R.drawable.image6),
            Pics(R.string.pic7, R.drawable.image7),
            Pics(R.string.pic8, R.drawable.image8),
            Pics(R.string.pic9, R.drawable.image9),
            Pics(R.string.pic10, R.drawable.image10))
    }
}
