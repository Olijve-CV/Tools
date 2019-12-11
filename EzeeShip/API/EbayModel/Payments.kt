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
class Payments {
 
    
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
        