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
class PaymentHold {
 
    
    @JsonProperty(value = JsonConstants.EXPECTEDRELEASEDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    var expectedReleaseDate: Date? = null
    
    @JsonProperty(value = JsonConstants.HOLDAMOUNT)
    var holdAmount: HoldAmount? = null
    
    @JsonProperty(value = JsonConstants.HOLDREASON)
    var holdReason: String? = null
    
    @JsonProperty(value = JsonConstants.HOLDSTATE)
    var holdState: String? = null
    
    @JsonProperty(value = JsonConstants.RELEASEDATE)
    @JsonDeserialize(using = FlexDateDeserializer::class)
    @JsonSerialize(using = FlexDateSerializer::class)
    var releaseDate: Date? = null
    
    @JsonProperty(value = JsonConstants.SELLERACTIONSTORELEASE)
    var sellerActionsToReleaseList: List<SellerActionsToRelease>? = null
    
}
        