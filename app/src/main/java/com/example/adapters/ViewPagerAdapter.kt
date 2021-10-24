package com.example.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter (
    fragmentManager: FragmentManager

        ): FragmentPagerAdapter(fragmentManager,BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT)
{
    var fragmentList = mutableListOf<Fragment>()
    private val fragmentNameList = ArrayList<String>()

    override fun getCount(): Int = fragmentList.size

    override fun getItem(position: Int): Fragment = fragmentList[position]

    override fun getPageTitle(position: Int) = fragmentNameList[position]

    fun addFragment(fragment: Fragment){
        fragmentList.add(fragment)
    }
    fun addFragment(fragment: Fragment, name: String = ""){
        fragmentList.add(fragment)
        fragmentNameList.add(name)
    }

}