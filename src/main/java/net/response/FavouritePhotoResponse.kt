package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class FavouritePhotoResponse
private constructor(

	@Expose
	@SerializedName("is_favourited")
	val isFavourited: Boolean,

  @Expose
	@SerializedName("count")
	val favouritesCount: Long,

	errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

	companion object {
		fun success(isFavourited: Boolean, count: Long): FavouritePhotoResponse {
			return FavouritePhotoResponse(isFavourited, count, ErrorCode.Ok)
		}

		fun fail(errorCode: ErrorCode): FavouritePhotoResponse {
			return FavouritePhotoResponse(false, 0, errorCode)
		}
	}
}