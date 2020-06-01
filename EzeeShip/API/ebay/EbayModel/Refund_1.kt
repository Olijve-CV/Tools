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
class Refund_1 {
 
    
    @JsonProperty(value = JsonConstants.AMOUNT)
    var amount: Amount? = null
    
    @JsonProperty(value = JsonConstants.REFUNDDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    var refundDate: Date? = null
    
    @JsonProperty(value = JsonConstants.REFUNDID)
    var refundId: String? = null
    
    @JsonProperty(value = JsonConstants.REFUNDREFERENCEID)
    var refundReferenceId: String? = null
    
    @JsonProperty(value = JsonConstants.REFUNDSTATUS)
    var refundStatus: String? = null
    
}
        