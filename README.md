# connectionOCI
Example of SQL search on Oracle Cloud Infrastructure using a Java Application.

# Tutorial

1- Create an ATP on OCI.

![image](https://user-images.githubusercontent.com/73943868/224455761-322ea8e6-2da5-4071-b8c6-ef0de800166c.png)

2- Set up you database instance, but have a special attention on the following details.

2.1- the default user created is ADMIN, so you need the username and credentials to access the database, don't forget to keep those. You can observe that the Admin created is only able to read the database, so you will not be able to do write operations until you change the permissions of this user.

![image](https://user-images.githubusercontent.com/73943868/224456345-3d13d97e-d3bb-4d68-b129-5bf17b96989a.png)

2.2- In this section, choose secure access from allowed IPs and VCNs only.

![image](https://user-images.githubusercontent.com/73943868/224455858-3a08857d-0783-4918-a3ec-6f3c2fe110f1.png)

2.3- Click on "Add my IP Adress" or type in the adress you want to use to add your ip to the access control list.

observation: I tried selecting "Secure access from everywhere" option, even not being safe at all, just so I could test my java code, but for a reason, even enabling access from everywhere, it didn't let me into the database with my Java code.

3- Now that your database is created, let's prepare our code.

3.1- you can already fill in these fields with your credentials. I suggest you leaving the "ADMIN" uppercase.

![image](https://user-images.githubusercontent.com/73943868/224456721-3fdfdc83-a959-4d5e-9d3a-e29708b13413.png)

3.2- 

Click on database connection.

![image](https://user-images.githubusercontent.com/73943868/224456604-c4dcace0-2544-4554-bb6a-a284ae5af393.png)

3.4- Copy the credentials of "yourdatabasename"_low.

![image](https://user-images.githubusercontent.com/73943868/224456898-b2abedcb-86ab-4cfc-8fe7-221d41d9e8fb.png)

3.5- Replace them on "your-database-info".

![image](https://user-images.githubusercontent.com/73943868/224457049-2a06d31d-2b7e-43f5-b133-9cf868e99aef.png)

4- Now for you to test the connection, i suggest you to create a table in SQL so that you can make a query on the code.

5- To input your SQL code, you need to click on "Database actions" and later on Development-SQL.

![image](https://user-images.githubusercontent.com/73943868/224457463-13501831-6422-4293-9484-d743b15fb514.png)

If you recall, in step 3.4, I wrote to copy the credentials for the "low", this is because when you enter on the SQL mode, the "consumption group" is set to low, but you can change it if you want to.

![image](https://user-images.githubusercontent.com/73943868/224457358-b44d16c8-1aa1-45b2-a2b9-c41f467b5a7b.png)

6- Now, to end this tutorial, you need to change this part of the code according to the table you created.











