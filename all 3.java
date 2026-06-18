public void saveHistory(String filename) throws IOException {
    Path path = Paths.get(filename);
    if (!path.isAbsolute()) {
        path = Paths.get(System.getProperty("user.dir")).resolve(filename);
    }
    Files.write(path, historyLines, StandardOpenOption.CREATE);
}