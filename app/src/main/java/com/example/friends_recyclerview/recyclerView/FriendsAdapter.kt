package com.example.friends_recyclerview.recyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.friends_recyclerview.R
import com.example.friends_recyclerview.databinding.ItemFriendBinding
import com.example.friends_recyclerview.recyclerView.models.Friend

class FriendsAdapter : RecyclerView.Adapter<FriendsAdapter.FriendViewHolder>() {

    var friendsList = listOf<Friend>()

    override fun getItemCount(): Int = friendsList.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FriendViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_friend, parent, false)
        return FriendViewHolder(view)
    }

    override fun onBindViewHolder(holder: FriendViewHolder, position: Int) {
        holder.bind(friendsList[position])
    }

    class FriendViewHolder(item: View) : RecyclerView.ViewHolder(item) {

        val binding = ItemFriendBinding.bind(item)

        fun bind(friend: Friend) = with(binding) {
            avatarImageView.setImageResource(friend.avatar)
            nameTextView.text = friend.name
        }

        init {
            itemView.setOnClickListener {
                Toast.makeText(
                    itemView.context, "Favorite hero",
                    Toast.LENGTH_SHORT
                ).show()
            }
        }
    }
}