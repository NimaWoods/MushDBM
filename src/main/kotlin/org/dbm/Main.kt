package org.example

import javax.swing.JButton
import javax.swing.JFrame
import javax.swing.JLabel
import javax.swing.JPanel
import java.awt.BorderLayout

class Main {

    fun main() {
        val frame = JFrame("Hello Kotlin + Swing")
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setSize(300, 200)

        val panel = JPanel(BorderLayout())
        val label = JLabel("Hello, World!", JLabel.CENTER)
        val button = JButton("Click Me")

        button.addActionListener {
            label.text = "Button Clicked!"
        }

        panel.add(label, BorderLayout.CENTER)
        panel.add(button, BorderLayout.SOUTH)

        frame.contentPane = panel

        frame.isVisible = true
    }

}
