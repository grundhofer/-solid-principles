/*Dem Product Owner der Spaßkasse ist eingefallen, dass neben einem Girokonto und einem Tagesgeldkonto weitere Produkte angeboten werden sollen.
Erweitere die BankOCP Klasse um Investment- und Saving-Accounts und ergänze nach Bedarf weitere sinnvolle Funktionalitäten (zum Beispiel calculateTotalInterest()).
Orientiere dich bei der Umsetzung am OCP-Prinzip.*/


class BankOCP {
    var checkingAccounts = mutableListOf<CheckingAccount>()
    var termAccounts = mutableListOf<TermAccount>()

    fun addCheckingAccount(account: CheckingAccount) {
        checkingAccounts.add(account)
    }

    fun addTermAccount(account: TermAccount) {
        termAccounts.add(account)
    }

    fun calculateTotalInterest(): Double {
        var totalInterest = 0.0
        for (account in checkingAccounts) {
            totalInterest += account.calculateInterest()
        }
        for (account in termAccounts) {
            totalInterest += account.calculateInterest()
        }
        return totalInterest
    }

}

class CheckingAccount(accountNumber: String, var balance: Double, var overdraftLimit: Double, var overdraftFee: Double) {
    fun calculateInterest(): Double {
        return balance * 0.01
    }
}

class TermAccount(accountNumber: String, var balance: Double, var term: Int, var interestRate: Double) {
    fun calculateInterest(): Double {
        return balance * interestRate * term
    }
}