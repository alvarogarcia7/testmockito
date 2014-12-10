package com.example.kata.testmockito;

import static org.hamcrest.Matchers.sameInstance;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

public class LinesTest {

	private Lines sut;

	@Before
	public void setUp() {
		sut = new Lines();
	}

	@Test
	public void one_line_should_total() {
		final Amount amount = mock(Amount.class);
		final Line line = mock(Line.class);

		doReturn(amount).when(line).getAmount();

		assertThat(sut.add(line).getTotal(), sameInstance(amount));
	}

	@Test
	public void two_lines_should_total() {
		final Line lineZero = mock(Line.class);
		doReturn(mock(Amount.class)).when(lineZero).getAmount();

		final Line lineNonZero = mock(Line.class);
		final Amount amountNonZero = new Amount(1);
		doReturn(amountNonZero).when(lineNonZero).getAmount();


		assertThat(sut.add(lineZero).add(lineNonZero).getTotal(), sameInstance(amountNonZero));
	}

}
