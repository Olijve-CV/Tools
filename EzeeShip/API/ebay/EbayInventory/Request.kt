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
class Request {
 
    
    @JsonProperty(value = JsonConstants.AVAILABILITY)
    val availability: Availability? = null
    
    @JsonProperty(value = JsonConstants.CONDITION)
    val condition: String? = null
    
    @JsonProperty(value = JsonConstants.CONDITIONDESCRIPTION)
    val conditionDescription: String? = null
    
    @JsonProperty(value = JsonConstants.LOCALE)
    val locale: String? = null
    
    @JsonProperty(value = JsonConstants.PACKAGEWEIGHTANDSIZE)
    val packageWeightAndSize: PackageWeightAndSize? = null
    
    @JsonProperty(value = JsonConstants.PRODUCT)
    val product: Product? = null
    
    @JsonProperty(value = JsonConstants.SKU)
    val sku: String? = null
    
}
        