package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode
import net.response.data.PhotoAdditionalInfoResponseData
import net.response.data.ReceivedPhotoResponseData

class ReceivedPhotosResponse
private constructor(

  @Expose
  @SerializedName("received_photos")
  val receivedPhotos: List<ReceivedPhotoResponseData>,

  @Expose
  @SerializedName("photo_addiitional_info")
  val additionalInfo: PhotoAdditionalInfoResponseData?,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(
      receivedPhotos: List<ReceivedPhotoResponseData>,
      additionalInfo: PhotoAdditionalInfoResponseData
    ): ReceivedPhotosResponse {
      return ReceivedPhotosResponse(receivedPhotos, additionalInfo, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): ReceivedPhotosResponse {
      return ReceivedPhotosResponse(emptyList(), null, errorCode)
    }
  }
}