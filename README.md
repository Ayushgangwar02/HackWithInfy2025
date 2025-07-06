# HackWithInfy2025 - Greedy Algorithm Solutions

This repository contains Java implementations of classic greedy algorithm problems developed for HackWithInfy2025.

## 📁 Project Structure

```
HackWithInfy2025/
├── GreedyApproach/
│   ├── knapShap.java               # Fractional Knapsack Problem
│   ├── ActivitySelection.java       # Activity Selection Problem
│   ├── BuyTwoChocolate.java        # Buy Two Chocolate Problem
│   ├── partition.java              # Array Partition Problem
│   ├── DiStringMatch.java          # DI String Match Problem
│   ├── minCoin.java                # Minimum Coin Change Problem (DP)
│   └── JobSeqPro.java              # Job Sequencing Problem
└── README.md                        # This file
```

## 🎯 Problems Solved

### 1. Fractional Knapsack Problem (`GreedyApproach/knapShap.java`)

**Problem Statement:**
Given a set of items with weights and values, and a knapsack with limited capacity, maximize the total value by selecting items (fractions allowed).

**Algorithm Approach:**
- **Greedy Strategy**: Sort items by value-to-weight ratio in descending order
- **Time Complexity**: O(n log n) due to sorting
- **Space Complexity**: O(1)

**Solution Explanation:**
1. Create an `Item` class to store value and weight
2. Sort items by value/weight ratio (highest first)
3. Greedily select items:
   - If item fits completely, take it entirely
   - If item doesn't fit, take fractional part
4. Return maximum value achieved

**Example:**
```
Items: [(value=60, weight=10), (value=100, weight=20), (value=120, weight=30)]
Capacity: 50
Ratios: [6.0, 5.0, 4.0]
Result: 60 + 100 + (120 * 20/30) = 240.0
```

**How to Run:**
```bash
cd GreedyApproach
javac knapShap.java
java GreedyApproach.knapShap
```

### 2. Activity Selection Problem (`GreedyApproach/ActivitySelection.java`)

**Problem Statement:**
Given a set of activities with start and end times, select the maximum number of non-overlapping activities.

**Algorithm Approach:**
- **Greedy Strategy**: Sort activities by end time, select earliest ending non-conflicting activities
- **Time Complexity**: O(n log n) due to sorting
- **Space Complexity**: O(1)

**Solution Explanation:**
1. Create an `Activity` class to store start and end times
2. Sort activities by end time (earliest first)
3. Greedily select activities:
   - Always select first activity
   - For remaining activities, select if start time ≥ last selected end time
4. Return count of selected activities

**Example:**
```
Activities: [(1,3), (2,4), (3,5), (0,6), (5,7), (8,9)]
After sorting by end time: [(1,3), (2,4), (3,5), (0,6), (5,7), (8,9)]
Selected: (1,3), (5,7), (8,9)
Result: 3 activities
```

**How to Run:**
```bash
cd GreedyApproach
javac ActivitySelection.java
java GreedyApproach.ActivitySelection
```

### 3. Buy Two Chocolate Problem (`GreedyApproach/BuyTwoChocolate.java`)

**Problem Statement:**
Given an array of chocolate prices and an amount of money, find the leftover money after buying the two cheapest chocolates (if possible).

**Algorithm Approach:**
- **Greedy Strategy**: Sort prices and select the two cheapest chocolates
- **Time Complexity**: O(n log n) due to sorting
- **Space Complexity**: O(1)

**Solution Explanation:**
1. Sort the chocolate prices in ascending order
2. Take the two cheapest chocolates (first two elements after sorting)
3. Calculate total cost of the two cheapest chocolates
4. If total cost ≤ available money, return leftover money
5. Otherwise, return original money (can't afford two chocolates)

**Example:**
```
Prices: [1, 2, 2]
Money: 3
After sorting: [1, 2, 2]
Two cheapest: 1 + 2 = 3
Since 3 ≤ 3, leftover = 3 - 3 = 0
```

**How to Run:**
```bash
cd GreedyApproach
javac BuyTwoChocolate.java
java GreedyApproach.Solution
```

### 4. Array Partition Problem (`GreedyApproach/partition.java`)

**Problem Statement:**
Given an integer array of 2n integers, group these integers into n pairs such that the sum of min(ai, bi) for all i is maximized.

**Algorithm Approach:**
- **Greedy Strategy**: Sort the array and pair adjacent elements
- **Time Complexity**: O(n log n) due to sorting
- **Space Complexity**: O(1)

**Solution Explanation:**
1. Sort the array in ascending order
2. Pair adjacent elements: (nums[0], nums[1]), (nums[2], nums[3]), etc.
3. Take the minimum of each pair (which will be the first element after sorting)
4. Sum all the minimums to get the maximum possible sum

**Key Insight:**
After sorting, pairing adjacent elements ensures that we minimize the "waste" - the larger element in each pair that doesn't contribute to the sum.

**Example:**
```
Input: [1, 4, 3, 2, 6, 5]
After sorting: [1, 2, 3, 4, 5, 6]
Pairs: (1,2), (3,4), (5,6)
Sum of mins: 1 + 3 + 5 = 9
```

**How to Run:**
```bash
cd GreedyApproach
javac partition.java
java GreedyApproach.partition
```

### 5. DI String Match Problem (`GreedyApproach/DiStringMatch.java`)

**Problem Statement:**
Given a string s containing only 'I' (Increasing) and 'D' (Decreasing), return any permutation of [0, 1, 2, ..., n] such that for all i:
- If s[i] == 'I', then perm[i] < perm[i+1]
- If s[i] == 'D', then perm[i] > perm[i+1]

**Algorithm Approach:**
- **Greedy Strategy**: Use two pointers (low and high) to assign values
- **Time Complexity**: O(n) - single pass through string
- **Space Complexity**: O(1) - excluding output array

**Solution Explanation:**
1. Initialize `low = 0` and `high = n` (where n is string length)
2. For each character in the string:
   - If 'I' (Increasing): assign `low` and increment `low`
   - If 'D' (Decreasing): assign `high` and decrement `high`
3. Assign the remaining value (`low` or `high`) to the last position

**Key Insight:**
By using the smallest available number for 'I' and largest for 'D', we ensure all constraints are satisfied.

**Example:**
```
Input: s = "IDID"
Process: I->0, D->4, I->1, D->3, last->2
Output: [0, 4, 1, 3, 2]
Verification: 0<4, 4>1, 1<3, 3>2 ✓
```

**How to Run:**
```bash
cd GreedyApproach
javac DiStringMatch.java
java GreedyApproach.DiStringMatch
```

### 6. Minimum Coin Change Problem (`GreedyApproach/minCoin.java`)

**Problem Statement:**
Given an array of coin denominations and a target amount, find the minimum number of coins needed to make that amount. Return -1 if it's impossible.

**Algorithm Approach:**
- **Strategy**: Dynamic Programming (Note: Greedy doesn't work for all coin systems)
- **Time Complexity**: O(amount × coins.length)
- **Space Complexity**: O(amount)

**Solution Explanation:**
1. Create a DP array where `dp[i]` represents minimum coins needed for amount `i`
2. Initialize `dp[0] = 0` (0 coins needed for amount 0)
3. For each amount from 1 to target:
   - Try each coin denomination
   - If coin ≤ current amount, update: `dp[i] = min(dp[i], dp[i-coin] + 1)`
4. Return `dp[amount]` if possible, otherwise -1

**Why Not Greedy?**
Greedy (always pick largest coin) fails for systems like [1,3,4] with amount=6:
- Greedy: 4+1+1 = 3 coins
- Optimal: 3+3 = 2 coins

**Example:**
```
Coins: [1, 2, 5], Amount: 11
DP process: dp[11] = min(dp[10]+1, dp[9]+1, dp[6]+1) = 3
Result: 3 coins (5+5+1)
```

**How to Run:**
```bash
cd GreedyApproach
javac minCoin.java
java GreedyApproach.minCoin
```

### 7. Job Sequencing Problem (`GreedyApproach/JobSeqPro.java`)

**Problem Statement:**
Given a set of jobs with deadlines and profits, schedule jobs to maximize profit such that no two jobs overlap and each job is completed before its deadline.

**Algorithm Approach:**
- **Greedy Strategy**: Sort jobs by profit (highest first), then assign to latest possible slot
- **Time Complexity**: O(n²) where n is number of jobs
- **Space Complexity**: O(max_deadline)

**Solution Explanation:**
1. Create a `Job` class with id, profit, and deadline
2. Sort jobs by profit in descending order (greedy choice: highest profit first)
3. Create a boolean array to track occupied time slots
4. For each job, try to assign it to the latest possible slot before its deadline
5. If a slot is available, assign the job and add profit to total

**Key Insight:**
By sorting by profit and assigning to the latest possible slot, we maximize the chance of fitting more high-profit jobs.

**Example:**
```
Jobs: [("a",100,2), ("b",19,1), ("c",27,2), ("d",25,1), ("e",15,3)]
After sorting by profit: [("a",100,2), ("c",27,2), ("d",25,1), ("b",19,1), ("e",15,3)]
Schedule: Job "a" at slot 2, Job "c" at slot 1, Job "e" at slot 3
Total profit: 100 + 27 + 15 = 142
```

**How to Run:**
```bash
cd GreedyApproach
javac JobSeqPro.java
java GreedyApproach.JobSeqPro
```

## 🔧 Key Features

- **Clean Code**: Well-structured, readable Java implementations
- **Optimal Solutions**: Both algorithms use optimal greedy strategies
- **Comprehensive Comments**: Code includes explanatory comments
- **Example Data**: Pre-configured test cases for easy verification

## 🚀 Getting Started

1. **Clone the repository:**
   ```bash
   git clone git@github.com:Ayushgangwar02/HackWithInfy2025.git
   cd HackWithInfy2025
   ```

2. **Compile and run individual programs:**
   ```bash
   cd GreedyApproach

   # For Fractional Knapsack
   javac knapShap.java && java GreedyApproach.knapShap

   # For Activity Selection
   javac ActivitySelection.java && java GreedyApproach.ActivitySelection

   # For Buy Two Chocolate
   javac BuyTwoChocolate.java && java GreedyApproach.Solution

   # For Array Partition
   javac partition.java && java GreedyApproach.partition

   # For DI String Match
   javac DiStringMatch.java && java GreedyApproach.DiStringMatch

   # For Minimum Coin Change
   javac minCoin.java && java GreedyApproach.minCoin

   # For Job Sequencing
   javac JobSeqPro.java && java GreedyApproach.JobSeqPro
   ```

## 📊 Algorithm Analysis

| Problem | Time Complexity | Space Complexity | Strategy |
|---------|----------------|------------------|----------|
| Fractional Knapsack | O(n log n) | O(1) | Greedy: Highest value/weight ratio |
| Activity Selection | O(n log n) | O(1) | Greedy: Earliest end time |
| Buy Two Chocolate | O(n log n) | O(1) | Greedy: Two lowest prices |
| Array Partition | O(n log n) | O(1) | Greedy: Adjacent pairs after sorting |
| DI String Match | O(n) | O(1) | Greedy: Min for 'I', Max for 'D' |
| Minimum Coin Change | O(amount × coins) | O(amount) | DP: Optimal substructure |
| Job Sequencing | O(n²) | O(max_deadline) | Greedy: Highest profit first |

## 🎓 Learning Outcomes

- Understanding greedy algorithm paradigm
- Implementing optimal sorting-based solutions
- Working with custom comparators in Java
- Solving classic computer science problems

## 👨‍💻 Author

**Ayush Gangwar**
- GitHub: [@Ayushgangwar02](https://github.com/Ayushgangwar02)
- Repository: [HackWithInfy2025](https://github.com/Ayushgangwar02/HackWithInfy2025)

## 📝 License

This project is open source and available under the [MIT License](LICENSE).

---

*Developed for HackWithInfy2025 - Demonstrating efficient greedy algorithm implementations in Java.*
