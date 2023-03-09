package app;

import org.hibernate.Session;
import org.hibernate.query.Query;

public class EscapeRoom {
    public static void main(String[] args) {
        int x=codigo1();
        int y=codigo2();
        int z=codigo3();
        int w=codigo4();
        System.out.println("El código descubierto es :" +x+y+z+w);
    }
    public static int codigo1() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        Query query = session.createQuery("SELECT count(*) FROM Modulo");
        Long aLong = (Long) query.uniqueResult();
        return aLong.intValue();
    }
    public static int codigo2() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Query query = session.createQuery("SELECT count(distinct idModulo) FROM Examen");
        Long aLong = (Long) query.uniqueResult();
        return aLong.intValue();
    }
    public static int codigo3() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Query query = session.createQuery("SELECT round (avg(nota),0)FROM Examen WHERE idModulo=1");
        Long aLong = (Long) query.uniqueResult();
        return aLong.intValue();
    }
    public static int codigo4() {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        Query query = session.createQuery("SELECT count(apellidos) FROM Alumno WHERE apellidos LIKE '%z%'");
        Long aLong = (Long) query.uniqueResult();
        return aLong.intValue();
    }
}
