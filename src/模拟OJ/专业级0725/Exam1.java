package 模拟OJ.专业级0725;

import java.nio.charset.StandardCharsets;
import java.util.*;

public class Exam1 {
    static class Command {
        private final String cmd;
        private final int row;
        private final int col;

        Command(String inputStr) {
            String[] inputArray = inputStr.split(" ");
            this.cmd = inputArray[0];
            this.row = Integer.parseInt(inputArray[1]);
            this.col = Integer.parseInt(inputArray[2]);
        }
    }

    static int sum = 0;
    static Set<String> set = new HashSet<>();

    // 待实现函数，在此函数中填入答题代码
    private static int getMatrixSum(int rows, int cols, int[][] baseStations, Command[] commands) {
        boolean[][] matrix = new boolean[rows+1][cols+1];

        for (int i = 0; i < baseStations.length; i++) {
            int[] baseStation = baseStations[i];
            matrix[baseStation[0]][baseStation[1]] = true;
            set.add(baseStation[0] + "," + baseStation[1]);
        }
        for (Command command : commands) {
            if ("delete".equals(command.cmd)) {
                deleteBaseStation(matrix, command.row, command.col);
            } else {
                matrix[command.row][command.col] = true;
                set.add(command.row + "," + command.col);
            }
        }
        for (String s : set) {
            String[] split = s.split(",");
            calculateBaseStation(matrix, rows, cols, Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        }
        return sum;
    }
    private static void deleteBaseStation(boolean[][] matrix, int row, int col) {
        for(int i = row-1; i < row+2; i++) {
            if (i < 1 || i > matrix.length - 1) {
                continue;
            }
            for (int j = col-1; j < col+2; j++) {
                if (j < 1 || j > matrix[0].length - 1) {
                    continue;
                }
                if (matrix[i][j]) {
                    matrix[i][j] = false;
                    set.remove(i + "," + j);
                }
            }
        }
    }
    private static void calculateBaseStation(boolean[][] matrix, int rows, int cols, int row, int col) {
        for(int i = row-1; i < row+2; i++) {
            if (i < 1 || i > rows) {
                continue;
            }
            for (int j = col-1; j < col+2; j++) {
                if (j < 1 || j > cols || (i==row && j==col) || matrix[i][j]) {
                    continue;
                }
                sum += 1;
            }
        }
    }

    // main入口由OJ平台调用
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in, StandardCharsets.UTF_8.name());

        int rows = cin.nextInt();
        int cols = cin.nextInt();
        cin.nextLine();
        int baseStationCnt = Integer.parseInt(cin.nextLine());
        int[][] baseStations = new int[baseStationCnt][2];
        for (int i = 0; i < baseStationCnt; i++) {
            String[] line = cin.nextLine().split(" ");
            baseStations[i][0] = Integer.parseInt(line[0]);
            baseStations[i][1] = Integer.parseInt(line[1]);
        }
        int cmdCnt = Integer.parseInt(cin.nextLine());
        Command[] commands = new Command[cmdCnt];
        for (int i = 0; i < cmdCnt; i++) {
            commands[i] = new Command(cin.nextLine());
        }
        cin.close();
        int result = getMatrixSum(rows, cols, baseStations, commands);
        System.out.println(result);
    }
}
