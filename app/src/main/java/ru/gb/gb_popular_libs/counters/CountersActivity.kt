package ru.gb.gb_popular_libs.counters

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ru.gb.gb_popular_libs.counters.R.layout.activity_counters

class CountersActivity : AppCompatActivity(activity_counters), CountersView {

    val presenter = CountersPresenter(this)

    private val counter1: Button by lazy { findViewById(R.id.btn_counter1) }
    private val counter2: Button by lazy { findViewById(R.id.btn_counter2) }
    private val counter3: Button by lazy { findViewById(R.id.btn_counter3) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val listener1 = View.OnClickListener {
            presenter.incrementCounter1()
        }

        val listener2 = View.OnClickListener {
            presenter.incrementCounter2()
        }

        val listener3 = View.OnClickListener {
            presenter.incrementCounter3()
        }

        counter1.setOnClickListener(listener1)
        counter2.setOnClickListener(listener2)
        counter3.setOnClickListener(listener3)
    }

    override fun showCounter1(value: String) {
        counter1.text = value
    }

    override fun showCounter2(value: String) {
        counter2.text = value
    }

    override fun showCounter3(value: String) {
        counter3.text = value
    }
}