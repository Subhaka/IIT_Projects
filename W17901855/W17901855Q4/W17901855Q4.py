# Creating histogram based on the information provided from list by getting the progression outcome for each of list

student_credits = [[120, 0, 0], [80,20 ,20], [100,0, 20], [80, 20, 20], [20,40,60], [120,0,50],[100,20,0],[20,20,80],[20,0,100],[0,0,120]] 

def print_histogram(name, value):
    print(f'{name:<10} {value:<3} {value*"*":<5}')

def list_summation(num_list):  # getting the total outocmes using user defined functions
    total = 0
    for num in num_list:
        total = total + num
    return total

def horizontal_histogram(student_credits):  #main function
    Progress=0
    Trailing=0
    Retriever=0
    Exclude=0
    for index in student_credits:
        try:
            pass_credit= index[0]   #assigning the first element in the list to pass credit
            defer_credit= index[1]  #assigning the secound element in the list to defer credit
            fail_credit= index[2]   #assigning the third element in the list to fail credit
            
            if (pass_credit in range(0,140,20) and defer_credit in range(0,140,20) and fail_credit in range(0,140,20)):#checking for range whether it is in ,0,20,40,60,80,100,120 
            
                Total_credits=pass_credit+defer_credit+fail_credit
                print("pass_credit=" ,index[0])
                print("defer_credit=",index[1])
                print("fail_credit=", index[2],'\n')
                if Total_credits!=120:
                   print("Your Total is incorrect")
                elif pass_credit==120:
                    print("PROGRESSION OUTCOME ==> PROGRESS")
                    Progress+=1
                elif pass_credit==100:
                    print("PROGRESSION OUTCOME ==> PROGRESS-MODULE TRAILER")
                    Trailing+=1
                elif (fail_credit>=80):
                    print("PROGRESSION OUTCOME ==> EXCLUDE")
                    Exclude+=1
                else:
                    print("PROGRESSION OUTCOME ==> DO NOT PROGRESS - MODULE RETRIEVER")
                    Retriever+=1
                print("\n======================================================= \n")
            else:
                print("Range Error")
                    
        except ValueError:
            print("Integer required")
            print("\n")
    outcome_list=[Progress,Trailing,Exclude,Retriever]  #storing the variables inside a list
    outcome = list_summation(outcome_list)              #calling list_summation functions 
    print_histogram("Progress", Progress)
    print_histogram("Trailing", Trailing)
    print_histogram("Retriever", Retriever)
    print_histogram("Exclude", Exclude)
    print(outcome," outcomes in total.")
            
    
horizontal_histogram(student_credits)
