package oops;

 class Manager extends Employee {
    String dept;
   @Override
   public void displayDetails(){
       super.displayDetails();
       System.out.println("Department Name :"+dept);
   }

}
