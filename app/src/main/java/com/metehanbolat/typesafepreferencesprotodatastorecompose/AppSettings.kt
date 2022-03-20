package com.metehanbolat.typesafepreferencesprotodatastorecompose

import kotlinx.collections.immutable.PersistentList
import kotlinx.collections.immutable.persistentListOf
import kotlinx.serialization.Serializable

@Serializable
data class AppSettings(
    var language: Language = Language.ENGLISH,
    val knownLocation: PersistentList<Location> = persistentListOf()
)

@Serializable
data class Location(
    val lat: Double,
    val long: Double
)

enum class Language {
    ENGLISH, GERMAN, SPANISH
}
