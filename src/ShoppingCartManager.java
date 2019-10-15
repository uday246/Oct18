import java.util.ArrayList;
import java.util.Scanner;

class ItemToPurchase {

private String itemDescription;

private String name;

private double itemPrie;

private int itemQuantity;

public ItemToPurchase() {

itemDescription = "none";

itemQuantity = 0;

itemPrie = 0;

name = "";

}

public ItemToPurchase(String name, String description, double price,

int itemQuantity) {

this.itemDescription = description;

this.name = name;

this.itemPrie = price;

this.itemQuantity = itemQuantity;

}

public String getDescription() {

return itemDescription;

}

public void setDescription(String itemDescription) {

this.itemDescription = itemDescription;

}

public void printCost() {

System.out.println(name + " " + itemQuantity + " @ " + itemPrie

+ " = $" + (itemQuantity * itemPrie));

}

public void printDescription() {

System.out.println(name + " " + itemDescription);

}

public String getName() {

return name;

}

public void setName(String name) {

this.name = name;

}

public double getPrice() {

return itemPrie;

}

public void setPrice(double itemPrie) {

this.itemPrie = itemPrie;

}

public int getQuantity() {

return itemQuantity;

}

public void setQuantity(int itemQuantity) {

this.itemQuantity = itemQuantity;

}

}

class ShoppingCart {

private String customerName;

private String currentDate;

ArrayList<ItemToPurchase> cartItems = new ArrayList<ItemToPurchase>();;

public ShoppingCart() {

currentDate = "January 1, 2016";

customerName = "none";

}

public ShoppingCart(String name, String date) {

this.currentDate = date;

this.customerName = name;

}

public String getCustomerName() {

return customerName;

}

public void setCustomerName(String customerName) {

this.customerName = customerName;

}

public String getCurrentDate() {

return currentDate;

}

public void setCurrentDate(String currentDate) {

this.currentDate = currentDate;

}

public void addItem(ItemToPurchase i) {

cartItems.add(i);

}

public void removeItem(String name) {

boolean found = false;

;

for (ItemToPurchase i : cartItems) {

if (i.getName().equalsIgnoreCase(name)) {

cartItems.remove(i);

found = true;

break;

}

}

if (!found)

System.out.println("Item not found in cart. Nothing removed");

}

public void modifyItem(ItemToPurchase item) {

boolean found = false;

;

for (ItemToPurchase i : cartItems) {

if (i.getName().equalsIgnoreCase(item.getName())) {

if (i.getQuantity() != 0) {

i.setQuantity(item.getQuantity());

}

found = true;

break;

}

}

if (!found)

System.out.println("Item not found in cart. Nothing removed");

}

public int getNumItemsInCart() {

int sum = 0;

for (ItemToPurchase i : cartItems) {

sum = sum + i.getQuantity();

}

return sum;

}

public double getCostOfCart() {

double sum = 0;

for (ItemToPurchase i : cartItems) {

sum = sum + i.getPrice();

}

return sum;

}

public void printTotal() {

if (cartItems != null && cartItems.size() > 0) {

System.out.println(customerName + "'s Shopping Cart - "

+ currentDate);

System.out.println("Number of Items: " + cartItems.size());

System.out.println();

for (ItemToPurchase i : cartItems) {

i.printCost();

}

}

else {

System.out.println("SHOPPING CART IS EMPTY");

}

}

public void printDescriptions() {

System.out.println(customerName + "'s Shopping Cart - " + currentDate);

System.out.println("Number of Items: " + cartItems.size());

System.out.println();

System.out.println("Item Descriptions");

for (ItemToPurchase i : cartItems) {

i.printDescription();

}

}

}

public class ShoppingCartManager {

public static void main(String[] args)

{

Scanner scan = new Scanner(System.in);

System.out.println("Enter Customer's Name:");

String customerName = scan.nextLine();

System.out.println("Enter Today's Date:");

String currentDate = scan.nextLine();

ShoppingCart s = new ShoppingCart(customerName, currentDate);

System.out.println();

System.out.println("Customer Name: " + s.getCustomerName());

System.out.println("Today's Date: " + currentDate);

printMenu(s);

}

public static void printMenu(ShoppingCart s) {

while (true) {

System.out.println("MENU\na - Add item to cart\nd - Remove item from cart\nc - Change item quantity\ni - Output items' descriptions\no - Output shopping cart\nq - Quit\n\nChoose an option: ");

Scanner scan = new Scanner(System.in);

char ch = scan.next().charAt(0);

scan.nextLine();

if (ch == 'a' || ch == 'A') {

System.out.println("ADD ITEM TO CART");

System.out.println("Enter Item Name: ");

String name = scan.nextLine();

System.out.println("Enter Item Description: ");

String itemDescritpion = scan.nextLine();

System.out.println("Enter Item Price: ");

int itemPrice = scan.nextInt();

System.out.println("Enter Item Quantity: ");

int quantity = scan.nextInt();

scan.nextLine();

ItemToPurchase item = new ItemToPurchase(name, itemDescritpion,

itemPrice, quantity);

s.addItem(item);

}

else if (ch == 'd' || ch == 'D') {

System.out.println("REMOVE ITEM FROM CART");

System.out.println("Enter name of item to remove: ");

String name = scan.nextLine();

s.removeItem(name);

}

else if (ch == 'c' || ch == 'C') {

System.out.println("CHANGE ITEM QUANTITY");

System.out.println("Enter the item name: ");

String name = scan.nextLine();

System.out.println("Enter the new quantity: ");

int quantity = scan.nextInt();

ItemToPurchase item = new ItemToPurchase();

item.setName(name);

item.setQuantity(quantity);

s.modifyItem(item);

}

else if (ch == 'I' || ch == 'i') {

System.out.println("OUTPUT ITEMS' DESCRIPTIONS");

s.printDescriptions();

}

else if (ch == 'O' || ch == 'o') {

System.out.println("OUTPUT SHOPPING CART");

s.printTotal();

}

else if (ch == 'q' || ch == 'Q') {

break;

}

}

}

}