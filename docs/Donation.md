
# Donation

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**branchId** | **String** |  |  [optional]
**campaignDescription** | **String** |  |  [optional]
**campaignId** | **String** |  |  [optional]
**campaignName** | **String** |  |  [optional]
**company** | **String** |  |  [optional]
**createDate** | **Long** |  |  [optional]
**currency** | **String** |  |  [optional]
**donationType** | [**DonationTypeEnum**](#DonationTypeEnum) |  |  [optional]
**dueDate** | **Long** |  |  [optional]
**externalMetadata** | **String** |  |  [optional]
**grandTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]
**metadata** | **String** |  |  [optional]
**nextBillingCycle** | **Long** |  |  [optional]
**partnerId** | **String** |  |  [optional]
**paymentMethodId** | **String** |  |  [optional]
**paymentNumber** | **Integer** |  |  [optional]
**period** | **Integer** |  |  [optional]
**periodUnit** | [**PeriodUnitEnum**](#PeriodUnitEnum) |  |  [optional]
**purchaseOrder** | **String** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**userFullName** | **String** |  |  [optional]
**userId** | **String** |  |  [optional]


<a name="DonationTypeEnum"></a>
## Enum: DonationTypeEnum
Name | Value
---- | -----
ONE_TIME | &quot;ONE_TIME&quot;
RECURRING | &quot;RECURRING&quot;


<a name="PeriodUnitEnum"></a>
## Enum: PeriodUnitEnum
Name | Value
---- | -----
DAY | &quot;DAY&quot;
WEEK | &quot;WEEK&quot;
MONTH | &quot;MONTH&quot;
YEAR | &quot;YEAR&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INACTIVE | &quot;INACTIVE&quot;
ACTIVE | &quot;ACTIVE&quot;
SUCCESS | &quot;SUCCESS&quot;
CANCELED | &quot;CANCELED&quot;
FINISHED | &quot;FINISHED&quot;



