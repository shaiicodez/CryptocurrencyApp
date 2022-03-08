package com.plcoding.cryptocurrencyappyt.presentation

// deal with screens and navigation in jetpack compose
sealed class Screen(val route: String){
    object CoinListScreen: Screen("coin_list_screen")
    object CoinDetailScreen: Screen("coin_detail_screen")
}
