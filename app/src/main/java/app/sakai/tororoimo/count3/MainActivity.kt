package app.sakai.tororoimo.count3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var number : Int = 0
        var number2 : Int = 0
        numberView.text = number.toString()

        button.setOnClickListener {
            number++
            numberView.text = number.toString()
        }


    }
}
