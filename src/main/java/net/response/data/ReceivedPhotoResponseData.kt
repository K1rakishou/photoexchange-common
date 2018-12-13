package net.response.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ReceivedPhotoResponseData(

  @Expose
  @SerializedName("photo_id")
  val photoId: Long,

  @Expose
  @SerializedName("uploaded_photo_name")
  val uploadedPhotoName: String,

  @Expose
  @SerializedName("received_photo_name")
  val receivedPhotoName: String,

  @Expose
  @SerializedName("lon")
  val lon: Double,

  @Expose
  @SerializedName("lat")
  val lat: Double,

  @Expose
  @SerializedName("uploaded_on")
  val uploadedOn: Long
)