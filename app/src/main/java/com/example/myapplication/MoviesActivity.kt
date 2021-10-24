package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.viewpager.widget.ViewPager
import com.example.adapters.MoviesAdapter
import com.example.adapters.ViewPagerAdapter
import com.example.fragments.MostRecentFragment
import com.example.fragments.TopRatedFragment
import com.example.models.Movie
import com.google.android.material.tabs.TabLayout

class MoviesActivity : AppCompatActivity() {

    private lateinit var tabLayout : TabLayout
    private lateinit var viewPager : ViewPager




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movies)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager = findViewById(R.id.viewPager)
//        recyclerView= findViewById(R.id.movieRecyclerView)
        initTabLayout()
//        initRecyclerView()


    }

    private fun initTabLayout() {
        //view-pager
        tabLayout.setupWithViewPager(viewPager)
        val viewPagerAdapter = ViewPagerAdapter(supportFragmentManager)
        viewPager.adapter = viewPagerAdapter

        //view-pager-fragmentrs
        val mostRatedFragment = MostRecentFragment()
        viewPagerAdapter.addFragment(mostRatedFragment,"Top Rated")
        val topRatedFragment = TopRatedFragment()
        viewPagerAdapter.addFragment(topRatedFragment,"Most Recent")


        viewPagerAdapter.notifyDataSetChanged()
        tabLayout.setupWithViewPager(viewPager)




    }




}