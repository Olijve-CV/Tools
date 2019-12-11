package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data
import java.math.BigDecimal
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.apex.util.FlexDateDeserializer
import com.apex.util.FlexDateSerializer
import java.util.Date

@Data
class Total {
 
    
    @JsonProperty(value = JsonConstants.CONVERTEDFROMCURRENCY)
    val convertedFromCurrency: Int? = null
    
    @JsonProperty(value = JsonConstants.CONVERTEDFROMVALUE)
    val convertedFromValue: String? = null
    
    @JsonProperty(value = JsonConstants.CURRENCY)
    val currency: Int? = null
    
    @JsonProperty(value = JsonConstants.VALUE)
    val value: BigDecimal? = null
    
}
        