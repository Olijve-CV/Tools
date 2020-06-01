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
    var cancelledDate: Date? = null
    
    @JsonProperty(value = JsonConstants.CANCELREQUESTS)
    var cancelRequestList: List<CancelRequest>? = null
    
    @JsonProperty(value = JsonConstants.CANCELSTATE)
    var cancelState: String? = null
    
}
        