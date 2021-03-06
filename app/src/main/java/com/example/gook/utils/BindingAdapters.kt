package com.example.gook.utils

import android.view.View
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.core.net.toUri
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.example.gook.R
import com.example.gook.repository.RegisterStatus
import com.example.gook.viewmodel.SearchedStatus


@BindingAdapter("imgUrl")
fun setUrltoImage(imageView: ImageView, url: String?){
    url?.let {

        val imgUrl = url.toUri().buildUpon().scheme("https").build()

        Glide.with(imageView.context)
                .load(imgUrl)
                .apply(RequestOptions()
                        .error(R.drawable.ic_connection_error)
                        .placeholder(R.drawable.loading_animation))
                .into(imageView)
    }
}

@BindingAdapter("isVisible")
fun setVisible(view: View, status: SearchedStatus?){
    when(status){
        SearchedStatus.LOADING -> view.visibility = View.VISIBLE
        SearchedStatus.DONE -> view.visibility = View.GONE
        else -> view.visibility = View.GONE
    }
}

@BindingAdapter("listString")
fun setListtoText(textView: TextView,stringList: List<String>?){
    stringList?.let {
        textView.text = "by " + stringList.joinToString()
    }
}

@BindingAdapter("registerStatus")
fun setProgressBarStatus(view: View,status: RegisterStatus?){
    when(status){
        RegisterStatus.LOADING->view.visibility = View.VISIBLE
        else->view.visibility = View.GONE
    }
}