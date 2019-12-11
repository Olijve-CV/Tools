package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class lineItemFulfillmentInstructions {
 
    
    @JsonProperty(value = JsonConstants.DESTINATIONTIMEZONE)
    val destinationTimeZone: String? = null
    
    @JsonProperty(value = JsonConstants.GUARANTEEDDELIVERY)
    val guaranteedDelivery: Boolean? = null
    
    @JsonProperty(value = JsonConstants.MAXESTIMATEDDELIVERYDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val maxEstimatedDeliveryDate: Date? = null
    
    @JsonProperty(value = JsonConstants.MINESTIMATEDDELIVERYDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val minEstimatedDeliveryDate: Date? = null
    
    @JsonProperty(value = JsonConstants.SHIPBYDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val shipByDate: Date? = null
    
    @JsonProperty(value = JsonConstants.SOURCETIMEZONE)
    val sourceTimeZone: String? = null
    
}
        