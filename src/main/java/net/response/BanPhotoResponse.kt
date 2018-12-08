package net.response

import core.ErrorCode

class BanPhotoResponse
private constructor(
  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(): BanPhotoResponse {
      return BanPhotoResponse(ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): BanPhotoResponse {
      return BanPhotoResponse(errorCode)
    }
  }

}