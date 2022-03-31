package zw.org.zvandiri.business.domain.dto;


import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.format.annotation.DateTimeFormat;
import zw.org.zvandiri.business.domain.Patient;
import zw.org.zvandiri.business.domain.util.Cd4CountResultSource;
import zw.org.zvandiri.business.domain.util.TestType;
import zw.org.zvandiri.business.domain.util.YesNo;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

/**
 * @author manatsachinyeruse@gmail.com
 */


public class VLCD4DTO {
    private String patient;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date dateTaken;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private Date nextTestDate;
    private Integer result;
    private String tnd;
    @Enumerated
    private TestType testType;
    @Enumerated
    private YesNo haveResult;
    @Enumerated
    private Cd4CountResultSource source;


    public VLCD4DTO() {
    }

    public VLCD4DTO(@NotNull String patient, Date dateTaken, Date nextTestDate, Integer result, String tnd, TestType testType, YesNo haveResult, Cd4CountResultSource source) {
        this.patient = patient;
        this.dateTaken = dateTaken;
        this.nextTestDate = nextTestDate;
        this.result = result;
        this.tnd = tnd;
        this.testType = testType;
        this.haveResult = haveResult;
        this.source = source;
    }

    public String getPatient() {
        return patient;
    }

    public void setPatient(String patient) {
        this.patient = patient;
    }

    public Date getDateTaken() {
        return dateTaken;
    }

    public void setDateTaken(Date dateTaken) {
        this.dateTaken = dateTaken;
    }

    public Date getNextTestDate() {
        return nextTestDate;
    }

    public void setNextTestDate(Date nextTestDate) {
        this.nextTestDate = nextTestDate;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }

    public String getTnd() {
        return tnd;
    }

    public void setTnd(String tnd) {
        this.tnd = tnd;
    }

    public TestType getTestType() {
        return testType;
    }

    public void setTestType(TestType testType) {
        this.testType = testType;
    }

    public YesNo getHaveResult() {
        return haveResult;
    }

    public void setHaveResult(YesNo haveResult) {
        this.haveResult = haveResult;
    }

    public Cd4CountResultSource getSource() {
        return source;
    }

    public void setSource(Cd4CountResultSource source) {
        this.source = source;
    }
}
