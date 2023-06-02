package com.example.menulistview;

import android.app.Activity;
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.FragmentTransaction

public class TempActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_temp)
        if (savedInstanceState == null) {
            val stopper = StopperFragment()
            val ft = supportFragmentManager.beginTransaction()
            ft.add(R.id.stopper_container, stopper)
            ft.addToBackStack(null)
            ft.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
            ft.commit()
        }
    }
}
