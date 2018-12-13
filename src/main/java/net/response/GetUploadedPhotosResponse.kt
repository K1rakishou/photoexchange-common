package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode
import net.response.data.UploadedPhotoResponseData

class GetUploadedPhotosResponse
private constructor(

  @Expose
  @SerializedName("uploaded_photos")
  val uploadedPhotos: List<UploadedPhotoResponseData>,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(uploadedPhotos: List<UploadedPhotoResponseData>): GetUploadedPhotosResponse {
      return GetUploadedPhotosResponse(uploadedPhotos, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): GetUploadedPhotosResponse {
      return GetUploadedPhotosResponse(emptyList(), errorCode)
    }
  }
}