package com.example.decketdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity(), IView, View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lifecycle.addObserver(MyPresent(this))
        findViewById<TextView>(R.id.tv_hello).setOnClickListener {
            var intent = Intent (this, TestActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onResume() {
        super.onResume()
        Log.i("陈立中", "onResume: ")
    }

    override fun onPause() {
        super.onPause()
        Log.i("陈立中", "onPause: ")
    }

    override fun showView() {
        Log.i("陈立中", "showView: ")
    }

    override fun closeView() {
        Log.i("陈立中", "closeView: ")
    }

    /**
     * Called when a view has been clicked.
     *
     * @param v The view that was clicked.
     */
    override fun onClick(v: View?) {
        
    }
}