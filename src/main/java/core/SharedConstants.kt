package core

object SharedConstants {
  const val MAX_PHOTO_SIZE = (10 * (1024 * 1024)).toLong() //10 megabytes
  const val MAX_PACKET_SIZE = (1024 * 256).toLong() //256 kb

  const val NO_GOOGLE_PLAY_SERVICES_DEFAULT_TOKEN = "NO_GOOGLE_PLAY_SERVICES_DEFAULT_TOKEN"

  const val USER_ID_LEN = 20
  const val PHOTO_NAME_LEN = 32
}