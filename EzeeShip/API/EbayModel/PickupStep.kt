package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class pickupStep {
 
    
    @JsonProperty(value = JsonConstants.MERCHANTLOCATIONKEY)
    val merchantLocationKey: String? = null
    
}
        