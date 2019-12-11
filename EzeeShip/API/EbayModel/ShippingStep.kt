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
class ShippingStep {
 
    
    @JsonProperty(value = JsonConstants.SHIPPINGCARRIERCODE)
    val shippingCarrierCode: String? = null
    
    @JsonProperty(value = JsonConstants.SHIPPINGSERVICECODE)
    val shippingServiceCode: String? = null
    
    @JsonProperty(value = JsonConstants.SHIPTO)
    val shipTo: ShipTo? = null
    
    @JsonProperty(value = JsonConstants.SHIPTOREFERENCEID)
    val shipToReferenceId: String? = null
    
}
        