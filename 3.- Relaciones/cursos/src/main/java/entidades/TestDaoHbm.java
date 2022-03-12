package entidades;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;


public class TestDaoHbm {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		Curso curso = new Curso();
		curso.setIdCurso(4);
		curso.setDescricion("Spring");
		curso.setPrecio(580000);
		//session.save(curso);
		//session.getTransaction().commit();
		//System.out.println("curso insertado " + curso.getDescricion());
		
		
		Query query=session.createQuery("from curso");//here persistent class name is Emp  
		List list=query.list(); 
		
		
		for(int x=0; x < list.size(); x++) {
			System.out.println("SALIDA --> ");
			
		}

		System.out.println("HOLA MUNDO");
	}

}
