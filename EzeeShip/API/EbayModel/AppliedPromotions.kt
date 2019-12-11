package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class appliedPromotions {
 
    
    @JsonProperty(value = JsonConstants.DESCRIPTION)
    val description: String? = null
    
    @JsonProperty(value = JsonConstants.DISCOUNTAMOUNT)
    val discountAmount: DiscountAmount? = null
    
    @JsonProperty(value = JsonConstants.PROMOTIONID)
    val promotionId: String? = null
    
}
        