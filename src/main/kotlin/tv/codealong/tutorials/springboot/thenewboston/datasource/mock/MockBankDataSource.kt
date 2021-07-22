package tv.codealong.tutorials.springboot.thenewboston.datasource.mock

import org.springframework.stereotype.Repository
import tv.codealong.tutorials.springboot.thenewboston.datasource.BankDataSource
import tv.codealong.tutorials.springboot.thenewboston.model.Bank

@Repository
class MockBankDataSource : BankDataSource{

    val banks = listOf(
        Bank("abcdf",
            1.0, 10),
        Bank("123",
            1.0, 0),
        Bank("123",
            0.0, 10)
    )


    override fun retrieveBanks(): Collection<Bank> = banks

}