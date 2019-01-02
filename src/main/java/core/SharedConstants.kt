package core

object SharedConstants {
  const val MAX_PHOTO_SIZE = (10 * (1024 * 1024)).toLong() //10 megabytes
  const val MAX_PACKET_SIZE = (1024 * 64).toLong() //64 kb

  const val NO_GOOGLE_PLAY_SERVICES_DEFAULT_TOKEN = "NO_GOOGLE_PLAY_SERVICES_DEFAULT_TOKEN"

  const val MAX_USER_UUID_LEN = 24
  const val MAX_PHOTO_NAME_LEN = 36
  const val MAX_FIREBASE_TOKEN_LEN = 256
}