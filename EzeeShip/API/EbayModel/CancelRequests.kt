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
class CancelRequests {
 
    
    @JsonProperty(value = JsonConstants.CANCELCOMPLETEDDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val cancelCompletedDate: Date? = null
    
    @JsonProperty(value = JsonConstants.CANCELINITIATOR)
    val cancelInitiator: String? = null
    
    @JsonProperty(value = JsonConstants.CANCELREASON)
    val cancelReason: String? = null
    
    @JsonProperty(value = JsonConstants.CANCELREQUESTEDDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val cancelRequestedDate: Date? = null
    
    @JsonProperty(value = JsonConstants.CANCELREQUESTID)
    val cancelRequestId: String? = null
    
    @JsonProperty(value = JsonConstants.CANCELREQUESTSTATE)
    val cancelRequestState: Int? = null
    
}
        