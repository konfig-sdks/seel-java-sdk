/*
 * Seel API
 * Seel API
 *
 * The version of the OpenAPI document: 1.3.0
 * 
 *
 * NOTE: This class is auto generated by Konfig (https://konfigthis.com).
 * Do not edit the class manually.
 */


package com.konfigthis.client.api;

import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.model.Invoice;
import com.konfigthis.client.model.InvoiceListInvoicesResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for InvoiceApi
 */
@Disabled
public class InvoiceApiTest {

    private static InvoiceApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new InvoiceApi(apiClient);
    }

    /**
     * Get an invoice
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getInvoiceByIdTest() throws ApiException {
        String invoiceId = null;
        String xSeelAPIKey = null;
        String xSeelAPIVersion = null;
        String partner = null;
        Invoice response = api.getInvoiceById(invoiceId, xSeelAPIKey, xSeelAPIVersion, partner)
                .execute();
        // TODO: test validations
    }

    /**
     * List invoices
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listInvoicesTest() throws ApiException {
        String xSeelAPIKey = null;
        String xSeelAPIVersion = null;
        String partner = null;
        Integer page = null;
        Integer pageSize = null;
        InvoiceListInvoicesResponse response = api.listInvoices(xSeelAPIKey, xSeelAPIVersion, partner)
                .page(page)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

}