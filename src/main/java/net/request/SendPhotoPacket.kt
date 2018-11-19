package net.request

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class SendPhotoPacket(
	@Expose
	@SerializedName("lon")
	val lon: Double,

  @Expose
	@SerializedName("lat")
	val lat: Double,

  @Expose
	@SerializedName("user_id")
	val userId: String,

  @Expose
	@SerializedName("is_public")
	val isPublic: Boolean
) {
	fun isPacketOk(): Boolean {
		if (lon == null || lat == null || userId == null || isPublic == null) {
			return false
		}

		if (lon < -180.0 || lon > 180.0 || lat < -90.0 || lat > 90.0 || userId.isEmpty()) {
			return false
		}

		return true
	}
}