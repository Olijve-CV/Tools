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
class ShipTo {
 
    
    @JsonProperty(value = JsonConstants.COMPANYNAME)
    val companyName: String? = null
    
    @JsonProperty(value = JsonConstants.CONTACTADDRESS)
    val contactAddress: ContactAddress? = null
    
    @JsonProperty(value = JsonConstants.EMAIL)
    val email: String? = null
    
    @JsonProperty(value = JsonConstants.FULLNAME)
    val fullName: String? = null
    
    @JsonProperty(value = JsonConstants.PRIMARYPHONE)
    val primaryPhone: PrimaryPhone? = null
    
}
        