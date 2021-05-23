# Creating vertical histogram based on student's progression outcome

def print_histogram(name1, name2, name3, name4, Progress, Trailing, Retriever, Exclude):
    print(f'{name1:^10}{name2:^10}{name3:^10}{name4:^10}')
    
    while(Progress >0 or Trailing >0 or Retriever >0 or Exclude >0): # using user defined function for creating vertical histogram
                if(Progress >0):
                      print(f'{"*":^10}',end = '')
                      Progress = Progress - 1
                else:
                    print(f'{" ":^10}',end = '')

                if(Trailing >0):
                      print(f'{"*":^10}',end = '')
                      Trailing = Trailing - 1
                else:
                    print(f'{" ":^10}',end = '')

                if(Retriever >0):
                      print(f'{"*":^10}',end = '')
                      Retriever = Retriever - 1
                else:
                    print(f'{" ":^10}',end = '')

                if(Exclude >0):
                      print(f'{"*":^10}',end = '')
                      Exclude = Exclude - 1
                else:
                    print(f'{" ":^10}',end = '')
                print('\n')

def list_summation(num_list):  # getting the total outocmes using user defined functions
    total = 0
    for num in num_list:
        total = total + num
    return total
    

def vertical_histogram():   #main function
    Progress=0              #To get the count we initially introduce 4 new variabls and assign the value 0
    Trailing=0
    Retriever=0
    Exclude=0

    while True:
        selection=input("Please enter s to get student progression or enter q to quit program:")
        selection=selection.lower()
        if selection=="s":
            try:
                pass_credit=int(input("Please Enter no. of pass credits:"))
                if pass_credit in range(0,140,20):          #checking for range whether it is in ,0,20,40,60,80,100,120 
                    defer_credit=int(input("Please Enter no. of defer credits:"))
                    if defer_credit  in range(0,140,20):    #checking if the defer credit is in range(20,40,60,80,100,120)
                        fail_credit=int(input("Please Enter no. of fail credits:"))
                        if fail_credit in range(0,140,20):  #checking if the fail credit is in range(20,40,60,80,100,120)
                            Total_credits=pass_credit+defer_credit+fail_credit
                            if Total_credits!=120:
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
            outcome_list=[Progress,Trailing,Exclude,Retriever]  #storing the variables inside a list
            outcome = list_summation(outcome_list)              #calling list_summation function to get summation
            print("\n====================VERTICAL HISTOGRAM=========================")
            print_histogram("Progress", "Trailing", "Retriever", "Exclude", Progress,Trailing,Retriever, Exclude) # printing the histogram
                    
            print(outcome," outcomes in total.") 
            break
        else:
            print("Please enter one of the input asked")


vertical_histogram()


    



