package core

enum class ErrorCode(val value: Int) {
  UnknownError(0),
  Ok(1),
  BadRequest(2),
  DatabaseError(3),
  CameraIsNotAvailable(4),
  CameraIsNotStartedException(5),
  TimeoutException(6),
  CouldNotTakePhoto(7),
  NoPhotosInRequest(8),
  NoPhotosToSendBack(9),
  UserDoesNotHaveFirebaseToken(10);

  fun getErrorMessage(): String {
    TODO()
  }

  companion object {
    fun fromInt(value: Int): ErrorCode {
      return ErrorCode.values().first { it.value == value }
    }
  }
}