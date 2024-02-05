package org.training.billing;

public interface BillingSystemAdapter {

	void invoice(int amount, Currency currency, String companyName);
}
