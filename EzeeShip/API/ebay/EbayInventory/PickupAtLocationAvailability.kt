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
class PickupAtLocationAvailability {
 
    
    @JsonProperty(value = JsonConstants.AVAILABILITYTYPE)
    val availabilityType: String? = null
    
    @JsonProperty(value = JsonConstants.FULFILLMENTTIME)
    val fulfillmentTime: FulfillmentTime? = null
    
    @JsonProperty(value = JsonConstants.MERCHANTLOCATIONKEY)
    val merchantLocationKey: String? = null
    
    @JsonProperty(value = JsonConstants.QUANTITY)
    val quantity: Int? = null
    
}
        