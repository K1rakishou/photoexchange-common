package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

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

  class UploadedPhotoResponseData(

    @Expose
    @SerializedName("photo_id")
    val photoId: Long,

    @Expose
    @SerializedName("photo_name")
    val photoName: String,

    @Expose
    @SerializedName("uploader_lon")
    val uploaderLon: Double,

    @Expose
    @SerializedName("uploader_lat")
    val uploaderLat: Double,

    @Expose
    @SerializedName("receiver_info")
    val receiverInfoResponseData: ReceiverInfoResponseData?,

    @Expose
    @SerializedName("uploaded_on")
    val uploadedOn: Long
  )

  class ReceiverInfoResponseData(

    @Expose
    @SerializedName("receiver_lon")
    val receiverLon: Double,

    @Expose
    @SerializedName("receiver_lat")
    val receiverLat: Double
  )
}