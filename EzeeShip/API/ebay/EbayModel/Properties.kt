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
class Properties {
 
    
    @JsonProperty(value = JsonConstants.BUYERPROTECTION)
    var buyerProtection: Boolean? = null
    
    @JsonProperty(value = JsonConstants.FROMBESTOFFER)
    var fromBestOffer: Boolean? = null
    
    @JsonProperty(value = JsonConstants.SOLDVIAADCAMPAIGN)
    var soldViaAdCampaign: Boolean? = null
    
}
        