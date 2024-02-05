package org.training.billing;

import com.ecorp.billing.GoodOldBillingSystem;

public class GoodOldBillingSystemAdapter implements BillingSystemAdapter {
    private final GoodOldBillingSystem billingSystem;

    public GoodOldBillingSystemAdapter(GoodOldBillingSystem billingSystem) {
        this.billingSystem = billingSystem;
    }

    @Override
    public void invoice(int amount, Currency currency, String companyName) {
        String invoiceForBillingSystem = String.format("%d%s to %s", amount, currency.symbol, companyName);
        billingSystem.invoice(invoiceForBillingSystem);
    }
}