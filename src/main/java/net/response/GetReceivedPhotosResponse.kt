package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class GetReceivedPhotosResponse
private constructor(

	@Expose
	@SerializedName("received_photos")
	val receivedPhotos: List<ReceivedPhotoResponseData>,

	errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

	companion object {
		fun success(uploadedPhotos: List<ReceivedPhotoResponseData>): GetReceivedPhotosResponse {
			return GetReceivedPhotosResponse(uploadedPhotos, ErrorCode.Ok)
		}

		fun fail(errorCode: ErrorCode): GetReceivedPhotosResponse {
			return GetReceivedPhotosResponse(emptyList(), errorCode)
		}
	}

	class ReceivedPhotoResponseData(
		@SerializedName("photo_id")
		val photoId: Long,

		@SerializedName("uploaded_photo_name")
		val uploadedPhotoName: String,

		@SerializedName("received_photo_name")
		val receivedPhotoName: String,

		@SerializedName("receiver_lon")
		val receiverLon: Double,

		@SerializedName("receiver_lat")
		val receiverLat: Double
	)
}
