
# Plan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**branchId** | **String** |  |  [optional]
**createDate** | **Long** |  |  [optional]
**currency** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**discount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**gracePeriod** | **Integer** |  |  [optional]
**gracePeriodUnit** | [**GracePeriodUnitEnum**](#GracePeriodUnitEnum) |  |  [optional]
**grandTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]
**locked** | **Boolean** |  |  [optional]
**maxSubcriber** | **Long** |  |  [optional]
**metadata** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**others** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**partnerId** | **String** |  |  [optional]
**period** | **Integer** |  |  [optional]
**periodUnit** | [**PeriodUnitEnum**](#PeriodUnitEnum) |  |  [optional]
**planType** | [**PlanTypeEnum**](#PlanTypeEnum) |  |  [optional]
**prefered** | **Boolean** |  |  [optional]
**priority** | **Integer** |  |  [optional]
**published** | **Boolean** |  |  [optional]


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



