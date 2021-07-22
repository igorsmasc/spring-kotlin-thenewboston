package tv.codealong.tutorials.springboot.thenewboston.service

import tv.codealong.tutorials.springboot.thenewboston.datasource.BankDataSource
import tv.codealong.tutorials.springboot.thenewboston.model.Bank

class BankService(private val dataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> = dataSource.retrieveBanks()
}