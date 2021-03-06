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
    var availability: Availability? = null
    
    @JsonProperty(value = JsonConstants.CONDITION)
    var condition: String? = null
    
    @JsonProperty(value = JsonConstants.CONDITIONDESCRIPTION)
    var conditionDescription: String? = null
    
    @JsonProperty(value = JsonConstants.LOCALE)
    var locale: String? = null
    
    @JsonProperty(value = JsonConstants.PACKAGEWEIGHTANDSIZE)
    var packageWeightAndSize: PackageWeightAndSize? = null
    
    @JsonProperty(value = JsonConstants.PRODUCT)
    var product: Product? = null
    
    @JsonProperty(value = JsonConstants.SKU)
    var sku: String? = null
    
}
        