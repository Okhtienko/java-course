package com.it.technology.lesson17.classes;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public final class DirectoryService {
    public List<Path> processFilesFromDirectory(final String pathDirectory) throws IOException {
        if (isDirectoryEmpty(pathDirectory)) {
            throw new IOException("Directory " + pathDirectory + " is empty");
        }

        try (Stream<Path> filesStream = Files.find(Paths.get(pathDirectory), Integer.MAX_VALUE,
                ((path, basicFileAttributes) -> path.toFile().getName().matches("(?i).*.txt")))) {

            return filesStream.toList();

        } catch (IOException exception) {
            exception.printStackTrace();
        }
        return new ArrayList<>();
    }

    private boolean isDirectoryEmpty(final String pathDirectory) throws IOException {
        try (DirectoryStream<Path> directory = Files.newDirectoryStream(Path.of(pathDirectory))) {
            return !directory.iterator().hasNext();
        }
    }
}

