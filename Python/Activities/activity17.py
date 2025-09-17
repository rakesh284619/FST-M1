import pandas as pd
import os
#create the dataset
data = {
  "Usernames": ["Test", "John", "Jim"],
  "Passwords": ["testpswd", "John122", "12Jim"]
}

#Convert the dataset into a dataframe
df = pd.DataFrame(data)

#print(df)

#write the data to a csv file
df.to_csv("./Activities/sample.csv", index=False)

#remove the file
#os.remove("./sample.csv")
# for reading a csv file
input_data = pd.read_csv("./Activities/sample.csv")
#print the values only in username column
print(input_data["Usernames"])
#print the username and password of the second row
print(input_data["Usernames"][1], input_data["Passwords"][1])
#sort the username column data in ascendig order and print data
print(input_data.sort_values("Usernames"))
#sort the password column in descending order and print data
print(input_data.sort_values("Passwords", ascending=False))