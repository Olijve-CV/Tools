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
class CancelStatus {
 
    
    @JsonProperty(value = JsonConstants.CANCELLEDDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val cancelledDate: Date? = null
    
    @JsonProperty(value = JsonConstants.CANCELREQUESTS)
    val cancelRequests: List<CancelRequests>? = null
    
    @JsonProperty(value = JsonConstants.CANCELSTATE)
    val cancelState: Int? = null
    
}
        