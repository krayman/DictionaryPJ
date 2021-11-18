package com.krayapp.dictionarypj.data

import com.krayapp.dictionarypj.DictionaryApp
import com.krayapp.dictionarypj.data.retrofit2.image.ImageDTO
import com.krayapp.dictionarypj.data.retrofit2.image.ImageRemoteAccess
import retrofit2.Callback

class ImageLoaderImpl(
    private val api:ImageRemoteAccess
):IImageLoader {
    override fun getImageFromApi(letter: String, callback: Callback<ImageDTO>) {
        api.getImageFromApi(letter).enqueue(callback)
    }
}