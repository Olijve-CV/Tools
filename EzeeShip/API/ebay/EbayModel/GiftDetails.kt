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
class GiftDetails {
 
    
    @JsonProperty(value = JsonConstants.MESSAGE)
    var message: String? = null
    
    @JsonProperty(value = JsonConstants.RECIPIENTEMAIL)
    var recipientEmail: String? = null
    
    @JsonProperty(value = JsonConstants.SENDERNAME)
    var senderName: String? = null
    
}
        