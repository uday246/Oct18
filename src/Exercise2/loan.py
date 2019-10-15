from tkinter import *

class LoanCalculator:
    def __init__(self):
        window = Tk()
        window.title("Loan Calculator")
        
        Label(window,text = "Annual Interest Rate").grid(row = 1, column = 1, sticky = W)
        Label(window,text = "Number of Years").grid(row = 2, column = 1, sticky = W)
        Label(window,text = "Loan Amount").grid(row = 3, column = 1, sticky = W)
        Label(window,text = "Monthly Payment").grid(row = 4, column = 1, sticky = W)
        Label(window,text = "Total Payment").grid(row = 5, column = 1, sticky = W)
        
        self.annualInterestRateVar = StingVar()
        Entry(window,textvariable = self.annualInterestRateVar,Justify=Right).grid(row = 1, column = 2)
        self.numberofYearsvar = StringVar()
        Entry(window,textvariable = self.numberofYearsVar,Justify=Right).grid(row = 2, column = 2)
        self.loanAmountVar = StringVar()
        Entry(window,textvariable = self.self.loanAmountVar,Justify=Right).grid(row = 3, column = 2)
        
        self.monthlyPaymentVar = StringVar()
        lblMonthlyPayment = Label(window,textvariable = self.monthlyPaymentVar)\
        .grid(row = 5, column = 2, Sticky = E)
        self.totalPaymentVar = StringVar()
        lblTotalPayment = Label(window,textvariable = self.totalPaymentVar)\
        .grid(row = 5, column = 2, Sticky = E)
        
        btComputePayment = Button(window, text = "Compute Payment", \
        command = self.computePayment).grid(row = 6, column = 2, sticky = E)
        
        window.mainloop()

def computePayment(self):
    try:
        monthlyPayment = self.getMonthlyPayment(float(self.loanAmountVar.get()),\
        float(self.annualInterestRateVar.get())/1200,\
        int(self.numberOfYearsVar.get())
        self.monthlyPaymentVar.set(monthlyPayment))
        totalPayment = float(self.monthlyPaymentVar.get())*12 *int(self.numberOfYearsVar.get())
        self.totalPaymentVar.set('%.2f' % totalPayment)
    
    except:
        self.totalPaymentVar.set("Error in input")

def getMonthlyPayment(self,loan,Amount,monthlyInterestRate,numberOfYears):
    monthlyPayment = loanAmount * monthlyInterestRate/(1-1/ \
    (1 + monthlyInterestRate)**(numberOfYears*12))
    return monthlyPayment
      

def main():


    LoanCalulator()