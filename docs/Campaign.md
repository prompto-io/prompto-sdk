
# Campaign

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**branchId** | **String** |  |  [optional]
**campaignSupportType** | [**CampaignSupportTypeEnum**](#CampaignSupportTypeEnum) |  |  [optional]
**createDate** | **Long** |  |  [optional]
**currency** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**donatedAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**donatorsCount** | **Long** |  |  [optional]
**endDate** | **Long** |  |  [optional]
**goal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]
**maxAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**metadata** | **String** |  |  [optional]
**minAmount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**name** | **String** |  |  [optional]
**partnerId** | **String** |  |  [optional]
**period** | **Integer** |  |  [optional]
**periodUnit** | [**PeriodUnitEnum**](#PeriodUnitEnum) |  |  [optional]
**published** | **Boolean** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**suggestedAmounts** | **String** |  |  [optional]


<a name="CampaignSupportTypeEnum"></a>
## Enum: CampaignSupportTypeEnum
Name | Value
---- | -----
ONE_TIME | &quot;ONE_TIME&quot;
RECURRING | &quot;RECURRING&quot;
BOTH | &quot;BOTH&quot;


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
ACTIVE | &quot;ACTIVE&quot;
STOPPED | &quot;STOPPED&quot;



