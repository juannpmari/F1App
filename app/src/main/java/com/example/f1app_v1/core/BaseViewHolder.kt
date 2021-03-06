package com.example.f1app_v1.core

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.f1app_v1.ui.adapters.Adapter

abstract class BaseViewHolder<T>(itemView: View):RecyclerView.ViewHolder(itemView) {
   abstract fun bind(item: T)
}

