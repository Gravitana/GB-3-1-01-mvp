package ru.gb.gb_popular_libs.counters

import moxy.MvpView
import moxy.viewstate.strategy.AddToEndSingleStrategy
import moxy.viewstate.strategy.StateStrategyType
import moxy.viewstate.strategy.alias.OneExecution
import moxy.viewstate.strategy.alias.Skip

interface CountersView: MvpView {

    /**
     * Показывает приветственное сообщение
     * для пользователя.
     */
    @OneExecution
    fun showOnBoarding()

    /**
     * Показывает значение счётчика 1.
     * @param value значение
     */
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showCounter1(value: String)

    /**
     * Показывает значение счётчика 2.
     * @param value значение
     */
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showCounter2(value: String)

    /**
     * Показывает значение счётчика 3.
     * @param value значение
     */
    @StateStrategyType(AddToEndSingleStrategy::class)
    fun showCounter3(value: String)

    /**
     * Показывает сообщение об изменении счётчика.
     */
    @Skip
    fun showCounterMessage()
}