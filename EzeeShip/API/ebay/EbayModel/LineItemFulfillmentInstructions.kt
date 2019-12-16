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
class LineItemFulfillmentInstructions {
 
    
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
        