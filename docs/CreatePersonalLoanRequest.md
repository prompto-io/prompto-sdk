
# CreatePersonalLoanRequest

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**chargeInitialPayment** | **Boolean** |  |  [optional]
**initialPayment** | [**BigDecimal**](BigDecimal.md) |  |  [optional]
**initialPaymentMethodType** | [**InitialPaymentMethodTypeEnum**](#InitialPaymentMethodTypeEnum) |  |  [optional]
**loan** | [**PersonalLoan**](PersonalLoan.md) |  |  [optional]
**timestamp** | **Long** |  |  [optional]


<a name="InitialPaymentMethodTypeEnum"></a>
## Enum: InitialPaymentMethodTypeEnum
Name | Value
---- | -----
CREDIT_CARD | &quot;CREDIT_CARD&quot;
ACH | &quot;ACH&quot;
POS | &quot;POS&quot;
CASH | &quot;CASH&quot;
CHECK | &quot;CHECK&quot;



