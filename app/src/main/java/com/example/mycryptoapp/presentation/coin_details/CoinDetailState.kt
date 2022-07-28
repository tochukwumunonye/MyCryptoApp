package com.example.mycryptoapp.presentation.coin_details

import com.example.mycryptoapp.domain.model.CoinDetail


data class CoinDetailState(
    val isLoading: Boolean = false,
    val coin: CoinDetail? = null,
    val error: String = ""
)