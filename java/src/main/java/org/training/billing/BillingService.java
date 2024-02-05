package org.training.billing;

public class BillingService {
    private final GoodOldBillingSystemAdapter goodOldBillingSystemAdapter;

    public BillingService(GoodOldBillingSystemAdapter goodOldBillingSystemAdapter) {
        this.goodOldBillingSystemAdapter = goodOldBillingSystemAdapter;
    }

    public void invoice(Invoice invoice) {
        int amount = invoice.amount;
        Currency currency = invoice.currency;
        String companyName = invoice.companyName;
        goodOldBillingSystemAdapter.invoice(amount, currency, companyName);
    }

}
