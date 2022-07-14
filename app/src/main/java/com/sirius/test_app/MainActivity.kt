package com.sirius.test_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val dataList: List<ReviewModelRecycler> = listOf(
            ReviewModelRecycler(
                R.drawable.img_user_1,
                resources.getString(R.string.user_1_name),
                resources.getString(R.string.user_1_date),
                resources.getString(R.string.user_1_message)),
            ReviewModelRecycler(
                R.drawable.img_user_2,
                resources.getString(R.string.user_2_name),
                resources.getString(R.string.user_2_date),
                resources.getString(R.string.user_2_message)))

        val commentRecycler: RecyclerView = findViewById(R.id.comments_recycler)
        commentRecycler.layoutManager = LinearLayoutManager(this)
        commentRecycler.adapter = CommentRecyclerAdapter(dataList)
    }
}