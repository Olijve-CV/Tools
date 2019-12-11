package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class paymentSummary {
 
    
    @JsonProperty(value = JsonConstants.PAYMENTS)
    val payments: List<Payments>? = null
    
    @JsonProperty(value = JsonConstants.REFUNDS)
    val refunds: List<Refunds>? = null
    
    @JsonProperty(value = JsonConstants.TOTALDUESELLER)
    val totalDueSeller: TotalDueSeller? = null
    
}
        