if __name__ == "__main__":
    f = open("D:\\Downloads\\01 背包问题.txt", encoding="utf-8")
    txt = []
    expected = ""
    capacity = ""
    weights = ""
    prices = ""
    is_begin = False
    is_end = False
    for line in f:
        line = line.strip()
        if len(line) > 0 and line[0] != '(':
            if line == "in":
                is_begin = True
                is_end = False
                continue
            elif line == "out":
                is_begin = False
                is_end = True
                continue
            if is_begin:
                capacity = line.split(" ")[1]
                is_begin = False
                continue
            if not is_begin and not is_end:
                weight = line.split(" ")[0]
                price = line.split(" ")[1]
                weights = weights + weight + ","
                prices = prices + price + ","
            elif not is_begin and is_end:
                expected = line
                weights_list = list(weights)
                weights_list[-1] = ";"
                prices_list = list(prices)
                prices_list[-1] = ";"
                sample = capacity + ";" + ''.join(weights_list) + ''.join(prices_list) + expected
                is_end = False
                print(sample)
                weights = ""
                prices = ""

    print(txt)
