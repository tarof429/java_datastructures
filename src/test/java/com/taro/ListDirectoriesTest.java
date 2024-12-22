package com.taro;

import java.io.File;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.DirectoryFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;
import org.junit.Test;

public class ListDirectoriesTest {

	@Test
	public void listDirectories() {

		File f = new File("/home/taro/Code/Java/blackboard/target");

		Collection<File> files = FileUtils.listFilesAndDirs(f,
				DirectoryFileFilter.INSTANCE, TrueFileFilter.INSTANCE);

		for (File file : files) {
			System.out.println(file.getAbsolutePath());
		}

		File dir = new File("target");
		String[] ff = dir.list(DirectoryFileFilter.INSTANCE);
		for (int i = 0; i < ff.length; i++) {
			System.out.println(ff[i]);
		}
	}
}
