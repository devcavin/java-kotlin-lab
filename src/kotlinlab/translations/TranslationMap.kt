package kotlinlab.translations

enum class Lang { EN, DA, DE }

object I18n {
    var currentLang: Lang = Lang.EN

    private val translations = mapOf(
        Lang.EN to mapOf(
            "overview.title" to "Overview",
            "overview.welcome" to "Welcome to the dashboard"
        ),
        Lang.DA to mapOf(
            "overview.title" to "Oversigt",
            "overview.welcome" to "Velkommen til dashboardet"
        )
    )

    fun t(key: String): String =
        translations[currentLang]?.get(key)
            ?: key
}