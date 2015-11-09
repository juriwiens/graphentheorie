public class Test {
    public static void main(String[] args) {
        final String path0 = Delivery.search(TestMap.testmap0);
        final String path1 = Delivery.search(TestMap.testmap1);
        final String path2 = Delivery.search(TestMap.testmap2);
        final String path3 = Delivery.search(TestMap.testmap3);

        System.out.println(path0 + " check: " + CheckPath.checkPath(TestMap.testmap0, path0));
        System.out.println(path1 + " check: " + CheckPath.checkPath(TestMap.testmap1, path1));
        System.out.println(path2 + " check: " + CheckPath.checkPath(TestMap.testmap2, path2));
        System.out.println(path3);
    }
}
