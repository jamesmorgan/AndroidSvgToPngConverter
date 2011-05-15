package com.morgan.design

import org.apache.batik.apps.rasterizer.SVGConverter

/**
 * @author James Edward Morgan
 */
class SvgImageCreator {

	public static void main(String[] args) {
		new SvgImageCreator().convert(SizeGroups.ANDROID_DIALOG, [
			"menu_bug",
			"menu_clear_stats",
			"menu_credits",
			"menu_email",
			"menu_improvement",
			"menu_play_again",
			"menu_settings",
			"menu_manage_groups",
			"menu_add_group"
		])
	}

	def convert(def sizes, def filesToConvert){
		filesToConvert.each{ file ->
			sizes.eachWithIndex { i, index ->
				println """Converting ${file} to W:${i[0]} H:${i[1]} for folder: ${SizeGroups.FOLDERS[index]}"""
				convertToPng(file, SizeGroups.FOLDERS[index], i[0], i[1])
			}
		}
	}

	def convertToPng(def name, def folder, def width, def height){
		final SVGConverter svgConverter = new SVGConverter();
		svgConverter.setSources(["images/svg/${name}.svg"]as String[]);
		svgConverter.setHeight(height);
		svgConverter.setWidth(width);
		svgConverter.setDst(new File("images/${folder}/${name}.png"));
		svgConverter.execute();
	}
}
