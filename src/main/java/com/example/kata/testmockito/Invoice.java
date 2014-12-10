package com.example.kata.testmockito;

public class Invoice {

	private Line line;

	public Amount getTotal() {
		if (null == line) {
			return new Amount(0);
		}
		return new Amount(1);
	}

	public Invoice addLine(final Line line) {
		this.line = line;
		return this;
	}

}