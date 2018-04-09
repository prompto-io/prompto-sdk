
# PersonalLoan

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**balance** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**branchId** | **String** |  |  [optional]
**company** | **String** |  |  [optional]
**createDate** | **Long** |  |  [optional]
**currency** | **String** |  |  [optional]
**delinquentDate** | **Long** |  |  [optional]
**duration** | **Integer** |  |  [optional]
**endDate** | **Long** |  |  [optional]
**frequency** | **Integer** |  |  [optional]
**frequencyUnit** | [**FrequencyUnitEnum**](#FrequencyUnitEnum) |  |  [optional]
**gracePeriod** | **Integer** |  |  [optional]
**gracePeriodUnit** | [**GracePeriodUnitEnum**](#GracePeriodUnitEnum) |  |  [optional]
**initialPayment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**interestRate** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]
**metadata** | **String** |  |  [optional]
**name** | **String** |  |  [optional]
**nextBillingCycle** | **Long** |  |  [optional]
**partnerId** | **String** |  |  [optional]
**paymentMethodId** | **String** |  |  [optional]
**paymentPerPeriod** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**paymentsRemaining** | **Integer** |  |  [optional]
**period** | **Integer** |  |  [optional]
**principal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**purchaseOrder** | **String** |  |  [optional]
**startDate** | **Long** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**terminationDate** | **Long** |  |  [optional]
**userFullName** | **String** |  |  [optional]
**userId** | **String** |  |  [optional]


<a name="FrequencyUnitEnum"></a>
## Enum: FrequencyUnitEnum
Name | Value
---- | -----
DAY | &quot;DAY&quot;
WEEK | &quot;WEEK&quot;
MONTH | &quot;MONTH&quot;
YEAR | &quot;YEAR&quot;


<a name="GracePeriodUnitEnum"></a>
## Enum: GracePeriodUnitEnum
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
PENDING | &quot;PENDING&quot;
ACTIVE | &quot;ACTIVE&quot;
DELINQUENT | &quot;DELINQUENT&quot;
PAID | &quot;PAID&quot;



