# PartnerUserUiResourceApi

All URIs are relative to *https://https://prompto.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateUsingPOST**](PartnerUserUiResourceApi.md#activateUsingPOST) | **POST** /api/v1/partner-users/{userId}/activate | activate
[**createUsingPOST1**](PartnerUserUiResourceApi.md#createUsingPOST1) | **POST** /api/v1/partner-users | create
[**deactivateUsingPOST**](PartnerUserUiResourceApi.md#deactivateUsingPOST) | **POST** /api/v1/partner-users/{userId}/deactivate | deactivate
[**deleteUsingPOST1**](PartnerUserUiResourceApi.md#deleteUsingPOST1) | **POST** /api/v1/partner-users/{userId}/delete | delete
[**getUsingGET2**](PartnerUserUiResourceApi.md#getUsingGET2) | **GET** /api/v1/partner-users/{userId} | get
[**listUsingGET4**](PartnerUserUiResourceApi.md#listUsingGET4) | **GET** /api/v1/partner-users | list
[**updateUsingPOST1**](PartnerUserUiResourceApi.md#updateUsingPOST1) | **POST** /api/v1/partner-users/{userId} | update


<a name="activateUsingPOST"></a>
# **activateUsingPOST**
> PartnerUserResponse activateUsingPOST(userId)

activate

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PartnerUserUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
try {
    PartnerUserResponse result = apiInstance.activateUsingPOST(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUserUiResourceApi#activateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |

### Return type

[**PartnerUserResponse**](PartnerUserResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createUsingPOST1"></a>
# **createUsingPOST1**
> PartnerUserResponse createUsingPOST1(req)

create

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PartnerUserUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi(defaultClient);
PartnerUserRequest req = new PartnerUserRequest(); // PartnerUserRequest | req
try {
    PartnerUserResponse result = apiInstance.createUsingPOST1(req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUserUiResourceApi#createUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**PartnerUserRequest**](PartnerUserRequest.md)| req |

### Return type

[**PartnerUserResponse**](PartnerUserResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deactivateUsingPOST"></a>
# **deactivateUsingPOST**
> PartnerUserResponse deactivateUsingPOST(userId)

deactivate

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PartnerUserUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
try {
    PartnerUserResponse result = apiInstance.deactivateUsingPOST(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUserUiResourceApi#deactivateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |

### Return type

[**PartnerUserResponse**](PartnerUserResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="deleteUsingPOST1"></a>
# **deleteUsingPOST1**
> RestResponse deleteUsingPOST1(userId)

delete

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PartnerUserUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
try {
    RestResponse result = apiInstance.deleteUsingPOST1(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUserUiResourceApi#deleteUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsingGET2"></a>
# **getUsingGET2**
> PartnerUserResponse getUsingGET2(userId)

get

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PartnerUserUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
try {
    PartnerUserResponse result = apiInstance.getUsingGET2(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUserUiResourceApi#getUsingGET2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |

### Return type

[**PartnerUserResponse**](PartnerUserResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET4"></a>
# **listUsingGET4**
> PartnerUserListResponse listUsingGET4(limit, offset, q)

list

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PartnerUserUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi(defaultClient);
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    PartnerUserListResponse result = apiInstance.listUsingGET4(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUserUiResourceApi#listUsingGET4");
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

[**PartnerUserListResponse**](PartnerUserListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateUsingPOST1"></a>
# **updateUsingPOST1**
> PartnerUserResponse updateUsingPOST1(userId, req)

update

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PartnerUserUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
PartnerUserRequest req = new PartnerUserRequest(); // PartnerUserRequest | req
try {
    PartnerUserResponse result = apiInstance.updateUsingPOST1(userId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUserUiResourceApi#updateUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |
 **req** | [**PartnerUserRequest**](PartnerUserRequest.md)| req |

### Return type

[**PartnerUserResponse**](PartnerUserResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

