package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class GalleryPhotoInfoResponse
private constructor(

  @Expose
  @SerializedName("gallery_photos_info")
  val galleryPhotosInfo: List<GalleryPhotosInfoResponseData>,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(galleryPhotosInfo: List<GalleryPhotosInfoResponseData>): GalleryPhotoInfoResponse {
      return GalleryPhotoInfoResponse(galleryPhotosInfo, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): GalleryPhotoInfoResponse {
      return GalleryPhotoInfoResponse(emptyList(), errorCode)
    }
  }

  class GalleryPhotosInfoResponseData(

    @SerializedName("photoId")
    val id: Long,

    @SerializedName("is_favourited")
    val isFavourited: Boolean,

    @SerializedName("is_reported")
    val isReported: Boolean
  )
}