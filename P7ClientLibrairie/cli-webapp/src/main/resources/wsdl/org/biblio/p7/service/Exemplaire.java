
package org.biblio.p7.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour exemplaire complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="exemplaire"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="bibliotheque" type="{http://service.p7.biblio.org/}bibliotheque" minOccurs="0"/&gt;
 *         &lt;element name="ouvrage" type="{http://service.p7.biblio.org/}ouvrage" minOccurs="0"/&gt;
 *         &lt;element name="referenceInterne" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="iD" type="{http://www.w3.org/2001/XMLSchema}int"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "exemplaire", propOrder = {
    "bibliotheque",
    "ouvrage",
    "referenceInterne",
    "id"
})
public class Exemplaire {

    protected Bibliotheque bibliotheque;
    protected Ouvrage ouvrage;
    protected String referenceInterne;
    @XmlElement(name = "iD")
    protected int id;

    /**
     * Obtient la valeur de la propriété bibliotheque.
     * 
     * @return
     *     possible object is
     *     {@link Bibliotheque }
     *     
     */
    public Bibliotheque getBibliotheque() {
        return bibliotheque;
    }

    /**
     * Définit la valeur de la propriété bibliotheque.
     * 
     * @param value
     *     allowed object is
     *     {@link Bibliotheque }
     *     
     */
    public void setBibliotheque(Bibliotheque value) {
        this.bibliotheque = value;
    }

    /**
     * Obtient la valeur de la propriété ouvrage.
     * 
     * @return
     *     possible object is
     *     {@link Ouvrage }
     *     
     */
    public Ouvrage getOuvrage() {
        return ouvrage;
    }

    /**
     * Définit la valeur de la propriété ouvrage.
     * 
     * @param value
     *     allowed object is
     *     {@link Ouvrage }
     *     
     */
    public void setOuvrage(Ouvrage value) {
        this.ouvrage = value;
    }

    /**
     * Obtient la valeur de la propriété referenceInterne.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReferenceInterne() {
        return referenceInterne;
    }

    /**
     * Définit la valeur de la propriété referenceInterne.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReferenceInterne(String value) {
        this.referenceInterne = value;
    }

    /**
     * Obtient la valeur de la propriété id.
     * 
     */
    public int getID() {
        return id;
    }

    /**
     * Définit la valeur de la propriété id.
     * 
     */
    public void setID(int value) {
        this.id = value;
    }

}
