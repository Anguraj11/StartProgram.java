package simpleCreate;

public class RentRecord extends DateTime{
    private String RentId;
    private DateTime RentDate;
    private DateTime EstimatedReturnDate;
    private DateTime ActualReturnDate;
    private Double RentFee;
    private Double LateFee;

    RentRecord(String RentId,DateTime Rentdate,DateTime EstimatedReturnDate)
    {
        this.RentId=RentId;
        this.RentDate=Rentdate;
        this.EstimatedReturnDate=EstimatedReturnDate;
    }

    public void setData(DateTime ActualDate,Double RentFee,Double LateFee)
    {
        this.ActualReturnDate=ActualDate;
        this.RentFee=RentFee;
        this.LateFee=LateFee;
    }
    public DateTime getEstimatedReturnDate() {
        return this.EstimatedReturnDate;
    }

    public DateTime getRentDate()
    {
        return this.RentDate;
    }

    public String toString()
    {
        if(this.ActualReturnDate==null && this.RentFee==null && this.LateFee==null){
            String data = this.RentId+":"+this.RentDate.toString()+":"+this.EstimatedReturnDate.toString()+":none:none:none";
            return data;
        }
        else{
           return this.RentId+":"+this.RentDate.toString()+":"+this.EstimatedReturnDate.toString()+":"+this.ActualReturnDate.toString()+":"+this.RentFee.toString()+":"+this.LateFee.toString();
        }
    }

    public String getDetails()
    {
        if(this.ActualReturnDate==null && this.RentFee==null && this.LateFee==null) {
            String data =
                        "Record ID:             " + this.RentId
                    + "\nRent Date:             " + this.RentDate.toString()
                    + "\nEstimated Return Date: " + this.EstimatedReturnDate.toString();

            return data;
        }
        else{
            return      "Record ID:             " + this.RentId
                    + "\nRent Date:             " + this.RentDate.toString()
                    + "\nEstimated Return Date: " + this.EstimatedReturnDate.toString()
                    + "\nActual Return Date:    "+this.ActualReturnDate.toString()
                    + "\nRental Fee:            "+String.format ("%.2f", this.RentFee)+
                      "\nLate Fee:              "+String.format("%.2f",this.LateFee);
        }
    }
	
	
}