package com.bpc;

import java.awt.*;


/**
Cette classe déclenche ou une plusieurs actions suites aux instructions
recues de GespersonnelEvennements
@see GespersonnelEvennements
*/
public class GespersonnelTraitements
{

public GespersonnelInterface G1;
public Frame frame;
String s;


//*************** DEBUT MODULE EMPLOYE *********************//

/**
Grace au CardLayout cette méthode affiche le panel correspondant
à l'ajout d'un employé
@param G2 Objet de type GespersonnelInterface 
*/
 public void afficherEmployeAjouter(GespersonnelInterface G2)
 {
 	G1=G2;
 	G1.cl.show(G1.panelCard0,"2");
	G1.labelInseePere.setEnabled(false);
	G1.inseePereTexte.setEnabled(false);
	G1.labelAdresse.setEnabled(true);
	G1.adresse.setEnabled(true);
	G1.labelNom.setEnabled(true);
	G1.nom.setEnabled(true);
	G1.labelPrenom.setEnabled(true);
	G1.prenom.setEnabled(true);
	G1.labelGrade.setEnabled(true);
	G1.grade.setEnabled(true);
	G1.labelResponsable.setEnabled(true);
	G1.responsable.setEnabled(true);
	G1.jNaiss.setEnabled(true);
	G1.moisNaiss.setEnabled(true);
	G1.labelDateNaiss.setEnabled(true);
	G1.labelDateEmb.setEnabled(true);
	G1.aNaiss.setEnabled(true);
	G1.jEmb.setEnabled(true);
	G1.moisEmb.setEnabled(true);
	G1.aEmb.setEnabled(true);
	G1.labelHobby.setEnabled(false);
	G1.hobby.setEnabled(false);
	G1.rechercher.setEnabled(false);
	G1.effacer.setEnabled(true);
	G1.valider.setEnabled(true);

 }


/**
Grace au CardLayout cette méthode affiche le panel correspondant
é la suppression d'un employé
@param G2 Objet de type GespersonnelInterface 
*/ 
 public void afficherEmployeSupprimer(GespersonnelInterface G2)
 {
 	G1=G2;
 	G1.cl.show(G1.panelCard0,"2");
	G1.labelInseePere.setEnabled(false);
	G1.inseePereTexte.setEnabled(false);
	G1.labelNom.setEnabled(false);
	G1.nom.setEnabled(false);
	G1.labelPrenom.setEnabled(false);
	G1.prenom.setEnabled(false);
	G1.labelAdresse.setEnabled(false);
	G1.adresse.setEnabled(false);
	G1.labelGrade.setEnabled(false);
	G1.grade.setEnabled(false);
	G1.labelResponsable.setEnabled(false);
	G1.responsable.setEnabled(false);
	G1.jNaiss.setEnabled(false);
	G1.moisNaiss.setEnabled(false);
	G1.labelDateNaiss.setEnabled(false);
	G1.labelDateEmb.setEnabled(false);
	G1.aNaiss.setEnabled(false);
	G1.jEmb.setEnabled(false);
	G1.moisEmb.setEnabled(false);
	G1.aEmb.setEnabled(false);
	G1.labelHobby.setEnabled(false);
	G1.hobby.setEnabled(false);
	G1.rechercher.setEnabled(false);
	G1.effacer.setEnabled(true);
	G1.valider.setEnabled(true);

 }
 
 /**
Cette méthode fait appel à une méthode de la classe
GespersonnelJdb qui affiche les informations sur un employé avant 
leur modification éventuelle
@param G2 Objet de type GespersonnelInterface 
@see GespersonnelJdbc
*/
 public void lancerAfficherAvantModifEmploye(GespersonnelInterface G2)
 {
 	G1=G2;
	GespersonnelJdbc gp11=new GespersonnelJdbc();
	gp11.afficherAvantModifEmploye(G1);
	gp11.fermerConnexion();
 }
 
 
/**
Grace au CardLayout cette méthode affiche le panel correspondant
é la modification des informations sur un employé
@param G2 Objet de type GespersonnelInterface 
*/ 
 public void afficherEmployeModifier(GespersonnelInterface G2)
 {
 	G1=G2;
 	G1.cl.show(G1.panelCard0,"2");
	G1.labelInseePere.setEnabled(false);
	G1.inseePereTexte.setEnabled(false);
	G1.labelAdresse.setEnabled(true);
	G1.adresse.setEnabled(true);
	G1.labelNom.setEnabled(true);
	G1.nom.setEnabled(true);
	G1.labelPrenom.setEnabled(true);
	G1.prenom.setEnabled(true);
	G1.labelGrade.setEnabled(true);
	G1.grade.setEnabled(true);
	G1.labelResponsable.setEnabled(true);
	G1.responsable.setEnabled(true);
	G1.jNaiss.setEnabled(true);
	G1.moisNaiss.setEnabled(true);
	G1.labelDateNaiss.setEnabled(true);
	G1.labelDateEmb.setEnabled(true);
	G1.aNaiss.setEnabled(true);
	G1.jEmb.setEnabled(true);
	G1.moisEmb.setEnabled(true);
	G1.aEmb.setEnabled(true);
	G1.labelHobby.setEnabled(false);
	G1.hobby.setEnabled(false);
	G1.rechercher.setEnabled(true);
	G1.effacer.setEnabled(true);
	G1.valider.setEnabled(true);

 }
 
 /**
Cette méthode fait appel à une méthode de la classe
GespersonnelJdbc qui affiche tous les employés engagés une meme année
@param G2 Objet de type GespersonnelInterface 
@see GespersonnelJdbc
*/
public void lancerAfficherEmployes(GespersonnelInterface G2)
 {
 	G1=G2;
	GespersonnelJdbc gp10=new GespersonnelJdbc();
	G1.cl.show(G1.panelCard0,"3");
 	gp10.afficherEmployes(G2);
	gp10.fermerConnexion();
 }
 //************* FIN MODULE EMPLOYE **************//
 
 
 //************* DEBUT MODULE ENFANT *************//
 
 
 /**
Grace au CardLayout cette méthode affiche le panel correspondant
à l'ajout d'un enregistrement-enfant
@param G2 Objet de type GespersonnelInterface 
*/ 
 public void afficherEnfantAjouter(GespersonnelInterface G2)
 {
 	G1=G2;
	G1.cl.show(G1.panelCard0,"2");
	G1.labelInseePere.setEnabled(true);
	G1.inseePereTexte.setEnabled(true);
	G1.labelAdresse.setEnabled(false);
	G1.adresse.setEnabled(false);
	G1.labelNom.setEnabled(true);
	G1.nom.setEnabled(true);
	G1.labelPrenom.setEnabled(true);
	G1.prenom.setEnabled(true);
	G1.labelGrade.setEnabled(false);
	G1.grade.setEnabled(false);
	G1.labelResponsable.setEnabled(false);
	G1.responsable.setEnabled(false);
	G1.jNaiss.setEnabled(true);
	G1.moisNaiss.setEnabled(true);
	G1.labelDateNaiss.setEnabled(true);
	G1.labelDateEmb.setEnabled(false);
	G1.aNaiss.setEnabled(true);
	G1.jEmb.setEnabled(false);
	G1.moisEmb.setEnabled(false);
	G1.aEmb.setEnabled(false);
	G1.labelHobby.setEnabled(true);
	G1.hobby.setEnabled(true);
	G1.rechercher.setEnabled(false);
	G1.effacer.setEnabled(true);
	G1.valider.setEnabled(true);

 }
 
  /**
Grace au CardLayout cette méthode affiche le panel correspondant
é la suppression d'un enregistrement-enfant
@param G2 Objet de type GespersonnelInterface 
*/ 
  public void afficherEnfantSupprimer(GespersonnelInterface G2)
 {
 	G1=G2;
	G1.cl.show(G1.panelCard0,"2");
	G1.labelInseePere.setEnabled(true);
	G1.inseePereTexte.setEnabled(true);
	G1.labelAdresse.setEnabled(false);
	G1.adresse.setEnabled(false);
	G1.labelNom.setEnabled(false);
	G1.nom.setEnabled(false);
	G1.labelPrenom.setEnabled(false);
	G1.prenom.setEnabled(false);
	G1.labelGrade.setEnabled(false);
	G1.grade.setEnabled(false);
	G1.labelResponsable.setEnabled(false);
	G1.responsable.setEnabled(false);
	G1.jNaiss.setEnabled(false);
	G1.moisNaiss.setEnabled(false);
	G1.labelDateNaiss.setEnabled(false);
	G1.labelDateEmb.setEnabled(false);
	G1.aNaiss.setEnabled(false);
	G1.jEmb.setEnabled(false);
	G1.moisEmb.setEnabled(false);
	G1.aEmb.setEnabled(false);
	G1.labelHobby.setEnabled(false);
	G1.hobby.setEnabled(false);
	G1.rechercher.setEnabled(false);
	G1.effacer.setEnabled(false);
	G1.valider.setEnabled(true);

 }
 
 
 /**
Cette méthode fait appel é une méthode de la classe
GespersonnelJdbc qui affiche les informations sur un enfant avant 
leur modification éventuelle
@param G2 Objet de type GespersonnelInterface 
@see GespersonnelJdbc
*/
 public void lancerAfficherAvantModifEnfant(GespersonnelInterface G2)
 {
 	G1=G2;
	GespersonnelJdbc gp12=new GespersonnelJdbc();
	gp12.afficherAvantModifEnfant(G1);
	gp12.fermerConnexion();
 }
 
 
/**
Grace au CardLayout cette méthode affiche le panel correspondant
é la modification des informations sur un enfant
@param G2 Objet de type GespersonnelInterface 
*/ 
   public void afficherEnfantModifier(GespersonnelInterface G2)
 {
 	G1=G2;
	G1.cl.show(G1.panelCard0,"2");
	G1.labelInseePere.setEnabled(true);
	G1.inseePereTexte.setEnabled(true);
	G1.labelAdresse.setEnabled(false);
	G1.adresse.setEnabled(false);
	G1.labelNom.setEnabled(true);
	G1.nom.setEnabled(true);
	G1.labelPrenom.setEnabled(true);
	G1.prenom.setEnabled(true);
	G1.labelGrade.setEnabled(false);
	G1.grade.setEnabled(false);
	G1.labelResponsable.setEnabled(false);
	G1.responsable.setEnabled(false);
	G1.jNaiss.setEnabled(true);
	G1.moisNaiss.setEnabled(true);
	G1.labelDateNaiss.setEnabled(true);
	G1.labelDateEmb.setEnabled(false);
	G1.aNaiss.setEnabled(true);
	G1.jEmb.setEnabled(false);
	G1.moisEmb.setEnabled(false);
	G1.aEmb.setEnabled(false);
	G1.labelHobby.setEnabled(true);
	G1.hobby.setEnabled(true);
	G1.rechercher.setEnabled(true);
	G1.effacer.setEnabled(true);
	G1.valider.setEnabled(true);

 }
  
//===Fin Module Enfant===//


/**
Cette méthode permet de réinitialiser tous les champs 
Elle est activée é l'aide du bouton EFFACER
*/
public void resetChamps(GespersonnelInterface G2)
{
G1=G2;
	
	String dateEmbDefaut=new String();
	String dateNaissDefaut=new String();
	
	G1.inseeTexte.setText("0");
	G1.inseePereTexte.setText("0");
	G1.nom.setText("");
	G1.prenom.setText("");
	G1.adresse.setText("");
	G1.grade.setText("");
	G1.responsable.setText("");
	G1.hobby.setText("");
	G1.jNaiss.setText("1");
	G1.aNaiss.setText("1900");
	G1.jEmb.setText("1");
	G1.aEmb.setText("1900");
	G1.moisNaiss.setSelectedItem(dateNaissDefaut.valueOf(G1.mois[0]));
	G1.moisEmb.setSelectedItem(dateEmbDefaut.valueOf(G1.mois[0]));
}


/**
Cette méthode crée une fenetre de dialogue, récupére le texte tapé,
affiche un panel en arriére-plan et y place qprés validation le texte récupéré
Est activée si l'utilisateur choisit d'afficher les informations sur un employé é
partir de son #INSEE
@param G2 Objet de type GespersonnelInterface
@see InputDialog
*/
public void lancerDialogInseeEmp(GespersonnelInterface G2)
{
G1=G2;
GespersonnelJdbc gp=new GespersonnelJdbc();

	afficherEmployeAjouter(G1);
	
	InputDialog inputDialog = new InputDialog(frame, "# INSEE", G1);
	inputDialog.pack();		

	inputDialog.setLocationRelativeTo(G1);
	inputDialog.setVisible(true);

	G1.inseeTexte.setText(inputDialog.getValidatedText());
	gp.afficherAvantModifEmploye(G1);
	G1.valider.setEnabled(false);  // impossibilité de valider le résultat de la recherche!
}

/**
Cette méthode crée une fenetre de dialogue, récupére le texte tapé,
affiche un panel en arriére-plan et y place qprés validation le texte récupéré
Est activée si l'utilisateur choisit d'afficher les informations sur un enfant
é partir de son #INSEE 
@param G2 Objet de type GespersonnelInterface
@see InputDialog
*/
public void lancerDialogInseeEnf(GespersonnelInterface G2)
{
G1=G2;
GespersonnelJdbc gp=new GespersonnelJdbc();

	afficherEnfantAjouter(G1);
	

	InputDialog inputDialog = new InputDialog(frame, "# INSEE de l'ENFANT", G1);
	inputDialog.pack();		

	inputDialog.setLocationRelativeTo(G1);
	inputDialog.setVisible(true);

	G1.inseeTexte.setText(inputDialog.getValidatedText());
	gp.rechercherEnfantInseePropre(G1);

}

/**
Cette méthode crée une fenetre de dialogue, récupére le texte tapé,
affiche un panel en arriére-plan et y place qprés validation le texte récupéré
Est activée si l'utilisateur choisit d'afficher les informations sur un enfant
é partir du #INSEE du pére
@param G2 Objet de type GespersonnelInterface
@see InputDialog
*/
public void lancerDialogInseePere(GespersonnelInterface G2)
{
G1=G2;
GespersonnelJdbc gp=new GespersonnelJdbc();

	afficherEnfantAjouter(G1);
	

	InputDialog inputDialog = new InputDialog(frame, "# INSEE du PERE", G1);
	inputDialog.pack();		

	inputDialog.setLocationRelativeTo(G1);
	inputDialog.setVisible(true);

	G1.inseePereTexte.setText(inputDialog.getValidatedText());
	gp.rechercherEnfantInseePere(G1);
	G1.valider.setEnabled(false);  // impossibilité de valider le résultat de la recherche!
	
}


/**
Cette méthode crée une fenetre de dialogue, récupére le texte tapé,
affiche un panel en arriére-plan et y place qprés validation le texte récupéré
Est activée si l'utilisateur choisit d'afficher tous les employés engagés une meme année
@param G2 Objet de type GespersonnelInterface
@see InputDialog
*/
public void lancerDialogEmpAnnee(GespersonnelInterface G2)
{
G1=G2;
GespersonnelJdbc gp=new GespersonnelJdbc();

	InputDialog inputDialog = new InputDialog(frame, "", G1);
	inputDialog.pack();		

	inputDialog.setLocationRelativeTo(G1);
	inputDialog.setVisible(true);

	//String s=inputDialog.;
	
	gp.afficherEmployesAnneeIdem(G1,inputDialog);
	
	G1.valider.setEnabled(false);  // impossibilité de valider le résultat de la recherche!
	
}

/**
Cette méthode de sélection permet d'activer une méthode parmi
deux possible quand l'utilisateur clique sur RECHERCHER
@param G2 Objet de type GespersonnelInterface
*/ 
 public void lancerRechercher(int code,GespersonnelInterface G2)
{
	G1=G2;
        
	switch (GespersonnelEvennements.codeEv)
			 {
			case 6:
                            
				lancerAfficherAvantModifEnfant(G2);
                                
				break;	
				
			case 5:
				lancerAfficherAvantModifEmploye(G2);
                                
				break;
				
			default: ;
 			 }
}

 /**
Cette méthode de sélection permet d'activer une méthode parmi
six possible quand l'utilisateur clique sur VALIDER
@param G2 Objet de type GespersonnelInterface
*/ 
 public void lancerValider(int code,GespersonnelInterface G2)
{
	G1=G2;
        GespersonnelJdbc gp1 = new GespersonnelJdbc();
                
	switch (GespersonnelEvennements.codeEv){
		 	case 1:				
				gp1.ajouterEmploye(G2);
				gp1.fermerConnexion();
				resetChamps(G2);
	        	break;
				
			case 2:                                
				gp1.ajouterEnfant(G2);
				gp1.fermerConnexion();
				resetChamps(G2);
			break;	
			case 3:
                                gp1.supprimerEmploye(G2);
                                gp1.fermerConnexion();
				resetChamps(G2);
			break;	
			case 4:
                                gp1.supprimerEnfant(G2);
                                gp1.fermerConnexion();
				resetChamps(G2);
			break;	
			case 5:
                            // TODO DEVOPS
                            resetChamps(G2);
			break;	
			case 6:
                            // TODO DEVOPS
                            resetChamps(G2);
			break;
                        
			default: 
                            resetChamps(G2);
                        ;
 	}
}

 
}
								