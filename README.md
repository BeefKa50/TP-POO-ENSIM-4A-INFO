    Spring Web est un module Spring consacré entièrement au développement d'applications et d'API Web.

    JPA est une API permettant l'interface entre l'application JAVA et une base de données relationnelle. Elle repose sur Hibernate et contient un certain 
	nombre de services permettant d'interagir avec la base de données relationnelle sans devoir passer par des requête. Il est donc uniquement nécessaire 
	d'écrire du code JAVA afin d'interagir avec la base de données grâce à cette API. JPA utilise notamment le concept des Repository pour simplifier l'interaction
	avec la base de données (on peut alors utiliser des méthodes simplifiées telles que findByName()).

    Hibernate est un framework open source permettant l'interrogation de bases de données relationnelles en écrivant les requêtes afin d'insérer en bases de données ou de consulter les données.

    H2 est un SGBDR (Système de gestion de bases de données relationnelles) permettant la création et la gestion d'une base de données basée sur le modèle relationnel. Il sera notamment utile afin
	de générer des bases de données temporaires en mémoire à des fins de développement informatique.

    Les DevTools Spring ssont un ensemble d'outils fournis par Spring permettant d'automatiser certaines tâches comme le redémarrage ou le rechargement de l'application lorsque les fichiers sources sont modifiés.

    Thymeleaf est un moteur de template permettant principalement, pour le développement web, la création de vues, c'est-à-dire d'interfaces utilisateur.

Réponses à la question 13 :

    1) L'url d'appel /greeting est paramétré grâce à l'annotation @GetMapping("/greeting") située devant la fonction du controlleur.
    2) Il s'agit de l'instruction return "greeting".
    3) L'attribut est récupéré grâce à la ligne @RequestParam(name="nameGET",
       required=false , defaultValue="World"). Plus précisément, cette ligne récupère l'argument nameGET de l'url, définit cet argument comme non obligatoire et instaure une valeur par défaut égale à "World" si elle n'est pas renseignée.
       
Réponse  à la question 17 :

    Suite à ces modifications, une table ADDRESS a été crée dans la base de données.

Réponse à la question 18 : 

    Nous avons crée dans le package model une classe Address. Cette classe est définie 
    comme une Entity par l'annotation qui se situe juste devant celle-ci. Cette classe 
    suit le modèle des java beans (ce qui est important pour Hibernate). Elle comporte 
    ainsi des getters et des setters pour chaque attribut. Les attributs présents sont 
    id, content et creation. L'attribut id dispose d'une annotation indiquant qu'il 
    s'agit d'une valeur définie en auto-incrémentation dans la base et qu'il s'agit d'un
    identifiant pour notre relation. Toutes ces informations permettent à Hibernate de 
    savoir qu'il y a une table à construire et quels sont les champs à spécifier pour 
    celle-ci.

Réponse à la question 20 : 

Contenu récupéré avec une requête SELECT * FROM ADDRESS;

ID  	CONTENT  	         CREATION  
1	57 boulevard demorieux	                2021-11-12 15:32:07.302017

2	51 allee du gamay, 34080 montpellier	2021-11-12 15:32:07.323123

Réponse à la question 23 : 

    L'annotation @Autowired permet d'indiquer à Spring qu'une 
    injection de dépendances sera à réaliser pour cette méthode.

Réponse à la question 30 : 

    Bootstrap a été importé dans le projet en important simplement
	le fichier de style bootstrap en ligne. Il est également possible
	par exemple de télécharger les fichiers bootstrap afin de les conserver
	en local. Cette solution peut s'avérer plus intéressante notamment si
	on souhaite ne pas être dépendant d'une connexion internet par exemple.
	
Après consultation de M. Duroy, j'ai utilisé l'API OpenWeather à la place de MeteoConcept étant donné que ce travail a été commencé
il y a longtemps. Je traiterais donc les questions suivantes pour l'API OpenWeather.

Faut-il une clé API pour appeler OpenWeather ?
Oui. La clé API peut être obtenue en créant un compte.
Elle doit être passée en paramètre de toute requête par l'intermédiaire du paramètre APPID.

— Quelle URL appeler ?

Il est possible d'utiliser l'URL suivante : http://api.openweathermap.org/data/2.5/weather?
Il est alors possible de passer des paramètres tels que la latitude (lat=) et la longitude (lon=) récupérés
précédemment grâce à l'API adresse. Il faut systématiquement passer le paramètre APPID qui contient le token.

— Quelle methode HTTP utiliser ?

La méthode HTTP utilisée par OpenWeather est la méthode GET.

— Comment passer les parametres d’appels ?

Les paramètres d'appels sont passés directement dans l'URL appelée, par exemple : http://api.openweathermap.org/data/2.5/weather?lon=10&lat=14&APPID=MonToken


— Ou est l’information dont j’ai besoin dans la réponse :

Pour ce TP, j'ai uniquement récupéré l'image représentant la météo actuelle (dans weather -> icon), la description de la météo 
(dans weather -> description), la température actuelle en Kelvin (dans main -> temp), la température maximale en Kelvin (dans 
main -> temp_min), la température minimaloe en Kelvin (dans main -> temp_max), la température ressentie en Kelvin (main -> feels_like)
et enfin l'humidité (dans main -> humidity).

— Pour afficher la temṕerature du lieu vise par les coordonn ́ees GPS

Pour ce TP, j'ai récupéré les informations de température suivantes aux coordonées GPS indiquées : 
La température actuelle en Kelvin (dans main -> temp), la température maximale en Kelvin (dans 
main -> temp_min), la température minimaloe en Kelvin (dans main -> temp_max) et la température ressentie en Kelvin (main -> feels_like)

— Pour afficher la pŕevision de ḿeteo du lieu viśe par les coordonnees GPS

En ce qui concerne la prévision météo, j'ai récupéré les informations suivantes : 
La description de la météo (dans weather -> description), l'image représentant la météo actuelle (dans weather -> icon) et
l'humidité (dans main -> humidity).



