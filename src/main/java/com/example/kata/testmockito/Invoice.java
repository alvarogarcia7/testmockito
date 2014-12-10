package com.example.kata.testmockito;

public class Invoice {

	private Line line;

	public Amount getTotal() {
		if (null == line) {
			return new Amount(0);
		}
		return new Amount(1);
	}

	//TODO AGB rename to addLine
	public Invoice addInvoice(final Line line) {
		this.line = line;
		return this;
	}

}