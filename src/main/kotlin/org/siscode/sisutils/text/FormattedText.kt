package org.siscode.sisutils.text

sealed class FormattedText

class LiteralText(val text: String) : FormattedText()
