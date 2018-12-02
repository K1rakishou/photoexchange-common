package core

import java.lang.IllegalStateException

enum class ErrorCode(val value: Int) {
  UnknownError(0),
  Ok(1),
  BadRequest(2),
  DatabaseError(3),
  NoPhotosInRequest(4),
  NoPhotosToSendBack(5),
  UserDoesNotHaveFirebaseToken(6),
  YouAreBanned(7);

  fun getErrorMessage(): String {
    return when(this) {
      UnknownError -> "Unknown error."
      BadRequest -> "Bad request. Check your input parameters."
      DatabaseError -> "Server database error."
      NoPhotosInRequest -> "No photos were provided in the request."
      NoPhotosToSendBack -> "No photos to send back"
      UserDoesNotHaveFirebaseToken -> "User have not registered yet."
      YouAreBanned -> "You are banned."

      Ok -> throw IllegalStateException("This should not happen")
    }
  }

  companion object {
    fun fromInt(value: Int): ErrorCode {
      return ErrorCode.values().first { it.value == value }
    }
  }
}