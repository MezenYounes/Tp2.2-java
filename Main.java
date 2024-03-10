public class Main {
    public static void main(String[] args) {
        Departement departementRH = new Departement(1);
        Employe employe1 = new Employe(123456789, "mohammed", 50000);
        Employe employe2 = new Employe(987654321, "Jaziz", 60000);
        Employe employe3 = new Employe(456789123, "mezen", 55000);

    
        departementRH.ajoutEmploye(employe1);
        departementRH.ajoutEmploye(employe2);
        departementRH.ajoutEmploye(employe3);
        
        departementRH.retirerEmploye(employe2);

        departementRH.afficheDep();
       System.out.println(departementRH.existeE(123456789)
       ); 
        System.out.println("Employe avec le plus grand salaire: " + departementRH.getEmpSalMax().getNom());



        Departement dep1 = new Departement(2);
        Departement dep2 = new Departement(3);
        Departement dep3 = new Departement(4);

        Entreprise entreprise = new Entreprise("Entrep1");

        entreprise.ajoutDep(dep1);
        entreprise.ajoutDep(dep2);
        entreprise.ajoutDep(dep3);
     

        entreprise.afficheE();
        entreprise.UpdateDep(employe3, 1);
        System.out.println(entreprise.existeD(dep3));

        entreprise.DepMinCapacity();
    
    }}