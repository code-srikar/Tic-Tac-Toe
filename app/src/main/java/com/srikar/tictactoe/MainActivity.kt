package com.srikar.tictactoe

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.Button
import android.widget.Toast
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.srikar.tictactoe.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var flag = 0
    var count = 0

    public override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.newGame.setOnClickListener(){
            newGame()
            Toast.makeText(this,"New Game Started",Toast.LENGTH_SHORT).show()
        }

    }

    fun check(view: View) {

        val currentBtn = view as Button

        if(currentBtn.text=="") {

            count++

            if (flag == 0) {
                currentBtn.text = "X"
                flag = 1
            } else {
                currentBtn.text = "O"
                flag = 0
            }

            val b1 = binding.btn1.text.toString()
            val b2 = binding.btn2.text.toString()
            val b3 = binding.btn3.text.toString()
            val b4 = binding.btn4.text.toString()
            val b5 = binding.btn5.text.toString()
            val b6 = binding.btn6.text.toString()
            val b7 = binding.btn7.text.toString()
            val b8 = binding.btn8.text.toString()
            val b9 = binding.btn9.text.toString()

            if (b1 == b2 && b2 == b3 && b3 != "") {
                binding.result.text = "Winner is $b1"
            } else if (b4.equals(b5) && b5 == b6 && b6 != "") {
                binding.result.text = "Winner is $b4"
            } else if (b7 == b8 && b8 == b9 && b9 != "") {
                binding.result.text = "Winner is $b7"
            } else if (b1 == b4 && b4 == b7 && b7 != "") {
                binding.result.text = "Winner is $b1"
            } else if (b2 == b5 && b5 == b8 && b8 != "") {
                binding.result.text = "Winner is $b2"
            } else if (b3 == b6 && b6 == b9 && b9 != "") {
                binding.result.text = "Winner is $b3"
            } else if (b1 == b5 && b5 == b9 && b9 != "") {
                binding.result.text = "Winner is $b1"
            } else if (b3 == b5 && b5 == b7 && b7 != "") {
                binding.result.text = "Winner is $b3"
            }
            else if(count==9){
                binding.result.text = "Match is Drawn"
            }
        }

    }

    fun newGame(){
        binding.btn1.text = ""
        binding.btn2.text = ""
        binding.btn3.text = ""
        binding.btn4.text = ""
        binding.btn5.text = ""
        binding.btn6.text = ""
        binding.btn7.text = ""
        binding.btn8.text = ""
        binding.btn9.text = ""
        flag = 0
        count = 0
        binding.result.text = ""
    }


}