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
    var buyer: Buyer? = null
    
    @JsonProperty(value = JsonConstants.BUYERCHECKOUTNOTES)
    var buyerCheckoutNotes: String? = null
    
    @JsonProperty(value = JsonConstants.CANCELSTATUS)
    var cancelStatus: CancelStatus? = null
    
    @JsonProperty(value = JsonConstants.CREATIONDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    var creationDate: Date? = null
    
    @JsonProperty(value = JsonConstants.EBAYCOLLECTANDREMITTAX)
    var ebayCollectAndRemitTax: Boolean? = null
    
    @JsonProperty(value = JsonConstants.FULFILLMENTHREFS)
    var fulfillmentHrefList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.FULFILLMENTSTARTINSTRUCTIONS)
    var fulfillmentStartInstructionList: List<FulfillmentStartInstruction>? = null
    
    @JsonProperty(value = JsonConstants.LASTMODIFIEDDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    var lastModifiedDate: Date? = null
    
    @JsonProperty(value = JsonConstants.LEGACYORDERID)
    var legacyOrderId: String? = null
    
    @JsonProperty(value = JsonConstants.LINEITEMS)
    var lineItemList: List<LineItem>? = null
    
    @JsonProperty(value = JsonConstants.ORDERFULFILLMENTSTATUS)
    var orderFulfillmentStatus: String? = null
    
    @JsonProperty(value = JsonConstants.ORDERID)
    var orderId: String? = null
    
    @JsonProperty(value = JsonConstants.ORDERPAYMENTSTATUS)
    var orderPaymentStatus: String? = null
    
    @JsonProperty(value = JsonConstants.PAYMENTSUMMARY)
    var paymentSummary: PaymentSummary? = null
    
    @JsonProperty(value = JsonConstants.PRICINGSUMMARY)
    var pricingSummary: PricingSummary? = null
    
    @JsonProperty(value = JsonConstants.SALESRECORDREFERENCE)
    var salesRecordReference: String? = null
    
    @JsonProperty(value = JsonConstants.SELLERID)
    var sellerId: String? = null
    
}
        