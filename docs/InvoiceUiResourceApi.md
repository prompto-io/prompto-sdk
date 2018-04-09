# InvoiceUiResourceApi

All URIs are relative to *https://https://prompto.io/api*

Method | HTTP request | Description
------------- | ------------- | -------------
[**attachFileUsingPOST**](InvoiceUiResourceApi.md#attachFileUsingPOST) | **POST** /api/v1/invoices/{invoiceId}/attach | attachFile
[**cancelInvoiceUsingPOST**](InvoiceUiResourceApi.md#cancelInvoiceUsingPOST) | **POST** /api/v1/invoices/{invoiceId}/cancel | cancelInvoice
[**clearInvoiceUsingPOST**](InvoiceUiResourceApi.md#clearInvoiceUsingPOST) | **POST** /api/v1/invoices/{invoiceId}/clear | clearInvoice
[**createInvoiceUsingPOST**](InvoiceUiResourceApi.md#createInvoiceUsingPOST) | **POST** /api/v1/invoices/create | createInvoice
[**downloadUsingGET**](InvoiceUiResourceApi.md#downloadUsingGET) | **GET** /api/v1/invoices/{invoiceId}/pdf | download
[**getDetailUsingGET**](InvoiceUiResourceApi.md#getDetailUsingGET) | **GET** /api/v1/invoices/{invoiceId} | getDetail
[**listUsingGET3**](InvoiceUiResourceApi.md#listUsingGET3) | **GET** /api/v1/invoices | list


<a name="attachFileUsingPOST"></a>
# **attachFileUsingPOST**
> RestResponse attachFileUsingPOST(invoiceId, file)

attachFile

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InvoiceUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

InvoiceUiResourceApi apiInstance = new InvoiceUiResourceApi(defaultClient);
String invoiceId = "invoiceId_example"; // String | invoiceId
File file = new File("/path/to/file.txt"); // File | file
try {
    RestResponse result = apiInstance.attachFileUsingPOST(invoiceId, file);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceUiResourceApi#attachFileUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **String**| invoiceId |
 **file** | **File**| file | [optional]

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: multipart/form-data
 - **Accept**: */*

<a name="cancelInvoiceUsingPOST"></a>
# **cancelInvoiceUsingPOST**
> RestResponse cancelInvoiceUsingPOST(invoiceId)

cancelInvoice

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InvoiceUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

InvoiceUiResourceApi apiInstance = new InvoiceUiResourceApi(defaultClient);
String invoiceId = "invoiceId_example"; // String | invoiceId
try {
    RestResponse result = apiInstance.cancelInvoiceUsingPOST(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceUiResourceApi#cancelInvoiceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **String**| invoiceId |

### Return type

[**RestResponse**](RestResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="clearInvoiceUsingPOST"></a>
# **clearInvoiceUsingPOST**
> InvoiceClearedResponse clearInvoiceUsingPOST(invoiceId, req)

clearInvoice

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InvoiceUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

InvoiceUiResourceApi apiInstance = new InvoiceUiResourceApi(defaultClient);
String invoiceId = "invoiceId_example"; // String | invoiceId
ClearInvoiceRequest req = new ClearInvoiceRequest(); // ClearInvoiceRequest | req
try {
    InvoiceClearedResponse result = apiInstance.clearInvoiceUsingPOST(invoiceId, req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceUiResourceApi#clearInvoiceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **String**| invoiceId |
 **req** | [**ClearInvoiceRequest**](ClearInvoiceRequest.md)| req |

### Return type

[**InvoiceClearedResponse**](InvoiceClearedResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="createInvoiceUsingPOST"></a>
# **createInvoiceUsingPOST**
> InvoiceResponse createInvoiceUsingPOST(req)

createInvoice

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InvoiceUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

InvoiceUiResourceApi apiInstance = new InvoiceUiResourceApi(defaultClient);
CreateInvoiceRequest req = new CreateInvoiceRequest(); // CreateInvoiceRequest | req
try {
    InvoiceResponse result = apiInstance.createInvoiceUsingPOST(req);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceUiResourceApi#createInvoiceUsingPOST");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **req** | [**CreateInvoiceRequest**](CreateInvoiceRequest.md)| req |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="downloadUsingGET"></a>
# **downloadUsingGET**
> ByteArrayResource downloadUsingGET(invoiceId)

download

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InvoiceUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

InvoiceUiResourceApi apiInstance = new InvoiceUiResourceApi(defaultClient);
String invoiceId = "invoiceId_example"; // String | invoiceId
try {
    ByteArrayResource result = apiInstance.downloadUsingGET(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceUiResourceApi#downloadUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **String**| invoiceId |

### Return type

[**ByteArrayResource**](ByteArrayResource.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="getDetailUsingGET"></a>
# **getDetailUsingGET**
> InvoiceResponse getDetailUsingGET(invoiceId)

getDetail

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InvoiceUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

InvoiceUiResourceApi apiInstance = new InvoiceUiResourceApi(defaultClient);
String invoiceId = "invoiceId_example"; // String | invoiceId
try {
    InvoiceResponse result = apiInstance.getDetailUsingGET(invoiceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceUiResourceApi#getDetailUsingGET");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **invoiceId** | **String**| invoiceId |

### Return type

[**InvoiceResponse**](InvoiceResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

<a name="listUsingGET3"></a>
# **listUsingGET3**
> InvoiceListResponse listUsingGET3(limit, offset, q)

list

### Example
```java
// Import classes:
//import io.prompto.sdk.api.ApiClient;
//import io.prompto.sdk.api.ApiException;
//import io.prompto.sdk.api.Configuration;
//import io.prompto.sdk.api.auth.*;
//import io.prompto.sdk.api.InvoiceUiResourceApi;

      ApiClient defaultClient = new ApiClient("<partner>", "<apikey>", "<secretKey");

InvoiceUiResourceApi apiInstance = new InvoiceUiResourceApi(defaultClient);
Integer limit = 25; // Integer | limit
Integer offset = 0; // Integer | offset
String q = "q_example"; // String | q
try {
    InvoiceListResponse result = apiInstance.listUsingGET3(limit, offset, q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling InvoiceUiResourceApi#listUsingGET3");
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

[**InvoiceListResponse**](InvoiceListResponse.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: */*

