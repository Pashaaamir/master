package interview.aamir.InterviewPreparation.StringInterviewQuestions;

import java.util.HashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {

    }
    class Solution {
       // class Solution {
            public boolean solution(String moves) {
                int x = 0, y = 0;
                int minX = 0, maxX = 0, minY = 0, maxY = 0;
                Set<String> visited = new HashSet<>();
                visited.add("0,0");

                for (char instruction : moves.toCharArray()) {
                    switch (instruction) {
                        case '^':
                            y++;
                            break;
                        case 'v':
                            y--;
                            break;
                        case '<':
                            x--;
                            break;
                        case '>':
                            x++;
                            break;
                    }

                    String currentPosition = x + "," + y;
                    if (visited.contains(currentPosition)) {
                        return false;
                    }
                    visited.add(currentPosition);

                    minX = Math.min(minX, x);
                    maxX = Math.max(maxX, x);
                    minY = Math.min(minY, y);
                    maxY = Math.max(maxY, y);
                }

                int width = maxX - minX + 1;
                int height = maxY - minY + 1;
                int expectedArea = width * height;
                int actualArea = moves.length();

                boolean startsAtOrigin = x == 0 && y == 0;
                boolean returnsToOrigin = x == 0 && y == 0 && !(moves.charAt(0) == '^' && moves.charAt(moves.length() - 1) == '^');


                long countA = moves.chars().filter(ch -> ch == '^').count();
                long countV = moves.chars().filter(ch -> ch == 'v').count();
                long countLeft = moves.chars().filter(ch -> ch == '<').count();
                long countRight = moves.chars().filter(ch -> ch == '>').count();
                boolean equalInstructions = countA == countV && countLeft == countRight;

                return expectedArea == actualArea && startsAtOrigin && returnsToOrigin && equalInstructions;
            }
        }

    }


