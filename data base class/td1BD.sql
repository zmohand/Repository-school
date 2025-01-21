use vacances;

CREATE TABLE Client(
	ide int,
	nom varchar(10),
    age int,
    avoir int DEFAULT 2000
);

CREATE TABLE Village(
	idv INT,
    ville VARCHAR(10),
    activite VARCHAR(10),
    prix INT,
    capacite INT
);

CREATE TABLE Sejour(
	ids INT,
    idc INT,
    idv INT,
    jour INT
);

CREATE TABLE Archive(
	ids int,
	idc int,
    idv int,
    jour int,
    avoir int
);
#question 1
insert into village (idv, ville, activite, prix, capacite) values (5, "New York", "cinema", 12, 310);

#Question 2
SELECT * FROM Village;
#modele d'ordre en pseudo code :
# Fonction qui rajoute une ligne dans une table
# creer_village(c_v, c_a, c_p, c_c) =
# INSERT INTO Village values( seq_village.nextval, c_v, c_a, c_p, c_c)

/*mise à jour d'une ligne de village(sauf idv, ville et prix)

update Village SET activite = "musée", capacite = 200
WHERE ville = "New York" AND activite = "cinema";

*/

/*
Consulter les séjours:

SELECT idv, idc FROM Sejour;

*/


/*
Pour chaque action donner un exemple sql (ou pseudo sql pour les traitements)
-> Traitement 3 (supression des séjours où la date est inférieure à une date donnée et renvoie le nombre de séjour détruites)

traitement3(une_date) : recupérer le nombre de séjour < à une date

nb_sejours : select count(*) from sejour where jour<date;


*/


/*
retourne id_village, id_sejour activite
Traitement 2 : entrées : une ville, une date, client
1 - Retrouver le village le plsu cher de la ville à la date donnée
2 - Ajouter dans séjour le client pour le village (avec le jour)
3 - Mettre à jour l'avoir du client 

idv, prix, activite <- (premiere ligne) SELECT idv, prix FROM village where ville = nom_ville ORDER BY prix DESC;
		si retour non vide : INSERT INTO sejour VALUES (seq_ids.nexval, id_client, idv, le_jour);
		UPDATE client, SET avoir = avoir_prix where idc = id_client.
        return idc, ids, activite
	sinon 
		return -1, -1, null
*/
    