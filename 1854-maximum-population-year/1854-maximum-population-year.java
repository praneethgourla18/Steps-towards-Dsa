class Solution {
    public int maximumPopulation(int[][] logs) {
        // Initialize an array to store population count for each year from 1950 to 2050
        int[] populationCount = new int[101]; // 2050 - 1950 + 1 = 101
        
        // Iterate through the logs and update population count
        for (int i = 0; i < logs.length; i++) {
            int birthYear = logs[i][0];
            int deathYear = logs[i][1];
            
            // Increment population count for birth year
            populationCount[birthYear - 1950]++;
            
            // Decrement population count for year after death year
            if (deathYear < 2050)
                populationCount[deathYear - 1950]--;
        }
        
        // Iterate through population count to find the year with maximum population
        int maxPopulationYear = 1950;
        int maxPopulation = populationCount[0];
        int currentPopulation = populationCount[0];
        for (int i = 1; i < populationCount.length; i++) {
            currentPopulation += populationCount[i];
            if (currentPopulation > maxPopulation) {
                maxPopulation = currentPopulation;
                maxPopulationYear = 1950 + i;
            }
        }
        
        return maxPopulationYear;
    }
}
