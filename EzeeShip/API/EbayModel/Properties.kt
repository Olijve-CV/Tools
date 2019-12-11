package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class properties {
 
    
    @JsonProperty(value = JsonConstants.BUYERPROTECTION)
    val buyerProtection: Boolean? = null
    
    @JsonProperty(value = JsonConstants.FROMBESTOFFER)
    val fromBestOffer: Boolean? = null
    
    @JsonProperty(value = JsonConstants.SOLDVIAADCAMPAIGN)
    val soldViaAdCampaign: Boolean? = null
    
}
        