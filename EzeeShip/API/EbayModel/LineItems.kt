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
class LineItems {
 
    
    @JsonProperty(value = JsonConstants.APPLIEDPROMOTIONS)
    val appliedPromotions: List<AppliedPromotions>? = null
    
    @JsonProperty(value = JsonConstants.DELIVERYCOST)
    val deliveryCost: DeliveryCost? = null
    
    @JsonProperty(value = JsonConstants.DISCOUNTEDLINEITEMCOST)
    val discountedLineItemCost: DiscountedLineItemCost? = null
    
    @JsonProperty(value = JsonConstants.EBAYCOLLECTANDREMITTAXES)
    val ebayCollectAndRemitTaxes: List<EbayCollectAndRemitTaxes>? = null
    
    @JsonProperty(value = JsonConstants.GIFTDETAILS)
    val giftDetails: GiftDetails? = null
    
    @JsonProperty(value = JsonConstants.LEGACYITEMID)
    val legacyItemId: String? = null
    
    @JsonProperty(value = JsonConstants.LEGACYVARIATIONID)
    val legacyVariationId: String? = null
    
    @JsonProperty(value = JsonConstants.LINEITEMCOST)
    val lineItemCost: LineItemCost? = null
    
    @JsonProperty(value = JsonConstants.LINEITEMFULFILLMENTINSTRUCTIONS)
    val lineItemFulfillmentInstructions: LineItemFulfillmentInstructions? = null
    
    @JsonProperty(value = JsonConstants.LINEITEMFULFILLMENTSTATUS)
    val lineItemFulfillmentStatus: Int? = null
    
    @JsonProperty(value = JsonConstants.LINEITEMID)
    val lineItemId: String? = null
    
    @JsonProperty(value = JsonConstants.LISTINGMARKETPLACEID)
    val listingMarketplaceId: Int? = null
    
    @JsonProperty(value = JsonConstants.PROPERTIES)
    val properties: Properties? = null
    
    @JsonProperty(value = JsonConstants.PURCHASEMARKETPLACEID)
    val purchaseMarketplaceId: Int? = null
    
    @JsonProperty(value = JsonConstants.QUANTITY)
    val quantity: Int? = null
    
    @JsonProperty(value = JsonConstants.REFUNDS)
    val refunds: List<Refunds>? = null
    
    @JsonProperty(value = JsonConstants.SKU)
    val sku: String? = null
    
    @JsonProperty(value = JsonConstants.SOLDFORMAT)
    val soldFormat: Int? = null
    
    @JsonProperty(value = JsonConstants.TAXES)
    val taxes: List<Taxes>? = null
    
    @JsonProperty(value = JsonConstants.TITLE)
    val title: String? = null
    
    @JsonProperty(value = JsonConstants.TOTAL)
    val total: Total? = null
    
}
        