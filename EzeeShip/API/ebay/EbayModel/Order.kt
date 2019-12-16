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
class Order {
 
    
    @JsonProperty(value = JsonConstants.BUYER)
    val buyer: Buyer? = null
    
    @JsonProperty(value = JsonConstants.BUYERCHECKOUTNOTES)
    val buyerCheckoutNotes: String? = null
    
    @JsonProperty(value = JsonConstants.CANCELSTATUS)
    val cancelStatus: CancelStatus? = null
    
    @JsonProperty(value = JsonConstants.CREATIONDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val creationDate: Date? = null
    
    @JsonProperty(value = JsonConstants.EBAYCOLLECTANDREMITTAX)
    val ebayCollectAndRemitTax: Boolean? = null
    
    @JsonProperty(value = JsonConstants.FULFILLMENTHREFS)
    val fulfillmentHrefList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.FULFILLMENTSTARTINSTRUCTIONS)
    val fulfillmentStartInstructionList: List<FulfillmentStartInstruction>? = null
    
    @JsonProperty(value = JsonConstants.LASTMODIFIEDDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val lastModifiedDate: Date? = null
    
    @JsonProperty(value = JsonConstants.LEGACYORDERID)
    val legacyOrderId: String? = null
    
    @JsonProperty(value = JsonConstants.LINEITEMS)
    val lineItemList: List<LineItem>? = null
    
    @JsonProperty(value = JsonConstants.ORDERFULFILLMENTSTATUS)
    val orderFulfillmentStatus: String? = null
    
    @JsonProperty(value = JsonConstants.ORDERID)
    val orderId: String? = null
    
    @JsonProperty(value = JsonConstants.ORDERPAYMENTSTATUS)
    val orderPaymentStatus: String? = null
    
    @JsonProperty(value = JsonConstants.PAYMENTSUMMARY)
    val paymentSummary: PaymentSummary? = null
    
    @JsonProperty(value = JsonConstants.PRICINGSUMMARY)
    val pricingSummary: PricingSummary? = null
    
    @JsonProperty(value = JsonConstants.SALESRECORDREFERENCE)
    val salesRecordReference: String? = null
    
    @JsonProperty(value = JsonConstants.SELLERID)
    val sellerId: String? = null
    
}
        