# Program to predict student progression outcome at the end of each academic year

def progression_eval(pass_credit, defer_credit, fail_credit): # Predicting student progression outcome based on following conditions  
    if pass_credit==120:
        print("Progress")
    elif pass_credit==100:
        print("Progress-module trailer")
    elif (fail_credit>=80):
        print("Exclude")
    else:
        print("Do not progress-module retriever")

while True:
        try:
            pass_credit=int(input("Please Enter no. of pass credits:"))
            if pass_credit in range(0,140,20):          #checking if the pass credit is in range(20,40,60,80,100,120)
                defer_credit=int(input("Please Enter no. of defer credits:"))
                if defer_credit  in range(0,140,20):    #checking if the defer credit is in range(20,40,60,80,100,120)
                    fail_credit=int(input("Please Enter no. of fail credits:"))
                    if fail_credit in range(0,140,20):  #checking if the fail credit is in range(20,40,60,80,100,120)
                        Total_credits=pass_credit+defer_credit+fail_credit
                        if Total_credits!=120:          #checking if the sum of credits is equal to 120
                                print("Your Total is incorrect")
                        else:
                            progression_eval(pass_credit, defer_credit, fail_credit) #calling the user defined funtion to find student progression outcome
                             
                    else:
                        print("Range Error")
                else:
                    print("Range Error")
            else:
                print("Range Error")
        except ValueError:
            print("Integer required")


