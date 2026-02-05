package pt.atec.a0x_apis

import com.google.gson.annotations.SerializedName

/*

  {
    "postId": int
    "id": int
    "name": str
    "email": str
    "body":  str

  },


 */

class Coment (

    @SerializedName("postId") val postId: Int,
    @SerializedName("id") val id: Int,
    @SerializedName("name") val name: String,
    @SerializedName("email") val email: String,
    @SerializedName("body") val body: String,
)