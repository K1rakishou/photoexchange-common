package net.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ReportPhotoPacket(
  @Expose
  @SerializedName("user_id")
  val userId: String,

  @Expose
  @SerializedName("photo_name")
  val photoName: String
)