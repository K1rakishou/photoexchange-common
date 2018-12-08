package net.response

import core.ErrorCode

class StartCleanupResponse
private constructor(
  errorCode: ErrorCode
) : StatusResponse(errorCode.value) {

  companion object {
    fun success(): StartCleanupResponse {
      return StartCleanupResponse(ErrorCode.Ok)
    }

    fun fail(errorCode: ErrorCode): StartCleanupResponse {
      return StartCleanupResponse(errorCode)
    }
  }
}