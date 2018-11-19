package net.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

open class StatusResponse(

	@Expose
	@SerializedName("server_error_code")
	var errorCode: Int
) {

	companion object {
		fun from(errorCode: Int) = StatusResponse(errorCode)
	}
}