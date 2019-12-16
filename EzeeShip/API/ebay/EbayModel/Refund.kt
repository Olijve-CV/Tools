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
class Refund {
 
    
    @JsonProperty(value = JsonConstants.AMOUNT)
    val amount: Amount? = null
    
    @JsonProperty(value = JsonConstants.REFUNDDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val refundDate: Date? = null
    
    @JsonProperty(value = JsonConstants.REFUNDID)
    val refundId: String? = null
    
    @JsonProperty(value = JsonConstants.REFUNDREFERENCEID)
    val refundReferenceId: String? = null
    
}
        