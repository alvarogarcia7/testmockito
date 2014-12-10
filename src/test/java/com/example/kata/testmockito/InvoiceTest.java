package com.example.kata.testmockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.sameInstance;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;


public class InvoiceTest {

	private static Invoice sut;

	@Before
	public void setUp() {
		sut = new Invoice(new Lines());
	}

	@Test
	public void an_empty_invoice_should__total_as_zero() {
		assertThat(sut.getTotal(), equalTo(new Amount(0)));
	}

	@Test
	public void an_invoice_with_one_line_should_total() {
		final Amount amount = mock(Amount.class);
		final Line line = mock(Line.class);

		doReturn(amount).when(line).getAmount();

		assertThat(sut.addLine(line).getTotal(), sameInstance(amount));
	}

	@Test
	public void a_non_empty_invoice_should_total(){
		final Line lineZero = mock(Line.class);
		doReturn(mock(Amount.class)).when(lineZero).getAmount();

		final Line lineNonZero = mock(Line.class);
		final Amount amountNonZero = new Amount(1);
		doReturn(amountNonZero).when(lineNonZero).getAmount();

		assertThat(sut.addLine(lineZero).addLine(lineNonZero).getTotal(), sameInstance(amountNonZero));
	}

}
