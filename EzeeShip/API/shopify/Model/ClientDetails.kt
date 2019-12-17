package com.apex.shopify.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data
import java.math.BigDecimal
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.apex.util.FlexDateDeserializer
import com.apex.util.FlexDateSerializer
import java.util.Date

@Data
class Client_details {
 
    
    @JsonProperty(value = JsonConstants.ACCEPT_LANGUAGE)
    val acceptLanguage: String? = null
    
    @JsonProperty(value = JsonConstants.BROWSER_HEIGHT)
    val browserHeight: Int? = null
    
    @JsonProperty(value = JsonConstants.BROWSER_IP)
    val browserIp: String? = null
    
    @JsonProperty(value = JsonConstants.BROWSER_WIDTH)
    val browserWidth: Int? = null
    
    @JsonProperty(value = JsonConstants.SESSION_HASH)
    val sessionHash: String? = null
    
    @JsonProperty(value = JsonConstants.USER_AGENT)
    val userAgent: String? = null
    
}
        