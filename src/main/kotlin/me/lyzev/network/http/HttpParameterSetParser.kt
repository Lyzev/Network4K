package me.lyzev.network.http

/**
 * Parses a set of HTTP parameters.
 *
 * @author Lyzev
 * @param parameters The HTTP parameter sets to parse.
 */
internal class HttpParameterSetParser(private val parameters: HttpParameterSet) {

    /**
     * Parses the HTTP parameter sets.
     *
     * @return The parsed HTTP parameter sets.
     */
    fun asString(): String {
        if (parameters.toList().isEmpty()) return ""
        val result = StringBuilder("?")
        for (parameter in parameters.toList()) {
            result.append(parameter.name)
            result.append("=")
            result.append(parameter.value)
            result.append("&")
        }
        return withoutLastCharacter(result)
    }

    /**
     * Removes the last character from the given string builder.
     *
     * @param stringBuilder The string builder to remove the last character from.
     * @return The string builder without the last character.
     */
    private fun withoutLastCharacter(stringBuilder: StringBuilder): String = stringBuilder.substring(0, stringBuilder.length - 1)
}