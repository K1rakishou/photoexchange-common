package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode
import net.response.data.PhotoAdditionalInfoResponseData

class GetPhotoAdditionalInfoResponse
private constructor(

  @Expose
  @SerializedName("photo_additional_info")
  val additionalInfo: List<PhotoAdditionalInfoResponseData>,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(
      additionalInfo: List<PhotoAdditionalInfoResponseData>
    ): GetPhotoAdditionalInfoResponse {
      return GetPhotoAdditionalInfoResponse(additionalInfo, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): GetPhotoAdditionalInfoResponse {
      return GetPhotoAdditionalInfoResponse(emptyList(), errorCode)
    }
  }
}