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
import com.konfigthis.client.model.Merchant;
import com.konfigthis.client.model.MerchantCreateNewMerchantRequest;
import com.konfigthis.client.model.MerchantCreateNewMerchantRequestSeelServicesInner;
import com.konfigthis.client.model.MerchantListAllMerchantsResponse;
import com.konfigthis.client.model.MerchantUpdateMerchantDetailsRequest;
import com.konfigthis.client.model.MerchantUpdateMerchantDetailsRequestSeelServicesInner;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MerchantApi
 */
@Disabled
public class MerchantApiTest {

    private static MerchantApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new MerchantApi(apiClient);
    }

    /**
     * Create a merchant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createNewMerchantTest() throws ApiException {
        String shopId = null;
        String adminDomain = null;
        String shopDomain = null;
        String shopPlatform = null;
        String shopCurrency = null;
        String shopName = null;
        String contactName = null;
        String contactEmail = null;
        List<MerchantCreateNewMerchantRequestSeelServicesInner> seelServices = null;
        String xSeelAPIKey = null;
        String xSeelAPIVersion = null;
        String partner = null;
        String contactPhoneNumber = null;
        Merchant response = api.createNewMerchant(shopId, adminDomain, shopDomain, shopPlatform, shopCurrency, shopName, contactName, contactEmail, seelServices, xSeelAPIKey, xSeelAPIVersion, partner)
                .contactPhoneNumber(contactPhoneNumber)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a merchant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getMerchantDetailsTest() throws ApiException {
        String merchantId = null;
        String xSeelAPIKey = null;
        String xSeelAPIVersion = null;
        String partner = null;
        Merchant response = api.getMerchantDetails(merchantId, xSeelAPIKey, xSeelAPIVersion, partner)
                .execute();
        // TODO: test validations
    }

    /**
     * List merchants
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listAllMerchantsTest() throws ApiException {
        String xSeelAPIKey = null;
        String xSeelAPIVersion = null;
        String partner = null;
        Integer page = null;
        Integer pageSize = null;
        MerchantListAllMerchantsResponse response = api.listAllMerchants(xSeelAPIKey, xSeelAPIVersion, partner)
                .page(page)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Update a merchant
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void updateMerchantDetailsTest() throws ApiException {
        String merchantId = null;
        String xSeelAPIKey = null;
        String xSeelAPIVersion = null;
        String partner = null;
        String shopId = null;
        String adminDomain = null;
        String shopDomain = null;
        String shopPlatform = null;
        String shopCurrency = null;
        String shopName = null;
        String contactName = null;
        String contactEmail = null;
        String contactPhoneNumber = null;
        List<MerchantUpdateMerchantDetailsRequestSeelServicesInner> seelServices = null;
        Merchant response = api.updateMerchantDetails(merchantId, xSeelAPIKey, xSeelAPIVersion, partner)
                .shopId(shopId)
                .adminDomain(adminDomain)
                .shopDomain(shopDomain)
                .shopPlatform(shopPlatform)
                .shopCurrency(shopCurrency)
                .shopName(shopName)
                .contactName(contactName)
                .contactEmail(contactEmail)
                .contactPhoneNumber(contactPhoneNumber)
                .seelServices(seelServices)
                .execute();
        // TODO: test validations
    }

}
