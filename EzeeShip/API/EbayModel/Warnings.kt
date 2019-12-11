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
class Warnings {
 
    
    @JsonProperty(value = JsonConstants.CATEGORY)
    val category: String? = null
    
    @JsonProperty(value = JsonConstants.DOMAIN)
    val domain: String? = null
    
    @JsonProperty(value = JsonConstants.ERRORID)
    val errorId: Int? = null
    
    @JsonProperty(value = JsonConstants.INPUTREFIDS)
    val inputRefIds: List<String>? = null
    
    @JsonProperty(value = JsonConstants.LONGMESSAGE)
    val longMessage: String? = null
    
    @JsonProperty(value = JsonConstants.MESSAGE)
    val message: String? = null
    
    @JsonProperty(value = JsonConstants.OUTPUTREFIDS)
    val outputRefIds: List<String>? = null
    
    @JsonProperty(value = JsonConstants.PARAMETERS)
    val parameters: List<Parameters>? = null
    
    @JsonProperty(value = JsonConstants.SUBDOMAIN)
    val subdomain: String? = null
    
}
        