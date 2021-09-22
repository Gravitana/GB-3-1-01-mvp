package gb.mvp.counters

class CountersModel(private val counters: MutableList<Int> = mutableListOf(0, 0, 0)) {

    fun incrementCounter(counterId: Int) = ++counters[counterId]
}