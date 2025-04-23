import java.io.*;
import java.util.*;

/**
 * Main class that manages student records.
 * This class demonstrates file I/O and exception handling in Java.
 * 
 * The StudentRecordsManager handles:
 * - Reading student data from CSV files
 * - Processing and validating the data
 * - Calculating statistics
 * - Writing formatted results to output files
 * - Proper exception handling throughout the process
 */
public class StudentRecordsManager {

    /**
     * Main method to run the program.
     * Handles user input and delegates processing to other methods.
     *
     * @param args Command line arguments (not used)
     */
    public static void main(String[] args) {
        StudentRecordsManager manager = new StudentRecordsManager();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter input filename: ");
        String inputFile = scanner.nextLine();

        System.out.print("Enter output filename: ");
        String outputFile = scanner.nextLine();

        try {
            /**
             * TODO: Call the processStudentRecords method with appropriate parameters
             *
             * This should pass the inputFile and outputFile variables to the method
             */
            manager.processStudentRecords(inputFile, outputFile);
        } catch (Exception e) {
            /**
             * TODO: Handle general exceptions
             *
             * - Display a user-friendly error message
             * - Include the exception's message for debugging purposes
             * - Consider using System.err instead of System.out for error messages
             */
            System.err.println("Oh no something is really wrong, like i'm talking armageddon bad!");
            System.err.println("Your error is: " + e.getMessage());
        } finally {
            /**
             * The scanner is closed in the finally block to ensure resources are
             * properly released regardless of whether an exception occurred.
             * This demonstrates proper resource management.
             */
            scanner.close();
        }
    }

    /**
     * Process student records from an input file and write results to an output file.
     * This method orchestrates the entire data processing workflow.
     *
     * @param inputFile  Path to the input file containing student records
     * @param outputFile Path to the output file where results will be written
     */
    public void processStudentRecords(String inputFile, String outputFile) {
        try {
            /**
             * TODO: Call readStudentRecords and writeResultsToFile methods
             *
             * 1. Call readStudentRecords to get a list of Student objects
             * 2. Call writeResultsToFile to output the processed data
             * 3. Print a success message to the console
             */
            List<Student> list = readStudentRecords(inputFile);
            writeResultsToFile(list, outputFile);
            System.out.println("Succesful read and write!");
        } catch (FileNotFoundException e) {
            /**
             * TODO: Handle file not found exception
             *
             * Provide a clear message indicating which file couldn't be found
             * and possibly suggest solutions (check spelling, path, etc.)
             */
            System.err.println("The file, " + inputFile + " could not be found, Check spelling or path.");
        } catch (IOException e) {
            /**
             * TODO: Handle general I/O exceptions
             *
             * These could be permission issues, disk full, etc.
             * Provide helpful information about the nature of the I/O problem.
             */
            System.err.println("An error occurred, Make sure you have permissions on the file, or that your disk is not full.");
        }
    }

    /**
     * Read student records from a file and convert them to Student objects.
     * This method demonstrates file reading operations and exception handling.
     *
     * @param filename Path to the input file
     * @return List of Student objects created from the file data
     * @throws IOException If an I/O error occurs during file reading
     */
    public List<Student> readStudentRecords(String filename) throws IOException {
        List<Student> students = new ArrayList<>();
        int lineNumber = 0;

        try (BufferedReader buffRead = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = buffRead.readLine()) != null) {
                lineNumber++;
                try {
                    String[] parts = line.split(",");

                    if (parts.length < 6) {
                        throw new ArrayIndexOutOfBoundsException("Expected at least 6 fields, found " + parts.length);
                    }

                    String studentId = parts[0];
                    String name = parts[1];
                    int[] grades = new int[4];

                    for (int i = 0; i < 4; i++) {
                        int grade = Integer.parseInt(parts[i + 2]);
                        if (grade < 0 || grade > 100) {
                            throw new InvalidGradeException("Grade out of range: " + grade);
                        }
                        grades[i] = grade;
                    }

                    Student student = new Student(studentId, name, grades);
                    students.add(student);

                } catch (NumberFormatException e) {
                    System.err.println("Number format error at line " + lineNumber + ": " + e.getMessage());
                } catch (InvalidGradeException e) {
                    System.err.println("Invalid grade at line " + lineNumber + ": " + e.getMessage());
                } catch (ArrayIndexOutOfBoundsException e) {
                    System.err.println("Too few fields at line " + lineNumber + ": " + e.getMessage());
                }
            }

        }

        return students;
    }

    /**
     * Write processed student results to an output file.
     * This method demonstrates file writing operations.
     *
     * @param students List of Student objects to be written to the file
     * @param filename Path to the output file
     * @throws IOException If an I/O error occurs during file writing
     */

    public void writeResultsToFile(List<Student> students, String filename) throws IOException {
        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            // 1. Header section
            writer.println("Student Results Report");
            writer.println("======================");

            // 2. Initialize statistics
            int totalStudents = students.size();
            double totalAverage = 0;
            int countA = 0, countB = 0, countC = 0, countD = 0, countF = 0;

            // 3. Write student information
            for (Student s : students) {
                writer.println(s.toString()); // uses overridden toString()

                double avg = s.getAverageGrade();
                totalAverage += avg;

                switch (s.getLetterGrade()) {
                    case 'A':
                        countA++;
                        break;
                    case 'B':
                        countB++;
                        break;
                    case 'C':
                        countC++;
                        break;
                    case 'D':
                        countD++;
                        break;
                    case 'F':
                        countF++;
                        break;
                }
            }

            // 4. Class statistics
            writer.println();
            writer.println("Class Statistics");
            writer.println("----------------");
            writer.println("Total Students: " + totalStudents);
            writer.println("Class Average: " + String.format("%.2f", totalAverage / totalStudents));
            writer.println("Grade Distribution:");
            writer.println("A: " + countA);
            writer.println("B: " + countB);
            writer.println("C: " + countC);
            writer.println("D: " + countD);
            writer.println("F: " + countF);
        }
    }
}
