package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class shippingStep {
 
    
    @JsonProperty(value = JsonConstants.SHIPPINGCARRIERCODE)
    val shippingCarrierCode: String? = null
    
    @JsonProperty(value = JsonConstants.SHIPPINGSERVICECODE)
    val shippingServiceCode: String? = null
    
    @JsonProperty(value = JsonConstants.SHIPTO)
    val shipTo: ShipTo? = null
    
    @JsonProperty(value = JsonConstants.SHIPTOREFERENCEID)
    val shipToReferenceId: String? = null
    
}
        