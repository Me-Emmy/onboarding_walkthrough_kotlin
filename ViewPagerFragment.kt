package com.emmywallpapers.onboarding

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup 
import com.emmywallpapers.Adapter.ViewPagerAdapter
import com.emmywallpapers.databinding.FragmentViewPagerBinding
import com.emmywallpapers.onboarding.screens.FirstScreen
import com.emmywallpapers.onboarding.screens.SecondScreen
import com.emmywallpapers.onboarding.screens.ThirdScreen

class ViewPagerFragment : Fragment() {

    lateinit var binding:FragmentViewPagerBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding= FragmentViewPagerBinding.inflate(inflater,container,false)

        val fragmentList = arrayListOf<Fragment>(
            FirstScreen(),
            SecondScreen(),
            ThirdScreen()
        )

        val adapter = ViewPagerAdapter(
            fragmentList,
            requireActivity().supportFragmentManager,
            lifecycle
        )

        binding.viewPager.adapter = adapter

        return binding.root
    }

}
