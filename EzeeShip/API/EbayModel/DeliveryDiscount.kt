package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class deliveryDiscount {
 
    
    @JsonProperty(value = JsonConstants.CONVERTEDFROMCURRENCY)
    val convertedFromCurrency: Int? = null
    
    @JsonProperty(value = JsonConstants.CONVERTEDFROMVALUE)
    val convertedFromValue: String? = null
    
    @JsonProperty(value = JsonConstants.CURRENCY)
    val currency: Int? = null
    
    @JsonProperty(value = JsonConstants.VALUE)
    val value: BigDecimal? = null
    
}
        