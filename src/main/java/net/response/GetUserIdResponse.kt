package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class GetUserIdResponse
private constructor(

  @Expose
  @SerializedName("user_id")
  val userId: String,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(userId: String): GetUserIdResponse {
      return GetUserIdResponse(userId, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): GetUserIdResponse {
      return GetUserIdResponse("", errorCode)
    }
  }
}