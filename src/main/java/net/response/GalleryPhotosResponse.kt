package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode
import net.response.data.GalleryPhotoResponseData
import net.response.data.PhotoAdditionalInfoResponseData

class GalleryPhotosResponse
private constructor(

  @Expose
  @SerializedName("gallery_photos")
  val galleryPhotos: List<GalleryPhotoResponseData>,

  @Expose
  @SerializedName("photo_additional_info")
  val additionalInfo: List<PhotoAdditionalInfoResponseData>,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(
      galleryPhotos: List<GalleryPhotoResponseData>,
      additionalInfo: List<PhotoAdditionalInfoResponseData>
    ): GalleryPhotosResponse {
      return GalleryPhotosResponse(galleryPhotos, additionalInfo, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): GalleryPhotosResponse {
      return GalleryPhotosResponse(emptyList(), emptyList(), errorCode)
    }
  }
}