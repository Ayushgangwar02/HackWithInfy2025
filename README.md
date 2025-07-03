# HackWithInfy2025 - Greedy Algorithm Solutions

This repository contains Java implementations of classic greedy algorithm problems developed for HackWithInfy2025.

## 📁 Project Structure

```
HackWithInfy2025/
├── knapShap.java                    # Fractional Knapsack Problem
├── GreedyApproach/
│   └── ActivitySelection.java       # Activity Selection Problem
└── README.md                        # This file
```

## 🎯 Problems Solved

### 1. Fractional Knapsack Problem (`knapShap.java`)

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
javac knapShap.java
java knapShap
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
   # For Fractional Knapsack
   javac knapShap.java && java knapShap
   
   # For Activity Selection
   javac GreedyApproach/ActivitySelection.java && java GreedyApproach.ActivitySelection
   ```

## 📊 Algorithm Analysis

| Problem | Time Complexity | Space Complexity | Greedy Choice |
|---------|----------------|------------------|---------------|
| Fractional Knapsack | O(n log n) | O(1) | Highest value/weight ratio |
| Activity Selection | O(n log n) | O(1) | Earliest end time |

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
