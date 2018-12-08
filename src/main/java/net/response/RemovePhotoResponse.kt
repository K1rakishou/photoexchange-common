package net.response

import core.ErrorCode

class RemovePhotoResponse
private constructor(
  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(): RemovePhotoResponse {
      return RemovePhotoResponse(ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): RemovePhotoResponse {
      return RemovePhotoResponse(errorCode)
    }
  }

}