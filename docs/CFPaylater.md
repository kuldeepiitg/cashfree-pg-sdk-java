

# CFPaylater


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channel** | **String** | The channel for cardless EMI is always &#x60;link&#x60; |  |
|**provider** | [**ProviderEnum**](#ProviderEnum) | One of [\&quot;kotak\&quot;, \&quot;flexipay\&quot;, \&quot;zestmoney\&quot;, \&quot;lazypay\&quot;, \&quot;olapostpaid\&quot;]. Please note that Flexipay is offered by HDFC bank |  |
|**phone** | **String** | Customers phone number for this payment instrument. If the customer is not eligible you will receive a 400 error with type as &#39;invalid_request_error&#39; and code as &#39;invalid_request_error&#39; |  |



## Enum: ProviderEnum

| Name | Value |
|---- | -----|
| KOTAK | &quot;kotak&quot; |
| FLEXIPAY | &quot;flexipay&quot; |
| ZESTMONEY | &quot;zestmoney&quot; |
| LAZYPAY | &quot;lazypay&quot; |
| OLAPOSTPAID | &quot;olapostpaid&quot; |



