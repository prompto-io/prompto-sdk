
# Subscription

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**activeDate** | **Long** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**branchId** | **String** |  |  [optional]
**company** | **String** |  |  [optional]
**createDate** | **Long** |  |  [optional]
**currency** | **String** |  |  [optional]
**delinquentDate** | **Long** |  |  [optional]
**discount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**endDate** | **Long** |  |  [optional]
**externalMetadata** | **String** |  |  [optional]
**goodUntil** | **Long** |  |  [optional]
**gracePeriod** | **Integer** |  |  [optional]
**gracePeriodUnit** | [**GracePeriodUnitEnum**](#GracePeriodUnitEnum) |  |  [optional]
**grandTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]
**metadata** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**nextBillingCycle** | **Long** |  |  [optional]
**others** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**partnerId** | **String** |  |  [optional]
**paymentMethodId** | **String** |  |  [optional]
**paymentNumber** | **Integer** |  |  [optional]
**period** | **Integer** |  |  [optional]
**periodUnit** | [**PeriodUnitEnum**](#PeriodUnitEnum) |  |  [optional]
**planId** | **String** |  |  [optional]
**planType** | [**PlanTypeEnum**](#PlanTypeEnum) |  |  [optional]
**purchaseOrder** | **String** |  |  [optional]
**reason** | **String** |  |  [optional]
**startDate** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**terminationDate** | **Long** |  |  [optional]
**userFullName** | **String** |  |  [optional]
**userId** | **String** |  |  [optional]


<a name="GracePeriodUnitEnum"></a>
## Enum: GracePeriodUnitEnum
Name | Value
---- | -----
DAY | &quot;DAY&quot;
WEEK | &quot;WEEK&quot;
MONTH | &quot;MONTH&quot;
YEAR | &quot;YEAR&quot;


<a name="PeriodUnitEnum"></a>
## Enum: PeriodUnitEnum
Name | Value
---- | -----
DAY | &quot;DAY&quot;
WEEK | &quot;WEEK&quot;
MONTH | &quot;MONTH&quot;
YEAR | &quot;YEAR&quot;


<a name="PlanTypeEnum"></a>
## Enum: PlanTypeEnum
Name | Value
---- | -----
ONE_TIME | &quot;ONE_TIME&quot;
RECURRING | &quot;RECURRING&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
INACTIVE | &quot;INACTIVE&quot;
ACTIVE | &quot;ACTIVE&quot;
DELINQUENT | &quot;DELINQUENT&quot;
SUSPENDED | &quot;SUSPENDED&quot;
CANCELED | &quot;CANCELED&quot;
FINISHED | &quot;FINISHED&quot;



