package com.example.kata.testmockito;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;


public class InvoiceTest {

	private static Invoice sut;

	@Mock
	private static Lines mockLines;

	@Before
	public void setUp() {
		mockLines = mock(Lines.class);
		sut = new Invoice(mockLines);
	}

	@Test
	public void an_invoice_should_delegate_the_total_calculation_to_lines() {
		sut.getTotal();
		verify(mockLines, times(1)).getTotal();
	}

}
