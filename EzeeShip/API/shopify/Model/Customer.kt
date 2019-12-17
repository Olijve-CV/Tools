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
class Customer {
 
    
    @JsonProperty(value = JsonConstants.ID)
    val id: Int? = null
    
    @JsonProperty(value = JsonConstants.EMAIL)
    val email: String? = null
    
    @JsonProperty(value = JsonConstants.ACCEPTS_MARKETING)
    val acceptsMarketing: Boolean? = null
    
    @JsonProperty(value = JsonConstants.CREATED_AT)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val createdAt: String? = null
    
    @JsonProperty(value = JsonConstants.UPDATED_AT)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val updatedAt: String? = null
    
    @JsonProperty(value = JsonConstants.FIRST_NAME)
    val firstName: String? = null
    
    @JsonProperty(value = JsonConstants.LAST_NAME)
    val lastName: String? = null
    
    @JsonProperty(value = JsonConstants.ORDERS_COUNT)
    val ordersCount: Int? = null
    
    @JsonProperty(value = JsonConstants.STATE)
    val state: String? = null
    
    @JsonProperty(value = JsonConstants.TOTAL_SPENT)
    val totalSpent: String? = null
    
    @JsonProperty(value = JsonConstants.LAST_ORDER_ID)
    val lastOrderId: Int? = null
    
    @JsonProperty(value = JsonConstants.NOTE)
    val note: String? = null
    
    @JsonProperty(value = JsonConstants.VERIFIED_EMAIL)
    val verifiedEmail: Boolean? = null
    
    @JsonProperty(value = JsonConstants.MULTIPASS_IDENTIFIER)
    val multipassIdentifier: String? = null
    
    @JsonProperty(value = JsonConstants.TAX_EXEMPT)
    val taxExempt: Boolean? = null
    
    @JsonProperty(value = JsonConstants.TAX_EXEMPTIONS)
    val taxExemptions: TaxExemptions? = null
    
    @JsonProperty(value = JsonConstants.PHONE)
    val phone: String? = null
    
    @JsonProperty(value = JsonConstants.TAGS)
    val tags: String? = null
    
    @JsonProperty(value = JsonConstants.LAST_ORDER_NAME)
    val lastOrderName: String? = null
    
    @JsonProperty(value = JsonConstants.CURRENCY)
    val currency: String? = null
    
    @JsonProperty(value = JsonConstants.ADDRESSES)
    val addresses: Addresses? = null
    
    @JsonProperty(value = JsonConstants.ADMIN_GRAPHQL_API_ID)
    val adminGraphqlApiId: String? = null
    
    @JsonProperty(value = JsonConstants.DEFAULT_ADDRESS)
    val defaultAddress: DefaultAddress? = null
    
}
        