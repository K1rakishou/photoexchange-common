package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class GetFreshPhotosCountResponse
private constructor(

  @Expose
  @SerializedName("fresh_photos_count")
  val freshPhotosCount: Int,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(count: Int): GetFreshPhotosCountResponse {
      return GetFreshPhotosCountResponse(count, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): GetFreshPhotosCountResponse {
      return GetFreshPhotosCountResponse(0, errorCode)
    }
  }

}