//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.09.20 at 10:29:25 PM MSK 
//


package gov.nih.ncbi.eutils.model;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElements;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "year",
    "monthOrDayOrSeason"
})
@XmlRootElement(name = "BeginningDate")
public class BeginningDate {

    @XmlElement(name = "Year", required = true)
    protected Year year;
    @XmlElements({
        @XmlElement(name = "Month", type = Month.class),
        @XmlElement(name = "Day", type = Day.class),
        @XmlElement(name = "Season", type = Season.class)
    })
    protected List<java.lang.Object> monthOrDayOrSeason;

    /**
     * Gets the value of the year property.
     * 
     * @return
     *     possible object is
     *     {@link Year }
     *     
     */
    public Year getYear() {
        return year;
    }

    /**
     * Sets the value of the year property.
     * 
     * @param value
     *     allowed object is
     *     {@link Year }
     *     
     */
    public void setYear(Year value) {
        this.year = value;
    }

    /**
     * Gets the value of the monthOrDayOrSeason property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the monthOrDayOrSeason property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMonthOrDayOrSeason().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Month }
     * {@link Day }
     * {@link Season }
     * 
     * 
     */
    public List<java.lang.Object> getMonthOrDayOrSeason() {
        if (monthOrDayOrSeason == null) {
            monthOrDayOrSeason = new ArrayList<java.lang.Object>();
        }
        return this.monthOrDayOrSeason;
    }

}
