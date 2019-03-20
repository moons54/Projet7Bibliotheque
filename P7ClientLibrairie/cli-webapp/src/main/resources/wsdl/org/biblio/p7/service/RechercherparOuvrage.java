
package org.biblio.p7.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour rechercherparOuvrage complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>
 * &lt;complexType name="rechercherparOuvrage"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="intituleOuvrage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "rechercherparOuvrage", propOrder = {
    "intituleOuvrage"
})
public class RechercherparOuvrage {

    protected String intituleOuvrage;

    /**
     * Obtient la valeur de la propriété intituleOuvrage.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIntituleOuvrage() {
        return intituleOuvrage;
    }

    /**
     * Définit la valeur de la propriété intituleOuvrage.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIntituleOuvrage(String value) {
        this.intituleOuvrage = value;
    }

}
