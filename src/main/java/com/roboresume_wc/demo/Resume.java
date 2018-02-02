package com.roboresume_wc.demo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class Resume {


    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;

    //General
    @NotNull
    @Size(min=4)
    private String name;

    @NotNull
    @Size(min=3)
    private String email;

    @NotNull
    @Size(min=5)
    private String linkedin;

    @NotNull
    @Size(min=5)
    private String github;

    @NotNull
    @Size(min=5)
    private String twitter;



    //Education ----------------------------------------------------------------
    @NotNull
    @Size(min=3)
    private String degree;

    @NotNull
    @Size(min=5)
    private String school;

    @NotNull
    @Size(min=4)
    private String year;

    //Optional Entries - Max of 3 for Education

    private String degree2;

    private String school2;

    private String year2;

    private String degree3;

    private String school3;

    private String year3;

    //Experience ----------------------------------------------------------------
    @NotNull
    @Size(min=4)
    private String position;

    @NotNull
    @Size(min=3)
    private String company;

    @NotNull
    @Size(min=5)
    private String location;

    @NotNull
    @Size(min=5)
    private String duration;

    @NotNull
    @Size(min=5)
    private String description;


    //Optional Entries - Max of 3 for Experience


    private String position2;


    private String company2;


    private String location2;


    private String duration2;


    private String description2;


    private String position3;


    private String company3;


    private String location3;


    private String duration3;


    private String description3;



    //Skill ----------------------------------------------------------------
    @NotNull
    @Size(min=3)
    private String skill;

    @NotNull
    @Min(1)
    @Max(5)
    private String level;



    //Optional Entries - Max of 5 for Skills




    private String skill2;



    private String level2;



    private String skill3;



    private String level3;



    //GETTERS / SETTERS -----------------------------------------------------

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLinkedin() {
        return linkedin;
    }

    public void setLinkedin(String linkedin) {
        this.linkedin = linkedin;
    }

    public String getGithub() {
        return github;
    }

    public void setGithub(String github) {
        this.github = github;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getDegree2() {
        return degree2;
    }

    public void setDegree2(String degree2) {
        this.degree2 = degree2;
    }

    public String getSchool2() {
        return school2;
    }

    public void setSchool2(String school2) {
        this.school2 = school2;
    }

    public String getYear2() {
        return year2;
    }

    public void setYear2(String year2) {
        this.year2 = year2;
    }

    public String getDegree3() {
        return degree3;
    }

    public void setDegree3(String degree3) {
        this.degree3 = degree3;
    }

    public String getSchool3() {
        return school3;
    }

    public void setSchool3(String school3) {
        this.school3 = school3;
    }

    public String getYear3() {
        return year3;
    }

    public void setYear3(String year3) {
        this.year3 = year3;
    }

    public String getPosition2() {
        return position2;
    }

    public void setPosition2(String position2) {
        this.position2 = position2;
    }

    public String getCompany2() {
        return company2;
    }

    public void setCompany2(String company2) {
        this.company2 = company2;
    }

    public String getLocation2() {
        return location2;
    }

    public void setLocation2(String location2) {
        this.location2 = location2;
    }

    public String getDuration2() {
        return duration2;
    }

    public void setDuration2(String duration2) {
        this.duration2 = duration2;
    }

    public String getDescription2() {
        return description2;
    }

    public void setDescription2(String description2) {
        this.description2 = description2;
    }

    public String getPosition3() {
        return position3;
    }

    public void setPosition3(String position3) {
        this.position3 = position3;
    }

    public String getCompany3() {
        return company3;
    }

    public void setCompany3(String company3) {
        this.company3 = company3;
    }

    public String getLocation3() {
        return location3;
    }

    public void setLocation3(String location3) {
        this.location3 = location3;
    }

    public String getDuration3() {
        return duration3;
    }

    public void setDuration3(String duration3) {
        this.duration3 = duration3;
    }

    public String getDescription3() {
        return description3;
    }

    public void setDescription3(String description3) {
        this.description3 = description3;
    }

    public String getSkill2() {
        return skill2;
    }

    public void setSkill2(String skill2) {
        this.skill2 = skill2;
    }

    public String getLevel2() {
        return level2;
    }

    public void setLevel2(String level2) {
        this.level2 = level2;
    }

    public String getSkill3() {
        return skill3;
    }

    public void setSkill3(String skill3) {
        this.skill3 = skill3;
    }

    public String getLevel3() {
        return level3;
    }

    public void setLevel3(String level3) {
        this.level3 = level3;
    }

}
