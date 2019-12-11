package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class shipTo {
 
    
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
        