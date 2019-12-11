package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class sellerActionsToRelease {
 
    
    @JsonProperty(value = JsonConstants.SELLERACTIONTORELEASE)
    val sellerActionToRelease: String? = null
    
}
        