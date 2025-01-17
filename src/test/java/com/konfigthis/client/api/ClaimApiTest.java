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
import com.konfigthis.client.model.Claim;
import com.konfigthis.client.model.ClaimGetAllClaimsResponse;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ClaimApi
 */
@Disabled
public class ClaimApiTest {

    private static ClaimApi api;

    
    @BeforeAll
    public static void beforeClass() {
        ApiClient apiClient = Configuration.getDefaultApiClient();
        api = new ClaimApi(apiClient);
    }

    /**
     * List claims
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAllClaimsTest() throws ApiException {
        String xSeelAPIKey = null;
        String xSeelAPIVersion = null;
        String partner = null;
        String orderId = null;
        Integer page = null;
        Integer pageSize = null;
        ClaimGetAllClaimsResponse response = api.getAllClaims(xSeelAPIKey, xSeelAPIVersion, partner)
                .orderId(orderId)
                .page(page)
                .pageSize(pageSize)
                .execute();
        // TODO: test validations
    }

    /**
     * Get a claim
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getByIdTest() throws ApiException {
        String claimId = null;
        String xSeelAPIKey = null;
        String xSeelAPIVersion = null;
        String partner = null;
        Claim response = api.getById(claimId, xSeelAPIKey, xSeelAPIVersion, partner)
                .execute();
        // TODO: test validations
    }

}
