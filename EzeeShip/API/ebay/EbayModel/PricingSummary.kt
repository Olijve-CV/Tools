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
    var adjustment: Adjustment? = null
    
    @JsonProperty(value = JsonConstants.DELIVERYCOST)
    var deliveryCost: DeliveryCost_1? = null
    
    @JsonProperty(value = JsonConstants.DELIVERYDISCOUNT)
    var deliveryDiscount: DeliveryDiscount? = null
    
    @JsonProperty(value = JsonConstants.FEE)
    var fee: Fee? = null
    
    @JsonProperty(value = JsonConstants.PRICEDISCOUNTSUBTOTAL)
    var priceDiscountSubtotal: PriceDiscountSubtotal? = null
    
    @JsonProperty(value = JsonConstants.PRICESUBTOTAL)
    var priceSubtotal: PriceSubtotal? = null
    
    @JsonProperty(value = JsonConstants.TAX)
    var tax: Tax_1? = null
    
    @JsonProperty(value = JsonConstants.TOTAL)
    var total: Total? = null
    
}
        