package org.example;


import java.util.Scanner;


public class ProductBuilder {
    public void productBuilder(){

        Scanner sc=new Scanner(System.in);

        ProductList productList =new ProductList();

        int exit=0;

        while(true) {

            System.out.println("Enter \n1.ElectronicProduct \n2.MedicalProduct \n3.exit");
            int res = sc.nextInt();

            Product prod = null;

            switch (res) {
                case 1:
                    System.out.println("please enter for product \n1.TV \n2.Fridge \n3.exit");
                    int prodChoice = sc.nextInt();
                    switch (prodChoice) {
                        case 1:
                            prod = new Tv();
                            break;
                        case 2:
                            prod = new Fridge();
                            break;
                        case 3:
                           exit=1;
                           break;
                        default:
                            System.out.println("not available");
                            break;
                    }
                    break;
                case 2:
                    System.out.println("please enter for product \n1.Paracetomol \n2.Dolo \n3.exit");
                    prodChoice = sc.nextInt();
                    switch (prodChoice) {
                        case 1:
                            prod = new Paracetomol();
                            break;
                        case 2:
                            prod = new Dolo();
                            break;
                        case 3:
                            exit=1;
                            break;
                        default:
                            System.out.println("not available");
                    }
                    break;

                case 3:
                    exit=1;
                    break;
                default:
                    System.out.println("Please enter your choice");
                    break;
            }

            if(exit==1)
                break;

            productList.addProd(prod);
            productList.showProducts();

        }
    }
}
