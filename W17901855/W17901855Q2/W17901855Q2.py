 # Creating horizontal histogram based on student's progression outcome

def print_histogram(name, value):
    print(f'{name:<10} {value:<3} {value*"*":<5}') #using user defined function to create horizontal histogram

def list_summation(num_list):  # getting the total outocmes using user defined functions
    total = 0
    for num in num_list:
        total = total + num
    return total

def horizontal_histogram():     #main function
    Progress=0                  #To find the count we introduce 4 new variables and assign the value 0 initially
    Trailing=0
    Retriever=0
    Exclude=0
    while True:
        selection=input("Please enter s to get student progression or enter q to quit program:")
        selection=selection.lower()
        if selection=="s":
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
                            elif pass_credit==120:
                                    print("Progress")
                                    Progress+=1
                            elif pass_credit==100:
                                    print("Progress-module trailer")
                                    Trailing+=1
                            elif (fail_credit>=80):
                                    print("Exclude")
                                    Exclude+=1
                            else:
                                print("Do not Progress-module retriever")
                                Retriever+=1
                        else:
                            print("Range Error")
                    else:
                        print("Range Error")
                else:
                    print("Range Error")
            except ValueError:
                print("Integer required")
        elif selection=="q":
            outcome_list=[Progress,Trailing,Exclude,Retriever] #storing the variables inside a list
            outcome = list_summation(outcome_list) #calling list_summation functions
            print("\n====================HORIZONTAL HISTOGRAM=========================")
            print_histogram("Progress:", Progress) #calling print_histogram functions
            print_histogram("Trailing:", Trailing)
            print_histogram("Retriever:", Retriever)
            print_histogram("Exclude:", Exclude)
            print(outcome," outcomes in total.")
            break
        else:
            print("Please enter one of the input asked")
            
    
    
horizontal_histogram()
