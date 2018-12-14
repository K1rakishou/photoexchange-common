package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode
import net.response.data.GalleryPhotoResponseData

class GalleryPhotosResponse
private constructor(

  @Expose
  @SerializedName("gallery_photos")
  val galleryPhotos: List<GalleryPhotoResponseData>,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(
      galleryPhotos: List<GalleryPhotoResponseData>
    ): GalleryPhotosResponse {
      return GalleryPhotosResponse(galleryPhotos, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): GalleryPhotosResponse {
      return GalleryPhotosResponse(emptyList(), errorCode)
    }
  }
}