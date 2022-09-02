package com.rsstudio.inshorts.ui.main

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.rsstudio.inshorts.R
import com.rsstudio.inshorts.databinding.ActivityMainBinding
import com.rsstudio.inshorts.ui.base.BaseActivity

class MainActivity : BaseActivity() {


    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        //
        initTheme()
    }

    private fun initTheme() {
        window.statusBarColor = resources.getColor(R.color.black)
        window.navigationBarColor = resources.getColor(R.color.black)
    }
}