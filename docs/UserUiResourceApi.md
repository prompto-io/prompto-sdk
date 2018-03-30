# UserUiResourceApi

All URIs are relative to *https://localhost:8080/web-ui-api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsingGET3**](UserUiResourceApi.md#getUsingGET3) | **GET** /api/v1/users/{userId} | get
[**listUsingGET3**](UserUiResourceApi.md#listUsingGET3) | **GET** /api/v1/users | list


<a name="getUsingGET3"></a>
# **getUsingGET3**
> UserResponse getUsingGET3(userId)

get

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.UserUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

UserUiResourceApi apiInstance = new UserUiResourceApi();
String userId = "userId_example"; // String | userId
try {
    UserResponse result = apiInstance.getUsingGET3(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#getUsingGET3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **userId** | **String**| userId |

### Return type

[**UserResponse**](UserResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET3"></a>
# **listUsingGET3**
> UserListResponse listUsingGET3(limit, offset, q)

list

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.UserUiResourceApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: Authorization
ApiKeyAuth Authorization = (ApiKeyAuth) defaultClient.getAuthentication("Authorization");
Authorization.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//Authorization.setApiKeyPrefix("Token");

UserUiResourceApi apiInstance = new UserUiResourceApi();
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    UserListResponse result = apiInstance.listUsingGET3(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#listUsingGET3");
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

[**UserListResponse**](UserListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

