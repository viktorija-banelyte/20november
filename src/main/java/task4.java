
import java.util.Scanner;
import java.io.File;


    public static long getSize(File folder) {
        long size = 0;

        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    size += file.length();
                } else {
                    size += getSize(file);
                }
            }
        }

        return size;
    }

    public static void showFolders(File folder) {
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    long size = getSize(file);

                    System.out.println("Folder: " + file.getName());
                    System.out.println("Bytes: " + size);
                    System.out.println("KB: " + size / 1024.0);
                    System.out.println("MB: " + size / (1024.0 * 1024.0));

                    showFolders(file);
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter folder path: ");
        String path = sc.nextLine();

        File folder = new File(path);

        if (folder.exists() && folder.isDirectory()) {

            long size = getSize(folder);

            System.out.println("\nTotal folder size:");
            System.out.println("Bytes: " + size);
            System.out.println("KB: " + size / 1024.0);
            System.out.println("MB: " + size / (1024.0 * 1024.0));

            System.out.println("\nSubfolders:");
            showFolders(folder);

        } else {
            System.out.println("Error: Folder does not exist!");
        }

        sc.close();
    }

