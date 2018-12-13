package net.response.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName


class GalleryPhotoResponseData(

  @Expose
  @SerializedName("photo_name")
  val photoName: String,

  @Expose
  @SerializedName("lon")
  val lon: Double,

  @Expose
  @SerializedName("lat")
  val lat: Double,

  @Expose
  @SerializedName("uploaded_on")
  val uploadedOn: Long,

  @Expose
  @SerializedName("favourites_count")
  val favouritesCount: Long
)