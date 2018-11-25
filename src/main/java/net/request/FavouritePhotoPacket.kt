package net.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class FavouritePhotoPacket(
  @Expose
  @SerializedName("user_id")
  val userId: String,

  @Expose
  @SerializedName("photo_name")
  val photoName: String
) {
  fun isPacketOk(): Boolean {
    return !(userId.isNullOrEmpty() || photoName.isNullOrEmpty())
  }
}