

# ChapterRestrictionObject

## Properties

Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**reason** | **String** | The reason for the restriction. Supported values: - &#x60;market&#x60; - The content item is not available in the given market. - &#x60;product&#x60; - The content item is not available for the user&#39;s subscription type. - &#x60;explicit&#x60; - The content item is explicit and the user&#39;s account is set to not play explicit content. - &#x60;payment_required&#x60; - Payment is required to play the content item.  Additional reasons may be added in the future. **Note**: If you use this field, make sure that your application safely handles unknown values.  |  [optional]



