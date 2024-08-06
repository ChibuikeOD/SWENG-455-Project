package com.Team4.SWENG455.SWENG._5.Project.model;


import jakarta.persistence.*;
import java.util.List;

@Entity
public class Meeting {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int meetingID;
    
    private String title;
    private String description;
    private String startTime;
    private String endTime;
    
    @ManyToMany
    private List<User> participants;

    public int getMeetingID() {
        return meetingID;
    }

    public void setMeetingID(int meetingID) {
        this.meetingID = meetingID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    public List<User> getParticipants() {
        return participants;
    }

    public void setParticipants(List<User> participants) {
        this.participants = participants;
    }
        
    public void updateMeeting() {
        
    }

    public void cancelMeeting() {
       
    }

    public void addParticipant() {
        
    }

    public void removeParticipant() {
        
    
    }
    
}