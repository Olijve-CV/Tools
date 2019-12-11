package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class payments {
 
    
    @JsonProperty(value = JsonConstants.AMOUNT)
    val amount: Amount? = null
    
    @JsonProperty(value = JsonConstants.PAYMENTDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val paymentDate: Date? = null
    
    @JsonProperty(value = JsonConstants.PAYMENTHOLDS)
    val paymentHolds: List<PaymentHolds>? = null
    
    @JsonProperty(value = JsonConstants.PAYMENTMETHOD)
    val paymentMethod: Int? = null
    
    @JsonProperty(value = JsonConstants.PAYMENTREFERENCEID)
    val paymentReferenceId: String? = null
    
    @JsonProperty(value = JsonConstants.PAYMENTSTATUS)
    val paymentStatus: Int? = null
    
}
        