package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class primaryPhone {
 
    
    @JsonProperty(value = JsonConstants.PHONENUMBER)
    val phoneNumber: String? = null
    
}
        