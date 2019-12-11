package com.apex.ebay.model

import com.fasterxml.jackson.annotation.JsonProperty
import lombok.Data


@Data
class paymentHolds {
 
    
    @JsonProperty(value = JsonConstants.EXPECTEDRELEASEDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val expectedReleaseDate: Date? = null
    
    @JsonProperty(value = JsonConstants.HOLDAMOUNT)
    val holdAmount: HoldAmount? = null
    
    @JsonProperty(value = JsonConstants.HOLDREASON)
    val holdReason: String? = null
    
    @JsonProperty(value = JsonConstants.HOLDSTATE)
    val holdState: String? = null
    
    @JsonProperty(value = JsonConstants.RELEASEDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    val releaseDate: Date? = null
    
    @JsonProperty(value = JsonConstants.SELLERACTIONSTORELEASE)
    val sellerActionsToRelease: List<SellerActionsToRelease>? = null
    
}
        