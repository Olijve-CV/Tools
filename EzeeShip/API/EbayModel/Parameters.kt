package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class parameters {
 
    
    @JsonProperty(value = JsonConstants.NAME)
    val name: String? = null
    
    @JsonProperty(value = JsonConstants.VALUE)
    val value: BigDecimal? = null
    
}
        