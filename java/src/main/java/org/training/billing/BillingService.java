package org.training.billing;

public class BillingService {
    private final BillingSystemAdapter billingSystemAdapter;

    public BillingService(BillingSystemAdapter billingSystemAdapter) {
        this.billingSystemAdapter = billingSystemAdapter;
    }

    public void invoice(Invoice invoice) {
        int amount = invoice.amount;
        Currency currency = invoice.currency;
        String companyName = invoice.companyName;
        billingSystemAdapter.invoice(amount, currency, companyName);
    }

}
