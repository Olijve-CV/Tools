package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class giftDetails {
 
    
    @JsonProperty(value = JsonConstants.MESSAGE)
    val message: String? = null
    
    @JsonProperty(value = JsonConstants.RECIPIENTEMAIL)
    val recipientEmail: String? = null
    
    @JsonProperty(value = JsonConstants.SENDERNAME)
    val senderName: String? = null
    
}
        