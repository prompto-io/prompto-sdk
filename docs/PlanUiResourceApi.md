# PlanUiResourceApi

All URIs are relative to *https://https://prompto.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUsingPOST2**](PlanUiResourceApi.md#deleteUsingPOST2) | **POST** /api/v1/plans/{planId}/delete | delete
[**getUsingGET3**](PlanUiResourceApi.md#getUsingGET3) | **GET** /api/v1/plans/{planId} | get
[**listUsingGET5**](PlanUiResourceApi.md#listUsingGET5) | **GET** /api/v1/plans | list
[**publishUsingPOST1**](PlanUiResourceApi.md#publishUsingPOST1) | **POST** /api/v1/plans/{planId}/publish | publish
[**saveUsingPOST1**](PlanUiResourceApi.md#saveUsingPOST1) | **POST** /api/v1/plans | save
[**unpublishUsingPOST2**](PlanUiResourceApi.md#unpublishUsingPOST2) | **POST** /api/v1/plans/{planId}/unpublish | unpublish
[**updateUsingPOST2**](PlanUiResourceApi.md#updateUsingPOST2) | **POST** /api/v1/plans/{planId} | update


<a name="deleteUsingPOST2"></a>
# **deleteUsingPOST2**
> RestResponse deleteUsingPOST2(planId)

delete

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PlanUiResourceApi apiInstance = new PlanUiResourceApi(defaultClient);
String planId = "planId_example"; // String | planId
try {
    RestResponse result = apiInstance.deleteUsingPOST2(planId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#deleteUsingPOST2");
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

<a name="getUsingGET3"></a>
# **getUsingGET3**
> PlanResponse getUsingGET3(planId)

get

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PlanUiResourceApi apiInstance = new PlanUiResourceApi(defaultClient);
String planId = "planId_example"; // String | planId
try {
    PlanResponse result = apiInstance.getUsingGET3(planId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#getUsingGET3");
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

<a name="listUsingGET5"></a>
# **listUsingGET5**
> PlanListResponse listUsingGET5(limit, offset, q)

list

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PlanUiResourceApi apiInstance = new PlanUiResourceApi(defaultClient);
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    PlanListResponse result = apiInstance.listUsingGET5(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#listUsingGET5");
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

<a name="publishUsingPOST1"></a>
# **publishUsingPOST1**
> PlanResponse publishUsingPOST1(planId)

publish

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PlanUiResourceApi apiInstance = new PlanUiResourceApi(defaultClient);
String planId = "planId_example"; // String | planId
try {
    PlanResponse result = apiInstance.publishUsingPOST1(planId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#publishUsingPOST1");
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

<a name="saveUsingPOST1"></a>
# **saveUsingPOST1**
> PlanResponse saveUsingPOST1(planReq)

save

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PlanUiResourceApi apiInstance = new PlanUiResourceApi(defaultClient);
PlanRequest planReq = new PlanRequest(); // PlanRequest | planReq
try {
    PlanResponse result = apiInstance.saveUsingPOST1(planReq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#saveUsingPOST1");
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

<a name="unpublishUsingPOST2"></a>
# **unpublishUsingPOST2**
> PlanResponse unpublishUsingPOST2(planId)

unpublish

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PlanUiResourceApi apiInstance = new PlanUiResourceApi(defaultClient);
String planId = "planId_example"; // String | planId
try {
    PlanResponse result = apiInstance.unpublishUsingPOST2(planId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#unpublishUsingPOST2");
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

<a name="updateUsingPOST2"></a>
# **updateUsingPOST2**
> PlanResponse updateUsingPOST2(planId, planReq)

update

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PlanUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PlanUiResourceApi apiInstance = new PlanUiResourceApi(defaultClient);
String planId = "planId_example"; // String | planId
PlanRequest planReq = new PlanRequest(); // PlanRequest | planReq
try {
    PlanResponse result = apiInstance.updateUsingPOST2(planId, planReq);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PlanUiResourceApi#updateUsingPOST2");
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

