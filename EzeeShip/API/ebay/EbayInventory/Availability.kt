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
class Availability {
 
    
    @JsonProperty(value = JsonConstants.PICKUPATLOCATIONAVAILABILITY)
    val pickupAtLocationAvailabilityList: List<PickupAtLocationAvailability>? = null
    
    @JsonProperty(value = JsonConstants.SHIPTOLOCATIONAVAILABILITY)
    val shipToLocationAvailability: ShipToLocationAvailability? = null
    
}
        