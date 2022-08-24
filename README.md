# Cab-application-using-Java
A Java software to record the daily earning details of  local Cab Company

# Project Scenario
 Greenwich Cabs is a small minicab company operating with only 10 cars. The company also employs four dispatchers. The function of the dispatcher is to record the journeys and the fares. The company needs to record this information for legal reasons and in order to calculate the percentage that the drivers pay. This percentage is based on 20% of the fare which is paid for the work the company provides to the drivers. The dispatcher needs to record: 
 1. The start time of the journey 
 2. The pickup point 
 3. The destination 
 4. The driver’s ID 
 5. Name of the passenger, if available 
 6. The fare 
 7. The optional tip 
 8. If the job is an account job, the name of the account 
 9. If a telephone number is needed it is recorded

# Software solution
 A Java based GUI solution which allows the dispatcher to record journey data in which he/she should enter atleast 4 fields before the journey begins. At the end of the journey, fare is calculated based upon the duration of travel rather than the commuting distance. The fare is calculated at **20 pounds** per hour. Whenever a dispatcher records new travel details a travel id will be generated using real time functioning which allows him to modify/add the details later on. This java program utilises arraylist as a database so whenever the program shuts off or logs off the existing data will be lost, so the dispatcher should make sure that he wont class the window till he signs off the work. At the end of the day all the journey details will be recorded externally into a text file with the date of the day as the text file name. Then the dispatcher needs to display the total earnings procured by each driver, commission amount to be given each driver, total jobs of the day and overall total earnings of the day.
