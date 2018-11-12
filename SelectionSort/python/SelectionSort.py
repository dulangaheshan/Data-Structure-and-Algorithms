

def find_min(arr):
    min = arr[0]
    min_index = 0
    for i in range(1, len(arr)):
        if arr[i] < min:
            min = arr[i]
            min_index = i
    return min_index


def selection_sort(arr):
    newArr = []

    for i in range(0, len(arr)):
        smallest = find_min(arr)

        newArr.append(arr.pop(smallest))

    return newArr


print(selection_sort([564, 512, 878, 1, 21, 878, 78, 11]))
