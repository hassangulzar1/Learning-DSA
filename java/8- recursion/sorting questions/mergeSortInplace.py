def merge_sort_in_place(arr, s, e):
    if e - s == 1:
        return

    mid = (s + e) // 2

    merge_sort_in_place(arr, s, mid)
    merge_sort_in_place(arr, mid, e)

    merge_in_place(arr, s, mid, e)

def merge_in_place(arr, s, m, e):
    mix = [0] * (e - s)

    i, j, k = s, m, 0

    while i < m and j < e:
        if arr[i] < arr[j]:
            mix[k] = arr[i]
            i += 1
        else:
            mix[k] = arr[j]
            j += 1
        k += 1

    while i < m:
        mix[k] = arr[i]
        i += 1
        k += 1

    while j < e:
        mix[k] = arr[j]
        j += 1
        k += 1

    for l in range(len(mix)):
        arr[s + l] = mix[l]

# Example usage:
arr = [3, 1, 4, 1, 5, 9, 2, 6, 5, 3, 5]
merge_sort_in_place(arr, 0, len(arr))
print(arr)