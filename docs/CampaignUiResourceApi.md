# CampaignUiResourceApi

All URIs are relative to *https://https://prompto.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**deleteUsingPOST**](CampaignUiResourceApi.md#deleteUsingPOST) | **POST** /api/v1/campaigns/{campaignId}/stop | delete
[**getUsingGET**](CampaignUiResourceApi.md#getUsingGET) | **GET** /api/v1/campaigns/{campaignId} | get
[**listUsingGET**](CampaignUiResourceApi.md#listUsingGET) | **GET** /api/v1/campaigns | list
[**publishUsingPOST**](CampaignUiResourceApi.md#publishUsingPOST) | **POST** /api/v1/campaigns/{campaignId}/publish | publish
[**saveUsingPOST**](CampaignUiResourceApi.md#saveUsingPOST) | **POST** /api/v1/campaigns | save
[**unpublishUsingPOST**](CampaignUiResourceApi.md#unpublishUsingPOST) | **POST** /api/v1/campaigns/{campaignId}/invite | unpublish
[**unpublishUsingPOST1**](CampaignUiResourceApi.md#unpublishUsingPOST1) | **POST** /api/v1/campaigns/{campaignId}/unpublish | unpublish
[**updateUsingPOST**](CampaignUiResourceApi.md#updateUsingPOST) | **POST** /api/v1/campaigns/{campaignId} | update


<a name="deleteUsingPOST"></a>
# **deleteUsingPOST**
> CampaignResponse deleteUsingPOST(campaignId)

delete

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.CampaignUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

CampaignUiResourceApi apiInstance = new CampaignUiResourceApi(defaultClient);
String campaignId = "campaignId_example"; // String | campaignId
try {
    CampaignResponse result = apiInstance.deleteUsingPOST(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignUiResourceApi#deleteUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| campaignId |

### Return type

[**CampaignResponse**](CampaignResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsingGET"></a>
# **getUsingGET**
> CampaignResponse getUsingGET(campaignId)

get

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.CampaignUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

CampaignUiResourceApi apiInstance = new CampaignUiResourceApi(defaultClient);
String campaignId = "campaignId_example"; // String | campaignId
try {
    CampaignResponse result = apiInstance.getUsingGET(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignUiResourceApi#getUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| campaignId |

### Return type

[**CampaignResponse**](CampaignResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET"></a>
# **listUsingGET**
> CampaignListResponse listUsingGET(limit, offset, q)

list

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.CampaignUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

CampaignUiResourceApi apiInstance = new CampaignUiResourceApi(defaultClient);
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    CampaignListResponse result = apiInstance.listUsingGET(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignUiResourceApi#listUsingGET");
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

[**CampaignListResponse**](CampaignListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="publishUsingPOST"></a>
# **publishUsingPOST**
> CampaignResponse publishUsingPOST(campaignId)

publish

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.CampaignUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

CampaignUiResourceApi apiInstance = new CampaignUiResourceApi(defaultClient);
String campaignId = "campaignId_example"; // String | campaignId
try {
    CampaignResponse result = apiInstance.publishUsingPOST(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignUiResourceApi#publishUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| campaignId |

### Return type

[**CampaignResponse**](CampaignResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="saveUsingPOST"></a>
# **saveUsingPOST**
> CampaignResponse saveUsingPOST(request)

save

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.CampaignUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

CampaignUiResourceApi apiInstance = new CampaignUiResourceApi(defaultClient);
CampaignRequest request = new CampaignRequest(); // CampaignRequest | request
try {
    CampaignResponse result = apiInstance.saveUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignUiResourceApi#saveUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CampaignRequest**](CampaignRequest.md)| request |

### Return type

[**CampaignResponse**](CampaignResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="unpublishUsingPOST"></a>
# **unpublishUsingPOST**
> RestResponse unpublishUsingPOST(campaignId, req)

unpublish

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.CampaignUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

CampaignUiResourceApi apiInstance = new CampaignUiResourceApi(defaultClient);
String campaignId = "campaignId_example"; // String | campaignId
InviteRequest req = new InviteRequest(); // InviteRequest | req
try {
    RestResponse result = apiInstance.unpublishUsingPOST(campaignId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignUiResourceApi#unpublishUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| campaignId |
 **req** | [**InviteRequest**](InviteRequest.md)| req |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="unpublishUsingPOST1"></a>
# **unpublishUsingPOST1**
> CampaignResponse unpublishUsingPOST1(campaignId)

unpublish

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.CampaignUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

CampaignUiResourceApi apiInstance = new CampaignUiResourceApi(defaultClient);
String campaignId = "campaignId_example"; // String | campaignId
try {
    CampaignResponse result = apiInstance.unpublishUsingPOST1(campaignId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignUiResourceApi#unpublishUsingPOST1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| campaignId |

### Return type

[**CampaignResponse**](CampaignResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="updateUsingPOST"></a>
# **updateUsingPOST**
> CampaignResponse updateUsingPOST(campaignId, request)

update

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.CampaignUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

CampaignUiResourceApi apiInstance = new CampaignUiResourceApi(defaultClient);
String campaignId = "campaignId_example"; // String | campaignId
CampaignRequest request = new CampaignRequest(); // CampaignRequest | request
try {
    CampaignResponse result = apiInstance.updateUsingPOST(campaignId, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling CampaignUiResourceApi#updateUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **campaignId** | **String**| campaignId |
 **request** | [**CampaignRequest**](CampaignRequest.md)| request |

### Return type

[**CampaignResponse**](CampaignResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

