/**
 * 
 */
package org.avinash.fhirclientjs.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ashanbhag
 *
 */
public class DiagnosticReportInfo implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private String display;
	private String status;
	private String category;
	private String code;
	private String performer;
	private String presentedForm;
	
	private String issued; // when (date)
	
	//private ObservationInfo observation;
	
	private List<ObservationInfo> observationlist;
	
	
	
	
	/**
	 * CTOR
	 */
	public DiagnosticReportInfo() 
	{
		this.display = null;
		this.status = null;
		this.category = null;
		this.code = null;
		this.performer = null;
		this.presentedForm = null;
		this.issued = null;
		
		this.observationlist = new ArrayList<ObservationInfo>();
		
	}
	
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}


	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}


	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}


	/**
	 * @param category the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}


	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}


	/**
	 * @param code the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}



	/**
	 * @return the performer
	 */
	public String getPerformer() {
		return performer;
	}


	/**
	 * @param performer the performer to set
	 */
	public void setPerformer(String performer) {
		this.performer = performer;
	}




	/**
	 * @return the presentedForm
	 */
	public String getPresentedForm() {
		return presentedForm;
	}


	/**
	 * @param presentedForm the presentedForm to set
	 */
	public void setPresentedForm(String presentedForm) {
		this.presentedForm = presentedForm;
	}

	/**
	 * @return the issued
	 */
	public String getIssued() {
		return issued;
	}

	/**
	 * @param issued the issued to set
	 */
	public void setIssued(String issued) {
		this.issued = issued;
	}

	/**
	 * @return the display
	 */
	public String getDisplay() {
		return display;
	}

	/**
	 * @param display the display to set
	 */
	public void setDisplay(String display) {
		this.display = display;
	}

	/**
	 * @return the observationlist
	 */
	public List<ObservationInfo> getObservationlist() {
		return observationlist;
	}

	/**
	 * @param observationlist the observationlist to set
	 */
	public void setObservationlist(List<ObservationInfo> observationlist) {
		this.observationlist = observationlist;
	}
	
	public void addObservation(ObservationInfo observationInfo)
	{
		this.observationlist.add(observationInfo);
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "DiagnosticReportInfo [display=" + display + ", status="
				+ status + ", category=" + category + ", code=" + code
				+ ", performer=" + performer 
				+ ", presentedForm=" + presentedForm + ", issued=" + issued
				+ ", observationlist=" + observationlist + "]";
	}


	


}
