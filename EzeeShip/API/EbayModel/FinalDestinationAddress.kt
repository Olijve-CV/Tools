package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class finalDestinationAddress {
 
    
    @JsonProperty(value = JsonConstants.ADDRESSLINE1)
    val addressLine1: String? = null
    
    @JsonProperty(value = JsonConstants.ADDRESSLINE2)
    val addressLine2: String? = null
    
    @JsonProperty(value = JsonConstants.CITY)
    val city: String? = null
    
    @JsonProperty(value = JsonConstants.COUNTRYCODE)
    val countryCode: Int? = null
    
    @JsonProperty(value = JsonConstants.COUNTY)
    val county: String? = null
    
    @JsonProperty(value = JsonConstants.POSTALCODE)
    val postalCode: String? = null
    
    @JsonProperty(value = JsonConstants.STATEORPROVINCE)
    val stateOrProvince: String? = null
    
}
        