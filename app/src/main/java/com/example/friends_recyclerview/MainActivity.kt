package com.example.friends_recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.friends_recyclerview.databinding.ActivityMainBinding
import com.example.friends_recyclerview.recyclerView.FriendsAdapter
import com.example.friends_recyclerview.recyclerView.models.Friend

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initAdapter()
    }

    private val friendList = listOf<Friend>(
        Friend(name = "Chandler Muriel Bing", avatar = R.drawable.chandler),
        Friend(name = "Monica Geller", avatar = R.drawable.monica),
        Friend(name = "Michael Tribbiani", avatar = R.drawable.michael),
        Friend(name = "Phoebe Buffay", avatar = R.drawable.phoebe),
        Friend(name = "Rachel Karen Green", avatar = R.drawable.rachel),
        Friend(name = "Ross Geller", avatar = R.drawable.ross)
    )

    private fun initAdapter() {
        val adapter = FriendsAdapter()
        adapter.friendsList = friendList
        binding.apply {
            resView.layoutManager = LinearLayoutManager(this@MainActivity)
            resView.adapter = adapter
        }
    }
}