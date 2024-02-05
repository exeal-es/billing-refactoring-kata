package org.training.billing;

import com.casadepapel.billing.BrandNewBillingSystem;

public class BrandNewBillingSystemAdapter implements BillingSystemAdapter {

	private final BrandNewBillingSystem billingSystem;

	public BrandNewBillingSystemAdapter(BrandNewBillingSystem billingSystem) {
		this.billingSystem = billingSystem;
	}

	@Override
	public void invoice(int amount, Currency currency, String companyName) {
		billingSystem.invoice(amount, currency.symbol, companyName);
	}
}
