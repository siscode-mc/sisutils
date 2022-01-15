package org.siscode.sisutils.text

interface TextAdapter<T> {
    fun parse(obj: T) : FormattedText
    fun serialize(formattedText: FormattedText) : T
}
