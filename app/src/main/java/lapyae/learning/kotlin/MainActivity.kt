package lapyae.learning.kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val countBtn = findViewById<Button>(R.id.countBtn)
        val tvTextView = findViewById<TextView>(R.id.textView)
        var checkStatus = true
        countBtn.setOnClickListener{
            if(checkStatus){
                tvTextView.text = "Hello"
                checkStatus = !checkStatus
            }
            else{
                tvTextView.text = "Hello World"
                checkStatus = !checkStatus
            }
            Toast.makeText(this,"Hey I am toast",Toast.LENGTH_LONG).show()
        }
    }
}