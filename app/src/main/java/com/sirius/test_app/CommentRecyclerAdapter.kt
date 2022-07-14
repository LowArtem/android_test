package com.sirius.test_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CommentRecyclerAdapter(
    private val data: List<ReviewModelRecycler>
) : RecyclerView.Adapter<CommentRecyclerAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val image: ImageView = itemView.findViewById(R.id.user_avatar_img)
        val userName: TextView = itemView.findViewById(R.id.user_name)
        val userDate: TextView = itemView.findViewById(R.id.user_date)
        val userMessage: TextView = itemView.findViewById(R.id.user_message)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val itemView =
            LayoutInflater.from(parent.context)
                .inflate(R.layout.comment_item, parent, false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.image.setImageResource(data[position].userImage)
        holder.userName.text = data[position].userName
        holder.userDate.text = data[position].date
        holder.userMessage.text = data[position].message
    }

    override fun getItemCount(): Int = data.count()
}