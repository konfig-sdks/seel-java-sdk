package com.konfigthis.client;

import com.konfigthis.client.api.ClaimApi;
import com.konfigthis.client.api.ContractApi;
import com.konfigthis.client.api.EventApi;
import com.konfigthis.client.api.FulfillmentApi;
import com.konfigthis.client.api.InvoiceApi;
import com.konfigthis.client.api.MerchantApi;
import com.konfigthis.client.api.OrderApi;
import com.konfigthis.client.api.ProductApi;
import com.konfigthis.client.api.QuoteApi;

public class Seel {
    private ApiClient apiClient;
    public final ClaimApi claim;
    public final ContractApi contract;
    public final EventApi event;
    public final FulfillmentApi fulfillment;
    public final InvoiceApi invoice;
    public final MerchantApi merchant;
    public final OrderApi order;
    public final ProductApi product;
    public final QuoteApi quote;

    public Seel() {
        this(null);
    }

    public Seel(Configuration configuration) {
        this.apiClient = new ApiClient(null, configuration);
        this.claim = new ClaimApi(this.apiClient);
        this.contract = new ContractApi(this.apiClient);
        this.event = new EventApi(this.apiClient);
        this.fulfillment = new FulfillmentApi(this.apiClient);
        this.invoice = new InvoiceApi(this.apiClient);
        this.merchant = new MerchantApi(this.apiClient);
        this.order = new OrderApi(this.apiClient);
        this.product = new ProductApi(this.apiClient);
        this.quote = new QuoteApi(this.apiClient);
    }

}
