package com.models;


import java.util.Date;
import java.util.UUID;

/**
 * @author User
 * @version 1.0
 * @created 10-May-2017 2:18:09 PM
 */
public class Assistant extends User{

    private UUID assistantId;
    private UUID officeId;

    public Assistant(String username, String password, Date dateAdded, Date dateOfBirth, String firstName, String lastName, Gender gender, UUID userId, UUID assistantId) {
        super(username, password, dateAdded, dateOfBirth, firstName, lastName, gender, userId);
        this.assistantId = assistantId;
    }

    public void finalize() throws Throwable {

    }

    public UUID getAsistantId() {
        return assistantId;
    }

    public void setAsistantId(UUID asistantId) {
        this.assistantId = asistantId;
    }

    public UUID getOfficeId() {
        return officeId;
    }

    public void setOfficeId(UUID officeId) {
        this.officeId = officeId;
    }
}//end Assistant