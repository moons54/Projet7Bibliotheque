
package org.biblio.p7.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour editeur complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="editeur"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intituleEditeur" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="lienweb" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "editeur", propOrder = {
    "intituleEditeur",
    "lienweb",
    "id"
})
public class Editeur {

    protected String intituleEditeur;
    protected String lienweb;
    @XmlElement(name = "iD")
    protected int id;

    /**
     * Obtient la valeur de la propriété intituleEditeur.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntituleEditeur() {
        return intituleEditeur;
    }

    /**
     * Définit la valeur de la propriété intituleEditeur.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntituleEditeur(String value) {
        this.intituleEditeur = value;
    }

    /**
     * Obtient la valeur de la propriété lienweb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLienweb() {
        return lienweb;
    }

    /**
     * Définit la valeur de la propriété lienweb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLienweb(String value) {
        this.lienweb = value;
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
