package application.graphics.math

import application.core.math.Matrix4f

open class ProjectionMatrix4f(
    val name: String,
    var screenWidth: Float,
    var screenHeight: Float
) : Matrix4f() {
    open fun apply() {}
}