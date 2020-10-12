package com.philou.afpa_cda.servlets;


import com.philou.afpa_cda.beans.Theme;
import com.philou.afpa_cda.resources.dao.ThemeDao;
import java.io.IOException;
import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "ThemesController", urlPatterns = {"/themes"})

public class ThemesController extends HttpServlet {
    
         //La connection JDBC 
       private  Connection cnx ;
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
         //System.out.println("ThemesController::DOGET");
         
         cnx = (Connection)getServletContext().getAttribute("connexion");
        
         //un bjet DaoTheme pour involquer les methode insert...
         ThemeDao dao = new ThemeDao(cnx);
         Theme theme = new Theme(); // Un objet Theme
         Long id = -1L;
         
          //presence d'un parametre action
          String action = "0";
         
         if(request.getParameter("action") != null){
             action = request.getParameter("action");
         }
         // On stocke l'action
        request.setAttribute("action", action);
        
         String view = ""; // La JSP finale
        
          switch(action){
            // Listing
            case "0":
                // on creer une liste pour le retour de la methode liste
                List<Theme> listeThemes = new ArrayList();
                listeThemes = dao.liste();
                // On crée un attribut de requète 
                request.setAttribute("listeThemes", listeThemes);
                view = "themes/liste.jsp";
            break;
            // Création
            case "1":     
                view = "themes/create.jsp";
            break;
            // Modification
            case "2":
                if(request.getParameter("id") != null) id = Long.parseLong(request.getParameter("id"));
                theme = dao.find(id);
                request.setAttribute("theme", theme);
                view = "themes/modify.jsp";
            break;
            // Suppression
            case "3":
                if(request.getParameter("id") != null) id = Long.parseLong(request.getParameter("id"));
                theme = dao.find(id);
                request.setAttribute("theme", theme);
                view = "themes/delete.jsp";
            break;
            // Duplication
            case "4":
                /*
                if(request.getParameter("id") != null) id = Long.parseLong(request.getParameter("id"));
                theme = dao.find(id);
                request.setAttribute("theme", theme);
                view = "themes/duplicate.jsp";
                */
            break;
            
        }
         
         
          //on forward la requete, on pousse jusqu'a bout la requete et la reponse
         request.getRequestDispatcher(view).forward(request, response);
       
        // System.out.println(listeThemes);
    }

    
   

    //------------------------------------------------------------------------
//------------------------------------------------------------------------
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        //System.out.println("ThemesController::DOPOST");
        
        cnx = (Connection)getServletContext().getAttribute("connexion");
      
        ThemeDao dao = new ThemeDao(cnx);
        Theme theme = new Theme();
        List<Theme> listeThemes = new ArrayList();
        
        String action = "";
        // Présence d'un paramètre 'action' ?
        if(request.getParameter("action") != null){
            action = request.getParameter("action");      
        }
        
        String view = "";
     
        // Which action ?
        switch(action){
            
            case "0":
                listeThemes = dao.liste();
                request.setAttribute("listeThemes", listeThemes);
                view = "themes/liste.jsp";
            break;
            
            case "1": 
                // On récupère les données du form
                if(request.getParameter("libelle") != null) theme.setLibelle(request.getParameter("libelle"));
                System.out.println("libelle" + theme.getLibelle());
                // On insère en BD
                dao.insert(theme);
                
                // On raffraichit la liste
                listeThemes = dao.liste();
                request.setAttribute("listeThemes", listeThemes);
                view = "themes/liste.jsp";
            break;
     
            case "2":
                // On récupère les données du form
                if(request.getParameter("id") != null) theme.setIdTheme(Long.parseLong(request.getParameter("id")));
                if(request.getParameter("libelle") != null) theme.setLibelle(request.getParameter("libelle"));
                System.out.println("libelle" + theme.getLibelle());
                // On insère en BD
                dao.update(theme);
                
                // On raffraichit la liste
                listeThemes = dao.liste();
                request.setAttribute("listeThemes", listeThemes);
                view = "themes/liste.jsp";
            break;
            
                case "3":
                // On récupère les données du form
                if(request.getParameter("id") != null) 
                    dao.delete(Long.parseLong(request.getParameter("id")));
                // On raffraichit la liste
                listeThemes = dao.liste();
                request.setAttribute("listeThemes", listeThemes);
                // On forward
                view = "themes/liste.jsp";
            break;
                case "4":
                // On récupère les données du form
                if(request.getParameter("libelle") != null) theme.setLibelle(request.getParameter("libelle"));
                System.out.println("libelle" + theme.getLibelle());
                // On insère en BD
                dao.insert(theme);
                // On raffraichit la liste
                listeThemes = dao.liste();
                request.setAttribute("listeThemes", listeThemes);
                // On forward
                view = "themes/liste.jsp";
            break;
            
        }
        
        // On forward la requète
        request.getRequestDispatcher(view).forward(request, response);         
 
    } // doPost END

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}



// valeur pour les actions
// 0 ==> liste
// 1 ==> création
// 2 ==> modification
// 3 ==> suppression
