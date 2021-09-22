package gb.mvp.counters

interface CountersView {

    /**
     * Показывает значение счетчика 1.
     * @param counter значение
     */
    fun showCounter1(counter: String)

    /**
     * Показывает значение счетчика 2.
     * @param counter значение
     */
    fun showCounter2(counter: String)

    /**
     * Показывает значение счетчика 3.
     * @param counter значение
     */
    fun showCounter3(counter: String)
}