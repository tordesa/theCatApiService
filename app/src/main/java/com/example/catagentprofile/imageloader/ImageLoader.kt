package com.example.catagentprofile.imageloader

import android.widget.ImageView

interface ImageLoader {
    fun loadImage(imageUrl: String, ImageView: ImageView)
}

