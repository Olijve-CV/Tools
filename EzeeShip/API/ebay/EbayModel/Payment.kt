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
class Payment {
 
    
    @JsonProperty(value = JsonConstants.AMOUNT)
    var amount: Amount? = null
    
    @JsonProperty(value = JsonConstants.PAYMENTDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    var paymentDate: Date? = null
    
    @JsonProperty(value = JsonConstants.PAYMENTHOLDS)
    var paymentHoldList: List<PaymentHold>? = null
    
    @JsonProperty(value = JsonConstants.PAYMENTMETHOD)
    var paymentMethod: String? = null
    
    @JsonProperty(value = JsonConstants.PAYMENTREFERENCEID)
    var paymentReferenceId: String? = null
    
    @JsonProperty(value = JsonConstants.PAYMENTSTATUS)
    var paymentStatus: String? = null
    
}
        