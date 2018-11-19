package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class GetUploadedPhotosResponse
private constructor(

	@Expose
	@SerializedName("uploaded_photos")
	val uploadedPhotos: List<UploadedPhotoResponseData>,

	errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

	companion object {
		fun success(uploadedPhotos: List<UploadedPhotoResponseData>): GetUploadedPhotosResponse {
			return GetUploadedPhotosResponse(uploadedPhotos, ErrorCode.Ok)
		}

		fun fail(errorCode: ErrorCode): GetUploadedPhotosResponse {
			return GetUploadedPhotosResponse(emptyList(), errorCode)
		}
	}

	class UploadedPhotoResponseData(

		@SerializedName("photo_id")
		val photoId: Long,

		@SerializedName("photo_name")
		val photoName: String,

		@SerializedName("uploader_lon")
		val uploaderLon: Double,

		@SerializedName("uploader_lat")
		val uploaderLat: Double,

		@SerializedName("has_receiver_info")
		val hasReceiverInfo: Boolean,

		@SerializedName("uploaded_on")
		val uploadedOn: Long
	)
}