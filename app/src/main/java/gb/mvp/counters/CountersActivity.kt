package gb.mvp.counters

import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import ru.gb.gb_popular_libs.lession1.R
import ru.gb.gb_popular_libs.lession1.R.layout.activity_counters

class CountersActivity : AppCompatActivity(activity_counters), CountersView {

    private val presenter = CountersPresenter(this)

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

    override fun showCounter1(counter: String) {
        counter1.text = counter
    }

    override fun showCounter2(counter: String) {
        counter2.text = counter
    }

    override fun showCounter3(counter: String) {
        counter3.text = counter
    }
}