
package org.biblio.p7.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour genre complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="genre"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="descriptionGenre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="intituleGenre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="webographie" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
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
@XmlType(name = "genre", propOrder = {
    "descriptionGenre",
    "intituleGenre",
    "webographie",
    "id"
})
public class Genre {

    protected String descriptionGenre;
    protected String intituleGenre;
    protected String webographie;
    @XmlElement(name = "iD")
    protected int id;

    /**
     * Obtient la valeur de la propriété descriptionGenre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionGenre() {
        return descriptionGenre;
    }

    /**
     * Définit la valeur de la propriété descriptionGenre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionGenre(String value) {
        this.descriptionGenre = value;
    }

    /**
     * Obtient la valeur de la propriété intituleGenre.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntituleGenre() {
        return intituleGenre;
    }

    /**
     * Définit la valeur de la propriété intituleGenre.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntituleGenre(String value) {
        this.intituleGenre = value;
    }

    /**
     * Obtient la valeur de la propriété webographie.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWebographie() {
        return webographie;
    }

    /**
     * Définit la valeur de la propriété webographie.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWebographie(String value) {
        this.webographie = value;
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
