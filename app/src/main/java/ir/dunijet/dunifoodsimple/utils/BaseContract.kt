package ir.dunijet.dunifoodsimple.utils

interface BasePresenter<T> {
    fun onAttach( view :T )
    fun onDetach()
}

interface BaseView {
    // write your functions for view here
}