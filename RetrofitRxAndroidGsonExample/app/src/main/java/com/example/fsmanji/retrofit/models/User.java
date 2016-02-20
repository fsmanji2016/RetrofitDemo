package com.example.fsmanji.retrofit.models;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by fsmanji on 2/19/16.
 */
public class User {
    //auto generated from http://www.jsonschema2pojo.org/

    private String login;
    private int id;
    private String name;
    private Object company;
    private String blog;
    private String location;
    private String email;
    private int publicRepos;
    private int publicGists;
    private int followers;
    private int following;
    private String createdAt;
    private String updatedAt;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    /**
     *
     * @return
     * The login
     */
    public String getLogin() {
        return login;
    }

    /**
     *
     * @param login
     * The login
     */
    public void setLogin(String login) {
        this.login = login;
    }

    /**
     *
     * @return
     * The id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(int id) {
        this.id = id;
    }

  /**
     *
     * @return
     * The name
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @param name
     * The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     *
     * @return
     * The company
     */
    public Object getCompany() {
        return company;
    }

    /**
     *
     * @param company
     * The company
     */
    public void setCompany(Object company) {
        this.company = company;
    }

    /**
     *
     * @return
     * The blog
     */
    public String getBlog() {
        return blog;
    }

    /**
     *
     * @param blog
     * The blog
     */
    public void setBlog(String blog) {
        this.blog = blog;
    }

    /**
     *
     * @return
     * The location
     */
    public String getLocation() {
        return location;
    }

    /**
     *
     * @param location
     * The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     *
     * @return
     * The email
     */
    public String getEmail() {
        return email;
    }

    /**
     *
     * @param email
     * The email
     */
    public void setEmail(String email) {
        this.email = email;
    }



    /**
     *
     * @return
     * The publicRepos
     */
    public int getPublicRepos() {
        return publicRepos;
    }

    /**
     *
     * @param publicRepos
     * The public_repos
     */
    public void setPublicRepos(int publicRepos) {
        this.publicRepos = publicRepos;
    }

    /**
     *
     * @return
     * The publicGists
     */
    public int getPublicGists() {
        return publicGists;
    }

    /**
     *
     * @param publicGists
     * The public_gists
     */
    public void setPublicGists(int publicGists) {
        this.publicGists = publicGists;
    }

    /**
     *
     * @return
     * The followers
     */
    public int getFollowers() {
        return followers;
    }

    /**
     *
     * @param followers
     * The followers
     */
    public void setFollowers(int followers) {
        this.followers = followers;
    }

    /**
     *
     * @return
     * The following
     */
    public int getFollowing() {
        return following;
    }

    /**
     *
     * @param following
     * The following
     */
    public void setFollowing(int following) {
        this.following = following;
    }

    /**
     *
     * @return
     * The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    /**
     *
     * @param updatedAt
     * The updated_at
     */
    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
