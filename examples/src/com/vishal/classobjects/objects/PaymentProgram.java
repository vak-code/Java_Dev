package com.vishal.classobjects.objects;

import java.util.Date;
import java.util.Objects;

public class PaymentProgram {

	private String progID;
	private Date startDate;
	private Date endDate;

	public void enrollAccountIntoProgram() {
		System.out.println("Account succesfully enrolled into payment program");
	}

	public void setProgID(String progID) {
		this.progID = progID;
	}

	public String getProgID() {
		return this.progID;
	}

	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}

	public Date getStartDate() {
		return this.startDate;
	}

	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}

	public Date getEndDate() {
		return this.endDate;
	}

	@Override
	public int hashCode() {
		return Objects.hash(progID, startDate, endDate);
	}

	@Override
	public boolean equals(Object o) {
		if (o == null)
			return false;

		if (!(o instanceof PaymentProgram))
			return false;

		if (o == this)
			return true;

		PaymentProgram temp = (PaymentProgram) o;
		return (this.progID == temp.progID && this.startDate.equals(temp.startDate)
				&& this.endDate.equals(temp.endDate));
	}
}
