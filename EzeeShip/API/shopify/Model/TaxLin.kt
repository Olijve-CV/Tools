package com.apex.shopify.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data
import java.math.BigDecimal
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.apex.util.FlexDateDeserializer
import com.apex.util.FlexDateSerializer
import java.util.Date

@Data
class Tax_lin_1 {
 
    
    @JsonProperty(value = JsonConstants.PRICE)
    val price: BigDecimal? = null
    
    @JsonProperty(value = JsonConstants.RATE)
    val rate: BigDecimal? = null
    
    @JsonProperty(value = JsonConstants.TITLE)
    val title: String? = null
    
}
        