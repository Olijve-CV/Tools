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
    var companyName: String? = null
    
    @JsonProperty(value = JsonConstants.CONTACTADDRESS)
    var contactAddress: ContactAddress? = null
    
    @JsonProperty(value = JsonConstants.EMAIL)
    var email: String? = null
    
    @JsonProperty(value = JsonConstants.FULLNAME)
    var fullName: String? = null
    
    @JsonProperty(value = JsonConstants.PRIMARYPHONE)
    var primaryPhone: PrimaryPhone? = null
    
}
        