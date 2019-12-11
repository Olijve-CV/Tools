package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class refunds {
 
    
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
    
    @JsonProperty(value = JsonConstants.REFUNDSTATUS)
    val refundStatus: Int? = null
    
}
        