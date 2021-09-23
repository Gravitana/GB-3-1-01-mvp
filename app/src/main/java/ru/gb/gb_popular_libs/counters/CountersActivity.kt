package ru.gb.gb_popular_libs.counters

import android.os.Bundle
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT
import androidx.appcompat.app.AlertDialog
import moxy.MvpAppCompatActivity
import moxy.ktx.moxyPresenter
import ru.gb.gb_popular_libs.counters.R.layout.activity_counters
import ru.gb.gb_popular_libs.counters.databinding.ActivityCountersBinding

class CountersActivity : MvpAppCompatActivity(activity_counters), CountersView {

    private var viewBinding: ActivityCountersBinding? = null

    private val presenter by moxyPresenter {
        CountersPresenter(model = CountersModel())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        viewBinding = ActivityCountersBinding
            .inflate(layoutInflater)
            .also { viewBinding -> setContentView(viewBinding.root) }
            .apply {
                btnCounter1.setOnClickListener { presenter.incrementCounter1() }
                btnCounter2.setOnClickListener { presenter.incrementCounter2() }
                btnCounter3.setOnClickListener { presenter.incrementCounter3() }
            }
    }

    override fun showOnBoarding() =
        AlertDialog
            .Builder(this)
            .setMessage(R.string.onboarding_message)
            .create()
            .show()

    override fun showCounter1(value: String) {
        viewBinding?.btnCounter1?.text = value
    }

    override fun showCounter2(value: String) {
        viewBinding?.btnCounter2?.text = value
    }

    override fun showCounter3(value: String) {
        viewBinding?.btnCounter3?.text = value
    }

    override fun showCounterMessage() =
        Toast.makeText(this, R.string.counter_message, LENGTH_SHORT)
            .show()
}