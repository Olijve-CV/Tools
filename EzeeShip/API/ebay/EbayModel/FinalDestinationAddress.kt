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
class FinalDestinationAddress {
 
    
    @JsonProperty(value = JsonConstants.ADDRESSLINE1)
    var addressLine1: String? = null
    
    @JsonProperty(value = JsonConstants.ADDRESSLINE2)
    var addressLine2: String? = null
    
    @JsonProperty(value = JsonConstants.CITY)
    var city: String? = null
    
    @JsonProperty(value = JsonConstants.COUNTRYCODE)
    var countryCode: String? = null
    
    @JsonProperty(value = JsonConstants.COUNTY)
    var county: String? = null
    
    @JsonProperty(value = JsonConstants.POSTALCODE)
    var postalCode: String? = null
    
    @JsonProperty(value = JsonConstants.STATEORPROVINCE)
    var stateOrProvince: String? = null
    
}
        