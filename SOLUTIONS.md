# Arrays and Methods: Annotated Solutions

Each solution includes a brief explanation where helpful. 

## Problem 1 — Sum Using a Method

We loop from index 0 to `arr.length - 1` and accumulate a running total.

```java
public int sumArray(int[] arr) {
    int total = 0;
    for (int i = 0; i < arr.length; i++) {
        total += arr[i];
    }
    return total;
}

public void run() {
    int[] nums = {3, 9, 2, 7, 4};

    int result = sumArray(nums);
    System.out.println("Sum = " + result);
}
```

## Problem 2 — Add a Bonus to Every Mark

Modifying an array inside a method changes the original array.  
We update each value one index at a time.

```java
public void addBonus(int[] marks, int bonus) {
    for (int i = 0; i < marks.length; i++) {
        marks[i] += bonus;
    }
}

public void run() {
    int[] marks = {10, 7, 8, 9, 6};

    System.out.print("Original: ");
    for (int i = 0; i < marks.length; i++) {
        System.out.print(marks[i] + " ");
    }
    System.out.println();

    addBonus(marks, 2);

    System.out.print("After bonus: ");
    for (int i = 0; i < marks.length; i++) {
        System.out.print(marks[i] + " ");
    }
}
```

## Problem 3 — Count Above Threshold

We compare each element to `limit` and count matches.

```java
public int countAbove(int[] arr, int limit) {
    int count = 0;
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] > limit) {
            count++;
        }
    }
    return count;
}

public void run() {
    int[] values = {8, 12, 3, 14, 6};
    int limit = 10;

    int result = countAbove(values, limit);
    System.out.println("Count above " + limit + ": " + result);
}
```

## Problem 4 — Copy Array (Method Returns New Array)

Copying using a loop ensures we create a *new* array rather than another reference.

```java
public int[] copyArray(int[] arr) {
    int[] copy = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
        copy[i] = arr[i];
    }
    return copy;
}

public void run() {
    int[] original = {4, 1, 9};
    int[] result = copyArray(original);

    System.out.print("Original: ");
    for (int i = 0; i < original.length; i++) {
        System.out.print(original[i] + " ");
    }
    System.out.println();

    System.out.print("Copy:     ");
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
    }
}
```

## Problem 5 — Extract the Middle Pair

For an even-length array, the two middle elements begin at index `length / 2 - 1`.

```java
public int[] middleTwo(int[] nums) {
    int mid = nums.length / 2;

    int[] result = new int[2];
    result[0] = nums[mid - 1];
    result[1] = nums[mid];
    return result;
}

public void run() {
    int[] nums = {4, 7, 9, 12, 15, 20};

    int[] result = middleTwo(nums);

    System.out.print("Middle two result: ");
    for (int i = 0; i < result.length; i++) {
        System.out.print(result[i] + " ");
    }
}
```

## Problem 6 — Multiply All Elements

Modifying in-place updates the caller's array.

```java
public void multiplyAll(int[] arr, int factor) {
    for (int i = 0; i < arr.length; i++) {
        arr[i] *= factor;
    }
}

public void run() {
    int[] arr = {2, 4, 6};

    System.out.print("Before: ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();

    multiplyAll(arr, 3);

    System.out.print("After:  ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
```

## Problem 7 — Index of Target

Return the first index where `target` appears, or `-1` if not found.

```java
public int findIndex(int[] arr, int target) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] == target) {
            return i;
        }
    }
    return -1;
}

public void run() {
    int[] nums = {5, 8, 2, 8, 1};
    int target = 8;

    int index = findIndex(nums, target);
    System.out.println("Found at index: " + index);
}
```

## Problem 8 — Reverse Copy

A reverse copy walks the original array backward.

```java
public int[] reverseCopy(int[] arr) {
    int[] reversed = new int[arr.length];

    for (int i = 0; i < arr.length; i++) {
        reversed[i] = arr[arr.length - 1 - i];
    }
    return reversed;
}

public void run() {
    int[] arr = {3, 7, 1, 9};
    int[] rev = reverseCopy(arr);

    System.out.print("Original: ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();

    System.out.print("Reversed: ");
    for (int i = 0; i < rev.length; i++) {
        System.out.print(rev[i] + " ");
    }
}
```

## Problem 9 — Replace Negatives

We check each value and assign zero where needed.

```java
public void replaceNegatives(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
        if (arr[i] < 0) {
            arr[i] = 0;
        }
    }
}

public void run() {
    int[] arr = {-3, 4, -1, 7};

    replaceNegatives(arr);

    System.out.print("Updated: ");
    for (int i = 0; i < arr.length; i++) {
        System.out.print(arr[i] + " ");
    }
}
```

## Problem 10 — Pairwise Sums

The resulting array has length `arr.length - 1` because sums exist between neighbours.

```java
public int[] pairwiseSums(int[] arr) {
    int[] result = new int[arr.length - 1];

    for (int i = 0; i < result.length; i++) {
        result[i] = arr[i] + arr[i + 1];
    }
    return result;
}

public void run() {
    int[] arr = {4, 6, 2, 5};
    int[] sums = pairwiseSums(arr);

    System.out.print("Pairwise sums: ");
    for (int i = 0; i < sums.length; i++) {
        System.out.print(sums[i] + " ");
    }
}
```
