package com.cards.framework.gui;

import java.awt.Font;
import java.awt.FontMetrics;

import javax.swing.Icon;
import javax.swing.JLabel;

public class Button extends JLabel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8345716504294723050L;

	public Button(String text, Icon image, Font font) {
		super(text, image, CENTER);
		setFont(font);
		FontMetrics metrics = getFontMetrics(font);
		int width = image.getIconWidth() / 2;
		width += metrics.stringWidth(text) / 2;
		setIconTextGap(-width);
		this.setAlignmentX(CENTER_ALIGNMENT);
	}

}