import java.util.Stack;

class Solution {
    public int[] solution_array(int[] prices) {
        int[] seconds = new int[prices.length];
        int currentPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            if (currentPrice > prices[i]) {
                for (int j = 0; j < i; j++) {
                    if (prices[j] > prices[i] && seconds[j] == 0) {
                        seconds[j] = i - j;
                    }
                }
            }
            currentPrice = prices[i];
        }

        for (int i = 0; i < prices.length; i++) {
            if (seconds[i] == 0) {
                seconds[i] = prices.length - 1 - i;
            }
        }

        return seconds;
    }

    public int[] solution(int[] prices) {
        int[] seconds = new int[prices.length];
        Stack<StockPrice> priceStack = new Stack<>();
        int currentPrice = 0;

        for (int i = 0; i < prices.length; i++) {
            if (currentPrice > prices[i]) {
                while (priceStack.peek().getPrice() > prices[i]) {
                    StockPrice price = priceStack.pop();
                    seconds[price.getTime()] = i - price.getTime();
                    if (priceStack.isEmpty()) break;
                }
            }
            priceStack.push(new StockPrice(prices[i], i));
            currentPrice = prices[i];
        }

        while (!priceStack.isEmpty()) {
            StockPrice price = priceStack.pop();
            seconds[price.getTime()] = seconds.length - 1 - price.getTime();
        }

        return seconds;
    }
}

class StockPrice {
    private final int price;
    private final int time;

    StockPrice(int price, int time) {
        this.price = price;
        this.time = time;
    }

    public int getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }
}

class Main {
    public static void main(String[] args) {
        int[] prices = new int[1000000];
        for (int i = 0; i < 1000000; i++) {
            prices[i] = (int)(Math.random() * 10000) + 1;
        }

        long stackStart = System.currentTimeMillis();
        int[] stackResults = new Solution().solution(prices);
        System.out.println("[stack] Total Time spend : " + (long) (System.currentTimeMillis() - stackStart));
        long start = System.currentTimeMillis();
        int[] results = new Solution().solution_array(prices);
        System.out.println("[array] Total Time spend : " + (long) (System.currentTimeMillis() - start));


        int check = 0;
        for (; check < 10000; check++) {
            if (results[check] != stackResults[check]) break;
        }
        if (check != 10000) {
            System.out.println("Test Failed....");
        } else {
            System.out.println("Test Perfect!!");
        }
    }
}