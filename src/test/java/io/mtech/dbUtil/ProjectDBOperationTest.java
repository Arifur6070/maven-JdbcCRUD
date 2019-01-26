//package io.mtech.dbUtil;
//
//import static org.junit.Assert.*;
//
//import org.junit.Test;
//
//import io.mtech.model.Project;
//import io.mtech.service.ProjectDao;
//
//public class ProjectDBOperationTest {
//
//	@Test
//	public void testInsertProject() throws Exception {
//		Project p = new Project("blockchain",5);
//		ProjectDao pd = new ProjectDao();
//		boolean res= pd.addProject(p);
//		assertEquals(true, res);
//				
//	}
//
//	@Test
//	public void testDeleteProject() throws Exception {
//		//Project p = new Project(2,"blockchain",5);
//		ProjectDao pd = new ProjectDao();
//		boolean res= pd.deleteProject(1);
//		assertEquals(true, res);
//				
//	}
//
//	@Test
//	public void testUpdateProject() {
//		fail("Not yet implemented");
//	}
//
//}
