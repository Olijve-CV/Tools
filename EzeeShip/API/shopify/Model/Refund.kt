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
class Refund {
 
    
    @JsonProperty(value = JsonConstants.ID)
    val id: Int? = null
    
    @JsonProperty(value = JsonConstants.ORDER_ID)
    val orderId: Int? = null
    
    @JsonProperty(value = JsonConstants.CREATED_AT)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val createdAt: String? = null
    
    @JsonProperty(value = JsonConstants.NOTE)
    val note: String? = null
    
    @JsonProperty(value = JsonConstants.USER_ID)
    val userId: String? = null
    
    @JsonProperty(value = JsonConstants.PROCESSED_AT)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val processedAt: String? = null
    
    @JsonProperty(value = JsonConstants.REFUND_LINE_ITEMS)
    val refundLineItemList: List<RefundLineItem>? = null
    
    @JsonProperty(value = JsonConstants.TRANSACTIONS)
    val transactionList: List<Transaction>? = null
    
    @JsonProperty(value = JsonConstants.ORDER_ADJUSTMENTS)
    val orderAdjustmentList: List<OrderAdjustment>? = null
    
}
        