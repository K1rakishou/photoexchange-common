package net.response.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ReceiverInfoResponseData(

  @Expose
  @SerializedName("receiver_photo_name")
  val receiverPhotoName: String,

  @Expose
  @SerializedName("receiver_lon")
  val receiverLon: Double,

  @Expose
  @SerializedName("receiver_lat")
  val receiverLat: Double
)