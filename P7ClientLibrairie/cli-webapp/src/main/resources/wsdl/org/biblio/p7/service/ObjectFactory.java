
package org.biblio.p7.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.biblio.p7.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ListerlesOuvrageparGenre_QNAME = new QName("http://service.p7.biblio.org/", "ListerlesOuvrageparGenre");
    private final static QName _ListerlesOuvrageparGenreResponse_QNAME = new QName("http://service.p7.biblio.org/", "ListerlesOuvrageparGenreResponse");
    private final static QName _ListerlesOuvrages_QNAME = new QName("http://service.p7.biblio.org/", "ListerlesOuvrages");
    private final static QName _ListerlesOuvragesResponse_QNAME = new QName("http://service.p7.biblio.org/", "ListerlesOuvragesResponse");
    private final static QName _ModifierOuvrage_QNAME = new QName("http://service.p7.biblio.org/", "ModifierOuvrage");
    private final static QName _ModifierOuvrageResponse_QNAME = new QName("http://service.p7.biblio.org/", "ModifierOuvrageResponse");
    private final static QName _AfficherAuteur_QNAME = new QName("http://service.p7.biblio.org/", "afficherAuteur");
    private final static QName _AfficherAuteurResponse_QNAME = new QName("http://service.p7.biblio.org/", "afficherAuteurResponse");
    private final static QName _AfficherEditeur_QNAME = new QName("http://service.p7.biblio.org/", "afficherEditeur");
    private final static QName _AfficherEditeurResponse_QNAME = new QName("http://service.p7.biblio.org/", "afficherEditeurResponse");
    private final static QName _AfficherExemplaire_QNAME = new QName("http://service.p7.biblio.org/", "afficherExemplaire");
    private final static QName _AfficherExemplaireResponse_QNAME = new QName("http://service.p7.biblio.org/", "afficherExemplaireResponse");
    private final static QName _AfficherGenre_QNAME = new QName("http://service.p7.biblio.org/", "afficherGenre");
    private final static QName _AfficherGenreResponse_QNAME = new QName("http://service.p7.biblio.org/", "afficherGenreResponse");
    private final static QName _AfficherVersion_QNAME = new QName("http://service.p7.biblio.org/", "afficherVersion");
    private final static QName _AfficherVersionResponse_QNAME = new QName("http://service.p7.biblio.org/", "afficherVersionResponse");
    private final static QName _AjouterAuteur_QNAME = new QName("http://service.p7.biblio.org/", "ajouterAuteur");
    private final static QName _AjouterAuteurResponse_QNAME = new QName("http://service.p7.biblio.org/", "ajouterAuteurResponse");
    private final static QName _AjouterEditeur_QNAME = new QName("http://service.p7.biblio.org/", "ajouterEditeur");
    private final static QName _AjouterEditeurResponse_QNAME = new QName("http://service.p7.biblio.org/", "ajouterEditeurResponse");
    private final static QName _AjouterExemplaire_QNAME = new QName("http://service.p7.biblio.org/", "ajouterExemplaire");
    private final static QName _AjouterExemplaireResponse_QNAME = new QName("http://service.p7.biblio.org/", "ajouterExemplaireResponse");
    private final static QName _AjouterGenre_QNAME = new QName("http://service.p7.biblio.org/", "ajouterGenre");
    private final static QName _AjouterGenreResponse_QNAME = new QName("http://service.p7.biblio.org/", "ajouterGenreResponse");
    private final static QName _AjouterOuvrage_QNAME = new QName("http://service.p7.biblio.org/", "ajouterOuvrage");
    private final static QName _AjouterOuvrageResponse_QNAME = new QName("http://service.p7.biblio.org/", "ajouterOuvrageResponse");
    private final static QName _AjouterVersion_QNAME = new QName("http://service.p7.biblio.org/", "ajouterVersion");
    private final static QName _AjouterVersionResponse_QNAME = new QName("http://service.p7.biblio.org/", "ajouterVersionResponse");
    private final static QName _ModifierAuteur_QNAME = new QName("http://service.p7.biblio.org/", "modifierAuteur");
    private final static QName _ModifierAuteurResponse_QNAME = new QName("http://service.p7.biblio.org/", "modifierAuteurResponse");
    private final static QName _ModifierEditeur_QNAME = new QName("http://service.p7.biblio.org/", "modifierEditeur");
    private final static QName _ModifierEditeurResponse_QNAME = new QName("http://service.p7.biblio.org/", "modifierEditeurResponse");
    private final static QName _ModifierExemplaire_QNAME = new QName("http://service.p7.biblio.org/", "modifierExemplaire");
    private final static QName _ModifierExemplaireResponse_QNAME = new QName("http://service.p7.biblio.org/", "modifierExemplaireResponse");
    private final static QName _ModifierGenre_QNAME = new QName("http://service.p7.biblio.org/", "modifierGenre");
    private final static QName _ModifierGenreResponse_QNAME = new QName("http://service.p7.biblio.org/", "modifierGenreResponse");
    private final static QName _ModifierVersion_QNAME = new QName("http://service.p7.biblio.org/", "modifierVersion");
    private final static QName _ModifierVersionResponse_QNAME = new QName("http://service.p7.biblio.org/", "modifierVersionResponse");
    private final static QName _RechercherparISBN_QNAME = new QName("http://service.p7.biblio.org/", "rechercherparISBN");
    private final static QName _RechercherparISBNResponse_QNAME = new QName("http://service.p7.biblio.org/", "rechercherparISBNResponse");
    private final static QName _RechercherparOuvrage_QNAME = new QName("http://service.p7.biblio.org/", "rechercherparOuvrage");
    private final static QName _RechercherparOuvrageResponse_QNAME = new QName("http://service.p7.biblio.org/", "rechercherparOuvrageResponse");
    private final static QName _SupprimerAuteur_QNAME = new QName("http://service.p7.biblio.org/", "supprimerAuteur");
    private final static QName _SupprimerAuteurResponse_QNAME = new QName("http://service.p7.biblio.org/", "supprimerAuteurResponse");
    private final static QName _SupprimerEditeur_QNAME = new QName("http://service.p7.biblio.org/", "supprimerEditeur");
    private final static QName _SupprimerEditeurResponse_QNAME = new QName("http://service.p7.biblio.org/", "supprimerEditeurResponse");
    private final static QName _SupprimerExemplaire_QNAME = new QName("http://service.p7.biblio.org/", "supprimerExemplaire");
    private final static QName _SupprimerExemplaireResponse_QNAME = new QName("http://service.p7.biblio.org/", "supprimerExemplaireResponse");
    private final static QName _SupprimerGenre_QNAME = new QName("http://service.p7.biblio.org/", "supprimerGenre");
    private final static QName _SupprimerGenreResponse_QNAME = new QName("http://service.p7.biblio.org/", "supprimerGenreResponse");
    private final static QName _SupprimerOuvrage_QNAME = new QName("http://service.p7.biblio.org/", "supprimerOuvrage");
    private final static QName _SupprimerOuvrageResponse_QNAME = new QName("http://service.p7.biblio.org/", "supprimerOuvrageResponse");
    private final static QName _SupprimerVersion_QNAME = new QName("http://service.p7.biblio.org/", "supprimerVersion");
    private final static QName _SupprimerVersionResponse_QNAME = new QName("http://service.p7.biblio.org/", "supprimerVersionResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.biblio.p7.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ListerlesOuvrageparGenre }
     * 
     */
    public ListerlesOuvrageparGenre createListerlesOuvrageparGenre() {
        return new ListerlesOuvrageparGenre();
    }

    /**
     * Create an instance of {@link ListerlesOuvrageparGenreResponse }
     * 
     */
    public ListerlesOuvrageparGenreResponse createListerlesOuvrageparGenreResponse() {
        return new ListerlesOuvrageparGenreResponse();
    }

    /**
     * Create an instance of {@link ListerlesOuvrages }
     * 
     */
    public ListerlesOuvrages createListerlesOuvrages() {
        return new ListerlesOuvrages();
    }

    /**
     * Create an instance of {@link ListerlesOuvragesResponse }
     * 
     */
    public ListerlesOuvragesResponse createListerlesOuvragesResponse() {
        return new ListerlesOuvragesResponse();
    }

    /**
     * Create an instance of {@link ModifierOuvrage }
     * 
     */
    public ModifierOuvrage createModifierOuvrage() {
        return new ModifierOuvrage();
    }

    /**
     * Create an instance of {@link ModifierOuvrageResponse }
     * 
     */
    public ModifierOuvrageResponse createModifierOuvrageResponse() {
        return new ModifierOuvrageResponse();
    }

    /**
     * Create an instance of {@link AfficherAuteur }
     * 
     */
    public AfficherAuteur createAfficherAuteur() {
        return new AfficherAuteur();
    }

    /**
     * Create an instance of {@link AfficherAuteurResponse }
     * 
     */
    public AfficherAuteurResponse createAfficherAuteurResponse() {
        return new AfficherAuteurResponse();
    }

    /**
     * Create an instance of {@link AfficherEditeur }
     * 
     */
    public AfficherEditeur createAfficherEditeur() {
        return new AfficherEditeur();
    }

    /**
     * Create an instance of {@link AfficherEditeurResponse }
     * 
     */
    public AfficherEditeurResponse createAfficherEditeurResponse() {
        return new AfficherEditeurResponse();
    }

    /**
     * Create an instance of {@link AfficherExemplaire }
     * 
     */
    public AfficherExemplaire createAfficherExemplaire() {
        return new AfficherExemplaire();
    }

    /**
     * Create an instance of {@link AfficherExemplaireResponse }
     * 
     */
    public AfficherExemplaireResponse createAfficherExemplaireResponse() {
        return new AfficherExemplaireResponse();
    }

    /**
     * Create an instance of {@link AfficherGenre }
     * 
     */
    public AfficherGenre createAfficherGenre() {
        return new AfficherGenre();
    }

    /**
     * Create an instance of {@link AfficherGenreResponse }
     * 
     */
    public AfficherGenreResponse createAfficherGenreResponse() {
        return new AfficherGenreResponse();
    }

    /**
     * Create an instance of {@link AfficherVersion }
     * 
     */
    public AfficherVersion createAfficherVersion() {
        return new AfficherVersion();
    }

    /**
     * Create an instance of {@link AfficherVersionResponse }
     * 
     */
    public AfficherVersionResponse createAfficherVersionResponse() {
        return new AfficherVersionResponse();
    }

    /**
     * Create an instance of {@link AjouterAuteur }
     * 
     */
    public AjouterAuteur createAjouterAuteur() {
        return new AjouterAuteur();
    }

    /**
     * Create an instance of {@link AjouterAuteurResponse }
     * 
     */
    public AjouterAuteurResponse createAjouterAuteurResponse() {
        return new AjouterAuteurResponse();
    }

    /**
     * Create an instance of {@link AjouterEditeur }
     * 
     */
    public AjouterEditeur createAjouterEditeur() {
        return new AjouterEditeur();
    }

    /**
     * Create an instance of {@link AjouterEditeurResponse }
     * 
     */
    public AjouterEditeurResponse createAjouterEditeurResponse() {
        return new AjouterEditeurResponse();
    }

    /**
     * Create an instance of {@link AjouterExemplaire }
     * 
     */
    public AjouterExemplaire createAjouterExemplaire() {
        return new AjouterExemplaire();
    }

    /**
     * Create an instance of {@link AjouterExemplaireResponse }
     * 
     */
    public AjouterExemplaireResponse createAjouterExemplaireResponse() {
        return new AjouterExemplaireResponse();
    }

    /**
     * Create an instance of {@link AjouterGenre }
     * 
     */
    public AjouterGenre createAjouterGenre() {
        return new AjouterGenre();
    }

    /**
     * Create an instance of {@link AjouterGenreResponse }
     * 
     */
    public AjouterGenreResponse createAjouterGenreResponse() {
        return new AjouterGenreResponse();
    }

    /**
     * Create an instance of {@link AjouterOuvrage }
     * 
     */
    public AjouterOuvrage createAjouterOuvrage() {
        return new AjouterOuvrage();
    }

    /**
     * Create an instance of {@link AjouterOuvrageResponse }
     * 
     */
    public AjouterOuvrageResponse createAjouterOuvrageResponse() {
        return new AjouterOuvrageResponse();
    }

    /**
     * Create an instance of {@link AjouterVersion }
     * 
     */
    public AjouterVersion createAjouterVersion() {
        return new AjouterVersion();
    }

    /**
     * Create an instance of {@link AjouterVersionResponse }
     * 
     */
    public AjouterVersionResponse createAjouterVersionResponse() {
        return new AjouterVersionResponse();
    }

    /**
     * Create an instance of {@link ModifierAuteur }
     * 
     */
    public ModifierAuteur createModifierAuteur() {
        return new ModifierAuteur();
    }

    /**
     * Create an instance of {@link ModifierAuteurResponse }
     * 
     */
    public ModifierAuteurResponse createModifierAuteurResponse() {
        return new ModifierAuteurResponse();
    }

    /**
     * Create an instance of {@link ModifierEditeur }
     * 
     */
    public ModifierEditeur createModifierEditeur() {
        return new ModifierEditeur();
    }

    /**
     * Create an instance of {@link ModifierEditeurResponse }
     * 
     */
    public ModifierEditeurResponse createModifierEditeurResponse() {
        return new ModifierEditeurResponse();
    }

    /**
     * Create an instance of {@link ModifierExemplaire }
     * 
     */
    public ModifierExemplaire createModifierExemplaire() {
        return new ModifierExemplaire();
    }

    /**
     * Create an instance of {@link ModifierExemplaireResponse }
     * 
     */
    public ModifierExemplaireResponse createModifierExemplaireResponse() {
        return new ModifierExemplaireResponse();
    }

    /**
     * Create an instance of {@link ModifierGenre }
     * 
     */
    public ModifierGenre createModifierGenre() {
        return new ModifierGenre();
    }

    /**
     * Create an instance of {@link ModifierGenreResponse }
     * 
     */
    public ModifierGenreResponse createModifierGenreResponse() {
        return new ModifierGenreResponse();
    }

    /**
     * Create an instance of {@link ModifierVersion }
     * 
     */
    public ModifierVersion createModifierVersion() {
        return new ModifierVersion();
    }

    /**
     * Create an instance of {@link ModifierVersionResponse }
     * 
     */
    public ModifierVersionResponse createModifierVersionResponse() {
        return new ModifierVersionResponse();
    }

    /**
     * Create an instance of {@link RechercherparISBN }
     * 
     */
    public RechercherparISBN createRechercherparISBN() {
        return new RechercherparISBN();
    }

    /**
     * Create an instance of {@link RechercherparISBNResponse }
     * 
     */
    public RechercherparISBNResponse createRechercherparISBNResponse() {
        return new RechercherparISBNResponse();
    }

    /**
     * Create an instance of {@link RechercherparOuvrage }
     * 
     */
    public RechercherparOuvrage createRechercherparOuvrage() {
        return new RechercherparOuvrage();
    }

    /**
     * Create an instance of {@link RechercherparOuvrageResponse }
     * 
     */
    public RechercherparOuvrageResponse createRechercherparOuvrageResponse() {
        return new RechercherparOuvrageResponse();
    }

    /**
     * Create an instance of {@link SupprimerAuteur }
     * 
     */
    public SupprimerAuteur createSupprimerAuteur() {
        return new SupprimerAuteur();
    }

    /**
     * Create an instance of {@link SupprimerAuteurResponse }
     * 
     */
    public SupprimerAuteurResponse createSupprimerAuteurResponse() {
        return new SupprimerAuteurResponse();
    }

    /**
     * Create an instance of {@link SupprimerEditeur }
     * 
     */
    public SupprimerEditeur createSupprimerEditeur() {
        return new SupprimerEditeur();
    }

    /**
     * Create an instance of {@link SupprimerEditeurResponse }
     * 
     */
    public SupprimerEditeurResponse createSupprimerEditeurResponse() {
        return new SupprimerEditeurResponse();
    }

    /**
     * Create an instance of {@link SupprimerExemplaire }
     * 
     */
    public SupprimerExemplaire createSupprimerExemplaire() {
        return new SupprimerExemplaire();
    }

    /**
     * Create an instance of {@link SupprimerExemplaireResponse }
     * 
     */
    public SupprimerExemplaireResponse createSupprimerExemplaireResponse() {
        return new SupprimerExemplaireResponse();
    }

    /**
     * Create an instance of {@link SupprimerGenre }
     * 
     */
    public SupprimerGenre createSupprimerGenre() {
        return new SupprimerGenre();
    }

    /**
     * Create an instance of {@link SupprimerGenreResponse }
     * 
     */
    public SupprimerGenreResponse createSupprimerGenreResponse() {
        return new SupprimerGenreResponse();
    }

    /**
     * Create an instance of {@link SupprimerOuvrage }
     * 
     */
    public SupprimerOuvrage createSupprimerOuvrage() {
        return new SupprimerOuvrage();
    }

    /**
     * Create an instance of {@link SupprimerOuvrageResponse }
     * 
     */
    public SupprimerOuvrageResponse createSupprimerOuvrageResponse() {
        return new SupprimerOuvrageResponse();
    }

    /**
     * Create an instance of {@link SupprimerVersion }
     * 
     */
    public SupprimerVersion createSupprimerVersion() {
        return new SupprimerVersion();
    }

    /**
     * Create an instance of {@link SupprimerVersionResponse }
     * 
     */
    public SupprimerVersionResponse createSupprimerVersionResponse() {
        return new SupprimerVersionResponse();
    }

    /**
     * Create an instance of {@link Ouvrage }
     * 
     */
    public Ouvrage createOuvrage() {
        return new Ouvrage();
    }

    /**
     * Create an instance of {@link Auteur }
     * 
     */
    public Auteur createAuteur() {
        return new Auteur();
    }

    /**
     * Create an instance of {@link Editeur }
     * 
     */
    public Editeur createEditeur() {
        return new Editeur();
    }

    /**
     * Create an instance of {@link Genre }
     * 
     */
    public Genre createGenre() {
        return new Genre();
    }

    /**
     * Create an instance of {@link Exemplaire }
     * 
     */
    public Exemplaire createExemplaire() {
        return new Exemplaire();
    }

    /**
     * Create an instance of {@link Bibliotheque }
     * 
     */
    public Bibliotheque createBibliotheque() {
        return new Bibliotheque();
    }

    /**
     * Create an instance of {@link EditionOuvrage }
     * 
     */
    public EditionOuvrage createEditionOuvrage() {
        return new EditionOuvrage();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerlesOuvrageparGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ListerlesOuvrageparGenre")
    public JAXBElement<ListerlesOuvrageparGenre> createListerlesOuvrageparGenre(ListerlesOuvrageparGenre value) {
        return new JAXBElement<ListerlesOuvrageparGenre>(_ListerlesOuvrageparGenre_QNAME, ListerlesOuvrageparGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerlesOuvrageparGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ListerlesOuvrageparGenreResponse")
    public JAXBElement<ListerlesOuvrageparGenreResponse> createListerlesOuvrageparGenreResponse(ListerlesOuvrageparGenreResponse value) {
        return new JAXBElement<ListerlesOuvrageparGenreResponse>(_ListerlesOuvrageparGenreResponse_QNAME, ListerlesOuvrageparGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerlesOuvrages }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ListerlesOuvrages")
    public JAXBElement<ListerlesOuvrages> createListerlesOuvrages(ListerlesOuvrages value) {
        return new JAXBElement<ListerlesOuvrages>(_ListerlesOuvrages_QNAME, ListerlesOuvrages.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ListerlesOuvragesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ListerlesOuvragesResponse")
    public JAXBElement<ListerlesOuvragesResponse> createListerlesOuvragesResponse(ListerlesOuvragesResponse value) {
        return new JAXBElement<ListerlesOuvragesResponse>(_ListerlesOuvragesResponse_QNAME, ListerlesOuvragesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierOuvrage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ModifierOuvrage")
    public JAXBElement<ModifierOuvrage> createModifierOuvrage(ModifierOuvrage value) {
        return new JAXBElement<ModifierOuvrage>(_ModifierOuvrage_QNAME, ModifierOuvrage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierOuvrageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ModifierOuvrageResponse")
    public JAXBElement<ModifierOuvrageResponse> createModifierOuvrageResponse(ModifierOuvrageResponse value) {
        return new JAXBElement<ModifierOuvrageResponse>(_ModifierOuvrageResponse_QNAME, ModifierOuvrageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "afficherAuteur")
    public JAXBElement<AfficherAuteur> createAfficherAuteur(AfficherAuteur value) {
        return new JAXBElement<AfficherAuteur>(_AfficherAuteur_QNAME, AfficherAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "afficherAuteurResponse")
    public JAXBElement<AfficherAuteurResponse> createAfficherAuteurResponse(AfficherAuteurResponse value) {
        return new JAXBElement<AfficherAuteurResponse>(_AfficherAuteurResponse_QNAME, AfficherAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherEditeur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "afficherEditeur")
    public JAXBElement<AfficherEditeur> createAfficherEditeur(AfficherEditeur value) {
        return new JAXBElement<AfficherEditeur>(_AfficherEditeur_QNAME, AfficherEditeur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherEditeurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "afficherEditeurResponse")
    public JAXBElement<AfficherEditeurResponse> createAfficherEditeurResponse(AfficherEditeurResponse value) {
        return new JAXBElement<AfficherEditeurResponse>(_AfficherEditeurResponse_QNAME, AfficherEditeurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherExemplaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "afficherExemplaire")
    public JAXBElement<AfficherExemplaire> createAfficherExemplaire(AfficherExemplaire value) {
        return new JAXBElement<AfficherExemplaire>(_AfficherExemplaire_QNAME, AfficherExemplaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherExemplaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "afficherExemplaireResponse")
    public JAXBElement<AfficherExemplaireResponse> createAfficherExemplaireResponse(AfficherExemplaireResponse value) {
        return new JAXBElement<AfficherExemplaireResponse>(_AfficherExemplaireResponse_QNAME, AfficherExemplaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "afficherGenre")
    public JAXBElement<AfficherGenre> createAfficherGenre(AfficherGenre value) {
        return new JAXBElement<AfficherGenre>(_AfficherGenre_QNAME, AfficherGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "afficherGenreResponse")
    public JAXBElement<AfficherGenreResponse> createAfficherGenreResponse(AfficherGenreResponse value) {
        return new JAXBElement<AfficherGenreResponse>(_AfficherGenreResponse_QNAME, AfficherGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "afficherVersion")
    public JAXBElement<AfficherVersion> createAfficherVersion(AfficherVersion value) {
        return new JAXBElement<AfficherVersion>(_AfficherVersion_QNAME, AfficherVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AfficherVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "afficherVersionResponse")
    public JAXBElement<AfficherVersionResponse> createAfficherVersionResponse(AfficherVersionResponse value) {
        return new JAXBElement<AfficherVersionResponse>(_AfficherVersionResponse_QNAME, AfficherVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ajouterAuteur")
    public JAXBElement<AjouterAuteur> createAjouterAuteur(AjouterAuteur value) {
        return new JAXBElement<AjouterAuteur>(_AjouterAuteur_QNAME, AjouterAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ajouterAuteurResponse")
    public JAXBElement<AjouterAuteurResponse> createAjouterAuteurResponse(AjouterAuteurResponse value) {
        return new JAXBElement<AjouterAuteurResponse>(_AjouterAuteurResponse_QNAME, AjouterAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEditeur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ajouterEditeur")
    public JAXBElement<AjouterEditeur> createAjouterEditeur(AjouterEditeur value) {
        return new JAXBElement<AjouterEditeur>(_AjouterEditeur_QNAME, AjouterEditeur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterEditeurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ajouterEditeurResponse")
    public JAXBElement<AjouterEditeurResponse> createAjouterEditeurResponse(AjouterEditeurResponse value) {
        return new JAXBElement<AjouterEditeurResponse>(_AjouterEditeurResponse_QNAME, AjouterEditeurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterExemplaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ajouterExemplaire")
    public JAXBElement<AjouterExemplaire> createAjouterExemplaire(AjouterExemplaire value) {
        return new JAXBElement<AjouterExemplaire>(_AjouterExemplaire_QNAME, AjouterExemplaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterExemplaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ajouterExemplaireResponse")
    public JAXBElement<AjouterExemplaireResponse> createAjouterExemplaireResponse(AjouterExemplaireResponse value) {
        return new JAXBElement<AjouterExemplaireResponse>(_AjouterExemplaireResponse_QNAME, AjouterExemplaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ajouterGenre")
    public JAXBElement<AjouterGenre> createAjouterGenre(AjouterGenre value) {
        return new JAXBElement<AjouterGenre>(_AjouterGenre_QNAME, AjouterGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ajouterGenreResponse")
    public JAXBElement<AjouterGenreResponse> createAjouterGenreResponse(AjouterGenreResponse value) {
        return new JAXBElement<AjouterGenreResponse>(_AjouterGenreResponse_QNAME, AjouterGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterOuvrage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ajouterOuvrage")
    public JAXBElement<AjouterOuvrage> createAjouterOuvrage(AjouterOuvrage value) {
        return new JAXBElement<AjouterOuvrage>(_AjouterOuvrage_QNAME, AjouterOuvrage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterOuvrageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ajouterOuvrageResponse")
    public JAXBElement<AjouterOuvrageResponse> createAjouterOuvrageResponse(AjouterOuvrageResponse value) {
        return new JAXBElement<AjouterOuvrageResponse>(_AjouterOuvrageResponse_QNAME, AjouterOuvrageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ajouterVersion")
    public JAXBElement<AjouterVersion> createAjouterVersion(AjouterVersion value) {
        return new JAXBElement<AjouterVersion>(_AjouterVersion_QNAME, AjouterVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AjouterVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "ajouterVersionResponse")
    public JAXBElement<AjouterVersionResponse> createAjouterVersionResponse(AjouterVersionResponse value) {
        return new JAXBElement<AjouterVersionResponse>(_AjouterVersionResponse_QNAME, AjouterVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "modifierAuteur")
    public JAXBElement<ModifierAuteur> createModifierAuteur(ModifierAuteur value) {
        return new JAXBElement<ModifierAuteur>(_ModifierAuteur_QNAME, ModifierAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "modifierAuteurResponse")
    public JAXBElement<ModifierAuteurResponse> createModifierAuteurResponse(ModifierAuteurResponse value) {
        return new JAXBElement<ModifierAuteurResponse>(_ModifierAuteurResponse_QNAME, ModifierAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierEditeur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "modifierEditeur")
    public JAXBElement<ModifierEditeur> createModifierEditeur(ModifierEditeur value) {
        return new JAXBElement<ModifierEditeur>(_ModifierEditeur_QNAME, ModifierEditeur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierEditeurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "modifierEditeurResponse")
    public JAXBElement<ModifierEditeurResponse> createModifierEditeurResponse(ModifierEditeurResponse value) {
        return new JAXBElement<ModifierEditeurResponse>(_ModifierEditeurResponse_QNAME, ModifierEditeurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierExemplaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "modifierExemplaire")
    public JAXBElement<ModifierExemplaire> createModifierExemplaire(ModifierExemplaire value) {
        return new JAXBElement<ModifierExemplaire>(_ModifierExemplaire_QNAME, ModifierExemplaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierExemplaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "modifierExemplaireResponse")
    public JAXBElement<ModifierExemplaireResponse> createModifierExemplaireResponse(ModifierExemplaireResponse value) {
        return new JAXBElement<ModifierExemplaireResponse>(_ModifierExemplaireResponse_QNAME, ModifierExemplaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "modifierGenre")
    public JAXBElement<ModifierGenre> createModifierGenre(ModifierGenre value) {
        return new JAXBElement<ModifierGenre>(_ModifierGenre_QNAME, ModifierGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "modifierGenreResponse")
    public JAXBElement<ModifierGenreResponse> createModifierGenreResponse(ModifierGenreResponse value) {
        return new JAXBElement<ModifierGenreResponse>(_ModifierGenreResponse_QNAME, ModifierGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "modifierVersion")
    public JAXBElement<ModifierVersion> createModifierVersion(ModifierVersion value) {
        return new JAXBElement<ModifierVersion>(_ModifierVersion_QNAME, ModifierVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ModifierVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "modifierVersionResponse")
    public JAXBElement<ModifierVersionResponse> createModifierVersionResponse(ModifierVersionResponse value) {
        return new JAXBElement<ModifierVersionResponse>(_ModifierVersionResponse_QNAME, ModifierVersionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherparISBN }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "rechercherparISBN")
    public JAXBElement<RechercherparISBN> createRechercherparISBN(RechercherparISBN value) {
        return new JAXBElement<RechercherparISBN>(_RechercherparISBN_QNAME, RechercherparISBN.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherparISBNResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "rechercherparISBNResponse")
    public JAXBElement<RechercherparISBNResponse> createRechercherparISBNResponse(RechercherparISBNResponse value) {
        return new JAXBElement<RechercherparISBNResponse>(_RechercherparISBNResponse_QNAME, RechercherparISBNResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherparOuvrage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "rechercherparOuvrage")
    public JAXBElement<RechercherparOuvrage> createRechercherparOuvrage(RechercherparOuvrage value) {
        return new JAXBElement<RechercherparOuvrage>(_RechercherparOuvrage_QNAME, RechercherparOuvrage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RechercherparOuvrageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "rechercherparOuvrageResponse")
    public JAXBElement<RechercherparOuvrageResponse> createRechercherparOuvrageResponse(RechercherparOuvrageResponse value) {
        return new JAXBElement<RechercherparOuvrageResponse>(_RechercherparOuvrageResponse_QNAME, RechercherparOuvrageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerAuteur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "supprimerAuteur")
    public JAXBElement<SupprimerAuteur> createSupprimerAuteur(SupprimerAuteur value) {
        return new JAXBElement<SupprimerAuteur>(_SupprimerAuteur_QNAME, SupprimerAuteur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerAuteurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "supprimerAuteurResponse")
    public JAXBElement<SupprimerAuteurResponse> createSupprimerAuteurResponse(SupprimerAuteurResponse value) {
        return new JAXBElement<SupprimerAuteurResponse>(_SupprimerAuteurResponse_QNAME, SupprimerAuteurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerEditeur }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "supprimerEditeur")
    public JAXBElement<SupprimerEditeur> createSupprimerEditeur(SupprimerEditeur value) {
        return new JAXBElement<SupprimerEditeur>(_SupprimerEditeur_QNAME, SupprimerEditeur.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerEditeurResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "supprimerEditeurResponse")
    public JAXBElement<SupprimerEditeurResponse> createSupprimerEditeurResponse(SupprimerEditeurResponse value) {
        return new JAXBElement<SupprimerEditeurResponse>(_SupprimerEditeurResponse_QNAME, SupprimerEditeurResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerExemplaire }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "supprimerExemplaire")
    public JAXBElement<SupprimerExemplaire> createSupprimerExemplaire(SupprimerExemplaire value) {
        return new JAXBElement<SupprimerExemplaire>(_SupprimerExemplaire_QNAME, SupprimerExemplaire.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerExemplaireResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "supprimerExemplaireResponse")
    public JAXBElement<SupprimerExemplaireResponse> createSupprimerExemplaireResponse(SupprimerExemplaireResponse value) {
        return new JAXBElement<SupprimerExemplaireResponse>(_SupprimerExemplaireResponse_QNAME, SupprimerExemplaireResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerGenre }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "supprimerGenre")
    public JAXBElement<SupprimerGenre> createSupprimerGenre(SupprimerGenre value) {
        return new JAXBElement<SupprimerGenre>(_SupprimerGenre_QNAME, SupprimerGenre.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerGenreResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "supprimerGenreResponse")
    public JAXBElement<SupprimerGenreResponse> createSupprimerGenreResponse(SupprimerGenreResponse value) {
        return new JAXBElement<SupprimerGenreResponse>(_SupprimerGenreResponse_QNAME, SupprimerGenreResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerOuvrage }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "supprimerOuvrage")
    public JAXBElement<SupprimerOuvrage> createSupprimerOuvrage(SupprimerOuvrage value) {
        return new JAXBElement<SupprimerOuvrage>(_SupprimerOuvrage_QNAME, SupprimerOuvrage.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerOuvrageResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "supprimerOuvrageResponse")
    public JAXBElement<SupprimerOuvrageResponse> createSupprimerOuvrageResponse(SupprimerOuvrageResponse value) {
        return new JAXBElement<SupprimerOuvrageResponse>(_SupprimerOuvrageResponse_QNAME, SupprimerOuvrageResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerVersion }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "supprimerVersion")
    public JAXBElement<SupprimerVersion> createSupprimerVersion(SupprimerVersion value) {
        return new JAXBElement<SupprimerVersion>(_SupprimerVersion_QNAME, SupprimerVersion.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SupprimerVersionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://service.p7.biblio.org/", name = "supprimerVersionResponse")
    public JAXBElement<SupprimerVersionResponse> createSupprimerVersionResponse(SupprimerVersionResponse value) {
        return new JAXBElement<SupprimerVersionResponse>(_SupprimerVersionResponse_QNAME, SupprimerVersionResponse.class, null, value);
    }

}
