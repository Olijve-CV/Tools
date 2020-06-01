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
class EbayCollectAndRemitTax {
 
    
    @JsonProperty(value = JsonConstants.AMOUNT)
    var amount: Amount? = null
    
    @JsonProperty(value = JsonConstants.TAXTYPE)
    var taxType: String? = null
    
    @JsonProperty(value = JsonConstants.COLLECTIONMETHOD)
    var collectionMethod: String? = null
    
}
        