public class SaveComputerToFile implements ISave {
    @Override
    public void save(String path, Computer cmp) {
        System.out.println("Save to file " + path + ", " + cmp);
    }
}
