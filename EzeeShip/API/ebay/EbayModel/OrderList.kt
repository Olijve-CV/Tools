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
    var href: String? = null
    
    @JsonProperty(value = JsonConstants.LIMIT)
    var limit: Int? = null
    
    @JsonProperty(value = JsonConstants.NEXT)
    var next: String? = null
    
    @JsonProperty(value = JsonConstants.OFFSET)
    var offset: Int? = null
    
    @JsonProperty(value = JsonConstants.ORDERS)
    var orderList: List<Order>? = null
    
    @JsonProperty(value = JsonConstants.PREV)
    var prev: String? = null
    
    @JsonProperty(value = JsonConstants.TOTAL)
    var total: Int? = null
    
    @JsonProperty(value = JsonConstants.WARNINGS)
    var warningList: List<Warning>? = null
    
}
        