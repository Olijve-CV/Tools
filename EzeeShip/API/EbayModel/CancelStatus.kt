package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class cancelStatus {
 
    
    @JsonProperty(value = JsonConstants.CANCELLEDDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val cancelledDate: Date? = null
    
    @JsonProperty(value = JsonConstants.CANCELREQUESTS)
    val cancelRequests: List<CancelRequests>? = null
    
    @JsonProperty(value = JsonConstants.CANCELSTATE)
    val cancelState: Int? = null
    
}
        