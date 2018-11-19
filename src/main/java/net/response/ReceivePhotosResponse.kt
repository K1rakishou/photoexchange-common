package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class ReceivePhotosResponse
private constructor(

	@Expose
	@SerializedName("received_photos")
	val receivedPhotos: List<ReceivedPhotoResponseData>,

	errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

	companion object {
		fun success(receivedPhotos: List<ReceivedPhotoResponseData>): ReceivePhotosResponse {
			return ReceivePhotosResponse(receivedPhotos, ErrorCode.Ok)
		}

		fun fail(errorCode: ErrorCode): ReceivePhotosResponse {
			return ReceivePhotosResponse(emptyList(), errorCode)
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