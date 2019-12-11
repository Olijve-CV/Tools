package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class ebayCollectAndRemitTaxes {
 
    
    @JsonProperty(value = JsonConstants.AMOUNT)
    val amount: Amount? = null
    
    @JsonProperty(value = JsonConstants.TAXTYPE)
    val taxType: Int? = null
    
    @JsonProperty(value = JsonConstants.COLLECTIONMETHOD)
    val collectionMethod: Int? = null
    
}
        