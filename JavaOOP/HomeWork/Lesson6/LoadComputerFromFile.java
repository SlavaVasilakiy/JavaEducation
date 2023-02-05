public class LoadComputerFromFile implements ILoad {
    @Override
    public void load(String path, Computer cmp) {
        System.out.println("Load from File " + path + ", " + cmp);
    }
}
