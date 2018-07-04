/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package takehomeassignment;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author Acer
 */
public class DBOperation {

    String url = "jdbc:mysql://localhost:3306/nsbm";
    String username = "root";
    String password = "";
    Connection con = null;
    PreparedStatement pst = null;
    int index=0;
    ResultSet rs = null;

    boolean addStudent(Student s) {
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "INSERT INTO student VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, s.getIndexNo()); //  add values th sql query
            pst.setString(2, s.getName()); //  add values th sql query
            pst.setString(3, s.getFullName()); //  add values th sql query
            pst.setString(4, s.getFaculty()); //  add values th sql query
            pst.setString(5, s.getNic()); //  add values th sql query
            pst.setString(6, s.getGender()); //  add values th sql query
            pst.setString(7, s.getAddress()); //  add values th sql query
            pst.setInt(8, s.getContactNo()); //  add values th sql query
            pst.setString(9, s.getEmail()); //  add values th sql query
            pst.setInt(10, s.getYear()); //  add values th sql query
            pst.setString(11, s.getBatch()); //  add values th sql query
            pst.setString(12, s.getCourseType()); //  add values th sql query

            pst.executeUpdate(); // execute the sql query and insert the values to db table

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    void checkIndex() {
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection
            String q = "SELECT MAX(indexNo) AS i FROM student";
            pst = (PreparedStatement) con.prepareStatement(q);

            rs = pst.executeQuery();
            String x="";
            while(rs.next()){
                x = rs.getString(1);
            }
            index = Integer.parseInt(x);
            //System.out.println(index);

        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
    ArrayList<Student> getStudent() {
        try {
            ArrayList<Student> list = new ArrayList<Student>();
            
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT * FROM student";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while(rs.next()){
                Student s = new Student();
                s.setIndexNo(rs.getInt(1));
                s.setName(rs.getString(2));
                s.setFullName(rs.getString(3));
                s.setFaculty(rs.getString(4));
                s.setNic(rs.getString(5));
                s.setGender(rs.getString(6));
                s.setAddress(rs.getString(7));
                s.setContactNo(rs.getInt(8));
                s.setEmail(rs.getString(9));
                s.setYear(rs.getInt(10));
                s.setBatch(rs.getString(11));
                s.setCourseType(rs.getString(12));
                list.add(s);
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    
    ArrayList<UndergraduateStudent> getUndergraduateStudent() {
        try {
            ArrayList<UndergraduateStudent> list = new ArrayList<UndergraduateStudent>();
            
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT * FROM undergraduate_student";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while(rs.next()){
                UndergraduateStudent us = new UndergraduateStudent();
                
                us.setIndexNo(rs.getInt(1));
                us.setALYear(rs.getInt(2));
                us.setShy(rs.getString(3));
                us.setSubject1(rs.getString(4));
                us.setSubject2(rs.getString(5));
                us.setSubject3(rs.getString(6));
                us.setGeneralEnglish(rs.getString(7));
                us.setzScore(rs.getDouble(8));
                list.add(us);
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    
    ArrayList<PostgraduateStudent> getPostgraduateStudent() {
        try {
            ArrayList<PostgraduateStudent> list = new ArrayList<PostgraduateStudent>();
            
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT * FROM postgraduate_student";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while(rs.next()){
                PostgraduateStudent ps = new PostgraduateStudent();
                
                ps.setIndexNo(rs.getInt(1));
                ps.setQualificationType(rs.getString(2));
                ps.setInstitute(rs.getString(3));
                ps.setYearOfCompletion(rs.getInt(4));
                ps.setStatus(rs.getString(5));
                list.add(ps);
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    
    ArrayList<Lecturer> getLecturer() {
        try {
            ArrayList<Lecturer> list = new ArrayList<Lecturer>();
            
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT * FROM lecturer";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while(rs.next()){
                Lecturer l = new Lecturer();
                
                l.setLecID(rs.getInt(1));
                l.setLecFullName(rs.getString(2));
                l.setLecName(rs.getString(3));
                l.setNic(rs.getString(4));
                l.setGender(rs.getString(5));
                l.setAddress(rs.getString(6));
                l.setQualification(rs.getString(7));
                l.setContactNo(rs.getInt(8));
                l.setEmail(rs.getString(9));
                l.setWhatCoursesDo(rs.getString(10));
                list.add(l);
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    ArrayList<Instructor> getInstructor() {
        try {
            ArrayList<Instructor> list = new ArrayList<Instructor>();
            
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT * FROM instructor";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while(rs.next()){
                Instructor i = new Instructor();
                
                i.setInsID(rs.getInt(1));
                i.setInsFullName(rs.getString(2));
                i.setInsName(rs.getString(3));
                i.setNic(rs.getString(4));
                i.setGender(rs.getString(5));
                i.setAddress(rs.getString(6));
                i.setQualification(rs.getString(7));
                i.setContactNo(rs.getInt(8));
                i.setEmail(rs.getString(9));
                list.add(i);
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    ArrayList<Subject> getSubject() {
        try {
            ArrayList<Subject> list = new ArrayList<Subject>();
            
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT * FROM subject";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while(rs.next()){
                Subject cd = new Subject();
                
                cd.setSubjectID(rs.getString(1));
                cd.setSubjectName(rs.getString(2));
                cd.setDegree(rs.getString(3));
                cd.setYear(rs.getInt(4));
                cd.setSemester(rs.getInt(5));
                cd.setFees(rs.getInt(6));
                cd.setLecturer(rs.getString(7));
                cd.setInstructors(rs.getString(8));
                cd.setTimeSchedule(rs.getString(9));
                cd.setNoOfAssignment(rs.getInt(10));
                cd.setCredit(rs.getInt(11));
                cd.setcompulsoryType(rs.getString(12));
                cd.setPlaceLecture(rs.getString(13));
                cd.setPlacePractical(rs.getString(14));
                cd.setNote(rs.getString(15));
                list.add(cd);
            }
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    ArrayList<Subject> getCSComSubject1() {
        try {
            ArrayList<Subject> list = new ArrayList<Subject>();
            
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT subjectID, subjectName, fees, credit FROM subject WHERE degree='CS' AND compulsoryOrNot='Compulsory' AND year=1 AND semester=1";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while(rs.next()){
                Subject cd = new Subject();
                
                cd.setSubjectID(rs.getString(1));
                cd.setSubjectName(rs.getString(2));
                cd.setFees(rs.getInt(3));
                cd.setCredit(rs.getInt(4));
                list.add(cd);
            }
            System.out.println(list);
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    
    ArrayList<Subject> getCSComSubject2() {
        try {
            ArrayList<Subject> list = new ArrayList<Subject>();
            
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT subjectID, subjectName, fees, credit FROM subject WHERE degree='CS' AND compulsoryOrNot='Compulsory' AND year=1 AND semester=2";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while(rs.next()){
                Subject cd = new Subject();
                
                cd.setSubjectID(rs.getString(1));
                cd.setSubjectName(rs.getString(2));
                cd.setFees(rs.getInt(3));
                cd.setCredit(rs.getInt(4));
                list.add(cd);
            }
            System.out.println(list);
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    
    ArrayList<Subject> getCSOptSubject1() {
        try {
            ArrayList<Subject> list = new ArrayList<Subject>();
            
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT subjectID, subjectName, fees, credit FROM subject WHERE degree='CS' AND compulsoryOrNot='Optional' AND year=1 AND semester=1";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while(rs.next()){
                Subject cd = new Subject();
                
                cd.setSubjectID(rs.getString(1));
                cd.setSubjectName(rs.getString(2));
                cd.setFees(rs.getInt(3));
                cd.setCredit(rs.getInt(4));
                list.add(cd);
            }
            System.out.println(list);
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    
    ArrayList<Subject> getCSOptSubject2() {
        try {
            ArrayList<Subject> list = new ArrayList<Subject>();
            
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT subjectID, subjectName, fees, credit FROM subject WHERE degree='CS' AND compulsoryOrNot='Optional' AND year=1 AND semester=2";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while(rs.next()){
                Subject cd = new Subject();
                
                cd.setSubjectID(rs.getString(1));
                cd.setSubjectName(rs.getString(2));
                cd.setFees(rs.getInt(3));
                cd.setCredit(rs.getInt(4));
                list.add(cd);
            }
            System.out.println(list);
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    
    ArrayList<NewUser> getUserAccountDetails() {
        try {
            ArrayList<NewUser> list = new ArrayList<NewUser>();
            
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT * FROM user_login";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery();
            
            while(rs.next()){
                NewUser nu = new NewUser();
                
                nu.setUserID(rs.getString(1));
                nu.setType(rs.getString(2));
                nu.setPassword(rs.getString(3));
                list.add(nu);
            }
            System.out.println(list);
            return list;

        } catch (Exception e) {
            System.out.println(e);
            return null;
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }

    boolean addUndergraduateStudent(UndergraduateStudent us) {
        try {
            checkIndex();
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "INSERT INTO undergraduate_student VALUES(?, ?, ?, ?, ?, ?, ?, ?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, index); //  add values th sql query
            pst.setInt(2, us.getALYear()); //  add values th sql query
            pst.setString(3, us.getShy()); //  add values th sql query
            pst.setString(4, us.getSubject1()); //  add values th sql query
            pst.setString(5, us.getSubject2()); //  add values th sql query
            pst.setString(6, us.getSubject3()); //  add values th sql query
            pst.setString(7, us.getGeneralEnglish()); //  add values th sql query
            pst.setDouble(8, us.getzScore()); //  add values th sql query
            
            pst.executeUpdate(); // execute the sql query and insert the values to db table

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }

    boolean addPostgraduateStudent(PostgraduateStudent ps) {
        try {
            checkIndex();
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "INSERT INTO postgraduate_student VALUES(?, ?, ?, ?, ?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, this.index); //  add values th sql query
            pst.setString(2, ps.getQualificationType());
            pst.setString(3, ps.getInstitute());
            pst.setInt(4, ps.getYearOfCompletion());
            pst.setString(5, ps.getStatus());

            pst.executeUpdate(); // execute the sql query and insert the values to db table

            return true;

        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    
    boolean addLecturer(Lecturer al) {
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "INSERT INTO lecturer VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, al.getLecID()); //  add values th sql query
            pst.setString(2, al.getLecFullName()); //  add values th sql query
            pst.setString(3, al.getLecName()); //  add values th sql query
            pst.setString(4, al.getNic()); //  add values th sql query
            pst.setString(5, al.getGender()); //  add values th sql query
            pst.setString(6, al.getAddress()); //  add values th sql query
            pst.setString(7, al.getQualification()); //  add values th sql query
            pst.setInt(8, al.getContactNo()); //  add values th sql query
            pst.setString(9, al.getEmail()); //  add values th sql query
            pst.setString(10, al.getWhatCoursesDo()); //  add values th sql query

            pst.executeUpdate(); // execute the sql query and insert the values to db table

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    
    boolean addInstructor(Instructor ai) {
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "INSERT INTO instructor VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, ai.getInsID()); //  add values th sql query
            pst.setString(2, ai.getInsFullName()); //  add values th sql query
            pst.setString(3, ai.getInsName()); //  add values th sql query
            pst.setString(4, ai.getNic()); //  add values th sql query
            pst.setString(5, ai.getGender()); //  add values th sql query
            pst.setString(6, ai.getAddress()); //  add values th sql query
            pst.setString(7, ai.getQualification()); //  add values th sql query
            pst.setInt(8, ai.getContactNo()); //  add values th sql query
            pst.setString(9, ai.getEmail()); //  add values th sql query

            pst.executeUpdate(); // execute the sql query and insert the values to db table

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    
    boolean addNewUser(NewUser s) {
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "INSERT INTO user_login VALUES(?, ?, ?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setString(1, s.getUserID()); //  add values th sql query
            pst.setString(2, s.getType()); //  add values th sql query
            pst.setString(3, s.getPassword()); //  add values th sql query

            pst.executeUpdate(); // execute the sql query and insert the values to db table

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    
    int checkUser(String index) {
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT indexNo FROM student";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery(); // execute the sql query and insert the values to db table
            
            while(rs.next()){
                if(index.equals(rs.getString(1))){
                    return 0;
                }
            }
            return 1;
            
        } catch (Exception e) {
            System.out.println(e);
            return 2;
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    
    String checkAndGetUser(String index) {
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT indexNo FROM student";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery(); // execute the sql query and insert the values to db table
            
            while(rs.next()){
                if(index.equals(rs.getString(1))){
                    return index;
                }
            }
            
        } catch (Exception e) {
            System.out.println(e);
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        return null;

    }
    
    int checkUserPassword(String name, String pass) {
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "SELECT * FROM user_login";
            pst = (PreparedStatement) con.prepareStatement(query);

            rs = pst.executeQuery(); // execute the sql query and insert the values to db table
            
            while(rs.next()){
//                NewUser nu = new NewUser();
//                
//                nu.setUserID(rs.getString(1));
//                nu.setType(rs.getString(2));
//                nu.setPassword(rs.getString(3));
                if((name.equals(rs.getString(1))) && (pass.equals(rs.getString(3))) ){
                    return 0;
                }
            }
            return 1;
            
        } catch (Exception e) {
            System.out.println(e);
            return 2;
            
        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
    
    public boolean updateStudent(Student em){
        try {
            checkIndex();
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "UPDATE student SET nameWithInitial='"+em.getName()+"', fullName='"+em.getFullName()+"', faculty='"+em.getFaculty()+"', nic='"+em.getNic()+"', gender='"+em.getGender()+"', address='"+em.getAddress()+"', contactNo="+em.getContactNo()+", email='"+em.getEmail()+"', year="+em.getYear()+", batch='"+em.getBatch()+"', courseType='"+em.getCourseType()+"' WHERE indexNo="+em.getIndexNo();
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.executeUpdate(); // execute the sql query and insert the values to db table
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean updateUndergraduateStudent(UndergraduateStudent em){
        try {
            System.out.println("1");
            checkIndex();
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "UPDATE undergraduate_student SET year="+em.getALYear()+", shy='"+em.getShy()+"', subject1='"+em.getSubject1()+"', subject2='"+em.getSubject2()+"', subject3='"+em.getSubject3()+"', generalEnglish='"+em.getGeneralEnglish()+"', zScore='"+em.getzScore()+"' WHERE indexNo="+em.getIndexNo();
            pst = (PreparedStatement) con.prepareStatement(query);
            System.out.println("2");
            pst.executeUpdate(); // execute the sql query and insert the values to db table
            System.out.println("3");
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean updatePostgraduateStudent(PostgraduateStudent em){
        try {
            System.out.println("1");
            checkIndex();
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "UPDATE postgraduate_student SET qualificationType='"+em.getQualificationType()+"', institute='"+em.getInstitute()+"', yearOfCompletion="+em.getYearOfCompletion()+", status='"+em.getStatus()+"' WHERE indexNo="+em.getIndexNo();
            pst = (PreparedStatement) con.prepareStatement(query);
            System.out.println("2");
            pst.executeUpdate(); // execute the sql query and insert the values to db table
            System.out.println("3");
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean updateLecturer(Lecturer em){
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "UPDATE lecturer SET lecFullName='"+em.getLecFullName()+"', lecName='"+em.getLecName()+"', nic='"+em.getNic()+"', gender='"+em.getGender()+"', address='"+em.getAddress()+"', qualifications='"+em.getAddress()+"', contactNo="+em.getContactNo()+", email='"+em.getEmail()+"', whatCoursesDo='"+em.getWhatCoursesDo()+"' WHERE lecID="+em.getLecID();
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.executeUpdate(); // execute the sql query and insert the values to db table
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean updateInstructor(Instructor em){
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "UPDATE instructor SET insFullName='"+em.getInsFullName()+"', insName='"+em.getInsName()+"', nic='"+em.getNic()+"', gender='"+em.getGender()+"', address='"+em.getAddress()+"', qualifications='"+em.getAddress()+"', contactNo="+em.getContactNo()+", email='"+em.getEmail()+"' WHERE insID="+em.getInsID();
            pst = (PreparedStatement) con.prepareStatement(query);
            pst.executeUpdate(); // execute the sql query and insert the values to db table
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean updateSubject(Subject em){
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection
            String a = em.getOldCourseID();
            String query = "UPDATE subject SET subjectID='"+em.getSubjectID()+"', subjectName='"+em.getSubjectName()+"', degree='"+em.getDegree()+"', year='"+em.getYear()+"', semester='"+em.getSemester()+"', fees='"+em.getFees()+"', lecturer='"+em.getLecturer()+"', instructors='"+em.getInstructors()+"', timeSchedule='"+em.getTimeSchedule()+"', noOfAssignment="+em.getNoOfAssignment()+", credit="+em.getCredit()+", compulsoryOrNot='"+em.getcompulsoryType()+"', placeLecture='"+em.getPlaceLecture()+"', placePractical='"+em.getPlacePractical()+"', note='"+em.getNote()+"' WHERE subjectID='"+a+"'";
            pst = (PreparedStatement) con.prepareStatement(query);
            System.out.println("--- DB ----"+pst);
            pst.executeUpdate(); // execute the sql query and insert the values to db table
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean addStudentRegCourse(StudentCourseReg em){
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "INSERT INTO student_degree VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setInt(1, em.getIndexNo()); //  add values th sql query
            pst.setInt(2, em.getSemester()); //  add values th sql query
            pst.setString(3, em.getSubject1()); //  add values th sql query
            pst.setString(4, em.getSubject2()); //  add values th sql query
            pst.setString(5, em.getSubject3()); //  add values th sql query
            pst.setString(6, em.getSubject4()); //  add values th sql query
            pst.setString(7, em.getSubject5()); //  add values th sql query
            pst.setString(8, em.getSubject6()); //  add values th sql query
            pst.setString(9, em.getSubject7()); //  add values th sql query

            pst.executeUpdate(); // execute the sql query and insert the values to db table

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean deleteStudent(Student em){
        try {
            checkIndex();
            con = DriverManager.getConnection(url, username, password); //get the connection

            String query = "DELETE FROM student  WHERE indexNo="+em.getIndexNo();
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate(); // execute the sql query and insert the values to db table

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean deleteUndergraduteStudent(Student em){
        try {
            checkIndex();
            con = DriverManager.getConnection(url, username, password); //get the connection

            System.out.println("------>"+em.getIndexNo());
            String query = "DELETE FROM undergraduate_student WHERE indexNo="+em.getIndexNo();
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate(); // execute the sql query and insert the values to db table
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean deletePostgraduateStudent(Student em){
        try {
            checkIndex();
            con = DriverManager.getConnection(url, username, password); //get the connection
            
            System.out.println("------>"+em.getIndexNo());
            String query = "DELETE FROM postgraduate_student WHERE indexNo="+em.getIndexNo();
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate(); // execute the sql query and insert the values to db table
            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean deleteLecturer(Lecturer em){
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection

            String query = "DELETE FROM lecturer WHERE lecID="+em.getLecID();
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate(); // execute the sql query and insert the values to db table

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean deleteInstructor(Instructor em){
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection

            String query = "DELETE FROM instructor WHERE insID="+em.getInsID();
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate(); // execute the sql query and insert the values to db table

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    public boolean deleteSubject(Subject em){
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection

            System.out.println(em.getSubjectID());
            String query = "DELETE FROM subject WHERE subjectID='"+em.getSubjectID()+"'";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.executeUpdate(); // execute the sql query and insert the values to db table

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }
    }
    
    boolean addSubject(Subject c) {
        try {
            con = DriverManager.getConnection(url, username, password); //get the connection
            String query = "INSERT INTO subject VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            pst = (PreparedStatement) con.prepareStatement(query);

            pst.setString(1, c.getSubjectID()); //  add values th sql query
            pst.setString(2, c.getSubjectName()); //  add values th sql query
            pst.setString(3, c.getDegree()); //  add values th sql query
            pst.setInt(4, c.getFees()); //  add values th sql query
            pst.setInt(5, c.getYear()); //  add values th sql query
            pst.setInt(6, c.getSemester()); //  add values th sql query
            pst.setString(7, c.getLecturer()); //  add values th sql query
            pst.setString(8, c.getInstructors()); //  add values th sql query
            pst.setString(9, c.getTimeSchedule()); //  add values th sql query
            pst.setInt(10, c.getNoOfAssignment()); //  add values th sql query
            pst.setInt(11, c.getCredit()); //  add values th sql query
            pst.setString(12, c.getcompulsoryType()); //  add values th sql query
            pst.setString(13, c.getPlaceLecture()); //  add values th sql query
            pst.setString(14, c.getPlacePractical()); //  add values th sql query
            pst.setString(15, c.getNote()); //  add values th sql query

            pst.executeUpdate(); // execute the sql query and insert the values to db table

            return true;

        } catch (Exception e) {
            System.out.println(e);
            return false;

        } finally {
            try {
                if (pst != null) {
                    pst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (Exception e) {
                System.out.println(e);
            }
        }

    }
}
