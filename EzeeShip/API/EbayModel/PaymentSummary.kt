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
class PaymentSummary {
 
    
    @JsonProperty(value = JsonConstants.PAYMENT)
    val paymentList: List<Payment>? = null
    
    @JsonProperty(value = JsonConstants.REFUND)
    val refundList: List<Refund>? = null
    
    @JsonProperty(value = JsonConstants.TOTALDUESELLER)
    val totalDueSeller: TotalDueSeller? = null
    
}
        