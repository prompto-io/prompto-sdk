# SubscriptionUiResourceApi

All URIs are relative to *https://https://prompto.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**cancelUsingPOST1**](SubscriptionUiResourceApi.md#cancelUsingPOST1) | **POST** /api/v1/subscriptions/{subscriptionId}/cancel | cancel
[**listUsingGET6**](SubscriptionUiResourceApi.md#listUsingGET6) | **GET** /api/v1/subscriptions | list
[**subscribeUsingPOST**](SubscriptionUiResourceApi.md#subscribeUsingPOST) | **POST** /api/v1/subscriptions/{userId}/subscribe | subscribe


<a name="cancelUsingPOST1"></a>
# **cancelUsingPOST1**
> RestResponse cancelUsingPOST1(subscriptionId, req)

cancel

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.SubscriptionUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

SubscriptionUiResourceApi apiInstance = new SubscriptionUiResourceApi(defaultClient);
String subscriptionId = "subscriptionId_example"; // String | subscriptionId
CancelSubscriptionRequest req = new CancelSubscriptionRequest(); // CancelSubscriptionRequest | req
try {
    RestResponse result = apiInstance.cancelUsingPOST1(subscriptionId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionUiResourceApi#cancelUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **subscriptionId** | **String**| subscriptionId |
 **req** | [**CancelSubscriptionRequest**](CancelSubscriptionRequest.md)| req |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET6"></a>
# **listUsingGET6**
> SubscriptionListResponse listUsingGET6(limit, offset, q)

list

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.SubscriptionUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

SubscriptionUiResourceApi apiInstance = new SubscriptionUiResourceApi(defaultClient);
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    SubscriptionListResponse result = apiInstance.listUsingGET6(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionUiResourceApi#listUsingGET6");
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

[**SubscriptionListResponse**](SubscriptionListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="subscribeUsingPOST"></a>
# **subscribeUsingPOST**
> RestResponse subscribeUsingPOST(userId, request)

subscribe

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.SubscriptionUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

SubscriptionUiResourceApi apiInstance = new SubscriptionUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
PurchaseOrderRequest request = new PurchaseOrderRequest(); // PurchaseOrderRequest | request
try {
    RestResponse result = apiInstance.subscribeUsingPOST(userId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling SubscriptionUiResourceApi#subscribeUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **request** | [**PurchaseOrderRequest**](PurchaseOrderRequest.md)| request |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

