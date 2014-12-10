package com.example.kata.testmockito;

import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.not;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class AmountTest {

	@Test
	public void two_same_amounts_should_be_equal() {
		assertThat(new Amount(0), equalTo(new Amount(0)));
	}

	@Test
	public void two_different_amounts_should_not_be_equal() {
		assertThat(new Amount(1), not(equalTo(new Amount(0))));
	}

}
