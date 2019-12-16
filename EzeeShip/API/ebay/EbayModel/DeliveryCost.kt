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
class DeliveryCost {
 
    
    @JsonProperty(value = JsonConstants.IMPORTCHARGES)
    val importCharges: ImportCharges? = null
    
    @JsonProperty(value = JsonConstants.SHIPPINGCOST)
    val shippingCost: ShippingCost? = null
    
    @JsonProperty(value = JsonConstants.SHIPPINGINTERMEDIATIONFEE)
    val shippingIntermediationFee: ShippingIntermediationFee? = null
    
}
        