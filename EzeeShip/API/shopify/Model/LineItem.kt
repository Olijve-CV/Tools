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
class Line_item {
 
    
    @JsonProperty(value = JsonConstants.FULFILLABLE_QUANTITY)
    val fulfillableQuantity: Int? = null
    
    @JsonProperty(value = JsonConstants.FULFILLMENT_SERVICE)
    val fulfillmentService: String? = null
    
    @JsonProperty(value = JsonConstants.FULFILLMENT_STATUS)
    val fulfillmentStatus: String? = null
    
    @JsonProperty(value = JsonConstants.GRAMS)
    val grams: Int? = null
    
    @JsonProperty(value = JsonConstants.ID)
    val id: Int? = null
    
    @JsonProperty(value = JsonConstants.PRICE)
    val price: String? = null
    
    @JsonProperty(value = JsonConstants.PRODUCT_ID)
    val productId: Int? = null
    
    @JsonProperty(value = JsonConstants.QUANTITY)
    val quantity: Int? = null
    
    @JsonProperty(value = JsonConstants.REQUIRES_SHIPPING)
    val requiresShipping: Boolean? = null
    
    @JsonProperty(value = JsonConstants.SKU)
    val sku: String? = null
    
    @JsonProperty(value = JsonConstants.TITLE)
    val title: String? = null
    
    @JsonProperty(value = JsonConstants.VARIANT_ID)
    val variantId: Int? = null
    
    @JsonProperty(value = JsonConstants.VARIANT_TITLE)
    val variantTitle: String? = null
    
    @JsonProperty(value = JsonConstants.VENDOR)
    val vendor: String? = null
    
    @JsonProperty(value = JsonConstants.NAME)
    val name: String? = null
    
    @JsonProperty(value = JsonConstants.GIFT_CARD)
    val giftCard: Boolean? = null
    
    @JsonProperty(value = JsonConstants.PRICE_SET)
    val priceSet: PriceSet? = null
    
    @JsonProperty(value = JsonConstants.PROPERTIES)
    val propertiList: List<Properti>? = null
    
    @JsonProperty(value = JsonConstants.TAXABLE)
    val taxable: Boolean? = null
    
    @JsonProperty(value = JsonConstants.TAX_LINES)
    val taxLinList: List<TaxLin>? = null
    
    @JsonProperty(value = JsonConstants.TOTAL_DISCOUNT)
    val totalDiscount: String? = null
    
    @JsonProperty(value = JsonConstants.TOTAL_DISCOUNT_SET)
    val totalDiscountSet: TotalDiscountSet? = null
    
    @JsonProperty(value = JsonConstants.DISCOUNT_ALLOCATIONS)
    val discountAllocationList: List<DiscountAllocation>? = null
    
}
        