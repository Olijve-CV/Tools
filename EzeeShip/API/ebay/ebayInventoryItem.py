requestList = { 
"requests" : [
{ 
"availability" :
{ 
"pickupAtLocationAvailability" : [
{ 
"availabilityType" : "AvailabilityTypeEnum : [IN_STOCK,OUT_OF_STOCK,SHIP_TO_STORE]",
"fulfillmentTime" :
{ 
"unit" : "TimeDurationUnitEnum : [YEAR,MONTH,DAY...]",
"value" : "integer"},
"merchantLocationKey" : "string",
"quantity" : "integer"}
],
"shipToLocationAvailability" :
{ 
"quantity" : "integer"}
},
"condition" : "ConditionEnum : [NEW,LIKE_NEW,NEW_OTHER...]",
"conditionDescription" : "string",
"locale" : "LocaleEnum : [en_US,en_CA,fr_CA...]",
"packageWeightAndSize" :
{ 
"dimensions" :
{ 
"height" : "number",
"length" : "number",
"unit" : "LengthUnitOfMeasureEnum : [INCH,FEET,CENTIMETER...]",
"width" : "number"},
"packageType" : "PackageTypeEnum : [LETTER,BULKY_GOODS,CARAVAN...]",
"weight" :
{ 
"unit" : "WeightUnitOfMeasureEnum : [POUND,KILOGRAM,OUNCE...]",
"value" : "number"}
},
"product" :
{ 
"aspects" : [
"string"
],
"brand" : "string",
"description" : "string",
"ean" : [
"string"
],
"epid" : "string",
"imageUrls" : [
"string"
],
"isbn" : [
"string"
],
"mpn" : "string",
"subtitle" : "string",
"title" : "string",
"upc" : [
"string"
]},
"sku" : "string"}
]
}