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
class Fulfillment {
 
    
    @JsonProperty(value = JsonConstants.CREATED_AT)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val createdAt: String? = null
    
    @JsonProperty(value = JsonConstants.ID)
    val id: Int? = null
    
    @JsonProperty(value = JsonConstants.ORDER_ID)
    val orderId: Int? = null
    
    @JsonProperty(value = JsonConstants.STATUS)
    val status: String? = null
    
    @JsonProperty(value = JsonConstants.TRACKING_COMPANY)
    val trackingCompany: String? = null
    
    @JsonProperty(value = JsonConstants.TRACKING_NUMBER)
    val trackingNumber: String? = null
    
    @JsonProperty(value = JsonConstants.UPDATED_AT)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val updatedAt: String? = null
    
}
        