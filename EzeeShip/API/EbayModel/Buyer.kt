package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class buyer {
 
    
    @JsonProperty(value = JsonConstants.USERNAME)
    val username: String? = null
    
}
        