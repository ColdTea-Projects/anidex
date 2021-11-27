package de.coldtea.anidex.domain.model

import de.coldtea.anidex.data.model.animesbygenre.AnimeResponse

data class AnimeByGenreBundle(val id: Int, val name: String, val animes: List<AnimeResponse>)