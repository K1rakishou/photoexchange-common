package core

object SharedConstants {
  const val MAX_PHOTO_SIZE = (10 * (1024 * 1024)).toLong() //10 megabytes
  const val MAX_PACKET_SIZE = (1024 * 64).toLong() //64 kb

  const val NO_GOOGLE_PLAY_SERVICES_DEFAULT_TOKEN = "NO_GOOGLE_PLAY_SERVICES_DEFAULT_TOKEN"
  const val DOMAIN = "photoexchange.io"

  // uh94qlfp4xykp9kcprva@photoexchange.io
  // ^                    ^
  // +-- user uuid        |
  // Domain --------------+

  const val MAX_DOMAIN_LEN = 16
  const val USER_UUID_LEN = 20
  const val FULL_USER_UUID_LEN = USER_UUID_LEN + MAX_DOMAIN_LEN + 1 //1 is for the "@" symbol

  const val MAX_PHOTO_NAME_LEN = 36
  const val MAX_FIREBASE_TOKEN_LEN = 256
}