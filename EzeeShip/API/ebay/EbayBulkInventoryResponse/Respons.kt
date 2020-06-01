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
class Respons {
 
    
    @JsonProperty(value = JsonConstants.ERRORS)
    var errorList: List<Error>? = null
    
    @JsonProperty(value = JsonConstants.LOCALE)
    var locale: String? = null
    
    @JsonProperty(value = JsonConstants.SKU)
    var sku: String? = null
    
    @JsonProperty(value = JsonConstants.STATUSCODE)
    var statusCode: Int? = null
    
    @JsonProperty(value = JsonConstants.WARNINGS)
    var warningList: List<Warning>? = null
    
}
        