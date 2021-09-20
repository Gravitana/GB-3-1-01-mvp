package ru.gb.gb_popular_libs.lession1

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ru.gb.gb_popular_libs.lession1.R.layout.activity_main

class MainActivity : AppCompatActivity(activity_main), MainView {

    val presenter = MainPresenter(this)

    private val showCounter1: Button by lazy { findViewById(R.id.btn_counter1) }
    private val showCounter2: Button by lazy { findViewById(R.id.btn_counter2) }
    private val showCounter3: Button by lazy { findViewById(R.id.btn_counter3) }

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

        showCounter1.setOnClickListener(listener1)
        showCounter2.setOnClickListener(listener2)
        showCounter3.setOnClickListener(listener3)
    }

    override fun setButtonText1(text: String) {
        showCounter1.text = text
    }

    override fun setButtonText2(text: String) {
        showCounter2.text = text
    }

    override fun setButtonText3(text: String) {
        showCounter3.text = text
    }
}