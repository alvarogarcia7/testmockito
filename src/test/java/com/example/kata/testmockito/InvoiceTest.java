package com.example.kata.testmockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;

import org.junit.Test;


public class InvoiceTest {

	@Test
	public void an_invoice_should_exist() {
		assertThat(new Invoice(), not(equalTo(null)));
	}

}
