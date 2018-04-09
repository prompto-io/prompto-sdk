# InstallmentsUiResourceApi

All URIs are relative to *https://https://prompto.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**advancePaymentUsingPOST**](InstallmentsUiResourceApi.md#advancePaymentUsingPOST) | **POST** /api/v1/installments/{id}/advance-payment | advancePayment
[**createUsingPOST**](InstallmentsUiResourceApi.md#createUsingPOST) | **POST** /api/v1/installments | create
[**getAmortizationUsingGET**](InstallmentsUiResourceApi.md#getAmortizationUsingGET) | **GET** /api/v1/installments/{id}/amortization | getAmortization
[**getUsingGET1**](InstallmentsUiResourceApi.md#getUsingGET1) | **GET** /api/v1/installments/{id} | get
[**listUsingGET2**](InstallmentsUiResourceApi.md#listUsingGET2) | **GET** /api/v1/installments | list


<a name="advancePaymentUsingPOST"></a>
# **advancePaymentUsingPOST**
> PersonalLoanResponse advancePaymentUsingPOST(id, request)

advancePayment

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InstallmentsUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

InstallmentsUiResourceApi apiInstance = new InstallmentsUiResourceApi(defaultClient);
String id = "id_example"; // String | id
AdvanceLoanPaymentRequest request = new AdvanceLoanPaymentRequest(); // AdvanceLoanPaymentRequest | request
try {
    PersonalLoanResponse result = apiInstance.advancePaymentUsingPOST(id, request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentsUiResourceApi#advancePaymentUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |
 **request** | [**AdvanceLoanPaymentRequest**](AdvanceLoanPaymentRequest.md)| request |

### Return type

[**PersonalLoanResponse**](PersonalLoanResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createUsingPOST"></a>
# **createUsingPOST**
> PersonalLoanResponse createUsingPOST(request)

create

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InstallmentsUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

InstallmentsUiResourceApi apiInstance = new InstallmentsUiResourceApi(defaultClient);
CreatePersonalLoanRequest request = new CreatePersonalLoanRequest(); // CreatePersonalLoanRequest | request
try {
    PersonalLoanResponse result = apiInstance.createUsingPOST(request);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentsUiResourceApi#createUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **request** | [**CreatePersonalLoanRequest**](CreatePersonalLoanRequest.md)| request |

### Return type

[**PersonalLoanResponse**](PersonalLoanResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getAmortizationUsingGET"></a>
# **getAmortizationUsingGET**
> AmortizationDetailsResponse getAmortizationUsingGET(id)

getAmortization

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InstallmentsUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

InstallmentsUiResourceApi apiInstance = new InstallmentsUiResourceApi(defaultClient);
String id = "id_example"; // String | id
try {
    AmortizationDetailsResponse result = apiInstance.getAmortizationUsingGET(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentsUiResourceApi#getAmortizationUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**AmortizationDetailsResponse**](AmortizationDetailsResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getUsingGET1"></a>
# **getUsingGET1**
> PersonalLoanResponse getUsingGET1(id)

get

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InstallmentsUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

InstallmentsUiResourceApi apiInstance = new InstallmentsUiResourceApi(defaultClient);
String id = "id_example"; // String | id
try {
    PersonalLoanResponse result = apiInstance.getUsingGET1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentsUiResourceApi#getUsingGET1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| id |

### Return type

[**PersonalLoanResponse**](PersonalLoanResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET2"></a>
# **listUsingGET2**
> PersonalLoanListResponse listUsingGET2(limit, offset, q)

list

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InstallmentsUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

InstallmentsUiResourceApi apiInstance = new InstallmentsUiResourceApi(defaultClient);
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    PersonalLoanListResponse result = apiInstance.listUsingGET2(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InstallmentsUiResourceApi#listUsingGET2");
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

[**PersonalLoanListResponse**](PersonalLoanListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

