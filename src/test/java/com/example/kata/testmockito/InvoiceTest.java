package com.example.kata.testmockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.Before;
import org.junit.Test;


public class InvoiceTest {

	private static Invoice sut = new Invoice();

	@Before
	public void setUp() {
		sut = new Invoice();
	}

	@Test
	public void an_empty_invoice_should__total_as_zero() {
		assertThat(sut.getTotal(), equalTo(new Amount(0)));
	}

	@Test
	public void a_non_empty_invoice_should_total(){
		assertThat(sut.addInvoice(new Line(new Amount(1))).getTotal(), equalTo(new Amount(1)));
	}

}
