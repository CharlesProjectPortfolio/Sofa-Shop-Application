
# WESTERN GOVERNOR UNIVERSITY
## D287 – JAVA FRAMEWORKS
C.  Customize the HTML user interface for your customer’s application. The user interface should include the shop name, the product names, and the names of the parts.
line 14 of mainscreen.html changed title to "My Sofa Shop".
line 19 of mainscreen.html changed color of h1 to red.
line 19 of mainscreen.html changed h1 to "Sofa King".
line 21 of mainscreen.html changed h2 to "Sofa Parts".
line 53 of mainscreen.html changed h2 to "Sofa Products".

Note: Do not remove any elements that were included in the screen. You may add any additional elements you would like or any images, colors, and styles, although it is not required.


D.  Add an “About” page to the application to describe your chosen customer’s company to web viewers and include navigation to and from the “About” page and the main screen.
Added an about.html to the templates folder.
Copied the html tag and it content from mainscreen.html to maintain style lines 1 - 15 in about.html.
line 14 of about.html changed the title to "About Page".
Created a div with two paragraph block inside of it in about.html lines 17 - 31.
Added a background color and changed the width of the paragraphs on lines 18 and 23 in about.html.
line 30 of about.html added a link back to mainscreen.html.
line 90 of mainscreen.html add a link button to about.html.
Created AboutController.java in the controllers folder.
line 6 of AboutController.java added @Controller.
line 7 of AboutController.java created the AboutController class.
line 9 of AboutController.java added @GetMapping with route to "/about".
line 10 of AboutController.java added function aboutPage().
line 11 of AboutController.java added return "about".


E.  Add a sample inventory appropriate for your chosen store to the application. You should have five parts and five products in your sample inventory and should not overwrite existing data in the database.
BootStrapData.java line 3 imported InhousePart.
BootStrapData.java line 7 imported InhousePartRepository.
BootStrapData.java line 17 imported InhousePartService.
BootStrapData.java line 18 imported InhousePartServiceImpl.
BootStrapData.java line 35 add a private final variable for InhousePartRepository.
BootStrapData.java line 37 add a parameter to the BootStrapData() method for InhousePartRepository.
BootStrapData.java line 41 assigned InhousePartRepository.
BootStrapData.java line 47 created a variable to hold partRepository.count().
BootStrapData.java line 49 added an if statement to check if partRepository.count() == 0.
BootStrapData.java line 50 Created the object for OutsourcedPart
BootStrapData.java lines 52-57 created an outsourced part with the CompanyName, name, inventory, price, and id then save the part to outsourcedPartRepository.
BootStrapData.java lines 59-64 created an outsourced part with the CompanyName, name, inventory, price, and id then save the part to outsourcedPartRepository.
BootStrapData.java line 71 added another if statement to the for loop.
BootStrapData.java line 73 Created the object for InhousePart.
BootStrapData.java lines 75-79 Created the first inhouse part with Name, inventory, price,and id then saved it to inhousePartRepository.
BootStrapData.java line 81-85 Created the second inhouse part with Name, inventory, price,and id then saved it to inhousePartRepository.
BootStrapData.java lines 87-91 Created the third inhouse part with Name, inventory, price,and id then saved it to inhousePartRepository.
BootStrapData.java line 93 created a variable for InhousePart and set it to null.
BootStrapData.java line 94 created a List variable inhouseParts.
BootStrapData.java lines 96-101 created a for loop to run through the inhouseParts list, match the names, and and assign them to the inhousePart variable.
BootStrapData.java line 115 if statement to check productRepository.count().
BootStrapData.java line 117 created new product Sofa.
BootStrapData.java line 118 created new product recliningSofa.
BootStrapData.java line 119 created new product poweredRecliningSofa.
BootStrapData.java line 120 created new product loveseat.
BootStrapData.java line 121 created new product consoleLoveseat.
BootStrapData.java line 123 saved the Sofa product to productRepository.
BootStrapData.java line 124 saved the recliningSofa product to productRepository.
BootStrapData.java line 125 saved the poweredRecliningSofa product to productRepository.
BootStrapData.java line 126 saved the loveseat product to productRepository.
BootStrapData.java line 127 saved the consoleLoveseat to productRepository.


Note: Make sure the sample inventory is added only when both the part and product lists are empty. When adding the sample inventory appropriate for the store, the inventory is stored in a set so duplicate items cannot be added to your products. When duplicate items are added, make a “multi-pack” part.


F.  Add a “Buy Now” button to your product list. Your “Buy Now” button must meet each of the following parameters:
•  The “Buy Now” button must be next to the buttons that update and delete products.
•  The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
•  Display a message that indicates the success or failure of a purchase.
Created a buyfailure.html in the templates folder.
Created a buysuccess.html in the templates folder.
buyfailure.html lines 1 - 25 clopied the html, head, and body tags from mainscreen to maintain uniformity.
buyfailure.html lines 18 - 20 created a paragraph block to display the message "Buy failure".
buyfailure.html line 22 added a link back to mainscreen.
buysuccess.html lines 1 - 25 copied from buyfailure.html.
buysuccess.html lines 18 - 20 added a paragraph block to display "Buy successful".
mainscreen.html line 85 add a "buy now" button.
Created the BuyNowController.java file in the controllers folder.
BuyNowController.java lines 1 - 11 imported all necessary files and classes.
BuyNowController.java line 13 added @Controller annotation.
BuyNowController.java line 14 created the class BuyNowController.
BuyNowController.java line 15 added @Autowired annotation.
BuyNowController.java lines 16 created private variable for ApplicationContext.
BuyNowController.java lines 18 added @GetMapping annotation.
BuyNowController.java line 19 created the method "check".
BuyNowController.java line 20 add a productService variable using context from ApplicationContext.
BuyNowController.java line 21 Created a Product variable and assigned it to productService.findById(theId).
BuyNowController.java lines 22 added if statement to check if product inventory is greater than 0.
BuyNowController.java lines 23 set product inventory to product inventory - 1.
BuyNowController.java line 24 Used productService.save() method to save the updated product.
BuyNowController.java line 25 return "buysuccess" if the if statement resulted in true.
BuyNowController.java line 27 add else statement.
BuyNowController.java line 28 return "buyfailure" if the if statement was false.

G.  Modify the parts to track maximum and minimum inventory by doing the following:
•  Add additional fields to the part entity for maximum and minimum inventory.
•  Modify the sample inventory to include the maximum and minimum fields.
•  Add to the InhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
•  Rename the file the persistent storage is saved to.
•  Modify the code to enforce that the inventory is between or at the minimum and maximum value.
Part.java line 34 added minInv variable.
Part.java line 36 add maxInv variable.
Part.java lines 59 - 66 added new constructor to include minInv and maxInv.
Part.java line 100 added method geteMinInv().
Part.java line 104 added method setMinInv().
Part.java line 108 added method getMaxInv().
Part.java line 112 added method setMaxInv().
Part.java line 116 added method inIsValid() to check if inv is between minInv and maxInv.
BootStrapData.java line 57 set minInv().
BootStrapData.java line 58 set maxInv().
BootStraPData.java line 66 set minInv().
BootStrapData.java line 67 set maxInv().
BootStrapData.java line 83 set minInv().
BootStrapData.java line 84 set maxInv().
BootstrapData.java line 91 set minInv().
BootStrapData.java line 92 set maxInv().
BootstrapData.java line 99 set minInv().
BootStrapData.java line 100 set maxInv().
AddInhousePartController.java line 46 added else if statement to check if (inv < maxInv) and (inv > minInv).
AddOutsourcedPartController.java line 46 added else if statement to check if (inv < mavInv) and (inv > minInv).
application.properties line 6 changed database name to Sofa-Storage-h2-db102.
InhousePartForm.html line 26 added input field for minimum inventory.
InhousePartForm.html line 27 added if statement to check minInv.
InhousePartForm.html line 29 added input field for maximum inventory.
InhousePartForm.html line 30 added if statement to check maxInv.
OutsourcedPartForm.html line 27 added input field for minimum inventory.
OutsourcedPartForm.html line 28 added if statement to check minInv.
OutsourcedPartForm.html line 30 added input field for maximum inventory.
OutsourcedPartForm.html line 31 add if statement to check maxInv.
Part.java line 119 added isInvValid() function to check if inventory is between minInv and maxInv.
AddInhousePartController.java line 46 added else if statement to check if inventory is in range of minInv and maxInv.
AddInhousePartController.java line 48 used BindingResult to reject bad value with a message.
AddOutsourcedPartController.java line 46 added else if statement to check if inventory is in range of minInv and maxInv.
AddOutsourcedPartController.java line 48 used BindingResult to reject bad value with a message.

H.  Add validation for between or at the maximum and minimum fields. The validation must include the following:
•  Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
•  Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
•  Display error messages when adding and updating parts if the inventory is greater than the maximum.
    AddInhousePartController.java line 48 added if statement to check if part.inv is less than part.minInv.
    AddInhousePartController.java line 49 use Binding result to output an error message for inventory too low.
    AddInhousePartController.java line 50 return "InhousePartForm".
    AddInhousePartController.java line 52 else statement for if inventory is to big.
    AddInhousePartController.java line 53 use Binding result to output error message for inventory too high.
    AddInhousePartController.java line 54 return "InhousePartForm".
    AddOutsourcedPartController.java line 48 added if statement to check if part.inv is less than part.minInv.
    AddOutsourcedPartController.java line 49 use Binding result to output an error message for inventory too low.
    AddOutsourcedPartController.java line 50 return "OutsourcedPartForm".
    AddOutsourcedPartController.java line 52 else statement for if inventory is to big.
    AddOutsourcedPartController.java line 53 use Binding result to output error message for inventory too high.
    AddOutsourcedPartController.java line 54 return "OutsourcedPartForm".
    ValidEnufParts.java line 20 Updated the error message
    EnufPartsValidator.java line 37 added if statement to check if making the update would lower the parts to below the minimum inventory.



I.  Add at least two unit tests for the maximum and minimum fields to the PartTest class in the test package.
    PartTest.java line 105 added a unit test getMinInv().
    PartTest.java line 106 added a variable and assigned it with the minimum value.
    PartTest.java line 107 used the partIn to set the minimum value.
    PartTest.java line 108 used the assert equals method to test the input.
    PartTest.java line 109 Used the partOut to set the minimum value.
    PartTest.java line 110 Used the assert equals method to test the output.
    PartTest.java line 114 added a unit test getMaxInv().
    PartTest.java line 115 added a variable and assigned it with the maximum value.
    PartTest.java line 116 used the partIn to set the maximum value.
    PartTest.java line 117 used the assert equals method to test the input.
    PartTest.java line 118 Used the partOut to set the maximum value.
    PartTest.java line 119 Used the assert equals method to test the output.

J.  Remove the class files for any unused validators in order to clean your code.
