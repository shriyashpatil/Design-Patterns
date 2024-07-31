public class Client {
    
    public static void main(String args[]){

        // register the prototype objects
        StudentRegistry registry = new StudentRegistry();
        fillRegistry(registry);

        Student shivam = registry.get("mar24lld").clone();
        shivam.setName("shivam");
        shivam.setAge(25);

        Student shri = registry.get("mar24lldIns").clone();
        shri.setName("shri");
        shri.setAge(25);
        System.out.println("DEBUG");
       

    }

    public static void fillRegistry(StudentRegistry registry){
        Student mar24lld = new Student();
        mar24lld.setBatch("mar24lld");
        mar24lld.setAvgPsp(70);
        registry.register("mar24lld", mar24lld);

        Student aug24lld = new Student();
        mar24lld.setBatch("aug24lld");
        mar24lld.setAvgPsp(70);
        registry.register("aug24lld", aug24lld);

        IntelligentStudent march2024lldPrototype = new IntelligentStudent();
        march2024lldPrototype.setBatch("mar24lldIns");
        march2024lldPrototype.setAvgPsp(70);
        registry.register("mar24lldIns", march2024lldPrototype);
    }

}
