package net.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class UpdateFirebaseTokenPacket(
  @Expose
  @SerializedName("user_id")
  val userId: String,

  @Expose
  @SerializedName("token")
  val token: String
) {
  fun isPacketOk(): Boolean {
    if (userId.isNullOrEmpty() || token.isNullOrEmpty()) {
      return false
    }

    return true
  }
}