package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class HasFreshGalleryPhotosResponse
private constructor(

  @Expose
  @SerializedName("fresh_gallery_photos_count")
  val freshGalleryPhotosCount: Int,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(count: Int): HasFreshGalleryPhotosResponse {
      return HasFreshGalleryPhotosResponse(count, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): HasFreshGalleryPhotosResponse {
      return HasFreshGalleryPhotosResponse(0, errorCode)
    }
  }

}