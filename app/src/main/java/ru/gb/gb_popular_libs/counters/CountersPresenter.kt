package ru.gb.gb_popular_libs.counters

class CountersPresenter(val view: CountersView) {

    val model = CountersModel()

    fun incrementCounter1(){
        val value = model.incrementCounter(0)
        view.showCounter1(value.toString())
    }

    fun incrementCounter2(){
        val value = model.incrementCounter(1)
        view.showCounter2(value.toString())
    }

    fun incrementCounter3(){
        val value = model.incrementCounter(2)
        view.showCounter3(value.toString())
    }
}