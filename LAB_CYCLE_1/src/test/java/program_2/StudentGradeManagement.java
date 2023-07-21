import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class StudentGradeManagement extends javax.swing.JFrame {
    private ArrayList<String> studentNames = new ArrayList<>();
    private ArrayList<int[]> marks = new ArrayList<>();
    private DefaultTableModel tableModel;

    /**
     * Creates new form StudentGradeManagement
     */
    public StudentGradeManagement() {
        initComponents();
        tableModel = new DefaultTableModel();
        jTable1.setModel(tableModel);
        tableModel.addColumn("Student Name");
        tableModel.addColumn("Grades");
    }

    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        addStudents = new javax.swing.JButton();
        addMarks = new javax.swing.JButton();
        displayNames = new javax.swing.JButton();
        displayGrades = new javax.swing.JButton();
        findStdAvg = new javax.swing.JButton();
        findClsAvg = new javax.swing.JButton();
        clearData = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        addStudents.setText("Add Students");
        addStudents.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addStudentsActionPerformed(evt);
            }
        });

        addMarks.setText("Add Marks");
        addMarks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addMarksActionPerformed(evt);
            }
        });

        displayNames.setText("Display Names");
        displayNames.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayNamesActionPerformed(evt);
            }
        });

        displayGrades.setText("Display Grades");
        displayGrades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayGradesActionPerformed(evt);
            }
        });

        findStdAvg.setText("Find Average(Student)");
        findStdAvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findStdAvgActionPerformed(evt);
            }
        });

        findClsAvg.setText("Find Average (Class)");
        findClsAvg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findClsAvgActionPerformed(evt);
            }
        });

        clearData.setText("Clear Data");
        clearData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearDataActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Student Name", "Grades"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(findStdAvg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearData, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(findClsAvg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayGrades, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(displayNames, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addMarks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addStudents, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 372, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(addStudents)
                .addGap(18, 18, 18)
                .addComponent(addMarks)
                .addGap(18, 18, 18)
                .addComponent(displayNames)
                .addGap(18, 18, 18)
                .addComponent(displayGrades)
                .addGap(18, 18, 18)
                .addComponent(findStdAvg)
                .addGap(18, 18, 18)
                .addComponent(findClsAvg)
                .addGap(18, 18, 18)
                .addComponent(clearData)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void addStudentsActionPerformed(java.awt.event.ActionEvent evt) {
        String studentName = JOptionPane.showInputDialog(this, "Enter student name:");
        if (studentName == null || studentName.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Please enter a valid name.");
            return;
        }

        if (studentNames.contains(studentName)) {
            JOptionPane.showMessageDialog(this, "Student with the same name already exists.");
            return;
        }

        studentNames.add(studentName);
        JOptionPane.showMessageDialog(this, "Student added successfully!");
    }

    private void addMarksActionPerformed(java.awt.event.ActionEvent evt) {
        if (studentNames.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No students found. Please add students first.");
            return;
        }

        String selectedStudent = (String) JOptionPane.showInputDialog(this, "Select a student:",
                "Add Marks", JOptionPane.QUESTION_MESSAGE, null, studentNames.toArray(), studentNames.get(0));

        if (selectedStudent == null) {
            return; // User canceled the selection
        }

        int[] studentMarks = new int[5];
        for (int i = 0; i < 5; i++) {
            String subjectName = JOptionPane.showInputDialog(this, "Enter marks for subject " + (i + 1) + " for " + selectedStudent + ":");
            try {
                studentMarks[i] = Integer.parseInt(subjectName);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(this, "Please enter a valid integer value.");
                return;
            }
        }

        marks.add(studentMarks);
        JOptionPane.showMessageDialog(this, "Marks added for " + selectedStudent + " successfully!");
    }

    private void displayNamesActionPerformed(java.awt.event.ActionEvent evt) {
        if (studentNames.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No students found.");
            return;
        }

        StringBuilder names = new StringBuilder();
        for (String name : studentNames) {
            names.append(name).append("\n");
        }

        jTextPane1.setText(names.toString());
    }

    private void displayGradesActionPerformed(java.awt.event.ActionEvent evt) {
        if (marks.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No marks found. Please add marks first.");
            return;
        }

        // Clear the table before displaying new data
        tableModel.setRowCount(0);

        for (int i = 0; i < studentNames.size(); i++) {
            int[] studentMarks = marks.get(i);
            int totalMarks = 0;
            for (int mark : studentMarks) {
                totalMarks += mark;
            }
            double averageMarks = (double) totalMarks / studentMarks.length;

            String grade;
            if (averageMarks >= 80) {
                grade = "A";
            } else if (averageMarks >= 60) {
                grade = "B";
            } else if (averageMarks >= 40) {
                grade = "C";
            } else {
                grade = "F";
            }

            tableModel.addRow(new Object[]{studentNames.get(i), grade});
        }
    }

    private void findStdAvgActionPerformed(java.awt.event.ActionEvent evt) {
        if (marks.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No marks found. Please add marks first.");
            return;
        }

        String selectedStudent = (String) JOptionPane.showInputDialog(this, "Select a student:",
                "Find Average(Student)", JOptionPane.QUESTION_MESSAGE, null, studentNames.toArray(), studentNames.get(0));

        if (selectedStudent == null) {
            return; // User canceled the selection
        }

        int selectedStudentIndex = studentNames.indexOf(selectedStudent);
        int[] studentMarks = marks.get(selectedStudentIndex);
        int totalMarks = 0;
        for (int mark : studentMarks) {
            totalMarks += mark;
        }
        double averageMarks = (double) totalMarks / studentMarks.length;

        jTextPane1.setText(selectedStudent + "'s average marks: " + averageMarks);
    }

    private void findClsAvgActionPerformed(java.awt.event.ActionEvent evt) {
        if (marks.isEmpty()) {
            JOptionPane.showMessageDialog(this, "No marks found. Please add marks first.");
            return;
        }

        int totalMarks = 0;
        int totalSubjects = 0;
        for (int[] studentMarks : marks) {
            for (int mark : studentMarks) {
                totalMarks += mark;
                totalSubjects++;
            }
        }
        double classAverage = (double) totalMarks / totalSubjects;

        jTextPane1.setText("Class average marks: " + classAverage);
    }

    private void clearDataActionPerformed(java.awt.event.ActionEvent evt) {
        studentNames.clear();
        marks.clear();
        tableModel.setRowCount(0);
        JOptionPane.showMessageDialog(this, "Data cleared successfully!");
    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentGradeManagement.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StudentGradeManagement().setVisible(true);
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton addMarks;
    private javax.swing.JButton addStudents;
    private javax.swing.JButton clearData;
    private javax.swing.JButton displayGrades;
    private javax.swing.JButton displayNames;
    private javax.swing.JButton findClsAvg;
    private javax.swing.JButton findStdAvg;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration
}
