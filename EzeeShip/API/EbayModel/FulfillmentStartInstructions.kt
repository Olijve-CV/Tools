package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class fulfillmentStartInstructions {
 
    
    @JsonProperty(value = JsonConstants.DESTINATIONTIMEZONE)
    val destinationTimeZone: String? = null
    
    @JsonProperty(value = JsonConstants.EBAYSUPPORTEDFULFILLMENT)
    val ebaySupportedFulfillment: Boolean? = null
    
    @JsonProperty(value = JsonConstants.FINALDESTINATIONADDRESS)
    val finalDestinationAddress: FinalDestinationAddress? = null
    
    @JsonProperty(value = JsonConstants.FULFILLMENTINSTRUCTIONSTYPE)
    val fulfillmentInstructionsType: Int? = null
    
    @JsonProperty(value = JsonConstants.MAXESTIMATEDDELIVERYDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val maxEstimatedDeliveryDate: Date? = null
    
    @JsonProperty(value = JsonConstants.MINESTIMATEDDELIVERYDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val minEstimatedDeliveryDate: Date? = null
    
    @JsonProperty(value = JsonConstants.PICKUPSTEP)
    val pickupStep: PickupStep? = null
    
    @JsonProperty(value = JsonConstants.SHIPPINGSTEP)
    val shippingStep: ShippingStep? = null
    
}
        