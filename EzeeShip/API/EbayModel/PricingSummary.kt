package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class pricingSummary {
 
    
    @JsonProperty(value = JsonConstants.ADJUSTMENT)
    val adjustment: Adjustment? = null
    
    @JsonProperty(value = JsonConstants.DELIVERYCOST)
    val deliveryCost: DeliveryCost? = null
    
    @JsonProperty(value = JsonConstants.DELIVERYDISCOUNT)
    val deliveryDiscount: DeliveryDiscount? = null
    
    @JsonProperty(value = JsonConstants.FEE)
    val fee: Fee? = null
    
    @JsonProperty(value = JsonConstants.PRICEDISCOUNTSUBTOTAL)
    val priceDiscountSubtotal: PriceDiscountSubtotal? = null
    
    @JsonProperty(value = JsonConstants.PRICESUBTOTAL)
    val priceSubtotal: PriceSubtotal? = null
    
    @JsonProperty(value = JsonConstants.TAX)
    val tax: Tax? = null
    
    @JsonProperty(value = JsonConstants.TOTAL)
    val total: Total? = null
    
}
        