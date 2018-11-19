package net.response

import com.google.gson.annotations.SerializedName
import core.ErrorCode

class UploadPhotoResponse(

	@SerializedName("photo_id")
	val photoId: Long,

	@SerializedName("photo_name")
	val photoName: String,

	errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

	companion object {
		fun success(photoId: Long, photoName: String): UploadPhotoResponse {
			return UploadPhotoResponse(photoId, photoName, ErrorCode.Ok)
		}

		fun fail(errorCode: ErrorCode): UploadPhotoResponse {
			return UploadPhotoResponse(-1L, "", errorCode)
		}
	}
}