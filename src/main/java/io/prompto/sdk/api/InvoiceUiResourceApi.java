/*
 * Abella
 * Partner API application
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.prompto.sdk.api;

import io.prompto.sdk.api.ApiCallback;
import io.prompto.sdk.api.ApiClient;
import io.prompto.sdk.api.ApiException;
import io.prompto.sdk.api.ApiResponse;
import io.prompto.sdk.api.Configuration;
import io.prompto.sdk.api.Pair;
import io.prompto.sdk.api.ProgressRequestBody;
import io.prompto.sdk.api.ProgressResponseBody;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import io.prompto.sdk.model.InvoiceListResponse;
import io.prompto.sdk.model.InvoiceResponse;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class InvoiceUiResourceApi {
    private ApiClient apiClient;

    public InvoiceUiResourceApi(String partnerId, String apikey, String secretKey) {
        this(new ApiClient(partnerId, apikey, secretKey));
    }

    public InvoiceUiResourceApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getUsingGET
     * @param invoiceId invoiceId (required)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getUsingGETCall(String invoiceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/invoices/{invoiceId}"
            .replaceAll("\\{" + "invoiceId" + "\\}", apiClient.escapeString(invoiceId.toString()));

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"Authorization"}; //new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getUsingGETValidateBeforeCall(String invoiceId, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'invoiceId' is set
        if (invoiceId == null) {
            throw new ApiException("Missing the required parameter 'invoiceId' when calling getUsingGET(Async)");
        }
        

        com.squareup.okhttp.Call call = getUsingGETCall(invoiceId, progressListener, progressRequestListener);
        return call;

    }

    /**
     * get
     * 
     * @param invoiceId invoiceId (required)
     * @return InvoiceResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InvoiceResponse getUsingGET(String invoiceId) throws ApiException {
        ApiResponse<InvoiceResponse> resp = getUsingGETWithHttpInfo(invoiceId);
        return resp.getData();
    }

    /**
     * get
     * 
     * @param invoiceId invoiceId (required)
     * @return ApiResponse&lt;InvoiceResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InvoiceResponse> getUsingGETWithHttpInfo(String invoiceId) throws ApiException {
        com.squareup.okhttp.Call call = getUsingGETValidateBeforeCall(invoiceId, null, null);
        Type localVarReturnType = new TypeToken<InvoiceResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * get (asynchronously)
     * 
     * @param invoiceId invoiceId (required)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getUsingGETAsync(String invoiceId, final ApiCallback<InvoiceResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getUsingGETValidateBeforeCall(invoiceId, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InvoiceResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
    /**
     * Build call for listUsingGET
     * @param limit limit (optional, default to 25)
     * @param offset offset (optional, default to 0)
     * @param q q (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call listUsingGETCall(Integer limit, Integer offset, String q, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/api/v1/invoices";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (limit != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("limit", limit));
        if (offset != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("offset", offset));
        if (q != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("q", q));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "*/*"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[]{"Authorization"}; //new String[] { "Authorization" };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call listUsingGETValidateBeforeCall(Integer limit, Integer offset, String q, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        

        com.squareup.okhttp.Call call = listUsingGETCall(limit, offset, q, progressListener, progressRequestListener);
        return call;

    }

    /**
     * list
     * 
     * @param limit limit (optional, default to 25)
     * @param offset offset (optional, default to 0)
     * @param q q (optional)
     * @return InvoiceListResponse
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public InvoiceListResponse listUsingGET(Integer limit, Integer offset, String q) throws ApiException {
        ApiResponse<InvoiceListResponse> resp = listUsingGETWithHttpInfo(limit, offset, q);
        return resp.getData();
    }

    /**
     * list
     * 
     * @param limit limit (optional, default to 25)
     * @param offset offset (optional, default to 0)
     * @param q q (optional)
     * @return ApiResponse&lt;InvoiceListResponse&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<InvoiceListResponse> listUsingGETWithHttpInfo(Integer limit, Integer offset, String q) throws ApiException {
        com.squareup.okhttp.Call call = listUsingGETValidateBeforeCall(limit, offset, q, null, null);
        Type localVarReturnType = new TypeToken<InvoiceListResponse>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     * list (asynchronously)
     * 
     * @param limit limit (optional, default to 25)
     * @param offset offset (optional, default to 0)
     * @param q q (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call listUsingGETAsync(Integer limit, Integer offset, String q, final ApiCallback<InvoiceListResponse> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = listUsingGETValidateBeforeCall(limit, offset, q, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<InvoiceListResponse>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }
}