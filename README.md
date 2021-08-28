![welcome_page](https://user-images.githubusercontent.com/67961014/131216478-7923adcb-fd36-4958-98db-155282d08aef.png)
# Pharmear 

PHARMEAR an open-source software for Pharmacy Store

PHARMEAR is open source, free to use, it offers a modern UI, with less clutter, easy to learn, easy to use, makes bills fast, shows you the status of your store, has intellisense to make bills with ease, user management and a lot more.

PHARMEAR is made using JAVA in Apache NetBeans, uses MySQL Server as the database, and libraries like jFreeChart, jCommon, and MySQL Connector/J for Bar Graphs and connection to the database. Git has been used for version control. Icons8, coolors.co are used for UI. We have implemented intellisense/autosuggestion in the program that helps users while bill making and managing stocks.

The theme of the project revolves around Medication. PHARMEAR is a simple program to use that can be used in a very low-end machine. It has very less to learn for users and much to offer them. We have just given the users what they want like Bill Making, Medicine Management, User Permission Control. We have a pre-made database of 4000+ medicines to help users while inserting medicine to the store. It also has a Pharmacy Status corner to tell users about their store.

# Requirements
1. MySQL Database version 8.0
2. MySQL should be installed default location
3. MySQL Database Password

# Installing 
For the setup you need to download the [pharmear_setup.exe](https://github.com/haitomns4173/pharmear/releases) and [mysql_database.exe](https://dev.mysql.com/downloads/installer/) the you need to first install the MySQL Database and then install the Pharmear Program. While installing the MySQL you need to note down the admin password because while setting up the pharmear you need the password to connect to the database.Installing Pharmear is as simple as installing any other program in windows.

# Setup
After installing pharemear you will get a setup screen where you need to add the MySQL database password and then test the conection, if you are successfully connected then with for the database to restore, you will get a confirmation that the database is restored and then you can proceed further.


![setup_db](https://user-images.githubusercontent.com/67961014/131214425-5a21db77-41d6-40bb-bada-4d3143e64f8c.png)

### Add User 
To add the user we need fill a small form that contains the name of the user, user-type, and the username and the password then just click add. You can add as much users as you   want. Then click next.

User Permission Control:
* Owner                 : Can access all the parts of Pharmear
* Medicine/Bill Manager : Can access all the parts except for the sales report
* Medicine              : Can access all except for Bill, and sales report
* Bill                  : Can access all except for Medicine and sales Reprot

![setup_user](https://user-images.githubusercontent.com/67961014/131214750-eda03415-064b-4d57-90d5-1102656e62c3.png)

### Shop Details
In Shop Details you can add the details of your shop, shop name, address, contact number and vat number. Then just press set.

![setup_shop](https://user-images.githubusercontent.com/67961014/131215675-d0f0f4af-99a6-4437-9b01-3d6bc152977f.png)

### Finish
Once you are in the finish screen you just need to press Complete button to finilize the setup. The program will close once you press comoplete and then you need to reopen it for login page.

![shop_finish](https://user-images.githubusercontent.com/67961014/131215890-1cdb7e51-31d1-420d-9eb0-cf7383a12b30.png)

# Login Page 
After the setup is completed Pharmear will open a login screen for you to input the credentials and you are in the program. You will be assigned with the permission according to the type of user you are.

![login_page](https://user-images.githubusercontent.com/67961014/131216369-756afdd0-e7b2-4a9c-87f0-e4e839715736.png)

# Welcome Page
This will be the page that will come first to you when open the program from here you can navigate yourself to the tabs you want also there is a Status of your pharmacy to get information about the out of stock, expired, total cost, total quantity, total medcicine in your pharmacy.

![welcome_page](https://user-images.githubusercontent.com/67961014/131216483-fbfec2bd-7e75-4655-9611-22a3990ef0b0.png)

# Medicine Manage
In Medcine Manage you can add, view and delete medicines in your store.
* It has a find tab to search medicine you can also type * to view all the medicines in your pharmacy.
* The table shows the result of the search.
* You can select a row in the medicine to delete it.
* Clear button clears the table and other text feilds.
* Medicine Details is used to add medicines to your store, you just need to fill the details and click add.
* Medicine Details has Intellisese to make the process easy.

![medicine_manage](https://user-images.githubusercontent.com/67961014/131216686-9b61d800-c59d-4c8c-8df3-696d6c19c902.png)
