package com.example.help_me_park

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.help_me_park.databinding.ActivityMainBinding
import com.example.help_me_park.presentation.ExploreFragment
import com.example.help_me_park.presentation.HomeFragment

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private val homeFragment = HomeFragment()
    private val exploreFragment = ExploreFragment()

    private val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        replaceFragment(homeFragment)

        binding.bottomNavigatinView.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.homeFragment -> replaceFragment(homeFragment)
                R.id.exploreFragment -> replaceFragment(exploreFragment)
            }
            true
        }

    }

    private fun replaceFragment(fragment: Fragment) {
        if (fragment != null) {
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}