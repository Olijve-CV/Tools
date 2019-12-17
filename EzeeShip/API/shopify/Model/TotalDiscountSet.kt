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
class Total_discount_set {
 
    
    @JsonProperty(value = JsonConstants.SHOP_MONEY)
    val shopMoney: ShopMoney? = null
    
    @JsonProperty(value = JsonConstants.PRESENTMENT_MONEY)
    val presentmentMoney: PresentmentMoney? = null
    
}
        