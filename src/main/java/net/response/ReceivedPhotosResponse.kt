package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class ReceivedPhotosResponse
private constructor(

	@Expose
	@SerializedName("received_photos")
	val receivedPhotos: List<ReceivedPhotoResponseData>,

	errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

	companion object {
		fun success(receivedPhotos: List<ReceivedPhotoResponseData>): ReceivedPhotosResponse {
			return ReceivedPhotosResponse(receivedPhotos, ErrorCode.Ok)
		}

		fun fail(errorCode: ErrorCode): ReceivedPhotosResponse {
			return ReceivedPhotosResponse(emptyList(), errorCode)
		}
	}

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
		val lat: Double
	)
}