package data;


import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

@Component
@Transactional
public class BoxGameDao {

    @PersistenceContext
    private EntityManager em;
    
    
    public List<User> getAllUsers() {
        String search = "select u from User u";
        List<User> allUsers = em.createQuery(search, User.class).getResultList();
        return allUsers;
    }
    
    public void addScore(User u){
        
        em.persist(u);
    }

}
