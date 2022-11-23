# **Invoice Traker**

## Table of Contents
* [Run Localy](#run-localy)
* [Abstract](#abstract)
* [Main Page](#main-page)
* [Login and Registration](#login-and-registration)
* [Create Item Page](#create-item-page)
* [Show Item Page](#show-item-page)
* [Show Items Page](#show-items-page)
* [Edit Item Page](#edit-item-page)
* [Create Invoice Page](#create-invoice-page)
* [Show Invoices Page](#show-invoices-page)
* [Technologies Used](#technologies-used)
* [Done by](#done-by)
* [Superviser](#superviser)

## Run Localy

```SpringToolSuite runserver``` then navigate to  [127.0.0.1:8080](https://localhost:8080).
## **Abstract:**
#### *Our project is to establish a platform that can handle all the invoices and the receipts received from all product’s distributors to a certain store.While piles of hardcopy invoices are not functional in today’s productivity, a system that can handle your incoming receipts is what you need to have easy management in your store.Using our application, you can permit an admin for your employees on inserting level only for any received receipts from your store products distributors.Employees will have view access only to the products they have inserted, keeping in mind that the original hardcopy receipts will be attached with each insertion.As a second base of authorization, your accountant will have overview access for all the incoming products and invoices from all employees.As a third-based authorization, the admin role has all the access to the system, they can view, update and delete any products or invoices, as well as give permission to new admins, accountants, and employees.*
## Main Page:
* Features:
     *  Mainpage have a navigation bar contains a route to (Invoices),(Items), (Users), and (Logout).
   ### Main Page Preview:
   
## Login and Registration:
* Features
    *	Users are able to register:
    *	Users will not be able to register with two different accounts with same email.
    *	Username must contain 2 characters at least.
    *	Password must contain at least 8 characters.
    *	Passwords are encrypted.
    *	Validations are done in real time
    *	User information are saved in session, so they don’t need to log in again.
    *   User will be able to login.
    *	User is only able to login with a valid password and email.
    *	User should be saved in session when registered successfully.
  ### Login/Register Preview
  <img width="1728" alt="sigin_up" src="https://user-images.githubusercontent.com/110983334/203486912-142d066d-fd61-4dd1-854b-461310347a5c.png">
  <img width="1728" alt="login" src="https://user-images.githubusercontent.com/110983334/203486946-0d3853fc-557a-47ec-8703-586feb4e5f5a.png">
## Create Item Page:
* Features
   * The create item page have a navigation bar contains a route to (Name of User),(Invoices),(Items), (Users), and (Logout).
   * The Invoices, Items, and Logout, are available to user.
   * The create item page display a form to a user.
   * The uesr can add the new item to the list of items.
   * When click on submit button the new item add to the items list.
   * Invoices button redirect to invoice page.
   * Items button redirect to Items page.
   * Logout button redirect to login page.  
  ### Create Item Preview
  <img width="1728" alt="create item" src="https://user-images.githubusercontent.com/110983334/203420027-16cdbd6c-efbd-4920-b3fb-5ebb445d4d73.png">
## Show Item Page:
* Features
   * The show item page have a navigation bar contains a route to (Name of User),(Invoices),(Items), (Users), and (Logout).
   * The Invoices, Items, and Logout, are available to user.
   * The show item page display the details of item.
   * When click on back to items button go to items page.
   * When click on edit button mean go to edit page.
   * When click on delete item button mean delete item.
   * Invoices button redirect to invoice page.
   * Items button redirect to Items page.
   * Logout button redirect to login page.  
  ### Show Item Preview
  <img width="1719" alt="show item1" src="https://user-images.githubusercontent.com/110983334/203421937-f5ae3fdb-6874-451a-843c-9287bd2a4d08.png"> 
## Show Items Page:
* Features
   * The show items page have a navigation bar contains a route to (Name of User),(Invoices),(Items), (Users), and (Logout).
   * The Invoices, Items, and Logout, are available to user.
   * The show items page display the list of items.
   * When click on item name go to show item page.
   * When click on create item button mean go to create item page.
   * Invoices button redirect to invoice page.
   * Logout button redirect to login page.  
  ### Show Items Preview
  <img width="1728" alt="show items" src="https://user-images.githubusercontent.com/110983334/203422758-274ca4be-e434-4c26-86a7-df70caae38eb.png">
## Edit Item Page:
* Features
   * The edit item page have a navigation bar contains a route to (Invoices),(Items), (Users), and (Logout).
   * The Invoices, Items, and Logout, are available to user.
   * The edit item page display form for edit the item.
   * When click on submit go to show items page.
   * When click on cancel button mean cancel edit and go to show items page .
   * Invoices button redirect to invoice page.
   * Logout button redirect to login page.  
  ### Edit Item Preview
  <img width="1728" alt="edit item" src="https://user-images.githubusercontent.com/110983334/203423912-d8baeaa5-576e-4d72-9032-5e0ea6ae346c.png">
## Create Invoice Page:
* Features
   * The create invoice page have a navigation bar contains a route to (Name of User),(Invoices),(Items), (Users), and (Logout).
   * The Invoices, Items, and Logout, are available to user.
   * The create invoice page display a form to a user.
   * The uesr can add the new invoice to the list of invoices.
   * When click on submit button the new invoice add to the invoices list.
   * Items button redirect to Items page.
   * Logout button redirect to login page.  
  ### Create Invoice Preview
  <img width="1728" alt="create_invoice" src="https://user-images.githubusercontent.com/110983334/203486136-d05b8984-c2ac-475e-ade3-a6a7f5e0a8d7.png">
  
## Show Invoices Page:
* Features
   * The show invoices page have a navigation bar contains a route to (Name of User),(Invoices),(Items), (Users), and (Logout).
   * The Invoices, Items, and Logout, are available to user.
   * The show invoices page display the list of invoices.
   * When click on invoice name go to show invoice page.
   * When click on create invoice button mean go to create invoice page.
   * Logout button redirect to login page.  
  ### Show Invoices Preview
  <img width="1728" alt="showinvoices" src="https://user-images.githubusercontent.com/110983334/203486537-9e238459-cbab-459e-a19b-2732876496dc.png">
## Show Users Page:
* Features
   * The show users page have a navigation bar contains a route to (Name of User),(Invoices),(Items), (Users), and (Logout).
   * The admin user can see this page
   * Logout button redirect to login page.  
  ### Show Users Preview
  <img width="1728" alt="showUsers" src="https://user-images.githubusercontent.com/110983334/203487412-8071be9d-99b2-421f-9a3a-253817614adc.png">
  
## Technologies Used:
- Spring Tool Suite 4.
- bootstrap - version 4.5.3.

## Done by:
- Ali Ahmed.
- Amin Elyaan.
- Khaled Ammar.
- Amin Hotari.
## Superviser:
- Saad Hroub.
 

