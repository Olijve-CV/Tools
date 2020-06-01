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
class InventoryItemList {
 
    
    @JsonProperty(value = JsonConstants.VARIANT)
    var variant: Variant? = null
    
}
        