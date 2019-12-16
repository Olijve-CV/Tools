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
class AppliedPromotion {
 
    
    @JsonProperty(value = JsonConstants.DESCRIPTION)
    val description: String? = null
    
    @JsonProperty(value = JsonConstants.DISCOUNTAMOUNT)
    val discountAmount: DiscountAmount? = null
    
    @JsonProperty(value = JsonConstants.PROMOTIONID)
    val promotionId: String? = null
    
}
        