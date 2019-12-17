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
class Shop_money {
 
    
    @JsonProperty(value = JsonConstants.AMOUNT)
    val amount: String? = null
    
    @JsonProperty(value = JsonConstants.CURRENCY_CODE)
    val currencyCode: String? = null
    
}
        