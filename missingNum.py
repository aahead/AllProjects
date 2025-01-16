#
#   Abram Head
#   1/16/2025
#   Computing Fundamentals I
#
import random
def missNum():
        randList = random.randint(1, 15)
        count = 1
        newList = []
        while count <= randList:
            newList.append(count)
            count += 1
        print(newList)
        xtacular = random.randint(1, randList)
        newList.remove(xtacular)
        print(newList)
        count = 0
        for i in newList:
            index = newList.index(i)
            if newList[index] != newList[index-1]+1:
                deletedNum = newList[index]
                if deletedNum != 1:
                    index = newList.index(deletedNum)
                    newList.insert(index, deletedNum -1)
                    print("Number deleted: ", deletedNum-1)
                    print("With Number Added: ", newList)
                    break
            if randList == xtacular:
                newList.append(xtacular)
                print("Number Deleted: ", xtacular)
                print("With Number Added: ", newList)
                break
        if xtacular == 1:
        newList.append(1)
        print("Number Deleted: 1")
        print("With Number Added: ", newList)
    

