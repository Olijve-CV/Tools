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
class Error {
 
    
    @JsonProperty(value = JsonConstants.CATEGORY)
    var category: String? = null
    
    @JsonProperty(value = JsonConstants.DOMAIN)
    var domain: String? = null
    
    @JsonProperty(value = JsonConstants.ERRORID)
    var errorId: Int? = null
    
    @JsonProperty(value = JsonConstants.INPUTREFIDS)
    var inputRefIdList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.LONGMESSAGE)
    var longMessage: String? = null
    
    @JsonProperty(value = JsonConstants.MESSAGE)
    var message: String? = null
    
    @JsonProperty(value = JsonConstants.OUTPUTREFIDS)
    var outputRefIdList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.PARAMETERS)
    var parameterList: List<Parameter>? = null
    
    @JsonProperty(value = JsonConstants.SUBDOMAIN)
    var subdomain: String? = null
    
}
        