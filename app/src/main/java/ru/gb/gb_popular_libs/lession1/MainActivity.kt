package ru.gb.gb_popular_libs.lession1

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ru.gb.gb_popular_libs.lession1.R.layout.activity_main

class MainActivity : AppCompatActivity(activity_main), MainView {

    val presenter = MainPresenter(this)

    private val btnCounter1: Button by lazy { findViewById(R.id.btn_counter1) }
    private val btnCounter2: Button by lazy { findViewById(R.id.btn_counter2) }
    private val btnCounter3: Button by lazy { findViewById(R.id.btn_counter3) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listener1 = View.OnClickListener {
            presenter.counterClick1()
        }

        val listener2 = View.OnClickListener {
            presenter.counterClick2()
        }

        val listener3 = View.OnClickListener {
            presenter.counterClick3()
        }

        btnCounter1.setOnClickListener(listener1)
        btnCounter2.setOnClickListener(listener2)
        btnCounter3.setOnClickListener(listener3)
    }

    override fun setButtonText1(text: String) {
        btnCounter1.text = text
    }

    override fun setButtonText2(text: String) {
        btnCounter2.text = text
    }

    override fun setButtonText3(text: String) {
        btnCounter3.text = text
    }
}