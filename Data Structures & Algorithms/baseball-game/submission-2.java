class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> s = new Stack<>();
        int points = 0;
        for(String op : operations) {
            switch (op) {
                case "+":
                    int a = s.pop();
                    int b = s.pop();

                    s.push(b);
                    s.push(a);

                    points += s.push(a+b);
                    break;

                case "C":
                    points -= s.pop();
                    break;

                case "D":
                    points += s.push(2 * s.peek());
                    break;

                default:
                    try {
                        points += s.push(Integer.parseInt(op));
                    } catch (NumberFormatException nfe) {
                        System.out.println("Invalid symbol: " + op);
                        nfe.printStackTrace();
                        
                        return -1;
                    }
                    break;
            }
        }
        return points;
    }
}