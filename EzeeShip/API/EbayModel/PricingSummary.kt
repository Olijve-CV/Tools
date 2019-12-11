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
class PricingSummary {
 
    
    @JsonProperty(value = JsonConstants.ADJUSTMENT)
    val adjustment: Adjustment? = null
    
    @JsonProperty(value = JsonConstants.DELIVERYCOST_1)
    val deliveryCost_1: DeliveryCost_1? = null
    
    @JsonProperty(value = JsonConstants.DELIVERYDISCOUNT)
    val deliveryDiscount: DeliveryDiscount? = null
    
    @JsonProperty(value = JsonConstants.FEE)
    val fee: Fee? = null
    
    @JsonProperty(value = JsonConstants.PRICEDISCOUNTSUBTOTAL)
    val priceDiscountSubtotal: PriceDiscountSubtotal? = null
    
    @JsonProperty(value = JsonConstants.PRICESUBTOTAL)
    val priceSubtotal: PriceSubtotal? = null
    
    @JsonProperty(value = JsonConstants.TAX_1)
    val tax_1: Tax_1? = null
    
    @JsonProperty(value = JsonConstants.TOTAL)
    val total: Total? = null
    
}
        