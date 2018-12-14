package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode
import net.response.data.ReceivedPhotoResponseData

class ReceivedPhotosResponse
private constructor(

  @Expose
  @SerializedName("received_photos")
  val receivedPhotos: List<ReceivedPhotoResponseData>,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(
      receivedPhotos: List<ReceivedPhotoResponseData>
    ): ReceivedPhotosResponse {
      return ReceivedPhotosResponse(receivedPhotos, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): ReceivedPhotosResponse {
      return ReceivedPhotosResponse(emptyList(), errorCode)
    }
  }
}