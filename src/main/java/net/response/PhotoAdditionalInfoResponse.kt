package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class PhotoAdditionalInfoResponse
private constructor(

  @Expose
  @SerializedName("photo_additional_info")
  val photoAdditionalInfo: List<PhotoAdditionalInfoResponseData>,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(photoAdditionalInfo: List<PhotoAdditionalInfoResponseData>): PhotoAdditionalInfoResponse {
      return PhotoAdditionalInfoResponse(photoAdditionalInfo, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): PhotoAdditionalInfoResponse {
      return PhotoAdditionalInfoResponse(emptyList(), errorCode)
    }
  }

  class PhotoAdditionalInfoResponseData(
    @Expose
    @SerializedName("photo_name")
    val photoName: String,

    @Expose
    @SerializedName("is_favourited")
    val isFavourited: Boolean,

    @Expose
    @SerializedName("is_reported")
    val isReported: Boolean
  )
}