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
class Price {
 
    
    @JsonProperty(value = JsonConstants.CURRENCY_CODE)
    var currency_code: String? = null
    
    @JsonProperty(value = JsonConstants.AMOUNT)
    var amount: String? = null
    
}
        