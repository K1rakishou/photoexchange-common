package core

import java.util.concurrent.TimeUnit

object SharedConstants {

  const val MAX_PHOTO_SIZE = 10 * (1024 * 1024) //10 megabytes
  
  //TODO: change in production
  val OLD_PHOTOS_CLEANUP_ROUTINE_INTERVAL = TimeUnit.MINUTES.toMillis(1)
  //TODO: change in production
  val UPLOADED_OLDER_THAN_TIME_DELTA = TimeUnit.MINUTES.toMillis(1)
  //TODO: change in production
  val DELETED_EARLIER_THAN_TIME_DELTA = TimeUnit.MINUTES.toMillis(1)

  const val PHOTOS_DELIMITER = ','

}