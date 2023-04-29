package com.example.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.recyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding : ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listStudent = arrayListOf(
            MyContact("20102204", "Yerico Rosanta", "085225247152", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102205", "Yerico", "085225247153", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102206", "Rosanta", "085225247154", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102207", "Rico", "085225247155", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102208", "Santa", "085225247156", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102209", "Yeri", "085225247157", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102204", "Yerico Rosanta", "085225247152", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102205", "Yerico", "085225247153", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102206", "Rosanta", "085225247154", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102207", "Rico", "085225247155", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102208", "Santa", "085225247156", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102209", "Yeri", "085225247157", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102204", "Yerico Rosanta", "085225247152", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102205", "Yerico", "085225247153", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102206", "Rosanta", "085225247154", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102207", "Rico", "085225247155", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102208", "Santa", "085225247156", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102209", "Yeri", "085225247157", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102204", "Yerico Rosanta", "085225247152", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102205", "Yerico", "085225247153", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102206", "Rosanta", "085225247154", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102207", "Rico", "085225247155", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102208", "Santa", "085225247156", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
            MyContact("20102209", "Yeri", "085225247157", "https://spesialis1.orthopaedi.fk.unair.ac.id/wp-content/uploads/2021/02/depositphotos_39258143-stock-illustration-businessman-avatar-profile-picture.jpg"),
        )

        gridView(listStudent)


    }

    private fun listView(value: ArrayList<MyContact>){
        val adapter = ListViewAdapter(this,value)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun gridView(value: ArrayList<MyContact>){
        val adapter = GridViewAdapter(this,value)

        val layoutManager = GridLayoutManager(this,2, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }

    private fun cardView(value: ArrayList<MyContact>){
        val adapter = CardViewAdapter(this,value)

        val layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        binding.rvContact.layoutManager = layoutManager
        binding.rvContact.adapter = adapter
    }
}