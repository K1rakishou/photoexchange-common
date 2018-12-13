package net.response.data

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class PhotoAdditionalInfoResponseData(
  @Expose
  @SerializedName("photo_name")
  val photoName: String,

  @Expose
  @SerializedName("is_favourited")
  val isFavourited: Boolean,

  @Expose
  @SerializedName("is_reported")
  val isReported: Boolean
)