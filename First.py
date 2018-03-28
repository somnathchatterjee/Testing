import calendar

class cal:

    def calender1():
        yr = int(input("Enter the year : "))
        mon1 = int(input("Enter The Month : "))
        ca = calendar.month(yr, mon1)
        print("The calendar of the year :", yr)
        print(ca)
        if yr == 2017 and mon1 == 2:
            print("It is a leap year")
        else:
            print("It is not a leap year")
    calender1()

def