package ru.gb.gb_popular_libs.presentation.users

import com.github.terrakok.cicerone.Router
import io.reactivex.rxjava3.disposables.CompositeDisposable
import moxy.MvpPresenter
import ru.gb.gb_popular_libs.data.user.GitHubUser
import ru.gb.gb_popular_libs.data.user.GitHubUserRepository
import ru.gb.gb_popular_libs.presentation.user.UserScreen

class UsersPresenter(
    private val userRepository: GitHubUserRepository,
    private val router: Router
): MvpPresenter<UsersView>() {

    private val disposables = CompositeDisposable()

    override fun onFirstViewAttach() {
        disposables.add(
            userRepository
                .getUsers()
                .subscribe(
                    viewState::showUsers,
                    viewState::showError
                )
        )
    }

    fun displayError(message: String?) {
        println("Error: $message")
    }

    fun displayUser(user: GitHubUser) =
        router.navigateTo(UserScreen(user.login))

    override fun destroyView(view: UsersView?) {
        disposables.clear()
        super.destroyView(view)
    }
}