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
    var description: String? = null
    
    @JsonProperty(value = JsonConstants.DISCOUNTAMOUNT)
    var discountAmount: DiscountAmount? = null
    
    @JsonProperty(value = JsonConstants.PROMOTIONID)
    var promotionId: String? = null
    
}
        