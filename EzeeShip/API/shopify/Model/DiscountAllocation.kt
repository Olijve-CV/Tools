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
class Discount_allocation {
 
    
    @JsonProperty(value = JsonConstants.AMOUNT)
    val amount: String? = null
    
    @JsonProperty(value = JsonConstants.DISCOUNT_APPLICATION_INDEX)
    val discountApplicationIndex: Int? = null
    
    @JsonProperty(value = JsonConstants.AMOUNT_SET)
    val amountSet: AmountSet? = null
    
}
        