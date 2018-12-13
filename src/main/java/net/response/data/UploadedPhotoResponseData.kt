package net.response.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import net.response.GetUploadedPhotosResponse

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
  val receiverInfoResponseData: GetUploadedPhotosResponse.ReceiverInfoResponseData?,

  @Expose
  @SerializedName("uploaded_on")
  val uploadedOn: Long
)