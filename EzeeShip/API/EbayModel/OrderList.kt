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
class OrderList {
 
    
    @JsonProperty(value = JsonConstants.HREF)
    val href: String? = null
    
    @JsonProperty(value = JsonConstants.LIMIT)
    val limit: Int? = null
    
    @JsonProperty(value = JsonConstants.NEXT)
    val next: String? = null
    
    @JsonProperty(value = JsonConstants.OFFSET)
    val offset: Int? = null
    
    @JsonProperty(value = JsonConstants.ORDER)
    val orderList: List<Order>? = null
    
    @JsonProperty(value = JsonConstants.PREV)
    val prev: String? = null
    
    @JsonProperty(value = JsonConstants.TOTAL)
    val total: Int? = null
    
    @JsonProperty(value = JsonConstants.WARNING)
    val warningList: List<Warning>? = null
    
}
        