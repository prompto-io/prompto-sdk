# PartnerUserUiResourceApi

All URIs are relative to *https://localhost:8080/web-ui-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateUsingPOST**](PartnerUserUiResourceApi.md#activateUsingPOST) | **POST** /api/v1/partner-users/{userId}/activate | activate
[**createUsingPOST**](PartnerUserUiResourceApi.md#createUsingPOST) | **POST** /api/v1/partner-users | create
[**deactivateUsingPOST**](PartnerUserUiResourceApi.md#deactivateUsingPOST) | **POST** /api/v1/partner-users/{userId}/deactivate | deactivate
[**deleteUsingPOST**](PartnerUserUiResourceApi.md#deleteUsingPOST) | **POST** /api/v1/partner-users/{userId}/delete | delete
[**getUsingGET1**](PartnerUserUiResourceApi.md#getUsingGET1) | **GET** /api/v1/partner-users/{userId} | get
[**listUsingGET1**](PartnerUserUiResourceApi.md#listUsingGET1) | **GET** /api/v1/partner-users | list
[**updateUsingPOST**](PartnerUserUiResourceApi.md#updateUsingPOST) | **POST** /api/v1/partner-users/{userId} | update


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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi();
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

<a name="createUsingPOST"></a>
# **createUsingPOST**
> PartnerUserResponse createUsingPOST(req)

create

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PartnerUserUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi();
PartnerUserRequest req = new PartnerUserRequest(); // PartnerUserRequest | req
try {
    PartnerUserResponse result = apiInstance.createUsingPOST(req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUserUiResourceApi#createUsingPOST");
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

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi();
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

<a name="deleteUsingPOST"></a>
# **deleteUsingPOST**
> RestResponse deleteUsingPOST(userId)

delete

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PartnerUserUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi();
String userId = "userId_example"; // String | userId
try {
    RestResponse result = apiInstance.deleteUsingPOST(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUserUiResourceApi#deleteUsingPOST");
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

<a name="getUsingGET1"></a>
# **getUsingGET1**
> PartnerUserResponse getUsingGET1(userId)

get

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PartnerUserUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi();
String userId = "userId_example"; // String | userId
try {
    PartnerUserResponse result = apiInstance.getUsingGET1(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUserUiResourceApi#getUsingGET1");
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

<a name="listUsingGET1"></a>
# **listUsingGET1**
> PartnerUserListResponse listUsingGET1(limit, offset, q)

list

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PartnerUserUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi();
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    PartnerUserListResponse result = apiInstance.listUsingGET1(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUserUiResourceApi#listUsingGET1");
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

<a name="updateUsingPOST"></a>
# **updateUsingPOST**
> PartnerUserResponse updateUsingPOST(userId, req)

update

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.PartnerUserUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

PartnerUserUiResourceApi apiInstance = new PartnerUserUiResourceApi();
String userId = "userId_example"; // String | userId
PartnerUserRequest req = new PartnerUserRequest(); // PartnerUserRequest | req
try {
    PartnerUserResponse result = apiInstance.updateUsingPOST(userId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling PartnerUserUiResourceApi#updateUsingPOST");
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

