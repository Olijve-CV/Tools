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
class Dimensions {
 
    
    @JsonProperty(value = JsonConstants.HEIGHT)
    var height: Int? = null
    
    @JsonProperty(value = JsonConstants.LENGTH)
    var length: Int? = null
    
    @JsonProperty(value = JsonConstants.UNIT)
    var unit: String? = null
    
    @JsonProperty(value = JsonConstants.WIDTH)
    var width: Int? = null
    
}
        