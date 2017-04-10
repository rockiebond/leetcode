def binarySearch(a, target):
    lo = 1
    hi = len(a)-1
    while lo <= hi:
        mid = (lo + hi) / 2
        if a[mid] == target:
            return mid
        elif a[mid] < target:
            lo = mid + 1
        else:
            hi = mid - 1
    return -1

a = [1, 3, 5, 7, 9, 10]
print '[%s]' % ', '.join(map(str, a))
print("\n")
value = 3
print("searching " + str(value) + "\n")
print(binarySearch(a, 3))
