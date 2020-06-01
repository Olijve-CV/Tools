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
class Product {
 
    
    @JsonProperty(value = JsonConstants.ASPECTS)
    var aspectList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.BRAND)
    var brand: String? = null
    
    @JsonProperty(value = JsonConstants.DESCRIPTION)
    var description: String? = null
    
    @JsonProperty(value = JsonConstants.EAN)
    var eanList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.EPID)
    var epid: String? = null
    
    @JsonProperty(value = JsonConstants.IMAGEURLS)
    var imageUrlList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.ISBN)
    var isbnList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.MPN)
    var mpn: String? = null
    
    @JsonProperty(value = JsonConstants.SUBTITLE)
    var subtitle: String? = null
    
    @JsonProperty(value = JsonConstants.TITLE)
    var title: String? = null
    
    @JsonProperty(value = JsonConstants.UPC)
    var upcList: List<String>? = null
    
}
        