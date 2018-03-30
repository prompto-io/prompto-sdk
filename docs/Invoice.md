
# Invoice

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**id** | **String** |  |  [optional]
**amount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**branchId** | **String** |  |  [optional]
**company** | **String** |  |  [optional]
**concept** | [**ConceptEnum**](#ConceptEnum) |  |  [optional]
**createDate** | **Long** |  |  [optional]
**currency** | **String** |  |  [optional]
**description** | **String** |  |  [optional]
**discount** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**dueDate** | **Long** |  |  [optional]
**expires** | **Long** |  |  [optional]
**fromDate** | **Long** |  |  [optional]
**grandTotal** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**interest** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**links** | [**List&lt;Link&gt;**](Link.md) |  |  [optional]
**masterInvoice** | **String** |  |  [optional]
**metadata** | **String** |  |  [optional]
**others** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**owner** | **String** |  |  [optional]
**ownerEmail** | **String** |  |  [optional]
**paidDate** | **Long** |  |  [optional]
**partnerId** | **String** |  |  [optional]
**paymentMethodId** | **String** |  |  [optional]
**paymentMethodType** | [**PaymentMethodTypeEnum**](#PaymentMethodTypeEnum) |  |  [optional]
**paymentNumber** | **Integer** |  |  [optional]
**productReferenceId** | **String** |  |  [optional]
**productType** | [**ProductTypeEnum**](#ProductTypeEnum) |  |  [optional]
**purchaseOrder** | **String** |  |  [optional]
**retries** | **Integer** |  |  [optional]
**sandbox** | **Boolean** |  |  [optional]
**status** | [**StatusEnum**](#StatusEnum) |  |  [optional]
**tax** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**toDate** | **Long** |  |  [optional]


<a name="ConceptEnum"></a>
## Enum: ConceptEnum
Name | Value
---- | -----
INITIAL_PAYMENT | &quot;INITIAL_PAYMENT&quot;
SCHEDULED_PAYMENT | &quot;SCHEDULED_PAYMENT&quot;
ADVANCE_PAYMENT | &quot;ADVANCE_PAYMENT&quot;
FEE_PAYMENT | &quot;FEE_PAYMENT&quot;


<a name="PaymentMethodTypeEnum"></a>
## Enum: PaymentMethodTypeEnum
Name | Value
---- | -----
CREDIT_CARD | &quot;CREDIT_CARD&quot;
ACH | &quot;ACH&quot;
POS | &quot;POS&quot;
CASH | &quot;CASH&quot;
CHECK | &quot;CHECK&quot;


<a name="ProductTypeEnum"></a>
## Enum: ProductTypeEnum
Name | Value
---- | -----
DONATION | &quot;DONATION&quot;
SUBSCRIPTION | &quot;SUBSCRIPTION&quot;
LOAN | &quot;LOAN&quot;
PARTNER_BILLING | &quot;PARTNER_BILLING&quot;
OTHER | &quot;OTHER&quot;


<a name="StatusEnum"></a>
## Enum: StatusEnum
Name | Value
---- | -----
UNAPPROVED | &quot;UNAPPROVED&quot;
PENDING | &quot;PENDING&quot;
PROCESSING_PAYMENT | &quot;PROCESSING_PAYMENT&quot;
FAILED | &quot;FAILED&quot;
EXPIRED | &quot;EXPIRED&quot;
CANCELED | &quot;CANCELED&quot;
PAID | &quot;PAID&quot;
DISPUTED | &quot;DISPUTED&quot;



