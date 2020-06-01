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
class Parameter {
 
    
    @JsonProperty(value = JsonConstants.NAME)
    var name: String? = null
    
    @JsonProperty(value = JsonConstants.VALUE)
    var value: BigDecimal? = null
    
}
        