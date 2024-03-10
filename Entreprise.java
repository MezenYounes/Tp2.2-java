import java.util.HashMap;

public class Entreprise {
private String nomEntreprise;
HashMap<Integer, Departement> Liste_Deps;

public Entreprise(String nomEntreprise) {
    this.nomEntreprise = nomEntreprise;
    Liste_Deps = new HashMap<>();
}
public void ajoutDep(Departement d) {
    Liste_Deps.put(d.getIdDep(), d);
}
public void retirerDep(Departement d)
{
    Liste_Deps.remove(d.getIdDep());
}
    public void afficheE()
{
    System.out.println("Nom de l'entreprise: " + nomEntreprise);
    for (Departement d : Liste_Deps.values()) {
        d.afficheDep();}
    }
public void UpdateDep(Employe E, int idDep) {
        if (Liste_Deps.containsKey(idDep)) {
            for (Departement d : Liste_Deps.values()) {
                if (d.LEmployes.contains(E)) {
                    d.retirerEmploye(E);
                    Liste_Deps.get(idDep).ajoutEmploye(E);
                    E.setDepartement(Liste_Deps.get(idDep));
                    System.out.println("Employe transfere avec succes " + idDep);
                   
                }
            }

    
        }}
public boolean existeD(Departement d) {
    return Liste_Deps.containsValue(d);
        }
    

        public void DepMinCapacity() {
            Departement depMinCapacity = null;
            int minCapacity = Integer.MAX_VALUE;
    
            for (Departement d : Liste_Deps.values()) {
                if (d.LEmployes.size() < minCapacity) {
                    minCapacity = d.LEmployes.size();
                    depMinCapacity = d;
                }
            }
    
            if (depMinCapacity != null) {
                System.out.println("Departement avec le moins d'employes:");
                depMinCapacity.afficheDep();
            } else {
                System.out.println("Aucun departement trouve.");
            }
        }
    
    
    
    
    
    
    
    
    
}
