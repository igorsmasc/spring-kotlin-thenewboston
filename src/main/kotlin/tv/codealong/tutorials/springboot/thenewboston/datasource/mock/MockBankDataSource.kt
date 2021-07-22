package tv.codealong.tutorials.springboot.thenewboston.datasource.mock

import org.springframework.stereotype.Repository
import tv.codealong.tutorials.springboot.thenewboston.datasource.BankDataSource
import tv.codealong.tutorials.springboot.thenewboston.model.Bank

@Repository
class MockBankDataSource : BankDataSource{

    val banks = listOf(
        Bank("abcdf",
            1.0, 10),
        Bank("1234",
            0.7, 17),
        Bank("123",
            0.0, 10)
    )


    override fun retrieveBanks(): Collection<Bank> = banks
    override fun retrieveBank(accountNumber: String): Bank = banks.first { it.accountNumber == accountNumber }

}