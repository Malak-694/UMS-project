**Project Overview:******

The LMS project is required to be a web-based application for managing and organizing online
courses, and assessments from the perspective of students and instructors. It should support a
range of user needs, each with specific features. The primary functionalities will include course
creation and management, user management, assessments, and performance tracking.
**Key Components:**

_1. User Management_

● User Types: Admin, Instructor, Student.

● Admin: Manages overall system settings, creates users,and manages courses.

● Instructor: Creates courses, manages course content, adds assignments and quizzes,
grades students, removes students from courses.

● Student: Enrolls in courses, accesses course materials, take quizzes, hand in
assignments, view assignments and quiz grades.

● Features:

○ User Registration and Login (role-based access).

○ Profile Management (view/update profile information).

_2. Course Management_
● Course Creation:

○ Instructors can create courses with details like title, description, duration, ... etc.

○ Instructors can upload media files (videos, PDFs, audio, ... etc.).

○ Course consists of a number of lessons to be attended by students.

● Enrollment Management:

○ Students can view available courses and enroll in these courses.

○ Admins and Instructors can view the list of enrolled students per course.

● Attendance Management

○ Instructors can generate an OTP per lesson to maintain the students attendance.

○ Students can select the lesson to attend and enter the OTP received from the
instructor.
_3. Assessment & Grading_

● Assessment Types: Quiz, Assignment

● Quiz Creation:

○ Instructors can create quizzes with different types of questions (MCQ, true/false,
short answers).

○ Instructors can create a questions bank per course.

○ Randomized question selection for each quiz attempt.

● Assignment Submission:

○ Students can submit assignments by uploading files for review by Instructors.

● Grading and Feedback:

○ Instructors can grade assignments.

○ Students receive automated feedback after quizzes and manual feedback on
assignments.
_4. Performance Tracking_

● Student Progress Tracking:

○ Instructors can track quiz scores, assignment submissions, and attendance.

_5. Notifications_

● System Notifications:

○ Students can check their notifications after they login to the system where they
can find notifications for enrollment confirmation, graded assignments, and
course-related updates.

○ Notifications should be handled such that the students can choose to view only
the unread notifications or all notifications.

○ Instructors can check their notifications after they login to the system such as
getting notifications for the students who enroll on their courses.

_5. Bonus Features_

● Role-Based Access Control:

○ Using Spring Security for authentication and authorization.

○ Restrict access permissions so that they are granted based on role type.

● Performance Analytics:

○ Admins and Instructors can generate excel reports on student performance
(including grades and attendance).

○ Visual representations (charts) of progress, performance, and course completion.


**Technical Requirements:**
Backend

● Java with Spring Boot for RESTful API services.

● MySQL or PostgreSQL or SQLite or similar database management tool.

Integration, Testing & Deployment

● JUnit for unit testing.

● Git is mandatory for version control (each member in the team should contribute and
commit to the GitHub repository).
