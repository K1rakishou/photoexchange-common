package net.response

import core.ErrorCode

class BanUserResponse
private constructor(
  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(): BanUserResponse {
      return BanUserResponse(ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): BanUserResponse {
      return BanUserResponse(errorCode)
    }
  }
}