package com.example.mycryptoapp.domain.repository

import com.example.mycryptoapp.data.remote.dto.CoinDetailDto
import com.example.mycryptoapp.data.remote.dto.CoinDto


interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto
}