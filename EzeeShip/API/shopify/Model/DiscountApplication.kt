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
class Discount_application {
 
    
    @JsonProperty(value = JsonConstants.TYPE)
    val type: String? = null
    
    @JsonProperty(value = JsonConstants.TITLE)
    val title: String? = null
    
    @JsonProperty(value = JsonConstants.DESCRIPTION)
    val description: String? = null
    
    @JsonProperty(value = JsonConstants.VALUE)
    val value: BigDecimal? = null
    
    @JsonProperty(value = JsonConstants.VALUE_TYPE)
    val valueType: String? = null
    
    @JsonProperty(value = JsonConstants.ALLOCATION_METHOD)
    val allocationMethod: String? = null
    
    @JsonProperty(value = JsonConstants.TARGET_SELECTION)
    val targetSelection: String? = null
    
    @JsonProperty(value = JsonConstants.TARGET_TYPE)
    val targetType: String? = null
    
}
        