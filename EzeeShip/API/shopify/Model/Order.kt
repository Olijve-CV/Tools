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
class Order {
 
    
    @JsonProperty(value = JsonConstants.APP_ID)
    val appId: Int? = null
    
    @JsonProperty(value = JsonConstants.BILLING_ADDRESS)
    val billingAddress: BillingAddress? = null
    
    @JsonProperty(value = JsonConstants.BROWSER_IP)
    val browserIp: String? = null
    
    @JsonProperty(value = JsonConstants.BUYER_ACCEPTS_MARKETING)
    val buyerAcceptsMarketing: Boolean? = null
    
    @JsonProperty(value = JsonConstants.CANCEL_REASON)
    val cancelReason: String? = null
    
    @JsonProperty(value = JsonConstants.CANCELLED_AT)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val cancelledAt: String? = null
    
    @JsonProperty(value = JsonConstants.CART_TOKEN)
    val cartToken: String? = null
    
    @JsonProperty(value = JsonConstants.CLIENT_DETAILS)
    val clientDetails: ClientDetails? = null
    
    @JsonProperty(value = JsonConstants.CLOSED_AT)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val closedAt: String? = null
    
    @JsonProperty(value = JsonConstants.CREATED_AT)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val createdAt: String? = null
    
    @JsonProperty(value = JsonConstants.CURRENCY)
    val currency: String? = null
    
    @JsonProperty(value = JsonConstants.CUSTOMER)
    val customer: Customer? = null
    
    @JsonProperty(value = JsonConstants.CUSTOMER_LOCALE)
    val customerLocale: String? = null
    
    @JsonProperty(value = JsonConstants.DISCOUNT_APPLICATIONS)
    val discountApplicationList: List<DiscountApplication>? = null
    
    @JsonProperty(value = JsonConstants.DISCOUNT_CODES)
    val discountCodList: List<DiscountCod>? = null
    
    @JsonProperty(value = JsonConstants.EMAIL)
    val email: String? = null
    
    @JsonProperty(value = JsonConstants.FINANCIAL_STATUS)
    val financialStatus: String? = null
    
    @JsonProperty(value = JsonConstants.FULFILLMENTS)
    val fulfillmentList: List<Fulfillment>? = null
    
    @JsonProperty(value = JsonConstants.FULFILLMENT_STATUS)
    val fulfillmentStatus: String? = null
    
    @JsonProperty(value = JsonConstants.GATEWAY)
    val gateway: String? = null
    
    @JsonProperty(value = JsonConstants.ID)
    val id: Int? = null
    
    @JsonProperty(value = JsonConstants.LANDING_SITE)
    val landingSite: String? = null
    
    @JsonProperty(value = JsonConstants.LINE_ITEMS)
    val lineItemList: List<LineItem>? = null
    
    @JsonProperty(value = JsonConstants.LOCATION_ID)
    val locationId: Int? = null
    
    @JsonProperty(value = JsonConstants.NAME)
    val name: String? = null
    
    @JsonProperty(value = JsonConstants.NOTE)
    val note: String? = null
    
    @JsonProperty(value = JsonConstants.NOTE_ATTRIBUTES)
    val noteAttributList: List<NoteAttribut>? = null
    
    @JsonProperty(value = JsonConstants.NUMBER)
    val number: Int? = null
    
    @JsonProperty(value = JsonConstants.ORDER_NUMBER)
    val orderNumber: Int? = null
    
    @JsonProperty(value = JsonConstants.PAYMENT_DETAILS)
    val paymentDetails: PaymentDetails? = null
    
    @JsonProperty(value = JsonConstants.PAYMENT_GATEWAY_NAMES)
    val paymentGatewayNamList: List<String>? = null
    
    @JsonProperty(value = JsonConstants.PHONE)
    val phone: String? = null
    
    @JsonProperty(value = JsonConstants.PRESENTMENT_CURRENCY)
    val presentmentCurrency: String? = null
    
    @JsonProperty(value = JsonConstants.PROCESSED_AT)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val processedAt: String? = null
    
    @JsonProperty(value = JsonConstants.PROCESSING_METHOD)
    val processingMethod: String? = null
    
    @JsonProperty(value = JsonConstants.REFERRING_SITE)
    val referringSite: String? = null
    
    @JsonProperty(value = JsonConstants.REFUNDS)
    val refundList: List<Refund>? = null
    
    @JsonProperty(value = JsonConstants.SHIPPING_ADDRESS)
    val shippingAddress: ShippingAddress? = null
    
    @JsonProperty(value = JsonConstants.SHIPPING_LINES)
    val shippingLinList: List<ShippingLin>? = null
    
    @JsonProperty(value = JsonConstants.SOURCE_NAME)
    val sourceName: String? = null
    
    @JsonProperty(value = JsonConstants.SUBTOTAL_PRICE)
    val subtotalPrice: BigDecimal? = null
    
    @JsonProperty(value = JsonConstants.SUBTOTAL_PRICE_SET)
    val subtotalPriceSet: SubtotalPriceSet? = null
    
    @JsonProperty(value = JsonConstants.TAGS)
    val tags: String? = null
    
    @JsonProperty(value = JsonConstants.TAX_LINES)
    val taxLinList: List<TaxLin>? = null
    
    @JsonProperty(value = JsonConstants.TAXES_INCLUDED)
    val taxesIncluded: Boolean? = null
    
    @JsonProperty(value = JsonConstants.TEST)
    val test: Boolean? = null
    
    @JsonProperty(value = JsonConstants.TOKEN)
    val token: String? = null
    
    @JsonProperty(value = JsonConstants.TOTAL_DISCOUNTS)
    val totalDiscounts: String? = null
    
    @JsonProperty(value = JsonConstants.TOTAL_DISCOUNTS_SET)
    val totalDiscountsSet: TotalDiscountsSet? = null
    
    @JsonProperty(value = JsonConstants.TOTAL_LINE_ITEMS_PRICE)
    val totalLineItemsPrice: String? = null
    
    @JsonProperty(value = JsonConstants.TOTAL_LINE_ITEMS_PRICE_SET)
    val totalLineItemsPriceSet: TotalLineItemsPriceSet? = null
    
    @JsonProperty(value = JsonConstants.TOTAL_PRICE)
    val totalPrice: String? = null
    
    @JsonProperty(value = JsonConstants.TOTAL_PRICE_SET)
    val totalPriceSet: TotalPriceSet? = null
    
    @JsonProperty(value = JsonConstants.TOTAL_TAX)
    val totalTax: String? = null
    
    @JsonProperty(value = JsonConstants.TOTAL_TAX_SET)
    val totalTaxSet: TotalTaxSet? = null
    
    @JsonProperty(value = JsonConstants.TOTAL_TIP_RECEIVED)
    val totalTipReceived: String? = null
    
    @JsonProperty(value = JsonConstants.TOTAL_WEIGHT)
    val totalWeight: Int? = null
    
    @JsonProperty(value = JsonConstants.UPDATED_AT)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val updatedAt: String? = null
    
    @JsonProperty(value = JsonConstants.USER_ID)
    val userId: Int? = null
    
    @JsonProperty(value = JsonConstants.ORDER_STATUS_URL)
    val orderStatusUrl: String? = null
    
}
        