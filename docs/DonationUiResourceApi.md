# DonationUiResourceApi

All URIs are relative to *https://https://prompto.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelUsingPOST**](DonationUiResourceApi.md#cancelUsingPOST) | **POST** /api/v1/donations/{donationId}/cancel | cancel
[**listUsingGET1**](DonationUiResourceApi.md#listUsingGET1) | **GET** /api/v1/donations | list


<a name="cancelUsingPOST"></a>
# **cancelUsingPOST**
> RestResponse cancelUsingPOST(donationId)

cancel

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.DonationUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

DonationUiResourceApi apiInstance = new DonationUiResourceApi(defaultClient);
String donationId = "donationId_example"; // String | donationId
try {
    RestResponse result = apiInstance.cancelUsingPOST(donationId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DonationUiResourceApi#cancelUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **donationId** | **String**| donationId |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET1"></a>
# **listUsingGET1**
> DonationListResponse listUsingGET1(limit, offset, q)

list

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.DonationUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

DonationUiResourceApi apiInstance = new DonationUiResourceApi(defaultClient);
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    DonationListResponse result = apiInstance.listUsingGET1(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling DonationUiResourceApi#listUsingGET1");
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

[**DonationListResponse**](DonationListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

