package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class ReportPhotoResponse
private constructor(

  @Expose
  @SerializedName("is_reported")
  val isReported: Boolean,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(isReported: Boolean): ReportPhotoResponse {
      return ReportPhotoResponse(isReported, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): ReportPhotoResponse {
      return ReportPhotoResponse(false, errorCode)
    }
  }
}