# HackWithInfy2025 - Greedy Algorithm Solutions

This repository contains Java implementations of classic greedy algorithm problems developed for HackWithInfy2025.

## 📁 Project Structure

```
HackWithInfy2025/
├── GreedyApproach/
│   ├── knapShap.java               # Fractional Knapsack Problem
│   ├── ActivitySelection.java       # Activity Selection Problem
│   ├── BuyTwoChocolate.java        # Buy Two Chocolate Problem
│   └── partition.java              # Array Partition Problem
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
   ```

## 📊 Algorithm Analysis

| Problem | Time Complexity | Space Complexity | Greedy Choice |
|---------|----------------|------------------|---------------|
| Fractional Knapsack | O(n log n) | O(1) | Highest value/weight ratio |
| Activity Selection | O(n log n) | O(1) | Earliest end time |
| Buy Two Chocolate | O(n log n) | O(1) | Two lowest prices |
| Array Partition | O(n log n) | O(1) | Adjacent pairs after sorting |

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
