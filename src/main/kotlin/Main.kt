fun main(args: Array<String>) {

}

// In diesem Beispiel hat die Klasse Bank nicht nur bereits eine Vielzahl an Verantwortungen übernommen,
// sondern auch die Berechnung von Kreditzinsen und das Speichern der Kundendaten.
// Dies verletzt noch stärker das Single Responsibility Principle, da jede dieser Funktionalitäten in einer eigenen Klasse untergebracht werden sollte,
// um den Code übersichtlicher und wartbarer zu machen.

class Bank {
    var accountBalance = 100.0
    var bankName = "MyBank"
    var firstNameCustomer = "Bank"
    var lastNameCustomer = "Kunde"

    fun deposit(amount: Double) {
        accountBalance += amount
    }

    fun withdraw(amount: Double) {
        accountBalance -= amount
    }

    fun printStatement() {
        println("Account balance: $accountBalance")
    }

    fun changeBankName(newName: String) {
        bankName = newName
    }

    fun sendEmail(email: String) {
        println("Sending email to $email...")
    }

    fun generatePDFStatement() {
        println("Generating PDF statement...")
    }

    fun validateCustomerInformation(firstName: String, lastName: String, address: String) {
        println("Validating customer information for $firstName $lastName, living at $address...")
    }

    fun generateInvoice(amount: Double) {
        println("Generating invoice for $amount")
    }

    fun processPayment(amount: Double) {
        println("Processing payment of $amount")
    }

    fun calculateLoanInterest(principal: Double, rate: Double, time: Double) {
        println("Calculating loan interest for principal $principal, rate $rate, and time $time")
    }

    fun storeCustomerData(customer: Customer) {
        println("Storing customer data for ${customer.firstName} ${customer.lastName}")
    }
}