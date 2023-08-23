package com.example.pertemuan_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.pertemuan_2.databinding.ActivityMainBinding
import com.google.android.material.color.utilities.ColorUtils

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        with(binding){
            txtNumber.text = number.toString()

            btnCount.setOnClickListener {
                number++
                txtNumber.text = number.toString()
                if (number % 2 == 1) {
                    txtNumber.setBackgroundResource(R.color.pink)
                } else {
                    txtNumber.setBackgroundResource(R.color.green)
                }

            }

            val email : String = "sdasa"
            val pass : String = "pw123"

            btnGetText.setOnClickListener {
                val valueText = edtEmail.text.toString()
                // show toast
                Toast.makeText(
                    this@MainActivity,
                    valueText,
                    Toast.LENGTH_SHORT
                ).show()
            }

            btnToast.setOnClickListener {
                Toast.makeText(this@MainActivity, number.toString(), Toast.LENGTH_SHORT)
            }
        }
    }
}