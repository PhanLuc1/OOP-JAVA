package DTO;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DoB {
    private Date date;

    public DoB(String dob) throws InvalidDOBException {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            sdf.setLenient(false);
            this.date = sdf.parse(dob);
        } catch (ParseException e) {
            throw new InvalidDOBException("Invalid date of birth. Format must be dd/MM/yyyy.");
        }
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return sdf.format(date);
    }
}
