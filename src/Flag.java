/**
 * Licensed under GPL (available in source code directory)
 * @author pascal
 */
public class Flag {
    public static final int HEIGHT = 20, WIDTH = 70;
    public static final String MESSAGE = "72 tahun Indonesia Kerja Bersama / Teknik Informatika UNPAR /";
    public static void main(String[] args) {
        for (int i = 0; i < HEIGHT; i++) {
            for (int j = 0; j < WIDTH; j++) {
                if (i == 0 || j == 0 || i == HEIGHT - 1 || j == WIDTH - 1) {
                    System.out.print("\033[0m");
                } else if (i < HEIGHT / 2) {
                    System.out.print("\033[37;41m");
                } else {
                    System.out.print("\033[31;47m");
                }
                System.out.print(MESSAGE.charAt((i * WIDTH + j) % MESSAGE.length()));
            }
            System.out.println();
        }
    }
}
