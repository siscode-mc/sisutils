package org.siscode.sisutils.text

sealed class FormattedText

class LiteralText(val text: String) : FormattedText()
class StyledText(val styles: FormatStyle, val children: List<FormattedText>) : FormattedText()
