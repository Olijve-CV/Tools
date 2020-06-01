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
class LineItem {
 
    
    @JsonProperty(value = JsonConstants.APPLIEDPROMOTIONS)
    var appliedPromotionList: List<AppliedPromotion>? = null
    
    @JsonProperty(value = JsonConstants.DELIVERYCOST)
    var deliveryCost: DeliveryCost? = null
    
    @JsonProperty(value = JsonConstants.DISCOUNTEDLINEITEMCOST)
    var discountedLineItemCost: DiscountedLineItemCost? = null
    
    @JsonProperty(value = JsonConstants.EBAYCOLLECTANDREMITTAXES)
    var ebayCollectAndRemitTaxList: List<EbayCollectAndRemitTax>? = null
    
    @JsonProperty(value = JsonConstants.GIFTDETAILS)
    var giftDetails: GiftDetails? = null
    
    @JsonProperty(value = JsonConstants.LEGACYITEMID)
    var legacyItemId: String? = null
    
    @JsonProperty(value = JsonConstants.LEGACYVARIATIONID)
    var legacyVariationId: String? = null
    
    @JsonProperty(value = JsonConstants.LINEITEMCOST)
    var lineItemCost: LineItemCost? = null
    
    @JsonProperty(value = JsonConstants.LINEITEMFULFILLMENTINSTRUCTIONS)
    var lineItemFulfillmentInstructions: LineItemFulfillmentInstructions? = null
    
    @JsonProperty(value = JsonConstants.LINEITEMFULFILLMENTSTATUS)
    var lineItemFulfillmentStatus: String? = null
    
    @JsonProperty(value = JsonConstants.LINEITEMID)
    var lineItemId: String? = null
    
    @JsonProperty(value = JsonConstants.LISTINGMARKETPLACEID)
    var listingMarketplaceId: String? = null
    
    @JsonProperty(value = JsonConstants.PROPERTIES)
    var properties: Properties? = null
    
    @JsonProperty(value = JsonConstants.PURCHASEMARKETPLACEID)
    var purchaseMarketplaceId: String? = null
    
    @JsonProperty(value = JsonConstants.QUANTITY)
    var quantity: Int? = null
    
    @JsonProperty(value = JsonConstants.REFUNDS)
    var refundList: List<Refund>? = null
    
    @JsonProperty(value = JsonConstants.SKU)
    var sku: String? = null
    
    @JsonProperty(value = JsonConstants.SOLDFORMAT)
    var soldFormat: String? = null
    
    @JsonProperty(value = JsonConstants.TAXES)
    var taxList: List<Tax>? = null
    
    @JsonProperty(value = JsonConstants.TITLE)
    var title: String? = null
    
    @JsonProperty(value = JsonConstants.TOTAL)
    var total: Total? = null
    
}
        