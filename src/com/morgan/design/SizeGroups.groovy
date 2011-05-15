package com.morgan.design


/**
 * @author James Edward Morgan
 */
class SizeGroups {


	def static  ANDROID_MENU_SIZES = [
		[_36_PX, _36_PX],
		[_48_PX, _48_PX],
		[_72_PX, _72_PX
		]
	];

	def static ANDROID_LAUNCHER_SIZES = [
		[_36_PX, _36_PX],
		[_48_PX, _48_PX],
		[_72_PX, _72_PX
		]
	];

	def static  ANDROID_2_2_STATUS_BAR = [
		[_19_PX, _19_PX],
		[_25_PX, _25_PX],
		[_38_PX, _38_PX]
	];


	def static  ANDROID_TAB = [
		[_24_PX, _24_PX],
		[_32_PX, _32_PX],
		[_48_PX, _48_PX]
	];

	def static  ANDROID_DIALOG = ANDROID_TAB;
	def static  ANDROID_LIST_VIEW = ANDROID_TAB;

	def static FOLDERS =["ldpi", "mdpi", "hdpi"]

	private static final int _19_PX = 19;
	private static final int _24_PX = 24;
	private static final int _25_PX = 25;
	private static final int _36_PX = 36;
	private static final int _32_PX = 32;
	private static final int _38_PX = 38;
	private static final int _48_PX = 48;
	private static final int _72_PX = 72;
}
