package application.graphics.widget

import application.graphics.render.Render2dSystem

abstract class WidgetSystem(screenHeight: Float, screenWidth: Float) : Render2dSystem(screenWidth = screenWidth, screenHeight = screenHeight) {

    companion object {
        const val ID : Byte = 3
    }

    override fun getId(): Byte = ID

}