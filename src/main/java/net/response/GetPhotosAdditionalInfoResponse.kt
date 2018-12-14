package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode
import net.response.data.PhotoAdditionalInfoResponseData

class GetPhotosAdditionalInfoResponse
private constructor(

  @Expose
  @SerializedName("photos_additional_info")
  val additionalInfoList: List<PhotoAdditionalInfoResponseData>,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(additionalInfo: List<PhotoAdditionalInfoResponseData>): GetPhotosAdditionalInfoResponse {
      return GetPhotosAdditionalInfoResponse(additionalInfo, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): GetPhotosAdditionalInfoResponse {
      return GetPhotosAdditionalInfoResponse(emptyList(), errorCode)
    }
  }
}