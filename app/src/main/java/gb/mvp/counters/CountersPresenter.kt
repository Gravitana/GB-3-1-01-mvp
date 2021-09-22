package gb.mvp.counters

class CountersPresenter(val view: CountersView) {
    val model = CountersModel()

    fun incrementCounter1(){
        val nextValue = model.incrementCounter(0)
        view.showCounter1(nextValue.toString())
    }

    fun incrementCounter2(){
        val nextValue = model.incrementCounter(1)
        view.showCounter2(nextValue.toString())
    }

    fun incrementCounter3(){
        val nextValue = model.incrementCounter(2)
        view.showCounter3(nextValue.toString())
    }
}