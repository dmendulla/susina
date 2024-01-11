package com.bmhs.firstapp;

import com.badlogic.gdx.backends.lwjgl3.Lwjgl3Application;
import com.badlogic.gdx.backends.lwjgl3.Lwjgl3ApplicationConfiguration;
import com.bmhs.firstapp.AppHandler;

// Please note that on macOS your application needs to be started with the -XstartOnFirstThread JVM argument
public class DesktopLauncher {
	public static void main (String[] arg) {
		Lwjgl3ApplicationConfiguration config = new Lwjgl3ApplicationConfiguration();
		config.setWindowedMode(1920, 1080);
		config.setForegroundFPS(60);
		config.setTitle("LibGdxIntro");
		new Lwjgl3Application(new AppHandler(), config);
	}
}
