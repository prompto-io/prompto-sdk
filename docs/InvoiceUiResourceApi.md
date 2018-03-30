# InvoiceUiResourceApi

All URIs are relative to *https://localhost:8080/web-ui-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsingGET**](InvoiceUiResourceApi.md#getUsingGET) | **GET** /api/v1/invoices/{invoiceId} | get
[**listUsingGET**](InvoiceUiResourceApi.md#listUsingGET) | **GET** /api/v1/invoices | list


<a name="getUsingGET"></a>
# **getUsingGET**
> InvoiceResponse getUsingGET(invoiceId)

get

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InvoiceUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

InvoiceUiResourceApi apiInstance = new InvoiceUiResourceApi();
String invoiceId = "invoiceId_example"; // String | invoiceId
try {
    InvoiceResponse result = apiInstance.getUsingGET(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceUiResourceApi#getUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **String**| invoiceId |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET"></a>
# **listUsingGET**
> InvoiceListResponse listUsingGET(limit, offset, q)

list

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InvoiceUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

InvoiceUiResourceApi apiInstance = new InvoiceUiResourceApi();
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    InvoiceListResponse result = apiInstance.listUsingGET(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceUiResourceApi#listUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **limit** | **Integer**| limit | [optional] [default to 25]
 **offset** | **Integer**| offset | [optional] [default to 0]
 **q** | **String**| q | [optional]

### Return type

[**InvoiceListResponse**](InvoiceListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

