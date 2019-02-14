package com.henrique.vivian.projsobreactivity

import android.os.Bundle
import android.support.design.widget.Snackbar
import android.support.v7.app.AppCompatActivity
import android.util.Log

import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        Log.i( "MainActivity",  ">>>On Creat Rodou...")
        Log.i( "MainActivity",  ">>>On Creat Rodou...")
        Log.i( "MainActivity", ">>>On Creat Rodou...")
        Log.i( "MainActivity", ">>>On Creat Rodou...")

        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        fab.setOnClickListener { view ->
            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                    .setAction("Action", null).show()
        }
    }

    override fun onResume() {
        super.onResume()

        Log.i(  "MainActivity",  ">>>On Creat Rodou...")
        Log.i(  "MainActivity",  ">>>On Creat Rodou...")
        Log.i(  "MainActivity",  ">>>On Creat Rodou...")
        Log.i(  "MainActivity", ">>>On Creat Rodou...")
        Log.i( "MainActivity",  ">>>On Creat Rodou...")

    }

    override fun onPause() {
        super.onPause()
    }

    override fun onRestart() {
        super.onRestart()
    }

    override fun onStart() {
        super.onStart()
    }

    override fun onDestroy() {
        super.onDestroy()
    }

}
