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
class Note_attribut {
 
    
    @JsonProperty(value = JsonConstants.NAME)
    val name: String? = null
    
    @JsonProperty(value = JsonConstants.VALUE)
    val value: BigDecimal? = null
    
}
        