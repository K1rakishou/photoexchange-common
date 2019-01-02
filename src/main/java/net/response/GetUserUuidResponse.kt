package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class GetUserUuidResponse
private constructor(

  @Expose
  @SerializedName("user_uuid")
  val userUuid: String,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(userUuid: String): GetUserUuidResponse {
      return GetUserUuidResponse(userUuid, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): GetUserUuidResponse {
      return GetUserUuidResponse("", errorCode)
    }
  }
}