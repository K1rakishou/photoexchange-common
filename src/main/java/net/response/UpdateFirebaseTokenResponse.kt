package net.response

import core.ErrorCode

class UpdateFirebaseTokenResponse
private constructor(
  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {
  companion object {
    fun success(): UpdateFirebaseTokenResponse {
      return UpdateFirebaseTokenResponse(ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): UpdateFirebaseTokenResponse {
      return UpdateFirebaseTokenResponse(errorCode)
    }
  }
}