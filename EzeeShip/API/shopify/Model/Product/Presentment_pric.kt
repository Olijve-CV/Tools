package com.apex.shopify.domain.product

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data
import java.math.BigDecimal
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.apex.util.FlexDateDeserializer
import com.apex.util.FlexDateSerializer
import java.util.Date

@Data
class Presentment_pric {
 
    
    @JsonProperty(value = JsonConstants.PRICE)
    var price: Price? = null
    
    @JsonProperty(value = JsonConstants.COMPARE_AT_PRICE)
    var compare_at_price: String? = null
    
}
        