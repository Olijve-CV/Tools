package com.apex.shopify.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data
import java.math.BigDecimal
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.apex.util.FlexDateDeserializer
import com.apex.util.FlexDateSerializer
import java.util.Date

@Data
class Shipping_lin {
 
    
    @JsonProperty(value = JsonConstants.CODE)
    val code: String? = null
    
    @JsonProperty(value = JsonConstants.PRICE)
    val price: String? = null
    
    @JsonProperty(value = JsonConstants.PRICE_SET)
    val priceSet: PriceSet? = null
    
    @JsonProperty(value = JsonConstants.DISCOUNTED_PRICE)
    val discountedPrice: String? = null
    
    @JsonProperty(value = JsonConstants.DISCOUNTED_PRICE_SET)
    val discountedPriceSet: DiscountedPriceSet? = null
    
    @JsonProperty(value = JsonConstants.SOURCE)
    val source: String? = null
    
    @JsonProperty(value = JsonConstants.TITLE)
    val title: String? = null
    
    @JsonProperty(value = JsonConstants.TAX_LINES)
    val taxLinList: List<TaxLin>? = null
    
    @JsonProperty(value = JsonConstants.CARRIER_IDENTIFIER)
    val carrierIdentifier: String? = null
    
    @JsonProperty(value = JsonConstants.REQUESTED_FULFILLMENT_SERVICE_ID)
    val requestedFulfillmentServiceId: String? = null
    
}
        