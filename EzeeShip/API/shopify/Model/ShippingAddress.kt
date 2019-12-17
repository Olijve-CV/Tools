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
class Shipping_address {
 
    
    @JsonProperty(value = JsonConstants.ADDRESS1)
    val address1: String? = null
    
    @JsonProperty(value = JsonConstants.ADDRESS2)
    val address2: String? = null
    
    @JsonProperty(value = JsonConstants.CITY)
    val city: String? = null
    
    @JsonProperty(value = JsonConstants.COMPANY)
    val company: String? = null
    
    @JsonProperty(value = JsonConstants.COUNTRY)
    val country: String? = null
    
    @JsonProperty(value = JsonConstants.FIRST_NAME)
    val firstName: String? = null
    
    @JsonProperty(value = JsonConstants.LAST_NAME)
    val lastName: String? = null
    
    @JsonProperty(value = JsonConstants.LATITUDE)
    val latitude: String? = null
    
    @JsonProperty(value = JsonConstants.LONGITUDE)
    val longitude: String? = null
    
    @JsonProperty(value = JsonConstants.PHONE)
    val phone: String? = null
    
    @JsonProperty(value = JsonConstants.PROVINCE)
    val province: String? = null
    
    @JsonProperty(value = JsonConstants.ZIP)
    val zip: String? = null
    
    @JsonProperty(value = JsonConstants.NAME)
    val name: String? = null
    
    @JsonProperty(value = JsonConstants.COUNTRY_CODE)
    val countryCode: String? = null
    
    @JsonProperty(value = JsonConstants.PROVINCE_CODE)
    val provinceCode: String? = null
    
}
        