package net.response

import core.ErrorCode

class BanUserAndAllTheirPhotosResponse
private constructor(
  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(): BanUserAndAllTheirPhotosResponse {
      return BanUserAndAllTheirPhotosResponse(ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): BanUserAndAllTheirPhotosResponse {
      return BanUserAndAllTheirPhotosResponse(errorCode)
    }
  }
}
