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
    var destinationTimeZone: String? = null
    
    @JsonProperty(value = JsonConstants.GUARANTEEDDELIVERY)
    var guaranteedDelivery: Boolean? = null
    
    @JsonProperty(value = JsonConstants.MAXESTIMATEDDELIVERYDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    var maxEstimatedDeliveryDate: Date? = null
    
    @JsonProperty(value = JsonConstants.MINESTIMATEDDELIVERYDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    var minEstimatedDeliveryDate: Date? = null
    
    @JsonProperty(value = JsonConstants.SHIPBYDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    var shipByDate: Date? = null
    
    @JsonProperty(value = JsonConstants.SOURCETIMEZONE)
    var sourceTimeZone: String? = null
    
}
        