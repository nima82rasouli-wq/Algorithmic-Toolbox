# Java_Mortage_Calculator
A flexible and user-friendly mortgage calculator that supports any currency! Calculate your monthly payments with ease.

# Outputs
-The monthly interest rate
-The Montly Payment Amount
-The Number of Payments

## How to Use
1. Compile the program:

   javac MortgageCalculator.java

2. Run the program:

   java MortgageCalculator


Enter the required information when prompted:

Your preferred currency symbol

Annual interest rate (%)

Loan amount

Payment period (in years)

##Formular

M = P * [r(1+r)^n] / [(1+r)^n - 1]

Monthly Patments Contain: Interest + Principal

Interest is calculated on the remaining balance each month

With each payment, the principal balance decreases

Subsequent interest amounts become smaller

##Example:
Inputs:

Enter currency symbol (e.g., $, €, £, ¥, ₹):
                                                                                             ریال
Enter annual interest rate (%)
22
Enter loan amount:
50000000
Enter payment period (in years):
3

Outputs:

Monthly interest rate:1.8333%

Monthly payment:  ریال1,909,523.862

Number of payments :36

Requirements 

Java 8 or higher

No external dependencies

Author
Enjoy!
