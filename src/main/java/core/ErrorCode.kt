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
  YouAreBanned(7),
  AccountNotFound(8),
  ExceededMaxPhotoSize(9),
  ServerDiskError(10),
  ServerResizeError(11),
  FileIsNotAnImage(12);

  fun getErrorMessage(): String {
    return when(this) {
      UnknownError -> "Unknown error."
      BadRequest -> "Bad request. Check your input parameters."
      DatabaseError -> "Server database error."
      NoPhotosInRequest -> "No photos were provided in the request."
      NoPhotosToSendBack -> "No photos to send back"
      UserDoesNotHaveFirebaseToken -> "User have not registered yet."
      YouAreBanned -> "You are banned."
      AccountNotFound -> "Account not found."
      ExceededMaxPhotoSize -> "Exceeded max photo size."
      ServerDiskError -> "Unknown server disk error"
      ServerResizeError -> "Could not resize photo on the server"
      FileIsNotAnImage -> "Uploaded file is not an image"

      Ok -> throw IllegalStateException("This should not happen")
    }
  }

  companion object {
    fun fromInt(value: Int): ErrorCode {
      return ErrorCode.values().first { it.value == value }
    }
  }
}