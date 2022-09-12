package com.it.technology.lesson6;

public class CreditCard {
    private String nameCard;
    private  long bankAccountNumber;
    private double currentSum;

    public void setNameCard(String nameCard) {
        this.nameCard = nameCard;
    }

    public void setBankAccountNumber(long bankAccountNumber) {
        this.bankAccountNumber = bankAccountNumber;
    }

    public void setCurrentSum(double currentSum) {
        this.currentSum = currentSum;
    }

    public double creditingMoneyBankCard(double amountCredited) {
        return currentSum += amountCredited;
    }

    public double withdrawMoneyBankCard(double amountWithdrawn) {
        if ((currentSum < amountWithdrawn) || (currentSum <= 0)) {
            throw new RuntimeException("Cash withdrawal is not possible");
        }
        return currentSum -= amountWithdrawn;
    }

    public void displayingCurrentStateCard() {
        System.out.printf("%s%s%n%s%d%n%s%.2f%s%n",
                "Bank card name: ",
                nameCard,
                "Bank account number: ",
                bankAccountNumber,
                "Amount in bank account: ",
                currentSum,
                "$");
    }
}
