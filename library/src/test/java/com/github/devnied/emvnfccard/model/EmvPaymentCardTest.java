package com.github.devnied.emvnfccard.model;

import java.util.Date;

import org.fest.assertions.Assertions;
import org.junit.Test;

import com.github.devnied.emvnfccard.model.enums.CountryCodeEnum;
import com.github.devnied.emvnfccard.model.enums.CurrencyEnum;
import com.github.devnied.emvnfccard.model.enums.TransactionTypeEnum;

public class EmvPaymentCardTest {

	@Test
	public void testPayment() {
		EMVTransactionRecord payment = new EMVTransactionRecord();
		payment.setAmount((float) 100.0);
		payment.setCurrency(CurrencyEnum.EUR);
		payment.setCyptogramData("12");
		payment.setTerminalCountry(CountryCodeEnum.FR);
		payment.setTransactionDate(new Date());
		payment.setTransactionType(TransactionTypeEnum.CASHBACK);

		Assertions.assertThat(payment.getAmount()).isEqualTo(100);
		Assertions.assertThat(payment.getCurrency()).isEqualTo(CurrencyEnum.EUR);
		Assertions.assertThat(payment.getCyptogramData()).isEqualTo("12");
		Assertions.assertThat(payment.getTerminalCountry()).isEqualTo(CountryCodeEnum.FR);
		Assertions.assertThat(payment.getTransactionType()).isEqualTo(TransactionTypeEnum.CASHBACK);
	}
}
