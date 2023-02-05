public class SaveComputerToDB implements ISave {
    @Override
    public void save(String path, Computer cmp) {
        System.out.println("Save to DB " + path + ", " + cmp);
    }
}
