package com.example.kata.testmockito;

public class Invoice {

	private Line line;

	public Amount getTotal() {
		if (null == line) {
			return new Amount(0);
		}
		return line.getAmount();
	}

	public Invoice addLine(final Line line) {
		this.line = line;
		return this;
	}

}