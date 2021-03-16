package application.graphics.math

import org.joml.Vector4f

open class Color4f(
    red: Float = 0f,
    green: Float = 0f,
    blue: Float = 0f,
    alpha: Float = 1f
) : Vector4f(
    red,
    green,
    blue,
    alpha
) {

    companion object {
        fun white(): Color4f = Color4f(
            red = 1f,
            green = 1f,
            blue = 1f,
            alpha = 1f
        )
    }

}