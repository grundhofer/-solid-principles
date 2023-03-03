import java.sql.DriverManager.println

class BankAccountSRP {
    var accountBalance = 100.0

    fun deposit(amount: Double) {
        accountBalance += amount
    }

    fun withdraw(amount: Double) {
        accountBalance -= amount
    }
}

class AccountStatement {
    fun printStatement(balance: Double) {
        println("Account balance: $balance")
    }
}

class Bank {
    private var bankName = "MyBank"

    fun changeBankName(newName: String) {
        bankName = newName
    }
}

class Email {
    fun sendEmail(email: String, emailAddress: String) {
        println("Sending email $email... to $emailAddress")
    }
}

class PDFStatement {
    fun generatePDFStatement() {
        println("Generating PDF statement...")
    }
}

class CustomerValidation {
    fun validateCustomerInformation(firstName: String, lastName: String, address: String) {
        println("Validating customer information for $firstName $lastName, living at $address...")
    }
}

class Invoice {
    fun generateInvoice(amount: Double) {
        println("Generating invoice for $amount")
    }
}

class Payment {
    fun sendPayment(amount: Double) {
        println("Processing payment of $amount")
    }
}

class LoanInterest {
    fun calculateLoanInterest(principal: Double, rate: Double, time: Double) {
        println("Calculating loan interest for principal $principal, rate $rate, and time $time")
    }
}

class Customer {
    var firstName = "Bank"
    var lastName = "Kunde"
    var emailAddress = "tester7p@gmail.com"
}

class CustomerData {
    fun storeCustomerData(customer: Customer) {
        println("Storing customer data for ${customer.firstName} ${customer.lastName} ${customer.emailAddress}")
    }
}