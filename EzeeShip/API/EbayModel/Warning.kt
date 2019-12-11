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
class Warning {
 
    
    @JsonProperty(value = JsonConstants.CATEGORY)
    val category: String? = null
    
    @JsonProperty(value = JsonConstants.DOMAIN)
    val domain: String? = null
    
    @JsonProperty(value = JsonConstants.ERRORID)
    val errorId: Int? = null
    
    @JsonProperty(value = JsonConstants.INPUTREFIDS)
    val inputRefIdList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.LONGMESSAGE)
    val longMessage: String? = null
    
    @JsonProperty(value = JsonConstants.MESSAGE)
    val message: String? = null
    
    @JsonProperty(value = JsonConstants.OUTPUTREFIDS)
    val outputRefIdList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.PARAMETERS)
    val parameterList: List<Parameter>? = null
    
    @JsonProperty(value = JsonConstants.SUBDOMAIN)
    val subdomain: String? = null
    
}
        