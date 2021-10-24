package com.example.movieapp.presentation.extensions

import android.view.RoundedCorner
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.resource.bitmap.RoundedCorners
import com.bumptech.glide.request.RequestOptions
import com.example.movieapp.R
import com.example.movieapp.util.mipmap

fun AppCompatImageView.loadImage(url: String) {
    Glide.with(this.context).load(url).placeholder(mipmap.load_placeholder).apply(RequestOptions.bitmapTransform(RoundedCorners(12)))
        .into(this)
}