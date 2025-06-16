1. Find the names and CGPAs of all students from the 'IT' department.
db.students.find({ department: 'IT' }, { name: 1, cgpa: 1, _id: 0 })

2. List all students whose CGPA is greater than or equal to 8.5. Show only their name, roll number, and department.
db.students.find({ cgpa: { $gte: 8.5 } }, { name: 1, roll_no: 1, department: 1, _id: 0 })

3. Find students who are in either the 'ECE' or 'ME' department using $in.
db.students.find({ department: { $in: ['ECE', 'ME'] } })

4. Get the name and CGPA of students who are in the 4th year and have a CGPA greater than 8.0.
db.students.find({ year: 4, cgpa: { $gt: 8.0 } }, { name: 1, cgpa: 1, _id: 0 })

5. Find all students who are not in the 'CSE' department and have a CGPA less than or equal to 7.5 using $and and $ne.
db.students.find({ $and: [ { department: { $ne: 'CSE' } }, { cgpa: { $lte: 7.5 } } ] })

6. Display the top 3 students with the highest CGPA across all departments.
db.students.find().sort({ cgpa: -1 }).limit(3)

7. Show the next 3 students after skipping the top 3 based on CGPA (pagination).
db.students.find().sort({ cgpa: -1 }).skip(3).limit(3)

8. Increase the CGPA by 0.2 for all students in the 'CSE' department.
db.students.updateMany({ department: 'CSE' }, { $inc: { cgpa: 0.2 } })

9. Set the department to 'Probation' for all students with CGPA less than 7.0.
db.students.updateMany({ cgpa: { $lt: 7.0 } }, { $set: { department: 'Probation' } })

10. Remove the email field from all students in the 'ME' department.
db.students.updateMany({ department: 'ME' }, { $unset: { email: '' } })

11. Rename the field cgpa to gpa for all students.
db.students.updateMany({}, { $rename: { 'cgpa': 'gpa' } }, { multi: true })

12. Replace the entire document of a student with roll number 'CSE2104' with a new record containing updated values.
db.students.replaceOne({ roll_no: 'CSE2104' }, {
  roll_no: 'CSE2104',
  name: 'Simran Kaur',
  year: 2,
  department: 'CSE',
  cgpa: 9.5,
  email: 'simran.new@univ.edu'
})