package com.apex.shopify.domain.product

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data
import java.math.BigDecimal
import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import com.fasterxml.jackson.databind.annotation.JsonSerialize
import com.apex.util.FlexDateDeserializer
import com.apex.util.FlexDateSerializer
import java.util.Date

@Data
class Variant {
 
    
    @JsonProperty(value = JsonConstants.ID)
    var id: Int? = null
    
    @JsonProperty(value = JsonConstants.PRODUCT_ID)
    var product_id: Int? = null
    
    @JsonProperty(value = JsonConstants.TITLE)
    var title: String? = null
    
    @JsonProperty(value = JsonConstants.PRICE)
    var price: String? = null
    
    @JsonProperty(value = JsonConstants.SKU)
    var sku: String? = null
    
    @JsonProperty(value = JsonConstants.POSITION)
    var position: Int? = null
    
    @JsonProperty(value = JsonConstants.INVENTORY_POLICY)
    var inventory_policy: String? = null
    
    @JsonProperty(value = JsonConstants.COMPARE_AT_PRICE)
    var compare_at_price: String? = null
    
    @JsonProperty(value = JsonConstants.FULFILLMENT_SERVICE)
    var fulfillment_service: String? = null
    
    @JsonProperty(value = JsonConstants.INVENTORY_MANAGEMENT)
    var inventory_management: String? = null
    
    @JsonProperty(value = JsonConstants.OPTION1)
    var option1: String? = null
    
    @JsonProperty(value = JsonConstants.OPTION2)
    var option2: String? = null
    
    @JsonProperty(value = JsonConstants.OPTION3)
    var option3: String? = null
    
    @JsonProperty(value = JsonConstants.CREATED_AT)
    var created_at: String? = null
    
    @JsonProperty(value = JsonConstants.UPDATED_AT)
    var updated_at: String? = null
    
    @JsonProperty(value = JsonConstants.TAXABLE)
    var taxable: Int? = null
    
    @JsonProperty(value = JsonConstants.BARCODE)
    var barcode: String? = null
    
    @JsonProperty(value = JsonConstants.GRAMS)
    var grams: Int? = null
    
    @JsonProperty(value = JsonConstants.IMAGE_ID)
    var image_id: Int? = null
    
    @JsonProperty(value = JsonConstants.WEIGHT)
    var weight: Boolean? = null
    
    @JsonProperty(value = JsonConstants.WEIGHT_UNIT)
    var weight_unit: String? = null
    
    @JsonProperty(value = JsonConstants.INVENTORY_ITEM_ID)
    var inventory_item_id: Int? = null
    
    @JsonProperty(value = JsonConstants.INVENTORY_QUANTITY)
    var inventory_quantity: Int? = null
    
    @JsonProperty(value = JsonConstants.OLD_INVENTORY_QUANTITY)
    var old_inventory_quantity: Int? = null
    
    @JsonProperty(value = JsonConstants.TAX_CODE)
    var tax_code: String? = null
    
    @JsonProperty(value = JsonConstants.REQUIRES_SHIPPING)
    var requires_shipping: Int? = null
    
    @JsonProperty(value = JsonConstants.ADMIN_GRAPHQL_API_ID)
    var admin_graphql_api_id: String? = null
    
    @JsonProperty(value = JsonConstants.PRESENTMENT_PRICES)
    var presentment_pricList: List<Presentment_pric>? = null
    
}
        