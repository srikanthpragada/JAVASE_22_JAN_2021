package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FilesDemo {

	public static void main(String[] args) throws IOException {
		Path p = Paths.get("d:\\classroom\\temp.txt");
		System.out.println(p.getClass());
		// Files.delete(p);

	}

}
