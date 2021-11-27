package de.coldtea.anidex.data.model.animesbygenre


import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ExplicitGenreResponse(
    @SerialName("mal_id")
    var malId: Int?,
    @SerialName("name")
    var name: String?,
    @SerialName("type")
    var type: String?,
    @SerialName("url")
    var url: String?
)