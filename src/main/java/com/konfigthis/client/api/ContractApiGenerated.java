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

import com.konfigthis.client.ApiCallback;
import com.konfigthis.client.ApiClient;
import com.konfigthis.client.ApiException;
import com.konfigthis.client.ApiResponse;
import com.konfigthis.client.Configuration;
import com.konfigthis.client.Pair;
import com.konfigthis.client.ProgressRequestBody;
import com.konfigthis.client.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.konfigthis.client.model.Contract;
import com.konfigthis.client.model.ContractListContractsResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.ws.rs.core.GenericType;

public class ContractApiGenerated {
    private ApiClient localVarApiClient;
    private int localHostIndex;
    private String localCustomBaseUrl;

    public ContractApiGenerated() throws IllegalArgumentException {
        this(Configuration.getDefaultApiClient());
    }

    public ContractApiGenerated(ApiClient apiClient) throws IllegalArgumentException {
        this.localVarApiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return localVarApiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.localVarApiClient = apiClient;
    }

    public int getHostIndex() {
        return localHostIndex;
    }

    public void setHostIndex(int hostIndex) {
        this.localHostIndex = hostIndex;
    }

    public String getCustomBaseUrl() {
        return localCustomBaseUrl;
    }

    public void setCustomBaseUrl(String customBaseUrl) {
        this.localCustomBaseUrl = customBaseUrl;
    }

    private okhttp3.Call getByIdCall(String contractId, String xSeelAPIKey, String xSeelAPIVersion, String partner, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{partner}/contracts/{contract_id}"
            .replace("{" + "contract_id" + "}", localVarApiClient.escapeString(contractId.toString()))
            .replace("{" + "partner" + "}", localVarApiClient.escapeString(partner.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (xSeelAPIKey != null) {
            localVarHeaderParams.put("X-Seel-API-Key", localVarApiClient.parameterToString(xSeelAPIKey));
        }

        if (xSeelAPIVersion != null) {
            localVarHeaderParams.put("X-Seel-API-Version", localVarApiClient.parameterToString(xSeelAPIVersion));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call getByIdValidateBeforeCall(String contractId, String xSeelAPIKey, String xSeelAPIVersion, String partner, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'contractId' is set
        if (contractId == null) {
            throw new ApiException("Missing the required parameter 'contractId' when calling getById(Async)");
        }

        // verify the required parameter 'xSeelAPIKey' is set
        if (xSeelAPIKey == null) {
            throw new ApiException("Missing the required parameter 'xSeelAPIKey' when calling getById(Async)");
        }

        // verify the required parameter 'xSeelAPIVersion' is set
        if (xSeelAPIVersion == null) {
            throw new ApiException("Missing the required parameter 'xSeelAPIVersion' when calling getById(Async)");
        }

        // verify the required parameter 'partner' is set
        if (partner == null) {
            throw new ApiException("Missing the required parameter 'partner' when calling getById(Async)");
        }

        return getByIdCall(contractId, xSeelAPIKey, xSeelAPIVersion, partner, _callback);

    }


    private ApiResponse<Contract> getByIdWithHttpInfo(String contractId, String xSeelAPIKey, String xSeelAPIVersion, String partner) throws ApiException {
        okhttp3.Call localVarCall = getByIdValidateBeforeCall(contractId, xSeelAPIKey, xSeelAPIVersion, partner, null);
        Type localVarReturnType = new TypeToken<Contract>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call getByIdAsync(String contractId, String xSeelAPIKey, String xSeelAPIVersion, String partner, final ApiCallback<Contract> _callback) throws ApiException {

        okhttp3.Call localVarCall = getByIdValidateBeforeCall(contractId, xSeelAPIKey, xSeelAPIVersion, partner, _callback);
        Type localVarReturnType = new TypeToken<Contract>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class GetByIdRequestBuilder {
        private final String contractId;
        private final String xSeelAPIKey;
        private final String xSeelAPIVersion;
        private final String partner;

        private GetByIdRequestBuilder(String contractId, String xSeelAPIKey, String xSeelAPIVersion, String partner) {
            this.contractId = contractId;
            this.xSeelAPIKey = xSeelAPIKey;
            this.xSeelAPIVersion = xSeelAPIVersion;
            this.partner = partner;
        }

        /**
         * Build call for getById
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return getByIdCall(contractId, xSeelAPIKey, xSeelAPIVersion, partner, _callback);
        }


        /**
         * Execute getById request
         * @return Contract
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public Contract execute() throws ApiException {
            ApiResponse<Contract> localVarResp = getByIdWithHttpInfo(contractId, xSeelAPIKey, xSeelAPIVersion, partner);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute getById request with HTTP info returned
         * @return ApiResponse&lt;Contract&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<Contract> executeWithHttpInfo() throws ApiException {
            return getByIdWithHttpInfo(contractId, xSeelAPIKey, xSeelAPIVersion, partner);
        }

        /**
         * Execute getById request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<Contract> _callback) throws ApiException {
            return getByIdAsync(contractId, xSeelAPIKey, xSeelAPIVersion, partner, _callback);
        }
    }

    /**
     * Get a contract
     * 
     * @param contractId ID of the contract (required)
     * @param xSeelAPIKey Your Seel API key (required)
     * @param xSeelAPIVersion Version of the Seel API to use (required)
     * @param partner partner name (required)
     * @return GetByIdRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public GetByIdRequestBuilder getById(String contractId, String xSeelAPIKey, String xSeelAPIVersion, String partner) throws IllegalArgumentException {
        if (contractId == null) throw new IllegalArgumentException("\"contractId\" is required but got null");
            

        if (xSeelAPIKey == null) throw new IllegalArgumentException("\"xSeelAPIKey\" is required but got null");
            

        if (xSeelAPIVersion == null) throw new IllegalArgumentException("\"xSeelAPIVersion\" is required but got null");
            

        if (partner == null) throw new IllegalArgumentException("\"partner\" is required but got null");
            

        return new GetByIdRequestBuilder(contractId, xSeelAPIKey, xSeelAPIVersion, partner);
    }
    private okhttp3.Call listContractsCall(String xSeelAPIKey, String xSeelAPIVersion, String partner, String orderId, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        String basePath = null;
        // Operation Servers
        String[] localBasePaths = new String[] {  };

        // Determine Base Path to Use
        if (localCustomBaseUrl != null){
            basePath = localCustomBaseUrl;
        } else if ( localBasePaths.length > 0 ) {
            basePath = localBasePaths[localHostIndex];
        } else {
            basePath = null;
        }

        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/{partner}/contracts"
            .replace("{" + "partner" + "}", localVarApiClient.escapeString(partner.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        Map<String, String> localVarHeaderParams = new HashMap<String, String>();
        Map<String, String> localVarCookieParams = new HashMap<String, String>();
        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        if (orderId != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("order_id", orderId));
        }

        if (page != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page", page));
        }

        if (pageSize != null) {
            localVarQueryParams.addAll(localVarApiClient.parameterToPair("page_size", pageSize));
        }

        if (xSeelAPIKey != null) {
            localVarHeaderParams.put("X-Seel-API-Key", localVarApiClient.parameterToString(xSeelAPIKey));
        }

        if (xSeelAPIVersion != null) {
            localVarHeaderParams.put("X-Seel-API-Version", localVarApiClient.parameterToString(xSeelAPIVersion));
        }

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = localVarApiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        final String[] localVarContentTypes = {
        };
        final String localVarContentType = localVarApiClient.selectHeaderContentType(localVarContentTypes);
        if (localVarContentType != null) {
            localVarHeaderParams.put("Content-Type", localVarContentType);
        }

        String[] localVarAuthNames = new String[] {  };
        return localVarApiClient.buildCall(basePath, localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarCookieParams, localVarFormParams, localVarAuthNames, _callback);
    }

    @SuppressWarnings("rawtypes")
    private okhttp3.Call listContractsValidateBeforeCall(String xSeelAPIKey, String xSeelAPIVersion, String partner, String orderId, Integer page, Integer pageSize, final ApiCallback _callback) throws ApiException {
        // verify the required parameter 'xSeelAPIKey' is set
        if (xSeelAPIKey == null) {
            throw new ApiException("Missing the required parameter 'xSeelAPIKey' when calling listContracts(Async)");
        }

        // verify the required parameter 'xSeelAPIVersion' is set
        if (xSeelAPIVersion == null) {
            throw new ApiException("Missing the required parameter 'xSeelAPIVersion' when calling listContracts(Async)");
        }

        // verify the required parameter 'partner' is set
        if (partner == null) {
            throw new ApiException("Missing the required parameter 'partner' when calling listContracts(Async)");
        }

        return listContractsCall(xSeelAPIKey, xSeelAPIVersion, partner, orderId, page, pageSize, _callback);

    }


    private ApiResponse<ContractListContractsResponse> listContractsWithHttpInfo(String xSeelAPIKey, String xSeelAPIVersion, String partner, String orderId, Integer page, Integer pageSize) throws ApiException {
        okhttp3.Call localVarCall = listContractsValidateBeforeCall(xSeelAPIKey, xSeelAPIVersion, partner, orderId, page, pageSize, null);
        Type localVarReturnType = new TypeToken<ContractListContractsResponse>(){}.getType();
        return localVarApiClient.execute(localVarCall, localVarReturnType);
    }

    private okhttp3.Call listContractsAsync(String xSeelAPIKey, String xSeelAPIVersion, String partner, String orderId, Integer page, Integer pageSize, final ApiCallback<ContractListContractsResponse> _callback) throws ApiException {

        okhttp3.Call localVarCall = listContractsValidateBeforeCall(xSeelAPIKey, xSeelAPIVersion, partner, orderId, page, pageSize, _callback);
        Type localVarReturnType = new TypeToken<ContractListContractsResponse>(){}.getType();
        localVarApiClient.executeAsync(localVarCall, localVarReturnType, _callback);
        return localVarCall;
    }

    public class ListContractsRequestBuilder {
        private final String xSeelAPIKey;
        private final String xSeelAPIVersion;
        private final String partner;
        private String orderId;
        private Integer page;
        private Integer pageSize;

        private ListContractsRequestBuilder(String xSeelAPIKey, String xSeelAPIVersion, String partner) {
            this.xSeelAPIKey = xSeelAPIKey;
            this.xSeelAPIVersion = xSeelAPIVersion;
            this.partner = partner;
        }

        /**
         * Set orderId
         * @param orderId Query by order ID (optional)
         * @return ListContractsRequestBuilder
         */
        public ListContractsRequestBuilder orderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        
        /**
         * Set page
         * @param page Query by page, default 0 (optional, default to 0)
         * @return ListContractsRequestBuilder
         */
        public ListContractsRequestBuilder page(Integer page) {
            this.page = page;
            return this;
        }
        
        /**
         * Set pageSize
         * @param pageSize Query by page_size, default 100 (optional, default to 100)
         * @return ListContractsRequestBuilder
         */
        public ListContractsRequestBuilder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        
        /**
         * Build call for listContracts
         * @param _callback ApiCallback API callback
         * @return Call to execute
         * @throws ApiException If fail to serialize the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call buildCall(final ApiCallback _callback) throws ApiException {
            return listContractsCall(xSeelAPIKey, xSeelAPIVersion, partner, orderId, page, pageSize, _callback);
        }


        /**
         * Execute listContracts request
         * @return ContractListContractsResponse
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ContractListContractsResponse execute() throws ApiException {
            ApiResponse<ContractListContractsResponse> localVarResp = listContractsWithHttpInfo(xSeelAPIKey, xSeelAPIVersion, partner, orderId, page, pageSize);
            return localVarResp.getResponseBody();
        }

        /**
         * Execute listContracts request with HTTP info returned
         * @return ApiResponse&lt;ContractListContractsResponse&gt;
         * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public ApiResponse<ContractListContractsResponse> executeWithHttpInfo() throws ApiException {
            return listContractsWithHttpInfo(xSeelAPIKey, xSeelAPIVersion, partner, orderId, page, pageSize);
        }

        /**
         * Execute listContracts request (asynchronously)
         * @param _callback The callback to be executed when the API call finishes
         * @return The request call
         * @throws ApiException If fail to process the API call, e.g. serializing the request body object
         * @http.response.details
         <table summary="Response Details" border="1">
            <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
            <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
         </table>
         */
        public okhttp3.Call executeAsync(final ApiCallback<ContractListContractsResponse> _callback) throws ApiException {
            return listContractsAsync(xSeelAPIKey, xSeelAPIVersion, partner, orderId, page, pageSize, _callback);
        }
    }

    /**
     * List contracts
     * 
     * @param xSeelAPIKey Your Seel API key (required)
     * @param xSeelAPIVersion Version of the Seel API to use (required)
     * @param partner partner name (required)
     * @return ListContractsRequestBuilder
     * @http.response.details
     <table summary="Response Details" border="1">
        <tr><td> Status Code </td><td> Description </td><td> Response Headers </td></tr>
        <tr><td> 200 </td><td> Success </td><td>  -  </td></tr>
     </table>
     */
    public ListContractsRequestBuilder listContracts(String xSeelAPIKey, String xSeelAPIVersion, String partner) throws IllegalArgumentException {
        if (xSeelAPIKey == null) throw new IllegalArgumentException("\"xSeelAPIKey\" is required but got null");
            

        if (xSeelAPIVersion == null) throw new IllegalArgumentException("\"xSeelAPIVersion\" is required but got null");
            

        if (partner == null) throw new IllegalArgumentException("\"partner\" is required but got null");
            

        return new ListContractsRequestBuilder(xSeelAPIKey, xSeelAPIVersion, partner);
    }
}