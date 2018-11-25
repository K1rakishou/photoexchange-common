package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import core.ErrorCode

class CheckAccountExistsResponse
private constructor(

  @Expose
  @SerializedName("account_exists")
  val accountExists: Boolean,

  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(accountExists: Boolean): CheckAccountExistsResponse {
      return CheckAccountExistsResponse(accountExists, ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): CheckAccountExistsResponse {
      return CheckAccountExistsResponse(false, errorCode)
    }
  }
}