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
    val aspectList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.BRAND)
    val brand: String? = null
    
    @JsonProperty(value = JsonConstants.DESCRIPTION)
    val description: String? = null
    
    @JsonProperty(value = JsonConstants.EAN)
    val eanList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.EPID)
    val epid: String? = null
    
    @JsonProperty(value = JsonConstants.IMAGEURLS)
    val imageUrlList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.ISBN)
    val isbnList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.MPN)
    val mpn: String? = null
    
    @JsonProperty(value = JsonConstants.SUBTITLE)
    val subtitle: String? = null
    
    @JsonProperty(value = JsonConstants.TITLE)
    val title: String? = null
    
    @JsonProperty(value = JsonConstants.UPC)
    val upcList: List<String>? = null
    
}
        