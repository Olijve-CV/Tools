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
class CancelRequest {
 
    
    @JsonProperty(value = JsonConstants.CANCELCOMPLETEDDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    var cancelCompletedDate: Date? = null
    
    @JsonProperty(value = JsonConstants.CANCELINITIATOR)
    var cancelInitiator: String? = null
    
    @JsonProperty(value = JsonConstants.CANCELREASON)
    var cancelReason: String? = null
    
    @JsonProperty(value = JsonConstants.CANCELREQUESTEDDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    var cancelRequestedDate: Date? = null
    
    @JsonProperty(value = JsonConstants.CANCELREQUESTID)
    var cancelRequestId: String? = null
    
    @JsonProperty(value = JsonConstants.CANCELREQUESTSTATE)
    var cancelRequestState: String? = null
    
}
        