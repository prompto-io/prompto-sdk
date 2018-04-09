# UserUiResourceApi

All URIs are relative to *https://https://prompto.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getUsingGET4**](UserUiResourceApi.md#getUsingGET4) | **GET** /api/v1/users/{userId} | get
[**listUsingGET7**](UserUiResourceApi.md#listUsingGET7) | **GET** /api/v1/users | list


<a name="getUsingGET4"></a>
# **getUsingGET4**
> UserResponse getUsingGET4(userId)

get

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.UserUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

UserUiResourceApi apiInstance = new UserUiResourceApi(defaultClient);
String userId = "userId_example"; // String | userId
try {
    UserResponse result = apiInstance.getUsingGET4(userId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#getUsingGET4");
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

<a name="listUsingGET7"></a>
# **listUsingGET7**
> UserListResponse listUsingGET7(limit, offset, q)

list

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.UserUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

UserUiResourceApi apiInstance = new UserUiResourceApi(defaultClient);
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    UserListResponse result = apiInstance.listUsingGET7(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling UserUiResourceApi#listUsingGET7");
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

