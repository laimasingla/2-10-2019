package com.cg.ibs.cardmanagement.service;

import java.math.BigInteger;
import java.util.Date;

import com.cg.ibs.cardmanagement.cardbean.CaseIdBean;
import com.cg.ibs.cardmanagement.cardbean.CreditCardBean;
import com.cg.ibs.cardmanagement.cardbean.DebitCardBean;
import com.cg.ibs.cardmanagement.dao.CustomerDao;
import com.cg.ibs.cardmanagement.dao.DaoClass;
import com.cg.ibs.common.bean.TransactionBean;

public interface CustomerService {
	
	
	
	
	void applyNewDebitCard();
	void applyNewCreditCard(int creditScore, String incomeTaxReturns);
	 void resetCreditPin(BigInteger creditCardNumber, long currentCreditPin);
	 void resetDebtitPin(BigInteger debitCardNumber, long currentDebitPin);
	 void requestDebitCardLost(BigInteger debitCardNumber);
	 void requestCreditCardLost(BigInteger creditCardNumber);
	 void requestDebitCardUpgrade(BigInteger debitCardNumber);
	 void requestCreditCardUpgrade(BigInteger creditCardNumber);
	 TransactionBean showDebitCardStatement(Date fromDate , Date toDate , BigInteger debitCardNumber);
	 // void showCreditCardStatement(Date fromDate , Date toDate , BigInteger creditCardNumber);
	 void raiseDebitMismatchTicket(BigInteger debitCardNumber,BigInteger transactionId );
	 //void raiseCreditMismatchTicket(BigInteger creditCardNumber,BigInteger transactionId );
	 
	 
	 
	 
	 
	 
	
	
}
