
package com.philou.afpa_cda.beans;

import java.sql.Date;

/**
 *
 * @author alliese
 */
public class News {
    
    private int id_news;
    private String titre;
    private Date date_pub;
    private String content;
    
    public News(){
        
    }

    public int getId_news() {
        return id_news;
    }

    public void setId_news(int id_news) {
        this.id_news = id_news;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getDate_pub() {
        return date_pub;
    }

    public void setDate_pub(Date date_pub) {
        this.date_pub = date_pub;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
