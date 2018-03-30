# PlanUiResourceApi

All URIs are relative to *https://localhost:8080/web-ui-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUsingPOST1**](PlanUiResourceApi.md#deleteUsingPOST1) | **POST** /api/v1/plans/{planId}/delete | delete
[**getUsingGET2**](PlanUiResourceApi.md#getUsingGET2) | **GET** /api/v1/plans/{planId} | get
[**listUsingGET2**](PlanUiResourceApi.md#listUsingGET2) | **GET** /api/v1/plans | list
[**publishUsingPOST**](PlanUiResourceApi.md#publishUsingPOST) | **POST** /api/v1/plans/{planId}/publish | publish
[**saveUsingPOST**](PlanUiResourceApi.md#saveUsingPOST) | **POST** /api/v1/plans | save
[**unpublishUsingPOST**](PlanUiResourceApi.md#unpublishUsingPOST) | **POST** /api/v1/plans/{planId}/unpublish | unpublish
[**updateUsingPOST1**](PlanUiResourceApi.md#updateUsingPOST1) | **POST** /api/v1/plans/{planId} | update


<a name="deleteUsingPOST1"></a>
# **deleteUsingPOST1**
> RestResponse deleteUsingPOST1(planId)

delete

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PlanUiResourceApi apiInstance = new PlanUiResourceApi();
String planId = "planId_example"; // String | planId
try {
    RestResponse result = apiInstance.deleteUsingPOST1(planId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#deleteUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planId** | **String**| planId |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsingGET2"></a>
# **getUsingGET2**
> PlanResponse getUsingGET2(planId)

get

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PlanUiResourceApi apiInstance = new PlanUiResourceApi();
String planId = "planId_example"; // String | planId
try {
    PlanResponse result = apiInstance.getUsingGET2(planId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#getUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planId** | **String**| planId |

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET2"></a>
# **listUsingGET2**
> PlanListResponse listUsingGET2(limit, offset, q)

list

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PlanUiResourceApi apiInstance = new PlanUiResourceApi();
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    PlanListResponse result = apiInstance.listUsingGET2(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#listUsingGET2");
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

[**PlanListResponse**](PlanListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="publishUsingPOST"></a>
# **publishUsingPOST**
> PlanResponse publishUsingPOST(planId)

publish

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PlanUiResourceApi apiInstance = new PlanUiResourceApi();
String planId = "planId_example"; // String | planId
try {
    PlanResponse result = apiInstance.publishUsingPOST(planId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#publishUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planId** | **String**| planId |

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveUsingPOST"></a>
# **saveUsingPOST**
> PlanResponse saveUsingPOST(planReq)

save

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PlanUiResourceApi apiInstance = new PlanUiResourceApi();
PlanRequest planReq = new PlanRequest(); // PlanRequest | planReq
try {
    PlanResponse result = apiInstance.saveUsingPOST(planReq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#saveUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planReq** | [**PlanRequest**](PlanRequest.md)| planReq |

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="unpublishUsingPOST"></a>
# **unpublishUsingPOST**
> PlanResponse unpublishUsingPOST(planId)

unpublish

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PlanUiResourceApi apiInstance = new PlanUiResourceApi();
String planId = "planId_example"; // String | planId
try {
    PlanResponse result = apiInstance.unpublishUsingPOST(planId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#unpublishUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planId** | **String**| planId |

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateUsingPOST1"></a>
# **updateUsingPOST1**
> PlanResponse updateUsingPOST1(planId, planReq)

update

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PlanUiResourceApi apiInstance = new PlanUiResourceApi();
String planId = "planId_example"; // String | planId
PlanRequest planReq = new PlanRequest(); // PlanRequest | planReq
try {
    PlanResponse result = apiInstance.updateUsingPOST1(planId, planReq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#updateUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **planId** | **String**| planId |
 **planReq** | [**PlanRequest**](PlanRequest.md)| planReq |

### Return type

[**PlanResponse**](PlanResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

