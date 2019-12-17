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
class Payment_details {
 
    
    @JsonProperty(value = JsonConstants.AVS_RESULT_CODE)
    val avsResultCode: String? = null
    
    @JsonProperty(value = JsonConstants.CREDIT_CARD_BIN)
    val creditCardBin: Int? = null
    
    @JsonProperty(value = JsonConstants.CVV_RESULT_CODE)
    val cvvResultCode: String? = null
    
    @JsonProperty(value = JsonConstants.CREDIT_CARD_NUMBER)
    val creditCardNumber: String? = null
    
    @JsonProperty(value = JsonConstants.CREDIT_CARD_COMPANY)
    val creditCardCompany: String? = null
    
}
        