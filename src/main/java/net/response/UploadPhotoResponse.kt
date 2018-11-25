package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class UploadPhotoResponse(

  @Expose
  @SerializedName("photo_id")
  val photoId: Long,

  @Expose
  @SerializedName("photo_name")
  val photoName: String,

  @Expose
  @SerializedName("uploaded_on")
  val uploadedOn: Long,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(photoId: Long, photoName: String, uploadedOn: Long): UploadPhotoResponse {
      return UploadPhotoResponse(photoId, photoName, uploadedOn, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): UploadPhotoResponse {
      return UploadPhotoResponse(-1L, "", -1L, errorCode)
    }
  }
}