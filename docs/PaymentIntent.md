
# PaymentIntent

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**ach** | [**ACHMethod**](ACHMethod.md) |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**branchId** | **String** |  |  [optional]
**createDate** | **Long** |  |  [optional]
**creditCard** | [**CreditCardMethod**](CreditCardMethod.md) |  |  [optional]
**currency** | **String** |  |  [optional]
**errorCode** | **String** |  |  [optional]
**errorMessage** | **String** |  |  [optional]
**gatewayType** | [**GatewayTypeEnum**](#GatewayTypeEnum) |  |  [optional]
**invoiceId** | **String** |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]
**method** | [**MethodEnum**](#MethodEnum) |  |  [optional]
**owner** | **String** |  |  [optional]
**partnerId** | **String** |  |  [optional]
**paymentId** | **String** |  |  [optional]
**processedDate** | **Long** |  |  [optional]
**sandbox** | **Boolean** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]


<a name="GatewayTypeEnum"></a>
## Enum: GatewayTypeEnum
Name | Value
---- | -----
PAYMENT_SPRING | &quot;PAYMENT_SPRING&quot;
STRIPE | &quot;STRIPE&quot;
OPENPAY | &quot;OPENPAY&quot;


<a name="MethodEnum"></a>
## Enum: MethodEnum
Name | Value
---- | -----
CREDIT_CARD | &quot;CREDIT_CARD&quot;
ACH | &quot;ACH&quot;
POS | &quot;POS&quot;
CASH | &quot;CASH&quot;
CHECK | &quot;CHECK&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
IN_PROGRESS | &quot;IN_PROGRESS&quot;
COMPLETED | &quot;COMPLETED&quot;
FAILED | &quot;FAILED&quot;



