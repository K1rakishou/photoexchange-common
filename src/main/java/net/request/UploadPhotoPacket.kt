package net.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UploadPhotoPacket(
  @Expose
  @SerializedName("lon")
  val lon: Double,

  @Expose
  @SerializedName("lat")
  val lat: Double,

  @Expose
  @SerializedName("user_uuid")
  val userUuid: String,

  @Expose
  @SerializedName("is_public")
  val isPublic: Boolean
)