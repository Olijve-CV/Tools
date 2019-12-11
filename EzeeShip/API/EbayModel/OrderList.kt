package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


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
    
    @JsonProperty(value = JsonConstants.ORDERS)
    val orders: List<Orders>? = null
    
    @JsonProperty(value = JsonConstants.PREV)
    val prev: String? = null
    
    @JsonProperty(value = JsonConstants.TOTAL)
    val total: Int? = null
    
    @JsonProperty(value = JsonConstants.WARNINGS)
    val warnings: List<Warnings>? = null
    
}
        