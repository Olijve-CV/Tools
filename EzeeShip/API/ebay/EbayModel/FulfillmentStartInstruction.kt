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
class FulfillmentStartInstruction {
 
    
    @JsonProperty(value = JsonConstants.DESTINATIONTIMEZONE)
    var destinationTimeZone: String? = null
    
    @JsonProperty(value = JsonConstants.EBAYSUPPORTEDFULFILLMENT)
    var ebaySupportedFulfillment: Boolean? = null
    
    @JsonProperty(value = JsonConstants.FINALDESTINATIONADDRESS)
    var finalDestinationAddress: FinalDestinationAddress? = null
    
    @JsonProperty(value = JsonConstants.FULFILLMENTINSTRUCTIONSTYPE)
    var fulfillmentInstructionsType: String? = null
    
    @JsonProperty(value = JsonConstants.MAXESTIMATEDDELIVERYDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    var maxEstimatedDeliveryDate: Date? = null
    
    @JsonProperty(value = JsonConstants.MINESTIMATEDDELIVERYDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    var minEstimatedDeliveryDate: Date? = null
    
    @JsonProperty(value = JsonConstants.PICKUPSTEP)
    var pickupStep: PickupStep? = null
    
    @JsonProperty(value = JsonConstants.SHIPPINGSTEP)
    var shippingStep: ShippingStep? = null
    
}
        